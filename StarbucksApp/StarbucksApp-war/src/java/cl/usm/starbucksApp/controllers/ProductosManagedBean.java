/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.starbucksApp.controllers;

import cl.usm.starbucksApp.dao.ProductosModelLocal;
import cl.usm.starbucksApp.dto.Producto;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
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

    @EJB
    private ProductosModelLocal productosModel;
    
    private List<Producto> productos;
    
    
    private String nombreTxt;
    private String descripcionTxt;
    private int valorTxt;
    
    /**
     * Creates a new instance of ProductosManagedBean
     */
    public ProductosManagedBean() {
    }
    
    @PostConstruct
    public void init(){
        this.productos = productosModel.getProductos();
    }
    
    public void agregarProducto(ActionEvent ev){
        
        Producto producto = new Producto();
        producto.setNombre(nombreTxt);
        producto.setDescripcion(descripcionTxt);
        producto.setValor(valorTxt);
        
        productosModel.agregarProducto(producto);
        
        try {
            FacesContext.getCurrentInstance()
                    .getExternalContext()
                    .redirect("ver_productos.xhtml");
        } catch (IOException ex) {
            
        }
        
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
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
