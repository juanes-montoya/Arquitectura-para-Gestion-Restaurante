package dominio.puertos;

import dominio.modelos.Restaurant;
import java.util.Optional;

public interface AlmacenRestaurants {
    Optional<Restaurant> consultarPorId(String restaurantId);
}