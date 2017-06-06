package nguyenvanphituoc.configuration;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.mem.InMemoryUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.social.security.SpringSocialConfigurer;

import nguyenvanphituoc.service.FacebookConnectionSignup;
import nguyenvanphituoc.service.FacebookSignInAdapter;
import nguyenvanphituoc.service.SocialUserDetailService;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = { "nguyenvanphituoc.service.security" })
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

/*	@Autowired
	private ConnectionFactoryLocator connectionFactoryLocator;

	@Autowired
	private UsersConnectionRepository usersConnectionRepository;

	@Autowired
	private FacebookConnectionSignup facebookConnectionSignup;*/


	@Override
	public void configure(WebSecurity web) throws Exception {
		web
		//Spring Security ignores request to static resources such as CSS or JS files.
		.ignoring()
		.antMatchers("/resources/**");
	}
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(passwordencoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/admin", "/edit/**", "/delete-document/**", "/delete/**", "/new/**", "/add-document/**")
			.hasRole("ADMIN")
		// ROLE_ADMIN
		.antMatchers("/login*","/signin/**","/signup/**").permitAll()
		.anyRequest().permitAll()
		
		.and()
		.formLogin()
		.loginPage("/login")
		.usernameParameter("username")
		.passwordParameter("password")
		.and()
		.logout()
		.logoutUrl("/logout")
		.deleteCookies("JSESSIONID")
		.logoutSuccessUrl("/login?logout") 
		.and()
		.exceptionHandling()
		.accessDeniedPage("/403")
		//Adds the SocialAuthenticationFilter to Spring Security's filter chain.
		.and()
		// apply the configuration from the socialConfigurer (adds the SocialAuthenticationFilter)
		.apply(new SpringSocialConfigurer())
		.and()
		.csrf();
	}

	@Bean(name="passwordEncoder")
	public PasswordEncoder passwordencoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SocialUserDetailsService socialUsersDetailService() {
		return new SocialUserDetailService(userDetailsService());
	}
/*	@Bean
	// @Primary
	public ProviderSignInController providerSignInController() {
		((InMemoryUsersConnectionRepository) usersConnectionRepository).setConnectionSignUp(facebookConnectionSignup);
		return new ProviderSignInController(connectionFactoryLocator, usersConnectionRepository, new FacebookSignInAdapter());
	}*/
}