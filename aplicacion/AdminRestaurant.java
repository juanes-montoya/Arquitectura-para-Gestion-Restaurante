package aplicacion;

import dominio.puertos.AlmacenRestaurants;
import dominio.modelos.Restaurant;
import java.util.Optional;

public class AdminRestaurant {

    private final AlmacenRestaurants almacen;

    public AdminRestaurant(AlmacenRestaurants almacen) {
        this.almacen = almacen;
    }

    public Optional<Restaurant> consultar(String restaurantId) {
        return almacen.consultarPorId(restaurantId);
    }
}