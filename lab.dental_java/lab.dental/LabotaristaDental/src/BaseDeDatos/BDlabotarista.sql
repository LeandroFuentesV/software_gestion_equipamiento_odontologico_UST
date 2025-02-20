-- Paso 1: Crear el esquema (base de datos) para el sistema de gestión del laboratorio
CREATE SCHEMA `sistemalabotaristadental2`;

-- Paso 2: Seleccionar el esquema recién creado para que las siguientes instrucciones se apliquen en él
USE sistemalabotaristadental2;

-- Paso 3: Crear la tabla de Usuarios que almacenará los datos de los estudiantes y otros usuarios del sistema
CREATE TABLE Usuarios (
    rut VARCHAR(12) PRIMARY KEY NOT NULL,  -- Identificador único de cada usuario, Ej: 12.345.678-9
    nombre VARCHAR(100) NOT NULL,          -- Nombre completo del usuario
    carrera VARCHAR(50),                   -- Carrera del usuario (opcional)
    semestre VARCHAR(20),                  -- Ejemplo: "2024-1", indica el semestre en el que está inscrito
    tipo_usuario VARCHAR(20) NOT NULL,     -- Tipo de usuario, puede ser 'Estudiante' o 'Docente', etc.
    contrasena VARCHAR(30),                -- Contraseña para acceder al sistema
    correo VARCHAR(30) NOT NULL            -- Correo electrónico del usuario
);

-- Paso 4: Crear la tabla de Equipos que almacenará información sobre los equipos del laboratorio
CREATE TABLE Equipos (
    ID_equipo BIGINT PRIMARY KEY NOT NULL,             -- Identificador único del equipo (código de barras)
    estado VARCHAR(11) NOT NULL,           -- Estado del equipo: 'DISPONIBLE' o 'USADO'
    condicion VARCHAR(20) NOT NULL,        -- Estado físico del equipo, Ej: 'Nuevo', 'Regular', 'Dañado'
    total_horas_uso INT DEFAULT 0,         -- Total de horas de uso del equipo
    veces_usada INT DEFAULT 0              -- Número de veces que el equipo ha sido utilizado
);

-- Paso 5: Crear la tabla PrestamoEquipos para registrar los préstamos de equipos a los estudiantes
CREATE TABLE PrestamoEquipos (
    id_prestamo INT PRIMARY KEY AUTO_INCREMENT,  -- Identificador único de cada préstamo
    rut_estudiante VARCHAR(12) NOT NULL,         -- Identifica al estudiante que realiza el préstamo
    id_equipo BIGINT NOT NULL,                      -- Identifica el equipo prestado
    fecha_prestamo DATETIME NOT NULL,            -- Fecha y hora en la que se prestó el equipo
    fecha_devolucion DATETIME,                   -- Fecha y hora en la que se devolvió el equipo (puede ser nula mientras no se devuelva)
    FOREIGN KEY (rut_estudiante) REFERENCES Usuarios(rut) ON UPDATE CASCADE,  -- Relación con la tabla Usuarios
    FOREIGN KEY (ID_equipo) REFERENCES Equipos(ID_equipo) ON UPDATE CASCADE -- Relación con la tabla Equipos
);

-- Paso 6: Crear un trigger para actualizar el total de horas de uso de un equipo cuando se registra su devolución
DELIMITER //
CREATE TRIGGER actualizar_total_horas_uso
AFTER UPDATE ON PrestamoEquipos
FOR EACH ROW
BEGIN
    -- Verifica que la fecha_devolucion esté presente (no nula)
    IF NEW.fecha_devolucion IS NOT NULL THEN
        -- Calcula las horas de uso del préstamo desde la fecha_prestamo hasta la fecha_devolucion
        SET @horas_uso = TIMESTAMPDIFF(HOUR, NEW.fecha_prestamo, NEW.fecha_devolucion);
        
        -- Actualiza el total de horas de uso del equipo sumando las horas calculadas
        UPDATE Equipos
        SET total_horas_uso = total_horas_uso + @horas_uso
        WHERE ID_equipo = NEW.id_equipo;
    END IF;
END;
//
DELIMITER ;

-- Paso 7: Crear un trigger para cambiar el estado del equipo a 'Ocupado' cuando se registra un nuevo préstamo
DELIMITER //
CREATE TRIGGER after_insert_prestamo
AFTER INSERT ON PrestamoEquipos
FOR EACH ROW
BEGIN
    -- Actualiza el estado del equipo a 'Ocupado' cuando se crea un nuevo préstamo
    UPDATE Equipos
    SET estado = 'Ocupado'
    WHERE ID_equipo = NEW.id_equipo;
END;
//
DELIMITER ;

-- Paso 8: Crear un trigger para cambiar el estado del equipo a 'Disponible' cuando se registra una devolución
DELIMITER //
CREATE TRIGGER after_update_devolucion
AFTER UPDATE ON PrestamoEquipos
FOR EACH ROW
BEGIN
    -- Verifica que la fecha_devolucion esté presente (no nula)
    IF NEW.fecha_devolucion IS NOT NULL THEN
        -- Actualiza el estado del equipo a 'Disponible' cuando se registra la devolución
        UPDATE Equipos
        SET estado = 'Disponible'
        WHERE ID_equipo = NEW.id_equipo;
    END IF;
END;
//
DELIMITER ;

-- Paso 9: Crear un trigger para incrementar el contador de 'veces_usada' cada vez que se presta un equipo
DELIMITER //
CREATE TRIGGER incrementar_veces_usada
AFTER INSERT ON PrestamoEquipos
FOR EACH ROW
BEGIN
    -- Incrementa el contador de veces que se ha usado el equipo cada vez que se registra un nuevo préstamo
    UPDATE Equipos
    SET veces_usada = veces_usada + 1
    WHERE ID_equipo = NEW.id_equipo;
END;
//
DELIMITER ;


