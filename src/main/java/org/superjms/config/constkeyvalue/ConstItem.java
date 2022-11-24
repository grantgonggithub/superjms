package org.superjms.config.constkeyvalue;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.constkeyvalue
 * @ClassName ConstItem
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:03
 * @Description 配置文件中定义的key - value的配置
 */
public class ConstItem {
    /**
     * The Key.
     */
    /*配置中的key*/
    private String _key;

    /**
     * The Value.
     */
    /*配置中的key对应的value*/
    private String _value;

    /**
     * Gets key.
     *
     * @return the key
     */
    public String get_key() {
        return _key;
    }

    /**
     * Sets key.
     *
     * @param _key the key
     */
    public void set_key(String _key) {
        this._key = _key;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String get_value() {
        return _value;
    }

    /**
     * Sets value.
     *
     * @param _value the value
     */
    public void set_value(String _value) {
        this._value = _value;
    }

    /**
     * Instantiates a new Const item.
     *
     * @param _key   the key
     * @param _value the value
     */
    public ConstItem(String _key, String _value) {
        this._key = _key;
        this._value = _value;
    }

    /**
     * Instantiates a new Const item.
     */
    public ConstItem() {
    }
}
