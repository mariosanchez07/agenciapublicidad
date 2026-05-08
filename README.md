# Agencia de Publicidad 📢

Aplicación web para gestionar campañas publicitarias y clientes de una agencia de publicidad.

## 🌐 URL en producción
https://agenciapublicidad-production.up.railway.app/inicio
## 🛠️ Tecnologías
- Java 17
- Spring Boot 3.2
- JPA / Hibernate
- Thymeleaf + Bootstrap 5
- MySQL 8

## ✅ Requisitos previos
- Java 17 o superior
- MySQL 8
- Maven

## 🚀 Pasos para ejecutarlo localmente
1. Clona el repositorio
```bash
   git clone https://github.com/mariosanchez07/agenciapublicidad
```
2. Ejecuta el script `schema.sql` en tu MySQL para crear la base de datos
3. Configura `src/main/resources/application.properties` con tu usuario y contraseña de MySQL
4. Arranca la aplicación
```bash
   mvn spring-boot:run
```
5. Abre el navegador en `http://localhost:8080/inicio`

## 📄 Endpoints disponibles
- `GET /inicio` → Página principal
- `GET /listadoClientes` → Listado de clientes
- `GET /listadoCampanas` → Listado de campañas
- `GET /altaCliente` → Formulario alta de cliente
- `GET /altaCampana` → Formulario alta de campaña

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/6bbfc5a8-0918-4b5c-bb5e-77ab9b3d2519" />
