package com.mycompany.proyectocomputador;

public class computador {

    private String codigo;
    private String marca;
    private String procesador;
    private int ram;

    public computador() {
    }

    public computador(String codigo, String marca, String procesador, int ram) {
        this.codigo = codigo;
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return codigo + " - " + marca + " - " + procesador + " - " + ram;
    }
}
