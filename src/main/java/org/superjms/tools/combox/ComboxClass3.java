package org.superjms.tools.combox;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.tools.combox
 * @ClassName ComboxClass3
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午5:25
 * @Description TODO
 */
public class ComboxClass3<T1,T2,T3>{
    private T1 _v1;
    private T2 _v2;
    private T3 _v3;

    public ComboxClass3() {
    }

    public ComboxClass3(T1 _v1, T2 _v2, T3 _v3) {
        this._v1 = _v1;
        this._v2 = _v2;
        this._v3 = _v3;
    }

    public T1 get_v1() {
        return _v1;
    }

    public void set_v1(T1 _v1) {
        this._v1 = _v1;
    }

    public T2 get_v2() {
        return _v2;
    }

    public void set_v2(T2 _v2) {
        this._v2 = _v2;
    }

    public T3 get_v3() {
        return _v3;
    }

    public void set_v3(T3 _v3) {
        this._v3 = _v3;
    }
}

