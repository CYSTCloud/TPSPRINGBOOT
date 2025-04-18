package tp0.tpspringboot.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title("TPSPRINGBOTO")
                        .version("1.0"));
    }
}

//   <dependency>
//      <groupId>org.springdoc</groupId>
//      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
//      <version>2.8.6</version>
//   </dependency>