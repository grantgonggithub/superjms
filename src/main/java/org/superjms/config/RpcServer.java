package org.superjms.config;

import org.superjms.rpc.ServerType;

import java.util.Hashtable;
import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName RpcServer
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:27
 * @Description TODO
 */
public class RpcServer {
    /**
     * The Pool.
     */
    private int _pool;
    /**
     * The Ip.
     */
    private String _ip;
    /**
     * The Port.
     */
    private int _port;
    /**
     * The Port list.
     */
    /*集中配置中，服务和port的对照表*/
    private Hashtable<String, Integer> _portList;
    /**
     * The Server type.
     */
    private ServerType _serverType;
    /**
     * The Assembly path.
     */
    private String _assemblyPath;
    /**
     * The Enable.
     */
    private boolean _enable;
    /**
     * The Time out.
     */
    private int _timeOut;

    /**
     * Instantiates a new Rpc server.
     */
    public RpcServer() {
    }

    /**
     * Instantiates a new Rpc server.
     *
     * @param _pool         the pool
     * @param _ip           the ip
     * @param _port         the port
     * @param _portList     the port list
     * @param _serverType   the server type
     * @param _assemblyPath the assembly path
     * @param _enable       the enable
     * @param _timeOut      the time out
     */
    public RpcServer(int _pool, String _ip, int _port, Hashtable<String, Integer> _portList, ServerType _serverType, String _assemblyPath, boolean _enable, int _timeOut) {
        this._pool = _pool;
        this._ip = _ip;
        this._port = _port;
        this._portList = _portList;
        this._serverType = _serverType;
        this._assemblyPath = _assemblyPath;
        this._enable = _enable;
        this._timeOut = _timeOut;
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
     * Gets port list.
     *
     * @return the port list
     */
    public Hashtable<String, Integer> get_portList() {
        return _portList;
    }

    /**
     * Sets port list.
     *
     * @param _portList the port list
     */
    public void set_portList(Hashtable<String, Integer> _portList) {
        this._portList = _portList;
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
     * Gets assembly path.
     *
     * @return the assembly path
     */
    public String get_assemblyPath() {
        return _assemblyPath;
    }

    /**
     * Sets assembly path.
     *
     * @param _assemblyPath the assembly path
     */
    public void set_assemblyPath(String _assemblyPath) {
        this._assemblyPath = _assemblyPath;
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
}
