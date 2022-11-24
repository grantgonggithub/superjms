package org.superjms.config;

import org.superjms.config.constkeyvalue.ConstItem;
import org.superjms.config.fileserver.FileServerItem;
import org.superjms.config.fileserver.FileServerManager;
import org.superjms.config.rpcclient.Client;
import org.superjms.config.rpcclient.RpcClients;
import org.superjms.zookeeper.WatcherBase;

import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName ServerSetting
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/18 下午9:22
 * @Description TODO
 */
public class ServerSetting {
    private static ConfigCenter _configCenter;
    private static Configuration _config;

    private static String _appName;

    private static String _environmentVariable;

    private static int _pool;

    private static  IUpdateConfigAction _updateConfigAction;

    private static Hashtable<String,IUpdateConfigAction> updateCallBackList=new Hashtable<>();

    private static ReentrantLock lock=new ReentrantLock();

    /**
     * 获取配置的常量信息
     * @param key
     * @return
     */
    public static ConstItem GetConstValue(String key){
        return ConfigManager.GetConstKeyValue(key);
    }

    static Random random=new Random((int)(new Date().getTime()));

    /**
     * 获取文件服务器配置
     * @return
     */
    public static FileServerItem GetFileServers(){
        FileServerItem[] items= FileServerManager.GetFileServers();
        if (items==null||items.length<1) return null;
        int index = random.nextInt(items.length);
        return items[index];
    }

    /**
     * 获取配置
     * @return
     */
    public static Configuration GetConfiguration(){
        return _config;
    }

    /**
     * 获取配置，并且在配置发生变化时，通过回调，通知变更内容
     * @param updateConfigAction
     * @return
     */
    public static Configuration GetConfiguration(IUpdateConfigAction updateConfigAction){
        _updateConfigAction=updateConfigAction;
        return GetConfiguration();
    }

    /**
     * 注册zookeeper使用
     * @param server
     * @param ip
     * @param port
     * @param timeOut
     * @param enable
     */
    public static void RegisterRouter(String server,String ip,int port,int timeOut,boolean enable){
        if (_configCenter.get_configType()!=ConfigType.Zookeeper){
            return;// 本地配置不走zookeeper;
        }
        // zookeeper的逻辑后面补充 TODO
    }

    /**
     * HttpProxy 配置,主要配置那些微服务可以提供外部api服务
     * @param proxyName
     * @param updateConfigAction
     * @return
     */
    public static Configuration GetHttpProxy(String proxyName,IUpdateConfigAction updateConfigAction){
        switch (_configCenter.get_configType()){
            case Unknown:
            case Local:
            case HttpFile:
                return _config;
            case Zookeeper:
                return null;// TODO
            default:
                return null;
        }
    }

    /**
     * RpcClinet 客户端初始化信息，路由
     * @param appName
     * @param updateConfigAction
     * @return
     */
    public static Configuration GetAppClient(String appName,IUpdateConfigAction updateConfigAction){
        switch (_configCenter.get_configType()){
            case Local:
            case Unknown:
            case HttpFile:
                return _config;
            case Zookeeper:
                return null;//TODO
            default:
                return null;
        }
    }

    /**
     * 获取某个服务在集群中的所有负载地址，包括自己,注意必须是基于zk部署，或者集中配置中心才行，单个super.json的配置是无法知道负载地址的
     * @param serverName
     * @return
     */
    public static Client GetAllClientsByServiceName(String serverName){
        if (_config!=null &&
                _config.get_rpcClients()!=null&&
                _config.get_rpcClients().get_clients()!=null&&
        _config.get_rpcClients().get_clients().size()>0){
            return _config.get_rpcClients().get_clients().stream().filter(c->c.get_serverName()==serverName).findFirst().get();
        }
        return null;
    }

    /**
     * 获取zk的路由配置
     * @param appName
     * @param routerWatcher
     * @return
     */
    private static RpcClients getRouters(String appName, WatcherBase routerWatcher){
        return null; //TODO
    }

    public static void Inilize(String appName,int pool){
        try {

        }catch (Exception ex){}
    }

    private static void checkInitlize(){
        if (_config==null&&_config.get_serverConfig()==null){
            lock.lock();
            if (_config==null&&_config.get_serverConfig()==null){

            }
        }

    }
   private static final String SUPER_JMS_ENVIRONMENT="SUPER_JMS_ENVIRONMENT";
    private static final String CONFIG_FILE="config%s.json";
    private static void initConfiguration(){
       String env = System.getenv(SUPER_JMS_ENVIRONMENT);
       String configFile=null;
       if (env==null||env.isEmpty()){
           configFile=String.format(CONFIG_FILE,"");
       }
       else{
           env=env.trim().toLowerCase();
           configFile=String.format(CONFIG_FILE,"."+env);
       }
        _environmentVariable=env;



    }









}
