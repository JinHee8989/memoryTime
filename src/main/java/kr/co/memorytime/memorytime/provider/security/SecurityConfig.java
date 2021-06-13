package kr.co.memorytime.memorytime.provider.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().ignoringAntMatchers("/h2-console/**");
        http
                .authorizeRequests()
                .antMatchers( "/user/register","/user/sign-up","/h2-console/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/user/login")
                .permitAll();
        http
                .headers()
                .frameOptions()
                .disable();
    }

//    @Override
//    public void configure(WebSecurity web) {
//        // /css/**, /images/**, /js/** 등 정적 리소스는 보안필터를 거치지 않게 한다.
//        web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
//    }

}
