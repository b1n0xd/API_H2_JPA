package br.com.attornatus.cliente.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;



public class modelMapper {
    @Bean
    public ModelMapper metodoQueCriaUmModelMapper() {
        return new ModelMapper();

    }
}