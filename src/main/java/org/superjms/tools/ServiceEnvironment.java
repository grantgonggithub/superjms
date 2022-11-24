package org.superjms.tools;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.tools
 * @ClassName ServiceEnvironment
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午6:14
 * @Description TODO
 */
public class ServiceEnvironment {
    private static String _serviceName;
    private static String _computerName;
    private static String _computerAddress;
    private static String _processInfo;
    private static String _workPath;
    private static long _pid;
    private static List<String> _ipList=new ArrayList<>();

    private static String _environmentInfo;

    public static String get_serviceName() {
        return _serviceName;
    }

    public static void set_serviceName(String _serviceName) {
        ServiceEnvironment._serviceName = _serviceName;
    }

    public static String get_computerName() {
        return _computerName;
    }

    public static void set_computerName(String _computerName) {
        ServiceEnvironment._computerName = _computerName;
    }

    public static String get_computerAddress() {
        return _computerAddress;
    }

    public static void set_computerAddress(String _computerAddress) {
        ServiceEnvironment._computerAddress = _computerAddress;
    }

    public static String get_processInfo() {
        return _processInfo;
    }

    public static void set_processInfo(String _processInfo) {
        ServiceEnvironment._processInfo = _processInfo;
    }

    public static String get_workPath() {
        return _workPath;
    }

    public static void set_workPath(String _workPath) {
        ServiceEnvironment._workPath = _workPath;
    }

    public static long get_pid() {
        return _pid;
    }

    public static void set_pid(long _pid) {
        ServiceEnvironment._pid = _pid;
    }

    public static List<String> get_ipList() {
        return _ipList;
    }

    public static void set_ipList(List<String> _ipList) {
        ServiceEnvironment._ipList = _ipList;
    }

    public static String get_environmentInfo() {
        return _environmentInfo;
    }

    public static void set_environmentInfo(String _environmentInfo) {
        ServiceEnvironment._environmentInfo = _environmentInfo;
    }

    static {
        _serviceName = MainJarHelper.get_main_class_jar();
        _computerName = null;
        _computerAddress = null;
        _processInfo = getProcessInfo();
        _workPath = ServiceEnvironment.class.getResource("/").toString();
        _pid = getProcessId(_processInfo);
        try {
            _ipList=LocalMachineInfo.getAllHostIp();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        _environmentInfo=String.format("[serviceName]:%s [computerName]:%s [workPath]:%s [processInfo]:%s [computerAddress]:%s",_serviceName,_computerName,_workPath,_processInfo,_computerAddress);
    }

    /**
     * 获取进程名称
     * @return
     */
    private static String getProcessInfo(){
        RuntimeMXBean runtimeMXBean= ManagementFactory.getRuntimeMXBean();
        return runtimeMXBean.getName();
    }

    /**
     * 获取进程Id
     * @param processName
     * @return
     */
    private static Long getProcessId(String processName){
        String pid=processName.substring(0,processName.indexOf('@'));
        return Long.parseLong(pid);
    }

}
