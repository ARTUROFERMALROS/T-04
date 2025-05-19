package org.example.servicio;

import org.example.entidades.Vehiculo;
import org.example.repositorio.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServicio {

    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    public List<Vehiculo> listarVehiculo() {

        return vehiculoRepositorio.findAll();
    }

    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {

        return vehiculoRepositorio.save(vehiculo);
    }

    public Vehiculo editarVehiculo(Integer id) {

        return vehiculoRepositorio.findById(id).get();
    }

    public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {

        return vehiculoRepositorio.save(vehiculo);
    }

    public void eliminarVehiculo(Integer id) {

        vehiculoRepositorio.deleteById(id);
    }
}