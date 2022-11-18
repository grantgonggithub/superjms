package org.superjms.rpc.server;

import org.apache.thrift.TException;
import org.superjms.rpc.SuperJMSServerConfig;

/**
 * rpc server. 的基类
 */
public interface ISuperJMSRpcServer {

    /**
     * Dispose.释放服务监听
     */
    public void  Dispose();

    /**
     * Rpc server register.注册服务
     *
     * @param superJMSServerConfig the super jms server config
     */
    public void  RpcServerRegister(SuperJMSServerConfig superJMSServerConfig);
}
