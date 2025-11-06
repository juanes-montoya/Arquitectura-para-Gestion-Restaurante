package infrastructure.persistence;

import dominio.modelos.Booking;
import dominio.puertos.AlmacenBookings;
import java.util.List;
import java.util.Optional;

public class AlmacenBookingsBD implements AlmacenBookings {

    public AlmacenBookingsBD() {}

    @Override
    public Booking persistir(Booking booking) {
        // Implementación SQL u ORM
        return booking;
    }

    @Override
    public Optional<Booking> consultarPorId(String bookingId) {
        return Optional.empty();
    }

    @Override
    public List<Booking> consultarPorRestaurant(String restaurantId) {
        return List.of();
    }

    @Override
    public boolean remover(String bookingId) {
        return false;
    }
}