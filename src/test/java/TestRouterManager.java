import org.superjms.rpc.router.RouterManager;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName PACKAGE_NAME
 * @ClassName TestRouterManager
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午2:37
 * @Description TODO
 */
public class TestRouterManager {

    public static void TestGetPooling() throws ExecutionException, InterruptedException {
        Hashtable<LocalTime,Integer> hashTable=new Hashtable<>();
        // 用CompletableFuture这样使用CompletableFuture.allOf等待所有执行完毕
        CompletableFuture<Void>[] completableFutures=new CompletableFuture[100];
        for (int i=0;i<100;i++) {
            completableFutures[i]=CompletableFuture.supplyAsync(new Supplier<Void>() {
                @Override
                public Void get() {
                    int index = RouterManager.GetPoolling(2, 6);
                    hashTable.put(LocalDateTime.now().toLocalTime(),index);
                    return null;
                }
            }).exceptionally(ex->{
                System.out.println("出现了异常");
                return null;
            });
            // 用传统的线程执行，不知道杀时候执行完毕，只能用Thread.Sleep()这样有问题
/*            new Thread(new Runnable() {
                @Override
                public void run() {
                    int index = RouterManager.GetPoolling(2, 6);
                    hashTable.put(LocalDateTime.now().toLocalTime(),index);
                    //completableFuture.complete("ok");
                    //System.out.println(String.format("time:%s,value:%d", LocalDateTime.now().toLocalTime(),index));
                }
            }).start();*/
        }
        // Thread.sleep(30*1000);
        CompletableFuture.allOf(completableFutures).get();
        Map.Entry<LocalTime,Integer>[] sortEntry=sortByKey(hashTable);
        for(Map.Entry<LocalTime,Integer> mp : sortEntry){
            System.out.println(String.format("Time:%s,Value:%d",mp.getKey(),mp.getValue()));
        }
    }

    private static Map.Entry<LocalTime,Integer>[] sortByKey(Hashtable ht){
        Set<Map.Entry<LocalTime,Integer>> entries= ht.entrySet();
        //Map.Entry<Date,Integer>[] newEntery=new Map.Entry[entries.size()];
        Map.Entry<LocalTime,Integer>[] newEntery = entries.toArray(new Map.Entry[entries.size()]);
        Arrays.sort(newEntery, new Comparator<Map.Entry<LocalTime, Integer>>() {
            @Override
            public int compare(Map.Entry<LocalTime, Integer> o1, Map.Entry<LocalTime, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        return  newEntery;
    }
}
