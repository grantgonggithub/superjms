package org.superjms.config.rabbitmq;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.rabbitmq
 * @ClassName RabbitMQ
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:55
 * @Description TODO
 */
public class RabbitMQ {
    /**
     * The Host.
     */
    private List<HostItem> _host;

    /**
     * Instantiates a new Rabbit mq.
     */
    public RabbitMQ() {
    }

    /**
     * Instantiates a new Rabbit mq.
     *
     * @param _host the host
     */
    public RabbitMQ(List<HostItem> _host) {
        this._host = _host;
    }

    /**
     * Gets host.
     *
     * @return the host
     */
    public List<HostItem> get_host() {
        return _host;
    }

    /**
     * Sets host.
     *
     * @param _host the host
     */
    public void set_host(List<HostItem> _host) {
        this._host = _host;
    }
}
