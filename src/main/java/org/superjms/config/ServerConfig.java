package org.superjms.config;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName ServerConfig
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:37
 * @Description TODO
 */
public class ServerConfig {
    /**
     * The Rpc server.
     */
    private RpcServer _rpcServer;
    /**
     * The Config center.
     */
    private ConfigCenter _configCenter;

    /**
     * Instantiates a new Server config.
     */
    public ServerConfig() {
    }

    /**
     * Instantiates a new Server config.
     *
     * @param _rpcServer    the rpc server
     * @param _configCenter the config center
     */
    public ServerConfig(RpcServer _rpcServer, ConfigCenter _configCenter) {
        this._rpcServer = _rpcServer;
        this._configCenter = _configCenter;
    }

    /**
     * Gets rpc server.
     *
     * @return the rpc server
     */
    public RpcServer get_rpcServer() {
        return _rpcServer;
    }

    /**
     * Sets rpc server.
     *
     * @param _rpcServer the rpc server
     */
    public void set_rpcServer(RpcServer _rpcServer) {
        this._rpcServer = _rpcServer;
    }

    /**
     * Gets config center.
     *
     * @return the config center
     */
    public ConfigCenter get_configCenter() {
        return _configCenter;
    }

    /**
     * Sets config center.
     *
     * @param _configCenter the config center
     */
    public void set_configCenter(ConfigCenter _configCenter) {
        this._configCenter = _configCenter;
    }
}

