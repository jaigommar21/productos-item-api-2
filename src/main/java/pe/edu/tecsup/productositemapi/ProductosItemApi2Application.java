package pe.edu.tecsup.productositemapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductosItemApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductosItemApi2Application.class, args);
	}

}
