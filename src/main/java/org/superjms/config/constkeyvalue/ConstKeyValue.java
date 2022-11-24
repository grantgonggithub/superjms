package org.superjms.config.constkeyvalue;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.constkeyvalue
 * @ClassName ConstKeyValue
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:03
 * @Description TODO
 */
public class ConstKeyValue {
    /**
     * The Items.
     */
    /*配置常量的集合*/
    private List<ConstItem> _items;

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<ConstItem> get_items() {
        return _items;
    }

    /**
     * Sets items.
     *
     * @param _items the items
     */
    public void set_items(List<ConstItem> _items) {
        this._items = _items;
    }

    /**
     * Instantiates a new Const key value.
     *
     * @param _items the items
     */
    public ConstKeyValue(List<ConstItem> _items) {
        this._items = _items;
    }

    /**
     * Instantiates a new Const key value.
     */
    public ConstKeyValue() {
    }
}
