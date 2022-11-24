package org.superjms.rpc;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc
 * @ClassName ClientItem
 * @Author grantgong(巩建春)
 * @Date 2022 /11/17 上午11:35
 * @Description TODO
 */
public class ClientItem {
    /**
     * The Ip.
     */
    /*
    * 要连接服务器ip
    * */
    private String _ip;

    /**
     * The Port.
     */
    /*
    * 要连接的服务器端口
    * */
    private int _port;

    /**
     * The Server type.
     */
    /*
    * 服务器类型
    * */
    private ServerType _serverType;

    /**
     * The Url.
     */
    /*
    * 如果是api，表示url地址
    * */
    private String _url;

    /**
     * The Pool.
     */
    /*
    * 服务器编号
    * */
    private int _pool;

    /**
     * The Time-out.
     */
    /*
    * 连接超时时间
    * */
    private int _timeOut;

    /**
     * The Enable.
     */
    /*
    * 是否下线
    * */
    private  boolean _enable;

   /*
     服务对应的logic节点
    */
    private ClientServer _clientServer;

    public ClientServer get_clientServer() {
        return _clientServer;
    }

    public void set_clientServer(ClientServer _clientServer) {
        this._clientServer = _clientServer;
    }
//    private

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String get_ip() {
        return _ip;
    }

    /**
     * Sets ip.
     *
     * @param _ip the ip
     */
    public void set_ip(String _ip) {
        this._ip = _ip;
    }

    /**
     * Gets port.
     *
     * @return the port
     */
    public int get_port() {
        return _port;
    }

    /**
     * Sets port.
     *
     * @param _port the port
     */
    public void set_port(int _port) {
        this._port = _port;
    }

    /**
     * Gets server type.
     *
     * @return the server type
     */
    public ServerType get_serverType() {
        return _serverType;
    }

    /**
     * Sets server type.
     *
     * @param _serverType the server type
     */
    public void set_serverType(ServerType _serverType) {
        this._serverType = _serverType;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String get_url() {
        return _url;
    }

    /**
     * Sets url.
     *
     * @param _url the url
     */
    public void set_url(String _url) {
        this._url = _url;
    }

    /**
     * Gets pool.
     *
     * @return the pool
     */
    public int get_pool() {
        return _pool;
    }

    /**
     * Sets pool.
     *
     * @param _pool the pool
     */
    public void set_pool(int _pool) {
        this._pool = _pool;
    }

    /**
     * Gets time out.
     *
     * @return the time out
     */
    public int get_timeOut() {
        return _timeOut;
    }

    /**
     * Sets time out.
     *
     * @param _timeOut the time out
     */
    public void set_timeOut(int _timeOut) {
        this._timeOut = _timeOut;
    }

    /**
     * Is enable boolean.
     *
     * @return the boolean
     */
    public boolean is_enable() {
        return _enable;
    }

    /**
     * Instantiates a new Client item.
     *
     * @param _ip          the ip
     * @param _port        the port
     * @param _serverType  the server type
     * @param _url         the url
     * @param _pool        the pool
     * @param _timeOut     the time out
     * @param _enable      the enable
     * @param clientServer
     */
    public ClientItem(String _ip, int _port, ServerType _serverType, String _url, int _pool, int _timeOut, boolean _enable, ClientServer clientServer) {
        this._ip = _ip;
        this._port = _port;
        this._serverType = _serverType;
        this._url = _url;
        this._pool = _pool;
        this._timeOut = _timeOut;
        this._enable = _enable;
        _clientServer = clientServer;
    }

    /**
     * Instantiates a new Client item.
     */
    public ClientItem() {
    }

    /**
     * Sets enable.
     *
     * @param _enable the enable
     */
    public void set_enable(boolean _enable) {
        this._enable = _enable;
    }

}
