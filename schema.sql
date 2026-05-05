-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS agenciapublicidad;
USE agenciapublicidad;

-- Tabla clientes
CREATE TABLE IF NOT EXISTS clientes (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre_empresa VARCHAR(255),
    sector VARCHAR(255),
    cif VARCHAR(255),
    email VARCHAR(255),
    PRIMARY KEY (id)
) ENGINE=InnoDB;

-- Tabla campanas
CREATE TABLE IF NOT EXISTS campanas (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre_campana VARCHAR(255),
    presupuesto FLOAT(53),
    fecha_inicio DATE,
    canal VARCHAR(255),
    PRIMARY KEY (id)
) ENGINE=InnoDB;