# Proyecto Hibernate

Este proyecto es una aplicación de ejemplo que utiliza Hibernate para interactuar con una base de datos MySQL. La aplicación muestra cómo mapear una clase Java a una tabla de base de datos utilizando anotaciones de JPA (Java Persistence API) y cómo realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos utilizando Hibernate.

## Requisitos previos

- Java Development Kit (JDK) instalado en tu sistema.
- Un servidor de base de datos MySQL en funcionamiento.
- Herramientas de construcción como Maven o Gradle (opcional).

## Configuración

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/tu-usuario/proyecto-hibernate.git
    ```

2. Asegúrate de tener configurado correctamente tu archivo `hibernate.cfg.xml` con los detalles de conexión a tu base de datos MySQL.

3. Compila el proyecto si es necesario:

    ```bash
    mvn clean install
    ```

## Uso

1. Ejecuta la aplicación desde tu IDE o desde la línea de comandos utilizando Maven:

    ```bash
    mvn exec:java -Dexec.mainClass="paquete.Prueba"
    ```

2. La aplicación ejecutará operaciones CRUD en la base de datos utilizando Hibernate y mostrará los resultados en la consola.

## Estructura del proyecto

- `src/`: Directorio que contiene el código fuente de la aplicación.
    - `main/`: Paquete que contiene las clases de la aplicación.
        - `Prueba.java`: Clase principal que demuestra el uso de Hibernate.
- `hibernate.cfg.xml`: Archivo de configuración de Hibernate.
- `pom.xml`: Archivo de configuración de Maven (si se utiliza Maven).


