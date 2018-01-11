package eu.printingtrackerv2.configuration;

import eu.printingtrackerv2.repository.UserRepository;
import eu.printingtrackerv2.service.CustomerService;
import eu.printingtrackerv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private UserService userService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(this.userService).passwordEncoder(getBCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()        //.anyRequest().permitAll(); -> as if to disable the security
                .antMatchers("/", "/register", "/bootstrap/**", "/jquery/**", "/text/javascript/**").permitAll()
                //.antMatchers("/user/**").hasRole("USER")
                .antMatchers("/user/**").access("hasRole('ADMIN') OR hasRole('USER')")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/address/**").hasRole("ADMIN")
                .antMatchers("/allCustomers/**").hasRole("ADMIN")
                .antMatchers("/customers/**").hasRole("ADMIN")
                .antMatchers("/packages/**").hasRole("ADMIN")
                .antMatchers("/customers#/**").hasRole("ADMIN")
                .antMatchers("/printers/**").access("hasRole('ADMIN') OR hasRole('USER')")
                .anyRequest().authenticated()
            .and()
                .formLogin().loginPage("/login").permitAll()
                .usernameParameter("username")
                .passwordParameter("password")
            .and()
                .rememberMe()
                .rememberMeCookieName("RememberMeFrom")
                .rememberMeParameter("rememberMe") //for the button "Remember Me"
                .key("Confidential")
                .tokenValiditySeconds(302400) //half week in seconds
                .and()
                .logout().logoutSuccessUrl("/login?logout").permitAll()
            .and()
                .exceptionHandling().accessDeniedPage("/unauthorized")
            .and()
                .csrf().disable();

    }

}
