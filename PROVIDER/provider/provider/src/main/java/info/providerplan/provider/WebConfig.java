package info.providerplan.provider;


//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/jio") // Apply to all endpoints
                .allowedOrigins("http://127.0.0.1:5500") // Replace with your frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
                .allowedHeaders("*"); // Allow all headers
    
    
	    registry.addMapping("/jio/airtel")
			    .allowedOrigins("http://127.0.0.1:5500")
			    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
			    .allowedHeaders("*")
			    .allowCredentials(true);
    
    }
}