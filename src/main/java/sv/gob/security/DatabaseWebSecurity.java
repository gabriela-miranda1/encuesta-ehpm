package sv.gob.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DatabaseWebSecurity extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests() 
    // . . . .
    // El formulario de Login no requiere autenticacion
    .antMatchers(
        "/bootstrap/**",                        
        "/img/**",
        "/tinymce/**",
        "/logos/**").permitAll()
    .anyRequest().authenticated()
    .and().formLogin().loginPage("/login").permitAll();
    // . . . .
}
} 