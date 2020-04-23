package in.nit.inter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




@Component
public class AppConfig implements WebMvcConfigurer{

	@Autowired
	WishIntercept wish;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(wish);
	}
	
	
	
}
