package org.superjms.config.fileserver;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.fileserver
 * @ClassName FileServerItem
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 下午12:11
 * @Description TODO
 */
public class FileServerItem {
    /**
     * The Pool.
     */
    private int _pool;
    /**
     * The Url.
     */
    private String _url;

    /**
     * Instantiates a new File server item.
     */
    public FileServerItem() {
    }

    /**
     * Instantiates a new File server item.
     *
     * @param _pool the pool
     * @param _url  the url
     */
    public FileServerItem(int _pool, String _url) {
        this._pool = _pool;
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
}
