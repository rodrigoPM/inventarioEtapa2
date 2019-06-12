package com.pdm.sube.cum.inventarioetapa2.menu;

public class Integrante {
    private int id;
    private String carnet;
    private String nombre;
    private String tablas;
    private int imagen;

    public Integrante(){}
    public Integrante(int id, String carnet, String nombre, String tablas, int imagen) {
        this.id = id;
        this.carnet = carnet;
        this.nombre = nombre;
        this.tablas = tablas;
        this.imagen = imagen;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTablas() {
        return tablas;
    }

    public void setTablas(String tablas) {
        this.tablas = tablas;
    }
}
