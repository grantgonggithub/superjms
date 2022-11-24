package org.superjms.config.redis;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.redis
 * @ClassName RedisConfig
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 下午12:04
 * @Description TODO
 */
public class RedisConfig {
    /**
     * The Nodes.
     */
    private List<RedisNode> _nodes;

    /**
     * Instantiates a new Redis config.
     */
    public RedisConfig() {
    }

    /**
     * Instantiates a new Redis config.
     *
     * @param _nodes the nodes
     */
    public RedisConfig(List<RedisNode> _nodes) {
        this._nodes = _nodes;
    }

    /**
     * Gets nodes.
     *
     * @return the nodes
     */
    public List<RedisNode> get_nodes() {
        return _nodes;
    }

    /**
     * Sets nodes.
     *
     * @param _nodes the nodes
     */
    public void set_nodes(List<RedisNode> _nodes) {
        this._nodes = _nodes;
    }
}
