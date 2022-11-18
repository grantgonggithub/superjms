package org.superjms.rpc;

import org.superjms.rpc.router.RouterType;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
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
        Lock lock = readWriteLock.readLock();
        try {
            if(lock.tryLock(80, TimeUnit.MILLISECONDS)){
                return clients.values().toArray(new ClientItem[0]);
            }else{
                return new ClientItem[0];
            }
        } catch (Exception ex) {
            return new ClientItem[0];
        }
        finally {
            lock.unlock();
        }
    }

    public void UpdateClient(ClientItem[] _clients,boolean update){
        Lock lock= readWriteLock.writeLock();
        try{
            if(lock.tryLock(100,TimeUnit.MILLISECONDS)){
                clients.clear();
                Set<Map.Entry<String,ClientItem>> iterator = clients.entrySet();
                for (Map.Entry<String,ClientItem> item : iterator){
                    ClientItem itemValue=item.getValue();
                    String key=String.format("%s_%s",itemValue.get_ip(),itemValue.get_port());
                    clients.put(key,itemValue);
                }
            }

        }catch (Exception ex){

        }finally {
            lock.unlock();
        }

    }

    @Override
    public String toString() {
        return "ClientServer{" +
                "readWriteLock=" + readWriteLock +
                ", clients=" + clients +
                ", _serverName='" + _serverName + '\'' +
                ", _routerType=" + _routerType +
                ", _clients=" + Arrays.toString(_clients) +
                '}';
    }
/*    public void set_clients(ClientItem[] _clients) {
        this._clients = _clients;
    }*/

}
