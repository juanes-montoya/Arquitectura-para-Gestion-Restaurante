package dominio.modelos;

public class Restaurant {

    private String restaurantId;
    private String nombre;
    private String direccion;
    private String telefono;
    private String tipo;

    public Restaurant() {}

    public Restaurant(String restaurantId, String nombre, String direccion, 
                      String telefono, String tipo) {
        this.restaurantId = restaurantId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getRestaurantId() { return restaurantId; }
    public void setRestaurantId(String restaurantId) { this.restaurantId = restaurantId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}