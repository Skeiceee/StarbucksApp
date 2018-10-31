/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.starbucksApp.dao;

import cl.usm.starbucksApp.dto.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author sarayar
 */
@Singleton
public class ProductosModel implements ProductosModelLocal {

    private final List<Producto> productos = new ArrayList<>();
    
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Producto> getProductos() {
        return productos;
    }
    
}
