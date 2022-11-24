package org.superjms.config.fileserver;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.fileserver
 * @ClassName FileServer
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 下午12:12
 * @Description TODO
 */
public class FileServer {
    /**
     * The Items.
     */
    private List<FileServerItem> _items;

    /**
     * Instantiates a new File server.
     */
    public FileServer() {
    }

    /**
     * Instantiates a new File server.
     *
     * @param _items the items
     */
    public FileServer(List<FileServerItem> _items) {
        this._items = _items;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<FileServerItem> get_items() {
        return _items;
    }

    /**
     * Sets items.
     *
     * @param _items the items
     */
    public void set_items(List<FileServerItem> _items) {
        this._items = _items;
    }
}
