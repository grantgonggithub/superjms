package org.superjms.rpc;

/**
 * Copyright(C) 2020 顺兴文旅版权所有
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc
 * @ClassName ClientItem
 * @Author grantgong(巩建春)
 * @Date 2022/11/17 上午11:35
 * @Description TODO
 */
public class ClientItem {
    /*
    * 要连接服务器ip
    * */
    private String _ip;

    /*
    * 要连接的服务器端口
    * */
    private int _port;

    /*
    * 服务器类型
    * */
    private ServerType _serverType;

    /*
    * 如果是api，表示url地址
    * */
    private String _url;

    /*
    * 服务器编号
    * */
    private int _pool;

    /*
    * 连接超时时间
    * */
    private int _timeOut;

    /*
    * 是否下线
    * */
    private  boolean _enable;

//    private

}
