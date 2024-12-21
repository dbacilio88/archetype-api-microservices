![Discord](https://img.shields.io/discord/738601834096099409)
![GitHub forks](https://img.shields.io/github/forks/dbacilio88/archetype-api-microservices?style=social)
![GitHub Release](https://img.shields.io/github/v/release/dbacilio88/archetype-api-microservices)
![GitHub repo file or directory count](https://img.shields.io/github/directory-file-count/dbacilio88/archetype-api-microservices)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/dbacilio88/archetype-api-microservices/ci.yml)
![GitHub Downloads (all assets, all releases)](https://img.shields.io/github/downloads/dbacilio88/archetype-api-microservices/total)
![GitHub License](https://img.shields.io/github/license/dbacilio88/archetype-api-microservices)


# 🎯 archetype-api-microservices

<!-- TOC -->
* [🎯 archetype-api-microservices](#-archetype-api-microservices)
* [🧩 Descripción general](#-descripción-general)
* [🔖 Características](#-características)
  * [📋 Requisitos](#-requisitos)
* [🪛 Crear un proyecto](#-crear-un-proyecto)
  * [📀 Instalación](#-instalación)
  * [💻 Construir en Terminal bash](#-construir-en-terminal-bash)
  * [🖥️ Construir en Terminal cmd](#-construir-en-terminal-cmd)
  * [🧮 Estructura del proyecto](#-estructura-del-proyecto)
  * [🔧 Tecnologías Usadas](#-tecnologías-usadas)
  * [⚙️ Configuración rápida](#-configuración-rápida)
  * [🧰 Integración de dependencias](#-integración-de-dependencias)
  * [📦 Ejemplo de código](#-ejemplo-de-código)
* [🧪 Uso](#-uso)
* [👨🏻‍💻 Contribuciones](#-contribuciones)
* [📞 Contacto](#-contacto-)
<!-- TOC -->

# 🧩 Descripción general

Este arquetipo proporciona una estructura básica para iniciar proyectos en Java utilizando el framework Spring. Está
diseñado para facilitar el desarrollo rápido y eficiente de aplicaciones rest.

# 🔖 Características

## 📋 Requisitos

Asegúrate de tener instalado:

- Java OpenJDK 21
- Maven 3.6 o superior
- Git

| Herramienta  | Version | Recurso                                                                                                                           |
|--------------|:-------:|-----------------------------------------------------------------------------------------------------------------------------------|
| Java OpenJDK |   21    | [resources](https://jdk.java.net/java-se-ri/21)                                                                                   |
| Maven        |  3.6.2  | [resources](https://archive.apache.org/dist/maven/maven-3/3.6.2/)                                                                 |
| Git          | latest  | [win](https://git-scm.com/downloads/win),  [mac](https://git-scm.com/downloads/mac), [linux](https://git-scm.com/downloads/linux) |

# 🪛 Crear un proyecto

## 📀 Instalación

**Clonar el Proyecto**

Para clonar este proyecto, utiliza el siguiente comando:

```bash
git clone https://github.com/dbacilio88/archetype-api-microservices.git
```

```bash
cd archetype-api-microservices
```

```bash
mvn clean install
```

## 💻 Construir en Terminal bash

```shell
mvn archetype:generate \
-DarchetypeGroupId=com.bacsystem \
-DarchetypeArtifactId=archetype-api-microservices \
-DarchetypeVersion=1.1.0 \
-DgroupId=com.example \
-DartifactId=archetype-example \
-Dversion=1.0.0 \
-Dversion=1.0.0 \
-DpackageName=microservice \
-Dpackage=com.example \
-DinteractiveMode=false
```

## 🖥️ Construir en Terminal cmd

```shell
mvn archetype:generate ^
-DarchetypeGroupId=com.bacsystem ^
-DarchetypeArtifactId=archetype-api-microservices ^
-DarchetypeVersion=1.1.0 ^
-DgroupId=com.example ^
-DartifactId=archetype-example ^
-Dversion=1.0.0 ^
-DpackageName=microservice ^
-Dpackage=com.example ^
-DinteractiveMode=false
```

## 🧮 Estructura del proyecto

```
Disk:
├───deploy
├───docs
│   └───collections
├───gradle
│   └───wrapper
└───src
    ├───main
    │   ├───java
    │   │   └───com
    │   │       └───example
    │   │           └───microservice
    │   │               └───application
    │   │                   ├───components
    │   │                   │   ├───configuration
    │   │                   │   ├───enums
    │   │                   │   ├───exceptions
    │   │                   │   │   └───handler
    │   │                   │   ├───interfaces
    │   │                   │   ├───mappers
    │   │                   │   └───utils
    │   │                   ├───controllers
    │   │                   │   ├───contracts
    │   │                   │   └───implementations
    │   │                   ├───dtos
    │   │                   ├───repositories
    │   │                   │   └───entities
    │   │                   └───services
    │   │                       ├───contracts
    │   │                       └───implementations
    │   └───resources
    └───test
        ├───java
        │   └───com
        │       └───example
        └───resources
```

## 🔧 Tecnologías Usadas

|    java    | Spring Boot |   Gradle   | Maven          | Branch                                                                                         |
|:----------:|:-----------:|:----------:|----------------|------------------------------------------------------------------------------------------------|
| openJDK-21 |     3.*     | gradle-8.5 | 3.6 o superior | [console](https://github.com/dbacilio88/archetype-api-microservices/tree/spring-boot-3-jdk-21) |

## ⚙️ Configuración rápida

Incluye configuraciones predeterminadas para Spring Boot.

## 🧰 Integración de dependencias

Configuración básica de Maven o Gradle para gestionar dependencias.

## 📦 Ejemplo de código

Incluye ejemplos de controladores, servicios y repositorios.

**Ojo**: Leer deploy.md del proyecto generado

# 🧪 Uso

Puedes agregar tus propios controladores, servicios y repositorios en las carpetas correspondientes. Modifica
`application.properties` o  `application.yml` para configurar tu aplicación según sea necesario.

Nota: ejecutar el componente o aplicación en perfil **`dev`**

# 👨🏻‍💻 Contribuciones

¿Cómo puedes ayudar?

¡Las contribuciones son bienvenidas! Si deseas contribuir a este arquetipo, por favor abre un issue o envía un pull
request.

1. [ ] Prueba el arquetipo y compárteme tus impresiones.
2. [ ] Contribuye con código, ideas o mejoras.
3. [ ] Comparte este mensaje con tus colegas y en tus redes sociales.

Tu apoyo puede hacer una gran diferencia y juntos podemos construir algo increíble. 🚀 ¡Espero contar contigo!

# 📞 Contacto 
![Discord](https://img.shields.io/discord/738601834096099409)

Para más información, puedes contactar a [dbacilio88](https://github.com/dbacilio88)