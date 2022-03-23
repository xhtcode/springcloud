package com.it.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 方案一 过滤指定路径
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //这句为了访问eureka控制台和/actuator时能做安全控制
        super.configure(http);
        //忽略指定路径的所有请求
        http.csrf().ignoringAntMatchers("/eureka/**");
    }
    /**
     * 方案二 保持密码验证的同时禁用CSRF防御机制
     * @param http
     * @throws Exception
     */
/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //如果直接用disable()会把安全验证也警用掉
        http.csrf().disable().authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }*/
}
