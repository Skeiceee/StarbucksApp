/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.starbucksApp.controllers;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author sarayar
 */
@Named(value = "productosManagedBean")
@ViewScoped
public class ProductosManagedBean implements Serializable {

    private String nombreTxt;
    private String descripcionTxt;
    private int valorTxt;
    /**
     * Creates a new instance of ProductosManagedBean
     */
    public ProductosManagedBean() {
    }

    public void agregarProducto(ActionEvent ev){
        String mensaje = "El producto "
                + nombreTxt + " " + valorTxt;
        //TODO: Agregar al EJB, construir el Producto blabla
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(mensaje));
    }
    
    
    public String getNombreTxt() {
        return nombreTxt;
    }

    public void setNombreTxt(String nombreTxt) {
        this.nombreTxt = nombreTxt;
    }

    public String getDescripcionTxt() {
        return descripcionTxt;
    }

    public void setDescripcionTxt(String descripcionTxt) {
        this.descripcionTxt = descripcionTxt;
    }

    public int getValorTxt() {
        return valorTxt;
    }

    public void setValorTxt(int valorTxt) {
        this.valorTxt = valorTxt;
    }
    
}
