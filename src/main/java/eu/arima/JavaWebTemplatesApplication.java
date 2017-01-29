package eu.arima;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class JavaWebTemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaWebTemplatesApplication.class, args);
	}
	
	@Configuration
	public static class SpringMvcConfig extends WebMvcConfigurerAdapter {

	    @Override
	    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
	        argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
	    }
	}
	
}
