package dominio.modelos;

public class Usuario {

    private String usuarioId;
    private String nombre;
    private String email;
    private String telefono;

    public Usuario() {}

    public Usuario(String usuarioId, String nombre, String email, String telefono) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}