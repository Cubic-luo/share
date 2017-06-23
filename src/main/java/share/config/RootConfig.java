package share.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.access.SecurityConfig;

@Configuration
@ImportResource(value="classpath:spring/*.xml")
@Import(SecurityConfig.class)
@ComponentScan(basePackages = { "share.service"})
public class RootConfig {

}
