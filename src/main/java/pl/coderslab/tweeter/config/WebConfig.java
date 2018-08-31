package pl.coderslab.tweeter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "pl.coderslab.tweeter")
@EnableWebMvc
//@EnableJpaRepositories(basePackages = "pl.coderslab.tweeter.repositories")
//@EnableTransactionManagement
public class WebConfig extends WebMvcConfigurerAdapter {

}
