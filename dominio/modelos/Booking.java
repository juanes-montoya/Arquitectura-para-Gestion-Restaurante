package dominio.modelos;

import java.time.LocalDateTime;

public class Booking {

    private String bookingId;
    private String restaurantId;
    private String usuarioId;
    private LocalDateTime fechaHora;
    private int numeroPersonas;
    private String estado;

    public Booking() {}

    public Booking(String bookingId, String restaurantId, String usuarioId, 
                   LocalDateTime fechaHora, int numeroPersonas, String estado) {
        this.bookingId = bookingId;
        this.restaurantId = restaurantId;
        this.usuarioId = usuarioId;
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
        this.estado = estado;
    }

    // Getters y Setters
    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }

    public String getRestaurantId() { return restaurantId; }
    public void setRestaurantId(String restaurantId) { this.restaurantId = restaurantId; }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public int getNumeroPersonas() { return numeroPersonas; }
    public void setNumeroPersonas(int numeroPersonas) { this.numeroPersonas = numeroPersonas; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}