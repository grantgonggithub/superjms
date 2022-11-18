package org.superjms.config;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName ConfigCenter
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/18 下午9:29
 * @Description TODO
 */
public class ConfigCenter {

    /*配置类型*/
    private ConfigType _configType;
    /*zk的ip和端口是统一配置在一起的，主要考虑到zk集群部署会有多个节点  ip1:port1,ip2:port2*/
    private String _ip;
    /*如果是zk配置，表示连接的超时时间*/
    private int sessionTimeout;
}
