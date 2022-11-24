package org.superjms.config.redis;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.redis
 * @ClassName RedisItem
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:57
 * @Description TODO
 */
public class RedisItem {
    /**
     * The Pool.
     */
    private int _pool;
    /**
     * The Is master.
     */
    private boolean _isMaster;
    /**
     * The Server.
     */
    private String _server;
    /**
     * The Port.
     */
    private int _port;
    /**
     * The Allow admin.
     */
    private boolean _allowAdmin;
    /**
     * The Connection timeout.
     */
    private int _connectionTimeout;
    /**
     * The Ssl.
     */
    private boolean _ssl;
    /**
     * The Ssl 2.
     */
    /*新加redis ssl配置，为了兼容老的ssl 默认是false*/
    private boolean _ssl2;
    /**
     * The Pwd.
     */
    private String _pwd;
    /**
     * The Db index.
     */
    /*redis 数据库索引*/
    private int _dbIndex;

    /**
     * Instantiates a new Redis item.
     */
    public RedisItem() {
    }

    /**
     * Instantiates a new Redis item.
     *
     * @param _pool              the pool
     * @param _isMaster          the is master
     * @param _server            the server
     * @param _port              the port
     * @param _allowAdmin        the allow admin
     * @param _connectionTimeout the connection timeout
     * @param _ssl               the ssl
     * @param _ssl2              the ssl 2
     * @param _pwd               the pwd
     * @param _dbIndex           the db index
     */
    public RedisItem(int _pool, boolean _isMaster, String _server, int _port, boolean _allowAdmin, int _connectionTimeout, boolean _ssl, boolean _ssl2, String _pwd, int _dbIndex) {
        this._pool = _pool;
        this._isMaster = _isMaster;
        this._server = _server;
        this._port = _port;
        this._allowAdmin = _allowAdmin;
        this._connectionTimeout = _connectionTimeout;
        this._ssl = _ssl;
        this._ssl2 = _ssl2;
        this._pwd = _pwd;
        this._dbIndex = _dbIndex;
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
     * Is is master boolean.
     *
     * @return the boolean
     */
    public boolean is_isMaster() {
        return _isMaster;
    }

    /**
     * Sets is master.
     *
     * @param _isMaster the is master
     */
    public void set_isMaster(boolean _isMaster) {
        this._isMaster = _isMaster;
    }

    /**
     * Gets server.
     *
     * @return the server
     */
    public String get_server() {
        return _server;
    }

    /**
     * Sets server.
     *
     * @param _server the server
     */
    public void set_server(String _server) {
        this._server = _server;
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
     * Is allow admin boolean.
     *
     * @return the boolean
     */
    public boolean is_allowAdmin() {
        return _allowAdmin;
    }

    /**
     * Sets allow admin.
     *
     * @param _allowAdmin the allow admin
     */
    public void set_allowAdmin(boolean _allowAdmin) {
        this._allowAdmin = _allowAdmin;
    }

    /**
     * Gets connection timeout.
     *
     * @return the connection timeout
     */
    public int get_connectionTimeout() {
        return _connectionTimeout;
    }

    /**
     * Sets connection timeout.
     *
     * @param _connectionTimeout the connection timeout
     */
    public void set_connectionTimeout(int _connectionTimeout) {
        this._connectionTimeout = _connectionTimeout;
    }

    /**
     * Is ssl boolean.
     *
     * @return the boolean
     */
    public boolean is_ssl() {
        return _ssl;
    }

    /**
     * Sets ssl.
     *
     * @param _ssl the ssl
     */
    public void set_ssl(boolean _ssl) {
        this._ssl = _ssl;
    }

    /**
     * Is ssl 2 boolean.
     *
     * @return the boolean
     */
    public boolean is_ssl2() {
        return _ssl2;
    }

    /**
     * Sets ssl 2.
     *
     * @param _ssl2 the ssl 2
     */
    public void set_ssl2(boolean _ssl2) {
        this._ssl2 = _ssl2;
    }

    /**
     * Gets pwd.
     *
     * @return the pwd
     */
    public String get_pwd() {
        return _pwd;
    }

    /**
     * Sets pwd.
     *
     * @param _pwd the pwd
     */
    public void set_pwd(String _pwd) {
        this._pwd = _pwd;
    }

    /**
     * Gets db index.
     *
     * @return the db index
     */
    public int get_dbIndex() {
        return _dbIndex;
    }

    /**
     * Sets db index.
     *
     * @param _dbIndex the db index
     */
    public void set_dbIndex(int _dbIndex) {
        this._dbIndex = _dbIndex;
    }
}
