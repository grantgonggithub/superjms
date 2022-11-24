package org.superjms.tools.combox;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.tools.combox
 * @ClassName ComboxClass1
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午5:24
 * @Description TODO
 */
public class ComboxClass1<T> {
    /**
     * The V.
     */
    private T _v;

    /**
     * Instantiates a new Combox class 1.
     */
    public ComboxClass1() {
    }

    /**
     * Instantiates a new Combox class 1.
     *
     * @param _v the v
     */
    public ComboxClass1(T _v) {
        this._v = _v;
    }

    /**
     * Gets v.
     *
     * @return the v
     */
    public T get_v() {
        return _v;
    }

    /**
     * Sets v.
     *
     * @param _v the v
     */
    public void set_v(T _v) {
        this._v = _v;
    }
}
