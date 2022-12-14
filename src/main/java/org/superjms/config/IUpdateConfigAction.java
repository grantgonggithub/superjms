package org.superjms.config;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config
 * @ClassName IUpdateConfigAction
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午2:49
 * @Description TODO
 */
public interface IUpdateConfigAction {
    /**
     * 统一的更新配置的接口
     * @param configuration
     */
    public void Update(Configuration configuration);
}
