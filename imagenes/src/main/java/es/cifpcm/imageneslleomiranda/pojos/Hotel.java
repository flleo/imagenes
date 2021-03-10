/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.imageneslleomiranda.pojos;

/**
 *
 * @author l
 */
public class Hotel {
    private int id_precioshab,precio;
    private String cod_hotel;

    public Hotel() {
    }

    public Hotel(int id_precioshab, int precio, String cod_hotel) {
        this.id_precioshab = id_precioshab;
        this.precio = precio;
        this.cod_hotel = cod_hotel;
    }

    public int getId_precioshab() {
        return id_precioshab;
    }

    public void setId_precioshab(int id_precioshab) {
        this.id_precioshab = id_precioshab;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(String cod_hotel) {
        this.cod_hotel = cod_hotel;
    }
    
    
}
