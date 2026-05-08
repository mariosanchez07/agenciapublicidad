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
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/b26e3335-c97e-4888-ae5e-2337c9f7ec41" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/8a7dfe2b-9545-43a3-afb2-5a1a3d7f895c" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/0934f465-b3fe-4100-b6bb-c7964cde32aa" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/d62a9907-01a6-4c65-8159-bf1ead154b5a" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/75f0d51c-a30a-40f0-b4e8-d28066cc7ac1" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/80e75e45-7391-4271-9fd6-8e2fddffdd4c" />
