package org.superjms.rpc;

import org.superjms.rpc.router.RouterType;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Copyright(C) 2020 顺兴文旅版权所有
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc
 * @ClassName ClientServer
 * @Author grantgong(巩建春)
 * @Date 2022/11/17 上午11:43
 * @Description TODO
 */
public class ClientServer {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private final Map<String, ClientItem> clients = new HashMap<>();
    /*服务名称*/
    private String _serverName;
    /*路由方式*/
    private RouterType _routerType;
    /*负载节点列表*/
    private ClientItem[] _clients;

    public ClientServer(String _serverName, RouterType _routerType, ClientItem[] _clients) {
        this._serverName = _serverName;
        this._routerType = _routerType;
        this._clients = _clients;
    }

    public ClientServer() {
    }

    public String get_serverName() {
        return _serverName;
    }

    public void set_serverName(String _serverName) {
        this._serverName = _serverName;
    }

    public RouterType get_routerType() {
        return _routerType;
    }

    public void set_routerType(RouterType _routerType) {
        this._routerType = _routerType;
    }

    public ClientItem[] get_clients() {
        try {

        } catch (Exception ex) {
        }
        return _clients;
    }

/*    public void set_clients(ClientItem[] _clients) {
        this._clients = _clients;
    }*/

}
