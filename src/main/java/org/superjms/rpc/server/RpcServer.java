package org.superjms.rpc.server;

import org.apache.thrift.TBaseProcessor;
import org.apache.thrift.TProcessor;
import org.slf4j.*;
import org.superjms.rpc.ThriftRpc;

import java.util.HashMap;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc.server
 * @ClassName RpcServer
 * @Author grantgong(巩建春)
 * @Date 2022/11/16 下午6:03
 * @Description TODO
 */
public class RpcServer<I extends ThriftRpc.Iface> extends TBaseProcessor<I> implements TProcessor {
     private static  final Logger _LOGGER=org.slf4j.LoggerFactory.getLogger(RpcServer.class.getName());
     public RpcServer(I Iface){
         super(Iface, getProcessMap(new HashMap<String,org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
     }

     protected  RpcServer(I Iface,java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap){
         super(Iface,getProcessMap(processMap));
     }

    private static  <I extends ThriftRpc.Iface> java.util.Map<java.lang.String,  org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
        processMap.put("Send", new ThriftRpc.Processor.Send());
        return processMap;
    }
}
