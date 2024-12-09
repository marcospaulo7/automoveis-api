package com.example.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AutomovelResponseDTO {

    private int id;
    private String marca;
    private String modelo;
    private BigDecimal valor;

    private LocalDate dataCadastro;

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
}
