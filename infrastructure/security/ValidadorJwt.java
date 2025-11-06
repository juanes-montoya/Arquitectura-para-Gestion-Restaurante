package infrastructure.security;

import dominio.puertos.ValidadorIdentidad;

public class ValidadorJwt implements ValidadorIdentidad {

    public ValidadorJwt() {}

    @Override
    public boolean verificarToken(String token) {
        // Validar firma, expiración, claims
        return false;
    }

    @Override
    public String extraerUsuarioDeToken(String token) {
        return null;
    }
}