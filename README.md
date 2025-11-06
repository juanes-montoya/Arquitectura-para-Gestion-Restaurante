# Sistema de Gestión de Bookings para Restaurants

## Descripción

Sistema de gestión de reservas (bookings) para restaurantes desarrollado con arquitectura hexagonal (puertos y adaptadores). El proyecto implementa un sistema completo de reservaciones con autenticación JWT y persistencia en base de datos.

## Estructura del Proyecto

El proyecto sigue los principios de arquitectura hexagonal, organizando el código en las siguientes capas:

ArquitecturaReservaRestaurantes/
├── dominio/
│ ├── modelos/
│ │ ├── Booking.java
│ │ ├── Restaurant.java
│ │ ├── Usuario.java
│ │ └── Tabla.java
│ ├── servicios/
│ │ └── AdministradorBookings.java
│ └── puertos/
│ ├── AlmacenBookings.java
│ ├── AlmacenRestaurants.java
│ └── ValidadorIdentidad.java
├── aplicacion/
│ ├── AdminBooking.java
│ ├── AdminRestaurant.java
│ └── interfaces/
│ ├── ConsultarSaldo.java
│ └── EliminarCuenta.java
├── infrastructure/
│ ├── persistence/
│ │ └── AlmacenBookingsBD.java
│ ├── security/
│ │ └── ValidadorJwt.java
│ └── api/
│ └── ClienteAPIRestaurant.java
└── presentation/
├── controllers/
│ ├── BookingController.java
│ ├── RestaurantController.java
│ └── UsuarioController.java
└── views/
├── bookings.html
├── acceso.html
└── restaurants.html


## Tecnologías Utilizadas

- Java 8+
- Arquitectura Hexagonal (Puertos y Adaptadores)
- JWT para autenticación
- SQL para persistencia de datos

## Características Principales

- Gestión completa de reservas (bookings)
- Sistema de autenticación con JWT
- Administración de restaurantes
- Gestión de usuarios
- Arquitectura desacoplada y escalable
- Separación clara de responsabilidades

## Arquitectura

### Capa de Dominio
Contiene la lógica de negocio central y las entidades del sistema. Es independiente de frameworks y tecnologías externas.

### Capa de Aplicación
Coordina las operaciones entre la capa de dominio y la infraestructura. Implementa los casos de uso del sistema.

### Capa de Infraestructura
Contiene las implementaciones concretas de los puertos definidos en el dominio, como persistencia, seguridad y APIs externas.

### Capa de Presentación
Maneja la interfaz de usuario y los controladores HTTP que exponen la funcionalidad del sistema.

## Instalación

1. Clonar el repositorio:
