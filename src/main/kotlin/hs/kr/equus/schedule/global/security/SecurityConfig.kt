package hs.kr.equus.schedule.global.security

import com.fasterxml.jackson.databind.ObjectMapper
import hs.kr.equus.schedule.global.security.jwt.UserRole
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain
import org.springframework.web.cors.CorsUtils

@Configuration
class SecurityConfig(
    private val objectMapper: ObjectMapper
) {
    @Bean
    protected fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http.csrf()
            .disable()
            .cors()
            .and()
            .formLogin()
            .disable()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)

        http.authorizeRequests()
            .requestMatchers(CorsUtils::isCorsRequest)
            .permitAll()
            .antMatchers(HttpMethod.PATCH, "/schedule/**")
            .hasRole(UserRole.ADMIN.name)
            .anyRequest()
            .permitAll()

        http
            .apply(FilterConfig(objectMapper))

        return http.build()
    }
}
