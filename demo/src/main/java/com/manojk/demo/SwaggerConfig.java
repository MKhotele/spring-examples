package com.manojk.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Configuration class for Swagger REST API documentation
 *
 */
@Configuration
@EnableSwagger2
/**
 * Run nad hit http://localhost:8080/swagger-ui.html to see it working
 */
public class SwaggerConfig {

  /**
   * @return Swagger Docker
   */
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            // .apis(RequestHandlerSelectors.basePackage("com.siemens.oss.domain.controller.service")) # does not work for interfaces
            .apis(RequestHandlerSelectors.basePackage("com.manojk.demo")) // works for implementations
            .paths(regex("/.*"))
            .build();
  }
}