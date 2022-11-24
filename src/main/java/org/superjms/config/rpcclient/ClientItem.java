package org.superjms.config.rpcclient;

import org.superjms.rpc.ServerType;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.rpcclient
 * @ClassName ClientItem
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:10
 * @Description rpc客户端配置
 */
public class ClientItem {
    /**
     * The Pool.
     */
    /*客户端配置的索引*/
    private int _pool;

    /**
     * The Ip.
     */
    /*服务器Ip*/
    private String _ip;

    /**
     * The Port.
     */
    /*服务器端口*/
    private int _port;

    /**
     * The Time out.
     */
    /*超时时间*/
    private int _timeOut;

    /**
     * The Server type.
     */
    /*服务类型*/
    private ServerType _serverType;

    /**
     * The Enable.
     */
    /*是否禁用状态*/
    private boolean _enable;

    /**
     * Instantiates a new Client item.
     */
    public ClientItem() {
    }

    /**
     * Instantiates a new Client item.
     *
     * @param _pool       the pool
     * @param _ip         the ip
     * @param _port       the port
     * @param _timeOut    the time out
     * @param _serverType the server type
     * @param _enable     the enable
     */
    public ClientItem(int _pool, String _ip, int _port, int _timeOut, ServerType _serverType, boolean _enable) {
        this._pool = _pool;
        this._ip = _ip;
        this._port = _port;
        this._timeOut = _timeOut;
        this._serverType = _serverType;
        this._enable = _enable;
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
     * Is enable boolean.
     *
     * @return the boolean
     */
    public boolean is_enable() {
        return _enable;
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
