package org.superjms.config.fileserver;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.fileserver
 * @ClassName FileServerManager
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午12:14
 * @Description TODO
 */
public class FileServerManager {
    public static final String FILE_SERVER_NAME = "FileServer";
    private static List<FileServer> _fileServers;

    /**
     * 初始化配置
     * @param fileServer
     */
    public static void Initlize(FileServer fileServer){

    }

    /**
     * 获取文件服务器列表
     * @return
     */
    public static FileServerItem[] GetFileServers(){
        return  null;
    }
}
