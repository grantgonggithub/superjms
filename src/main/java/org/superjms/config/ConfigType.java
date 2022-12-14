package org.superjms.config;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName ConfigType
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/18 下午9:24
 * @Description 服务的配置类型
 */

/*
* 服务的配置类型
* */
public enum ConfigType {
    Unknown,
    /*本地配置*/
    Local,
    /*zookeeper配置*/
    Zookeeper,
    /*基于api的配置文件*/
    HttpFile,
}
