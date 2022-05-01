package com.github.lianjiatech.retrofit.spring.boot.degrade;

import okhttp3.Interceptor;

/**
 * @author 陈添明
 * @since 2022/4/30 3:34 下午
 */
public interface RetrofitDegrade extends Interceptor {

    String NONE = "none";
    String SENTINEL = "sentinel";

    /**
     * 对于指定Retrofit接口，是否允许降级
     * @param retrofitInterface Retrofit接口
     * @return 是否允许降级
     */
    boolean isEnableDegrade(Class<?> retrofitInterface);

    /**
     * 加载指定Retrofit接口下的降级规则
     * @param retrofitInterface Retrofit接口
     */
    void loadDegradeRules(Class<?> retrofitInterface);

}
