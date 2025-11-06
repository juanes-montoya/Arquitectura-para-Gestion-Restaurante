package dominio.servicios;

import dominio.modelos.Booking;
import java.util.List;

public class AdministradorBookings {

    // Lógica de negocio: validar disponibilidad, reglas de booking, etc.

    public AdministradorBookings() {}

    public Booking registrarBooking(Booking booking) {
        // Implementar reglas de dominio aquí
        return booking;
    }

    public boolean anularBooking(String bookingId) {
        return false;
    }

    public List<Booking> consultarBookingsPorRestaurant(String restaurantId) {
        return List.of();
    }
}