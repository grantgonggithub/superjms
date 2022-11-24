package org.superjms.config.httpproxy;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.httpproxy
 * @ClassName HttpProxyItem
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 下午12:06
 * @Description TODO
 */
public class HttpProxyItem {
    /**
     * The Name.
     */
    private String _name;

    /**
     * Instantiates a new Http proxy item.
     */
    public HttpProxyItem() {
    }

    /**
     * Instantiates a new Http proxy item.
     *
     * @param _name the name
     */
    public HttpProxyItem(String _name) {
        this._name = _name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String get_name() {
        return _name;
    }

    /**
     * Sets name.
     *
     * @param _name the name
     */
    public void set_name(String _name) {
        this._name = _name;
    }
}
