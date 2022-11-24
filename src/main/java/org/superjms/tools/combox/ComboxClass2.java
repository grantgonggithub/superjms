package org.superjms.tools.combox;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.tools.combox
 * @ClassName ComboxClass2
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午5:25
 * @Description TODO
 */
public class ComboxClass2<T1,T2>{
    private T1 _v1;
    private T2 _v2;

    /**
     * Instantiates a new Combox class 2.
     */
    public ComboxClass2() {
    }

    /**
     * Instantiates a new Combox class 2.
     *
     * @param _v1 the v 1
     * @param _v2 the v 2
     */
    public ComboxClass2(T1 _v1, T2 _v2) {
        this._v1 = _v1;
        this._v2 = _v2;
    }

    /**
     * Gets v 1.
     *
     * @return the v 1
     */
    public T1 get_v1() {
        return _v1;
    }

    /**
     * Sets v 1.
     *
     * @param _v1 the v 1
     */
    public void set_v1(T1 _v1) {
        this._v1 = _v1;
    }

    /**
     * Gets v 2.
     *
     * @return the v 2
     */
    public T2 get_v2() {
        return _v2;
    }

    /**
     * Sets v 2.
     *
     * @param _v2 the v 2
     */
    public void set_v2(T2 _v2) {
        this._v2 = _v2;
    }
}

