package org.superjms.rpc.router;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.rpc.router
 * @ClassName RouterManager
 * @Author grantgong(巩建春)
 * @Date 2022 /11/17 下午2:02
 * @Description TODO
 */
public class RouterManager {
    /**
     * Get pool int.
     *
     * @param url the url
     * @return the int
     */
    public static int GetPool(String url){
        return 0;
    }

    /**
     * The constant next.
     */
    private static int next=0;
    /**
     * The constant atomicInteger.
     */
    private static AtomicInteger atomicInteger=new AtomicInteger(0);
    /**
     * 获取一个在指定范围内的原子自增的方法
     *
     * @param min the min
     * @param max the max
     * @return the int
     */
    public static int GetPoolling(int min,int max) {
        int newValue=0;
        do {
            newValue=next+1; // 先预+1；
            if (newValue >= max || newValue < min) {
               next = newValue = min;// +1后的值不在要求的范围内，改成增加的起点
                atomicInteger.set(next);
            }
        } // 比较next（上一次的值）和atomicInteger中的值是否一样，如果一样则设置为新值，不一样说明这个过程中被别的线程修改了重新计算，直到一样
        while (!atomicInteger.compareAndSet(next, newValue));
        return newValue;
    }

    private static Random random=new Random();

    /**
     * Get random int.
     *
     * @param min the min
     * @param max the max
     * @return the int
     */
    public static int GetRandom(int min,int max) {
        random.setSeed(System.currentTimeMillis());
        return random.nextInt(min, max);
    }
}
