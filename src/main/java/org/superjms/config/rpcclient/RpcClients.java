package org.superjms.config.rpcclient;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.rpcclient
 * @ClassName RpcClients
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:11
 * @Description 所有rpc服务的客户端配置
 */
public class RpcClients {
    /**
     * The Rpc clients.
     */
    /*rpc客户端配置*/
    private List<Client> _clients;

    public RpcClients() {
    }

    public RpcClients(List<Client> _clients) {
        this._clients = _clients;
    }

    public List<Client> get_clients() {
        return _clients;
    }

    public void set_clients(List<Client> _clients) {
        this._clients = _clients;
    }
}
