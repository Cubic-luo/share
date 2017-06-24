package share.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(SecurityConfig.class)
@ImportResource(value="classpath:spring/*.xml")
@ComponentScan(basePackages = { "share.service"})
public class RootConfig {

}
