package org.example.entidades;


import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "placa", nullable = false, length = 150)
    private String placa;

    @Column(nullable = true, length = 180)
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(Integer id, String placa, String modelo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
    }

    public Vehiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

