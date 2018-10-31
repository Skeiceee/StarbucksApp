/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.starbucksApp.dao;

import cl.usm.starbucksApp.dto.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sarayar
 */
@Local
public interface ProductosModelLocal {

    void agregarProducto(Producto producto);

    List<Producto> getProductos();
    
}
