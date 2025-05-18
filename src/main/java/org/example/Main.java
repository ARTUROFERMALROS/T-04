package org.example;

import org.example.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
// los dias de semana
        //Categoria categoria = new Categoria("Hogar", "Categoria Hogar");
        //categoriaRepositorio.save(categoria);
    }
}