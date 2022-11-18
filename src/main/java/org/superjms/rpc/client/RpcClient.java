package org.superjms.rpc.client;

import org.apache.thrift.TServiceClient;
import org.superjms.rpc.ThriftRpc;

/**
 * Copyright(C) 2020 顺兴文旅版权所有
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc.client
 * @ClassName RpcClient
 * @Author grantgong(巩建春)
 * @Date 2022/11/16 下午5:57
 * @Description TODO
 */
public class RpcClient extends TServiceClient implements ThriftRpc.Iface {


    public RpcClient(org.apache.thrift.protocol.TProtocol prot)
    {
        super(prot, prot);
    }

    public RpcClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        super(iprot, oprot);
    }

    @Override
    public java.lang.String Send(java.lang.String my_args) throws org.apache.thrift.TException
    {
        send_Send(my_args);
        return recv_Send();
    }

    public void send_Send(java.lang.String my_args) throws org.apache.thrift.TException
    {
        ThriftRpc.Send_args args = new ThriftRpc.Send_args();
        args.setMy_args(my_args);
        sendBase("Send", args);
    }

    public java.lang.String recv_Send() throws org.apache.thrift.TException
    {
        ThriftRpc.Send_result result = new ThriftRpc.Send_result();
        receiveBase(result, "Send");
        if (result.isSetSuccess()) {
            return result.success;
        }
        throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "Send failed: unknown result");
    }

}
