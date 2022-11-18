package org.superjms.rpc.router;

import java.util.EnumSet;

/**
 * Copyright(C) 2020 顺兴文旅版权所有
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc.router
 * @ClassName RouterType
 * @Author grantgong(巩建春)
 * @Date 2022/11/17 下午12:00
 * @Description TODO
 */
public enum RouterType {
    /*未知*/
    Unknown("0"),
    /*一致性hash*/
    Hash("1"),
    /*随机*/
    Random("2"),
    /*轮询*/
    Pooling("3");

    private final String routerType;
    RouterType(String _routerType) {
        this.routerType=_routerType;
    }

    @Override
    public String toString() {
        return this.routerType;
    }

    public static RouterType Parser(String _routerType){
        if (_routerType==null){
            return RouterType.Unknown;
        }
        try
        {
            return RouterType.valueOf(_routerType);
        }
        catch (Exception ex)
        {
            return RouterType.Unknown;
        }
    }
}
