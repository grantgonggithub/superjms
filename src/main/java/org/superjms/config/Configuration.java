package org.superjms.config;

import org.superjms.config.constkeyvalue.ConstKeyValue;
import org.superjms.config.database.DataBase;
import org.superjms.config.fileserver.FileServer;
import org.superjms.config.httpproxy.HttpProxy;
import org.superjms.config.logconfig.LogConfig;
import org.superjms.config.rabbitmq.RabbitMQ;
import org.superjms.config.redis.RedisConfig;
import org.superjms.config.rpcclient.RpcClients;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName Configuration
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:39
 * @Description TODO
 */
public class Configuration {
    /**
     * The Config path.
     */
    private String _configPath;
    /**
     * The Server config.
     */
    private ServerConfig _serverConfig;
    /**
     * The Data base.
     */
    private DataBase _dataBase;
    /**
     * The Log config.
     */
    private LogConfig _logConfig;
    /**
     * The Const key value.
     */
    private ConstKeyValue _constKeyValue;
    /**
     * The Rabbit mq.
     */
    private RabbitMQ _rabbitMq;
    /**
     * The Redis config.
     */
    private RedisConfig _redisConfig;
    /**
     * The Rpc clients.
     */
    private RpcClients _rpcClients;
    /**
     * The Http proxy.
     */
    private HttpProxy _httpProxy;
    /**
     * The File server.
     */
    private FileServer _fileServer;

    /**
     * Instantiates a new Configuration.
     */
    public Configuration() {
    }

    /**
     * Instantiates a new Configuration.
     *
     * @param _configPath    the config path
     * @param _serverConfig  the server config
     * @param _dataBase      the data base
     * @param _logConfig     the log config
     * @param _constKeyValue the const key value
     * @param _rabbitMq      the rabbit mq
     * @param _redisConfig   the redis config
     * @param _rpcClients    the rpc clients
     * @param _httpProxy     the http proxy
     * @param _fileServer    the file server
     */
    public Configuration(String _configPath, ServerConfig _serverConfig, DataBase _dataBase, LogConfig _logConfig, ConstKeyValue _constKeyValue, RabbitMQ _rabbitMq, RedisConfig _redisConfig, RpcClients _rpcClients, HttpProxy _httpProxy, FileServer _fileServer) {
        this._configPath = _configPath;
        this._serverConfig = _serverConfig;
        this._dataBase = _dataBase;
        this._logConfig = _logConfig;
        this._constKeyValue = _constKeyValue;
        this._rabbitMq = _rabbitMq;
        this._redisConfig = _redisConfig;
        this._rpcClients = _rpcClients;
        this._httpProxy = _httpProxy;
        this._fileServer = _fileServer;
    }

    /**
     * Gets config path.
     *
     * @return the config path
     */
    public String get_configPath() {
        return _configPath;
    }

    /**
     * Sets config path.
     *
     * @param _configPath the config path
     */
    public void set_configPath(String _configPath) {
        this._configPath = _configPath;
    }

    /**
     * Gets server config.
     *
     * @return the server config
     */
    public ServerConfig get_serverConfig() {
        return _serverConfig;
    }

    /**
     * Sets server config.
     *
     * @param _serverConfig the server config
     */
    public void set_serverConfig(ServerConfig _serverConfig) {
        this._serverConfig = _serverConfig;
    }

    /**
     * Gets data base.
     *
     * @return the data base
     */
    public DataBase get_dataBase() {
        return _dataBase;
    }

    /**
     * Sets data base.
     *
     * @param _dataBase the data base
     */
    public void set_dataBase(DataBase _dataBase) {
        this._dataBase = _dataBase;
    }

    /**
     * Gets log config.
     *
     * @return the log config
     */
    public LogConfig get_logConfig() {
        return _logConfig;
    }

    /**
     * Sets log config.
     *
     * @param _logConfig the log config
     */
    public void set_logConfig(LogConfig _logConfig) {
        this._logConfig = _logConfig;
    }

    /**
     * Gets const key value.
     *
     * @return the const key value
     */
    public ConstKeyValue get_constKeyValue() {
        return _constKeyValue;
    }

    /**
     * Sets const key value.
     *
     * @param _constKeyValue the const key value
     */
    public void set_constKeyValue(ConstKeyValue _constKeyValue) {
        this._constKeyValue = _constKeyValue;
    }

    /**
     * Gets rabbit mq.
     *
     * @return the rabbit mq
     */
    public RabbitMQ get_rabbitMq() {
        return _rabbitMq;
    }

    /**
     * Sets rabbit mq.
     *
     * @param _rabbitMq the rabbit mq
     */
    public void set_rabbitMq(RabbitMQ _rabbitMq) {
        this._rabbitMq = _rabbitMq;
    }

    /**
     * Gets redis config.
     *
     * @return the redis config
     */
    public RedisConfig get_redisConfig() {
        return _redisConfig;
    }

    /**
     * Sets redis config.
     *
     * @param _redisConfig the redis config
     */
    public void set_redisConfig(RedisConfig _redisConfig) {
        this._redisConfig = _redisConfig;
    }

    /**
     * Gets rpc clients.
     *
     * @return the rpc clients
     */
    public RpcClients get_rpcClients() {
        return _rpcClients;
    }

    /**
     * Sets rpc clients.
     *
     * @param _rpcClients the rpc clients
     */
    public void set_rpcClients(RpcClients _rpcClients) {
        this._rpcClients = _rpcClients;
    }

    /**
     * Gets http proxy.
     *
     * @return the http proxy
     */
    public HttpProxy get_httpProxy() {
        return _httpProxy;
    }

    /**
     * Sets http proxy.
     *
     * @param _httpProxy the http proxy
     */
    public void set_httpProxy(HttpProxy _httpProxy) {
        this._httpProxy = _httpProxy;
    }

    /**
     * Gets file server.
     *
     * @return the file server
     */
    public FileServer get_fileServer() {
        return _fileServer;
    }

    /**
     * Sets file server.
     *
     * @param _fileServer the file server
     */
    public void set_fileServer(FileServer _fileServer) {
        this._fileServer = _fileServer;
    }
}
