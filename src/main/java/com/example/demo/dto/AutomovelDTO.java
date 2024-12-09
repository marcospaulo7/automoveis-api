package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class AutomovelDTO {

    @JsonProperty("marca")
    private String marca;
    @JsonProperty("modelo")
    private String modelo;
    @JsonProperty("valor")
    private BigDecimal valor;

    public AutomovelDTO(String marca, String modelo, BigDecimal valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
