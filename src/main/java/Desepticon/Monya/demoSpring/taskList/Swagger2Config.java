//package Desepticon.Monya.demoSpring.taskList;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//@Configuration
//@EnableSwagger2
//@EnableWebMvc
////@EnableSwagger2WebMvc
////extends WebMvcConfigurationSupport
//public class Swagger2Config {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
////                .apis(RequestHandlerSelectors.basePackage("Desepticon.Monya.demoSpring.taskList"))
//                .paths(PathSelectors.any())
////                .paths(regex("/api/tasks"))
//                .build();
//    }
//
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("swagger-ui.html")
////                .addResourceLocations("classpath:/META-INF/resources/");
////
////        registry.addResourceHandler("/webjars/**")
////                .addResourceLocations("classpath:/META-INF/resources/webjars/");
////    }
//}