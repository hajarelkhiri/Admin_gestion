package com.example.admin_gestion;

import com.example.admin_gestion.Model.Endroit;
import com.example.admin_gestion.Repo.EndroitRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.MultipartFilter;

@SpringBootApplication
public class AdminGestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminGestionApplication.class, args);
    }




}
