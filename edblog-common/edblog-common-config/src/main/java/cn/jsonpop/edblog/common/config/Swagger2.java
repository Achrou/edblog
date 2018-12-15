package cn.jsonpop.edblog.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * description Swagger2接口生成文档配置类
 * 创建时间 2018/7/31
 *
 * @author 仇兴洲
 */
@ConditionalOnProperty(name = "swagger2.enable", havingValue = "true")
@Configuration
@EnableSwagger2//开启swagger2接口文档
@Profile(value = "dev")
public class Swagger2 {

    @Value("${swagger2.basePackage}")
    private String basePackage;
    @Value("${swagger2.enable}")
    private boolean enable;
    @Value("${swagger2.title}")
    private String title;
    @Value("${swagger2.desc}")
    private String desc;
    @Value("${swagger2.termsOfServiceUrl}")
    private String termsOfServiceUrl;
    @Value("${swagger2.version}")
    private String version;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(enable)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(desc)
                .termsOfServiceUrl(termsOfServiceUrl)
                .version(version)
                .build();

    }
}