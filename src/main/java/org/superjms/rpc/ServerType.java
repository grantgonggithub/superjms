package org.superjms.rpc;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc
 * @ClassName ServerType
 * @Author grantgong(巩建春)
 * @Date 2022/11/17 上午9:15
 * @Description TODO
 */
public enum ServerType {
    //占了个位
    None,
    //占了个位
    Unkown,
    // thrift rpc
    Thrift,
    // grpc
    Grpc,
    // 定时任务
    TaskWorker,
    // http网关
    HttpProxy,
    Http,
    HttpWebApi;
}
