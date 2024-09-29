# Guía de procedimientos para despliegue de una app:

<!-- TOC -->
* [Guía de procedimientos para despliegue de una app:](#guía-de-procedimientos-para-despliegue-de-una-app)
* [Contenido:](#contenido)
* [🛠️ Componente microservice](#-componente-microservice)
* [📦 Creación de la base](#-creación-de-la-base)
* [⚙️ Configuración](#-configuración)
* [👨🏻‍💻 Contributors](#-contributors)
<!-- TOC -->

# Contenido:

# 🛠️ Componente microservice

| Componente | Version                        | Recurso                                           |
|------------|--------------------------------|---------------------------------------------------|
| Spring     | org.springframework.boot 3.3.0 | [console](https://spring.io/projects/spring-boot) |
| Gradle     | gradle-8.5                     | [console](https://gradle.org/)                    |
| Lombok     | 1.18.32                        | [console](https://projectlombok.org/)             |

# 📦 Creación de la base

Para este proyecto trabajaremos con la base de datos postgresql, teniendo en cuenta que esta demostración está destinada
para desarrollo, y no para usos productivos.

| DB         | Image Version            | Recurso                                                                                                                                                                   |
|------------|--------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| docker     | Docker Desktop 4.34.2    | [console](https://www.docker.com/get-started/)                                                                                                                            |
| postgresql | postgres:16.3-alpine3.20 | [console](https://hub.docker.com/layers/library/postgres/13.16-alpine3.20/images/sha256-0658c4f5521f043f62d7e3431ad523261b9108ecbfb3f58a2350ac4e29ce1147?context=explore) |

# ⚙️ Configuración

Para crear la base de datos postgresql:

Requerimientos previos:

- Docker instalado
- Revisar
  documentación, [docker-postgresql](https://github.com/dbacilio88/devops/blob/master/documentation/docker/database/pg/postgres.md)
- Configurar las credenciales de acceso a base de datos con la credential definida

# 👨🏻‍💻 Contributors

¿Cómo puedes ayudar?

1. [ ] Prueba el arquetipo y compárteme tus impresiones.
2. [ ] Contribuye con código, ideas o mejoras.
3. [ ] Comparte este mensaje con tus colegas y en tus redes sociales.

Tu apoyo puede hacer una gran diferencia y juntos podemos construir algo increíble. ¡Espero contar contigo!

[dbacilio88](https://github.com/dbacilio88)

