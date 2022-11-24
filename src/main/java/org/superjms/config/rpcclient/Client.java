package org.superjms.config.rpcclient;

import org.superjms.rpc.router.RouterType;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.rpcclient
 * @ClassName Client
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:11
 * @Description 一个抽象的服务的客户端配置
 */
public class Client {
    /**
     * The Server name.
     */
    /*服务名称，逻辑名称*/
    private String _serverName;

    /**
     * The Router type.
     */
    /*路由的方式*/
    private RouterType _routerType;

    /**
     * The Items.
     */
    /*服务器列表*/
    private List<ClientItem> _items;

    /**
     * Instantiates a new Client.
     */
    public Client() {
    }

    /**
     * Instantiates a new Client.
     *
     * @param _serverName the server name
     * @param _routerType the router type
     * @param _items      the items
     */
    public Client(String _serverName, RouterType _routerType, List<ClientItem> _items) {
        this._serverName = _serverName;
        this._routerType = _routerType;
        this._items = _items;
    }

    /**
     * Gets server name.
     *
     * @return the server name
     */
    public String get_serverName() {
        return _serverName;
    }

    /**
     * Sets server name.
     *
     * @param _serverName the server name
     */
    public void set_serverName(String _serverName) {
        this._serverName = _serverName;
    }

    /**
     * Gets router type.
     *
     * @return the router type
     */
    public RouterType get_routerType() {
        return _routerType;
    }

    /**
     * Sets router type.
     *
     * @param _routerType the router type
     */
    public void set_routerType(RouterType _routerType) {
        this._routerType = _routerType;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<ClientItem> get_items() {
        return _items;
    }

    /**
     * Sets items.
     *
     * @param _items the items
     */
    public void set_items(List<ClientItem> _items) {
        this._items = _items;
    }
}
