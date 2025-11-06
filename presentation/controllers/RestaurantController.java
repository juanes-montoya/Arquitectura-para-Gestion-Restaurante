package presentation.controllers;

import aplicacion.AdminRestaurant;
import dominio.modelos.Restaurant;
import java.util.Optional;

public class RestaurantController {

    private final AdminRestaurant adminRestaurant;

    public RestaurantController(AdminRestaurant admin) { 
        this.adminRestaurant = admin; 
    }

    public Optional<Restaurant> consultar(String restaurantId) { 
        return adminRestaurant.consultar(restaurantId); 
    }
}