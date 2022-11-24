package org.superjms.config.redis;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.redis
 * @ClassName RedisNode
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 下午12:01
 * @Description TODO
 */
public class RedisNode {
    /**
     * The Node name.
     */
    private String _nodeName;
    /**
     * The Is master slave.
     */
    private boolean _isMasterSlave;
    /**
     * The Items.
     */
    private List<RedisItem> _items;

    /**
     * Instantiates a new Redis node.
     */
    public RedisNode() {
    }

    /**
     * Instantiates a new Redis node.
     *
     * @param _nodeName      the node name
     * @param _isMasterSlave the is master slave
     * @param _items         the items
     */
    public RedisNode(String _nodeName, boolean _isMasterSlave, List<RedisItem> _items) {
        this._nodeName = _nodeName;
        this._isMasterSlave = _isMasterSlave;
        this._items = _items;
    }

    /**
     * Gets node name.
     *
     * @return the node name
     */
    public String get_nodeName() {
        return _nodeName;
    }

    /**
     * Sets node name.
     *
     * @param _nodeName the node name
     */
    public void set_nodeName(String _nodeName) {
        this._nodeName = _nodeName;
    }

    /**
     * Is is master slave boolean.
     *
     * @return the boolean
     */
    public boolean is_isMasterSlave() {
        return _isMasterSlave;
    }

    /**
     * Sets is master slave.
     *
     * @param _isMasterSlave the is master slave
     */
    public void set_isMasterSlave(boolean _isMasterSlave) {
        this._isMasterSlave = _isMasterSlave;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<RedisItem> get_items() {
        return _items;
    }

    /**
     * Sets items.
     *
     * @param _items the items
     */
    public void set_items(List<RedisItem> _items) {
        this._items = _items;
    }
}
