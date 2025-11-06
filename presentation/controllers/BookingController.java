package presentation.controllers;

import aplicacion.AdminBooking;
import dominio.modelos.Booking;
import java.util.List;

public class BookingController {

    private final AdminBooking adminBooking;

    public BookingController(AdminBooking adminBooking) {
        this.adminBooking = adminBooking;
    }

    // Métodos que manejarían peticiones HTTP (que son simulados)
    public Booking registrar(Booking booking) { 
        return adminBooking.registrarBooking(booking); 
    }

    public boolean remover(String bookingId) { 
        return adminBooking.anularBooking(bookingId); 
    }

    public List<Booking> consultar(String restaurantId) { 
        return adminBooking.consultarPorRestaurant(restaurantId); 
    }
}