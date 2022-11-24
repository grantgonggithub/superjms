package org.superjms.tools;

import org.superjms.tools.combox.ComboxClass2;

import java.net.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.tools
 * @ClassName LocalMachineInfo
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午4:26
 * @Description TODO
 */
public class LocalMachineInfo {
     /**
     * 获取本地机器的所有网卡的ip地址
     * @return
     */
    public static List<String> getAllHostIp() throws SocketException {
        List<String> _ipList = new ArrayList<>();
        Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();
        while (networkInterface.hasMoreElements()) {
            NetworkInterface netInterface = (NetworkInterface) networkInterface.nextElement();
            Enumeration<InetAddress> address = netInterface.getInetAddresses();
            while (address.hasMoreElements()) {
                InetAddress ip = (InetAddress) address.nextElement();
                String ipHost = ip.getHostAddress();
                if (ipHost == "127.0.0.1" || ipHost.isEmpty())
                {
                    continue;
                }
                if (ip instanceof Inet4Address &&
                        !ip.isLoopbackAddress() &&
                        !ipHost.contains(":")) {
                    _ipList.add(ipHost);
                }
            }
        }
        return _ipList;
    }

    /**
     * 获取指定网卡的网络名称和Ip
     * @param _inetAddress
     * @return ComboxClass2<机器网络名称,ip>
     */
    public static ComboxClass2<String,String> getMachineNameAndIp(InetAddress _inetAddress){
        ComboxClass2<String,String> cbx = new ComboxClass2<String,String>();
        cbx.set_v1(_inetAddress.getHostName());
        cbx.set_v2(_inetAddress.getHostAddress());
        return cbx;
    }

    /**
     * 获取指定网卡的mac地址
     * @param inetAddress
     * @return
     * @throws SocketException
     */
    public static String getMacAddress(InetAddress inetAddress) throws SocketException {
        // 获得指定网络接口对象（即网卡），并得到mac地址，mac地址存在于一个byte数组中
        byte[] mac=NetworkInterface.getByInetAddress(inetAddress).getHardwareAddress();
        // 将数组拼接成字符串
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<mac.length;i++){
            if (i!=0){
                sb.append("-");
            }
            // mac[i] & 0xFF 是为了把byte转化为正整数
            String s=Integer.toHexString(mac[i] & 0xFF);
            sb.append(s.length()==1?0+s:s);
        }
        return sb.toString().toUpperCase();
    }
}

