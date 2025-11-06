# Sistema de Gestión de Reservas de Restaurantes

Sistema de reservas para restaurantes desarrollado con arquitectura hexagonal en Java.

## Descripción

Aplicación que permite gestionar reservas (bookings) de restaurantes con autenticación JWT y persistencia en base de datos. Implementa separación de capas siguiendo principios de arquitectura limpia.

## Estructura

src/

├── dominio/ # Modelos y lógica de negocio

├── aplicacion/ # Casos de uso

├── infrastructure/ # Persistencia, seguridad, APIs

└── presentation/ # Controladores y vistas

## Tecnologías

- Java 8+
- Arquitectura Hexagonal
- JWT
- SQL

## Instalación

git clone https://github.com/juanes-montoya/Arquitectura-para-Gestion-Restaurante.git
cd sistema-bookings
javac -d bin src/**/*.java

## Uso

// Crear reserva
BookingController controller = new BookingController(adminBooking);
Booking booking = controller.registrar(nuevoBooking);

// Consultar reservas
List<Booking> bookings = controller.consultar(restaurantId);

// Cancelar reserva
boolean cancelado = controller.remover(bookingId);

## Características

- Gestión completa de reservas
- Autenticación con JWT
- Arquitectura desacoplada y escalable
- Separación de responsabilidades por capas

## Link Excalidraw 
https://excalidraw.com/#room=f45b311912f92a70cf82,Vg45UPeeWpCuQojCdd0smg
