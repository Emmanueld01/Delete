# Proyecto Backend Java con Spring Boot

## Descripción del Proyecto

Este proyecto es una aplicación backend desarrollada en Java utilizando Spring Boot. La aplicación sigue principios de arquitectura limpia para asegurar mantenibilidad y escalabilidad. Utiliza MongoDB y PostgreSQL como bases de datos y ofrece múltiples endpoints para operaciones CRUD.

## Estructura del Proyecto

### 1. Controladores (Controllers)

Gestionan las solicitudes HTTP y retornan respuestas adecuadas.

- **DestinationController.java**: Gestiona destinos en MongoDB.
- **AnswersController.java**: Gestiona respuestas.
- **UserController.java**: Gestiona usuarios.

### 2. Servicios (Services)

Contienen la lógica de negocio de la aplicación.

- **AnswersService.java**: Lógica para respuestas.
- **UserService.java**: Lógica para usuarios.
- **DestinationsService.java**: Lógica para destinos en MongoDB.
- **GenericEntityService.java**: Métodos genéricos para buscar o crear entidades.

### 3. Modelos (Models)

Representan las entidades del dominio.

- **DestinationsEntity.java**: Destino en MongoDB.
- **ActivityEntity.java**: Actividad.
- **AgeEntity.java**: Rango de edad.
- **AnswersEntity.java**: Respuesta.
- **DestinationEntity.java**: Destino.
- **HostingEntity.java**: Alojamiento.
- **TravelEntity.java**: Viaje.
- **UserEntity.java**: Usuario.
- **WeatherEntity.java**: Clima.

### 4. Repositorios (Repositories)

Interacción con la base de datos utilizando Spring Data JPA.

- **DestinationsRepository.java**: Gestión de destinos en MongoDB.
- **ActivityRepository.java**: Gestión de actividades.
- **AgeRepository.java**: Gestión de rangos de edad.
- **AnswersRepository.java**: Gestión de respuestas.
- **DestinationRepository.java**: Gestión de destinos.
- **HostingRepository.java**: Gestión de alojamientos.
- **TravelRepository.java**: Gestión de viajes.
- **UserRepository.java**: Gestión de usuarios.
- **WeatherRepository.java**: Gestión de climas.

### 5. Mappers

Transforman entidades a DTOs y viceversa.

- **AnswersMapper.java**: Mapea AnswersEntity a AnswersDTO y viceversa.

## Configuración y Ejecución

### Prerequisitos

- Java 17
- Gradle
- MongoDB
- PostgreSQL

### Configuración

Configura las propiedades en `application.properties`:

```properties
spring.application.name=AmadeusNodo
spring.data.mongodb.uri=mongodb+srv://<usuario>:<contraseña>@<cluster-url>/<database>
Ejecución
Para ejecutar la aplicación:

bash
./gradlew bootRun
Endpoints
Usuarios
GET /users: Lista de todos los usuarios.

GET /user/{id}: Usuario por ID.

POST /user: Crear usuario.

DELETE /user/{id}: Eliminar usuario por ID.

Respuestas
GET /answers: Lista de todas las respuestas.

GET /answer/{id}: Respuesta por ID.

POST /answer: Crear respuesta.

DELETE /answer/{id}: Eliminar respuesta por ID.

Destinos (MongoDB)
GET /Destination: Lista de destinos (comentado en el controlador actual).

Pruebas
Para ejecutar las pruebas:

bash
./gradlew test
Contribuciones
Haz un fork del repositorio, crea una rama con tu feature y envía un pull request.

Licencia
Este proyecto está licenciado bajo los términos de la MIT License.
