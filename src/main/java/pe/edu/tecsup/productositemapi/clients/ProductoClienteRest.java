package pe.edu.tecsup.productositemapi.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pe.edu.tecsup.productositemapi.models.Producto;

@FeignClient(name = "productos-api", 
			url = "localhost:8080" )
public interface ProductoClienteRest {


	//@GetMapping("/api/productos/{id}")
	@GetMapping("/productos/{id}")
	public Producto detalle(@PathVariable Long id);
	
}
