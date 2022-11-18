package org.superjms.rpc;

import java.util.Map;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc
 * @ClassName SuperJMSServerConfig
 * @Author grantgong(巩建春)
 * @Date 2022 /11/17 上午9:12
 * @Description rpc server的配置项
 */
public class SuperJMSServerConfig {
    /*
    * 本地要监听的端口号
    */
    private int _port;
    /*
    * 端口号列表，集中配置会用到
    * */
    private Map<String,Integer> _portList;
    /*
    * 服务类型
    * */
    private ServerType _serverType;
    /*
    * 服务名称
    * */
    private String _serverName;
    /*
    * 服务所在的pool
    * */
    private int _pool;

    public SuperJMSServerConfig(int _port, Map<String, Integer> _portList, ServerType _serverType, String _serverName, int _pool, String _ip, int _timeOut, boolean _enable) {
        this._port = _port;
        this._portList = _portList;
        this._serverType = _serverType;
        this._serverName = _serverName;
        this._pool = _pool;
        this._ip = _ip;
        this._timeOut = _timeOut;
        this._enable = _enable;
    }

    public SuperJMSServerConfig() {
    }

    @Override
    public String toString() {
        return "SuperJMSServerConfig{" +
                "_port=" + _port +
                ", _portList=" + _portList +
                ", _serverType=" + _serverType +
                ", _serverName='" + _serverName + '\'' +
                ", _pool=" + _pool +
                ", _ip='" + _ip + '\'' +
                ", _timeOut=" + _timeOut +
                ", _enable=" + _enable +
                '}';
    }

    /*
    * 服务器ip
    * */
    private String _ip;
    /*
    * 连接超时时间
    * */
    private int _timeOut;
    /*
    * 服务是否启用，存在下线的情况
    * */
    private boolean _enable;


    /**
     * Gets the value of _port. *
     *
     * @return the value of _port
     */
    public int get_port() {
        return _port;
    }

    /**
     * Sets the _port. *
     * <p>You can use get_port() to get the value of _port</p>
     * * @param _port _port
     */
    public void set_port(int _port) {
        this._port = _port;
    }

    /**
     * Gets the value of _portList. *
     *
     * @return the value of _portList
     */
    public Map<String, Integer> get_portList() {
        return _portList;
    }

    /**
     * Sets the _portList. *
     * <p>You can use get_portList() to get the value of _portList</p>
     * * @param _portList _portList
     *
     * @param _portList the port list
     */
    public void set_portList(Map<String, Integer> _portList) {
        this._portList = _portList;
    }

    /**
     * Gets the value of _serverType. *
     *
     * @return the value of _serverType
     */
    public ServerType get_serverType() {
        return _serverType;
    }

    /**
     * Sets the _serverType. *
     * <p>You can use get_serverType() to get the value of _serverType</p>
     * * @param _serverType _serverType
     *
     * @param _serverType the server type
     */
    public void set_serverType(ServerType _serverType) {
        this._serverType = _serverType;
    }

    /**
     * Gets the value of _serverName. *
     *
     * @return the value of _serverName
     */
    public String get_serverName() {
        return _serverName;
    }

    /**
     * Sets the _serverName. *
     * <p>You can use get_serverName() to get the value of _serverName</p>
     * * @param _serverName _serverName
     *
     * @param _serverName the server name
     */
    public void set_serverName(String _serverName) {
        this._serverName = _serverName;
    }

    /**
     * Gets the value of _pool. *
     *
     * @return the value of _pool
     */
    public int get_pool() {
        return _pool;
    }

    /**
     * Sets the _pool. *
     * <p>You can use get_pool() to get the value of _pool</p>
     * * @param _pool _pool
     *
     * @param _pool the pool
     */
    public void set_pool(int _pool) {
        this._pool = _pool;
    }

    /**
     * Gets the value of _ip. *
     *
     * @return the value of _ip
     */
    public String get_ip() {
        return _ip;
    }

    /**
     * Sets the _ip. *
     * <p>You can use get_ip() to get the value of _ip</p>
     * * @param _ip _ip
     *
     * @param _ip the ip
     */
    public void set_ip(String _ip) {
        this._ip = _ip;
    }

    /**
     * Gets the value of _timeOut. *
     *
     * @return the value of _timeOut
     */
    public int get_timeOut() {
        return _timeOut;
    }

    /**
     * Sets the _timeOut. *
     * <p>You can use get_timeOut() to get the value of _timeOut</p>
     * * @param _timeOut _timeOut
     *
     * @param _timeOut the time out
     */
    public void set_timeOut(int _timeOut) {
        this._timeOut = _timeOut;
    }

    /**
     * Get enable boolean.
     *
     * @return the boolean
     */
    public boolean get_enable(){
        return _enable;
    }

    /**
     * Set enable.
     *
     * @param _enable the enable
     */
    public void set_enable(boolean _enable){
        this._enable=_enable;
    }
}
