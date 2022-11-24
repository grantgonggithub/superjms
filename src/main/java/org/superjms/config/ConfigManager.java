package org.superjms.config;

import org.superjms.config.constkeyvalue.ConstItem;
import org.superjms.config.constkeyvalue.ConstKeyValue;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName ConfigManager
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午12:21
 * @Description TODO
 */
public class ConfigManager {
    private static final String RPCSERVICE = "RpcService";
    private static final String RPCCLIENT = "RpcClient";
    private static final String CONSTKEYVALUE = "ConstKeyValue";
    private static Hashtable<String, ConstItem> _constMap = new Hashtable<>();
    private static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    /**
     *
     * @param constKeyValue
     */
    public static void Initlize(ConstKeyValue constKeyValue) {
        if (constKeyValue != null) {
            updateConstKeyValue(constKeyValue);
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public static ConstItem GetConstKeyValue(String key) {
        Lock readlock = readWriteLock.readLock();
        try {
            if (readlock.tryLock(100, TimeUnit.MILLISECONDS)) {
                if (_constMap.contains(key.toLowerCase())) {
                    return _constMap.get(key.toLowerCase());
                }
            }
        } catch (InterruptedException ex) {

        } finally {
            readlock.unlock();
        }

        return null;
    }

    /**
     *
     * @param constKeyValue
     */
    private static void updateConstKeyValue(ConstKeyValue constKeyValue) {
        if (constKeyValue==null || constKeyValue.get_items().size()<1) return;
        Lock writelock = readWriteLock.writeLock();
        try {
            if (writelock.tryLock(100, TimeUnit.MILLISECONDS)) {
                constKeyValue.get_items().forEach(c->{
                    String key=c.get_key();
                    String value=c.get_value();
                    if (!key.isEmpty()&&!value.isEmpty()) {
                        ConstItem kv = new ConstItem(key.toLowerCase(), value.toLowerCase());
                        _constMap.put(kv.get_key(), kv);
                    }
                });
            }
        } catch (InterruptedException ex) {

        } finally {
            writelock.unlock();
        }
    }
}
