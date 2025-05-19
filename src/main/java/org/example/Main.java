package org.example;

import org.example.entidades.Categoria;
import org.example.entidades.Vehiculo;
import org.example.repositorio.CategoriaRepositorio;
import org.example.repositorio.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria categoria = new Categoria("Hogar", "Categoria Hogar");
        categoriaRepositorio.save(categoria);
        Vehiculo vehiculo = new Vehiculo(1, "ABC1234", "TOYOTA COROLA")
        vehiculoRepositorio.save(vehiculo);
            }
}
