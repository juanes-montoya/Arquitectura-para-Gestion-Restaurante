package dominio.puertos;

import dominio.modelos.Booking;
import java.util.List;
import java.util.Optional;

public interface AlmacenBookings {
    Booking persistir(Booking booking);
    Optional<Booking> consultarPorId(String bookingId);
    List<Booking> consultarPorRestaurant(String restaurantId);
    boolean remover(String bookingId);
}