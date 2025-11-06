package aplicacion;

import dominio.servicios.AdministradorBookings;
import dominio.puertos.AlmacenBookings;
import dominio.modelos.Booking;
import java.util.List;

public class AdminBooking {

    private final AdministradorBookings administrador;
    private final AlmacenBookings almacen;

    public AdminBooking(AdministradorBookings administrador, AlmacenBookings almacen) {
        this.administrador = administrador;
        this.almacen = almacen;
    }

    public Booking registrarBooking(Booking booking) {
        Booking bookingValidado = administrador.registrarBooking(booking);
        return almacen.persistir(bookingValidado);
    }

    public boolean anularBooking(String bookingId) {
        boolean anulado = administrador.anularBooking(bookingId);
        if (anulado) {
            return almacen.remover(bookingId);
        }
        return false;
    }

    public List<Booking> consultarPorRestaurant(String restaurantId) {
        return almacen.consultarPorRestaurant(restaurantId);
    }
}