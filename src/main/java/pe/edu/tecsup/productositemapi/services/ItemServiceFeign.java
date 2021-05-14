package pe.edu.tecsup.productositemapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.productositemapi.clients.ProductoClienteRest;
import pe.edu.tecsup.productositemapi.models.Item;
import pe.edu.tecsup.productositemapi.models.Producto;

@Service
public class ItemServiceFeign {

	@Autowired
	private ProductoClienteRest productoClienteRest;
	
	
	public Item findById(Long id, Integer cantidad) {
		Producto producto = productoClienteRest.detalle(id);		
		return new Item(producto, cantidad);
	}
	
}
