package dominio.modelos;

public class Tabla {

    private String tablaId;
    private String restaurantId;
    private int capacidad;
    private boolean disponible;

    public Tabla() {}

    public Tabla(String tablaId, String restaurantId, int capacidad, boolean disponible) {
        this.tablaId = tablaId;
        this.restaurantId = restaurantId;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }

    // Getters y Setters
    public String getTablaId() { return tablaId; }
    public void setTablaId(String tablaId) { this.tablaId = tablaId; }

    public String getRestaurantId() { return restaurantId; }
    public void setRestaurantId(String restaurantId) { this.restaurantId = restaurantId; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}