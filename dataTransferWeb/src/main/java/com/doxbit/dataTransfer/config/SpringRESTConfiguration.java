package com.doxbit.dataTransfer.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.doxbit.dataTransfer")
public class SpringRESTConfiguration {
     
 
}