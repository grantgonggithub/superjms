package org.superjms.config.httpproxy;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.httpproxy
 * @ClassName HttpProxy
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 下午12:08
 * @Description TODO
 */
public class HttpProxy {
    /**
     * The Items.
     */
    private List<HttpProxyItem> _items;

    /**
     * Instantiates a new Http proxy.
     */
    public HttpProxy() {
    }

    /**
     * Instantiates a new Http proxy.
     *
     * @param _items the items
     */
    public HttpProxy(List<HttpProxyItem> _items) {
        this._items = _items;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<HttpProxyItem> get_items() {
        return _items;
    }

    /**
     * Sets items.
     *
     * @param _items the items
     */
    public void set_items(List<HttpProxyItem> _items) {
        this._items = _items;
    }
}
