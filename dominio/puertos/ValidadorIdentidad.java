package dominio.puertos;

public interface ValidadorIdentidad {
    boolean verificarToken(String token);
    String extraerUsuarioDeToken(String token);
}