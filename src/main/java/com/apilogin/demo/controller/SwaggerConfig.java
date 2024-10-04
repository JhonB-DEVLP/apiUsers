package com.apilogin.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Api desenvolvida para registro e login de usuários")
                        .version("1.0.0")
                        .description("Essa é uma api de configuração de cadastro e autenticação de usuários, para uma plataforma ou serviço.")
                        .contact(new Contact()
                            .name("Jhones Bonifacio da Silva")
                            .url("https://portifolio-jhones-bonifacio.vercel.app/")
                            .email("jhonesbonifacio_18@outlook.com")));
    }
}