package infrastructure.api;

import dominio.modelos.Restaurant;
import dominio.puertos.AlmacenRestaurants;
import java.util.Optional;

public class ClienteAPIRestaurant implements AlmacenRestaurants {

    // Adaptador a una API externa de restaurants

    @Override
    public Optional<Restaurant> consultarPorId(String restaurantId) {
        return Optional.empty();
    }
}