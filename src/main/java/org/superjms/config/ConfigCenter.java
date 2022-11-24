package org.superjms.config;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName ConfigCenter
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/18 下午9:29
 * @Description 配置中心的根配置
 */
public class ConfigCenter {

    /**
     * The Config type.
     */
    /*配置类型*/
    private ConfigType _configType;
    /**
     * The Ip.
     */
    /*zk的ip和端口是统一配置在一起的，主要考虑到zk集群部署会有多个节点  ip1:port1,ip2:port2*/
    private String _ip;
    /**
     * The Session timeout.
     */
    /*如果是zk配置，表示连接的超时时间*/
    private int sessionTimeout;

    /**
     * Instantiates a new Config center.
     */
    public ConfigCenter() {
    }

    /**
     * Instantiates a new Config center.
     *
     * @param _configType    the config type
     * @param _ip            the ip
     * @param sessionTimeout the session timeout
     */
    public ConfigCenter(ConfigType _configType, String _ip, int sessionTimeout) {
        this._configType = _configType;
        this._ip = _ip;
        this.sessionTimeout = sessionTimeout;
    }

    /**
     * Gets config type.
     *
     * @return the config type
     */
    public ConfigType get_configType() {
        return _configType;
    }

    /**
     * Sets config type.
     *
     * @param _configType the config type
     */
    public void set_configType(ConfigType _configType) {
        this._configType = _configType;
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
     * Gets session timeout.
     *
     * @return the session timeout
     */
    public int getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets session timeout.
     *
     * @param sessionTimeout the session timeout
     */
    public void setSessionTimeout(int sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }
}
