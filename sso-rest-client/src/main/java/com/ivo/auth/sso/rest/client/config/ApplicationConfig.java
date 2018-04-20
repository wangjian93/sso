
package com.ivo.auth.sso.rest.client.config;

import com.ivo.auth.sso.rest.client.bean.SysUser;
import com.ivo.auth.sso.rest.client.service.UserRepertory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 应用配置
 *
 * @author Carl
 * @date 2017/9/14
 * @since JDK1.7
 */
@Configuration
public class ApplicationConfig {
    @Bean
    public UserRepertory userRepertory() {
        SysUser admin = new SysUser().setUsername("rest-admin").setPassword("202cb962ac59075b964b07152d234b70").addAttribute("key", "keyVal");
        SysUser test = new SysUser().setUsername("rest-test").setPassword("123").addAttribute("test", "testVal");
        SysUser locked = new SysUser().setUsername("rest-locked").setPassword("123").setLocked(true);
        SysUser disable = new SysUser().setUsername("rest-disable").setPassword("123").setDisable(true);
        SysUser expired = new SysUser().setUsername("rest-expired").setPassword("123").setExpired(true);
        return new UserRepertory(admin, test, locked, disable, expired);
    }
}
