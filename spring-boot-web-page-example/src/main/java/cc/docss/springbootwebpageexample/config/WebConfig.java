package cc.docss.springbootwebpageexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ZhcChen
 * @since 2022-06-26 09:06:12
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/").addResourceLocations("classpath:/dist/index.html");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
