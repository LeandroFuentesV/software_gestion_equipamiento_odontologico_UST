package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DAO {
    
    public DefaultTableModel mostrarEquipos() {
        String[] nombresColumnas = {"id", "estado", "condicion", "horas de uso", "veces_usada"};
        String[] registros = new String[5];
        
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        
        String sql = "SELECT * FROM Equipos";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            cn = Conexion.conectar(); // Conexión a la base de datos
            
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            
            while (rs.next()) {
                registros[0] = rs.getString("ID_equipo");
                registros[1] = rs.getString("estado");
                registros[2] = rs.getString("condicion");
                registros[3] = rs.getString("total_horas_uso");
                registros[4] = rs.getString("veces_usada");
                
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }   
    
public DefaultTableModel mostrarRegistroPrestamos() {
    String[] nombresColumnas = {"id", "Rut estudiante", "Codigo equipo", "Fecha de prestamo", "Fecha de devolucion"};
    String[] registros = new String[5];
    
    DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
    
    String sql = "SELECT * FROM prestamoequipos";
    
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        
        pst = cn.prepareStatement(sql);                        
        rs = pst.executeQuery();
        
        while (rs.next()) {
            registros[0] = rs.getString("id_prestamo");
            registros[1] = rs.getString("rut_estudiante");
            registros[2] = rs.getString("id_equipo");
            registros[3] = rs.getString("fecha_prestamo");
            registros[4] = rs.getString("fecha_devolucion");
            
            modelo.addRow(registros);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (cn != null) cn.close(); // Cerrar la conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    return modelo;
}

     public DefaultTableModel mostrarUsuarios() {
        String[] nombresColumnas = {"Rut", "Nombre", "Semestre", "Rol", "Correo", "Carrera"};
        String[] registros = new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        
        String sql = "SELECT * FROM usuarios";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            cn = Conexion.conectar(); // Conexión a la base de datos
            
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            
            while (rs.next()) {
                registros[0] = rs.getString("rut");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("semestre");
                registros[3] = rs.getString("tipo_usuario");
                registros[4] = rs.getString("correo");
                registros[5] = rs.getString("carrera");
                
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }
     
     public boolean insertarUsuario(String rut, String nombre, String semestre, String tipo_usuario, String correo, String carrera, String contrasena) {
    String sql = "INSERT INTO usuarios (rut, nombre, semestre, tipo_usuario, correo, carrera, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    Connection cn = null;
    PreparedStatement pst = null;
    
    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sql);
        
        pst.setString(1, rut);
        pst.setString(2, nombre);
        pst.setString(3, semestre);
        pst.setString(4, tipo_usuario);
        pst.setString(5, correo);
        pst.setString(6, carrera);
        pst.setString(7, contrasena);
        
        int rowsAffected = pst.executeUpdate();
        return rowsAffected > 0; // Retorna true si se inserta al menos un registro
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar usuario: " + e.getMessage());
        return false;
    } finally {
        try {
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
     public boolean insertarPrestamo(String rutEstudiante, long idEquipo) {
    String sqlVerificarRut = "SELECT rut FROM Usuarios WHERE rut = ?";
    String sqlVerificarEquipo = "SELECT ID_equipo FROM Equipos WHERE ID_equipo = ?";
    String sqlVerificarDisponibilidad = "SELECT estado FROM Equipos WHERE ID_equipo = ? AND estado = 'DISPONIBLE'";
    String sqlInsertarPrestamo = "INSERT INTO PrestamoEquipos (rut_estudiante, id_equipo, fecha_prestamo) VALUES (?, ?, NOW())";
    String sqlActualizarEstado = "UPDATE Equipos SET estado = 'USADO' WHERE ID_equipo = ?";

    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar();

        // Verificar si el RUT del estudiante está registrado
        pst = cn.prepareStatement(sqlVerificarRut);
        pst.setString(1, rutEstudiante);
        rs = pst.executeQuery();
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "El RUT ingresado no está registrado en la base de datos.");
            return false;
        }

        // Verificar si el ID del equipo existe en la base de datos
        pst = cn.prepareStatement(sqlVerificarEquipo);
        pst.setLong(1, idEquipo);
        rs = pst.executeQuery();
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "El ID del equipo no existe en la base de datos.");
            return false;
        }

        // Verificar si el equipo está disponible
        pst = cn.prepareStatement(sqlVerificarDisponibilidad);
        pst.setLong(1, idEquipo);
        rs = pst.executeQuery();
        if (rs.next()) {
            pst = cn.prepareStatement(sqlInsertarPrestamo);
            pst.setString(1, rutEstudiante);
            pst.setLong(2, idEquipo);

            int rowsAffected = pst.executeUpdate();

            // Actualizar el estado del equipo a 'USADO'
            if (rowsAffected > 0) {
                pst = cn.prepareStatement(sqlActualizarEstado);
                pst.setLong(1, idEquipo);
                pst.executeUpdate();
                return true;
            }
        } 
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar préstamo: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    return false;
}
     public boolean devolverEquipo(String rutEstudiante, long idEquipo) {
    String sqlVerificarEquipoEnUso = "SELECT rut_estudiante FROM PrestamoEquipos WHERE id_equipo = ? AND fecha_devolucion IS NULL";
    String sqlActualizarDevolucion = "UPDATE PrestamoEquipos SET fecha_devolucion = NOW() WHERE id_equipo = ? AND rut_estudiante = ?";
    String sqlActualizarEstadoEquipo = "UPDATE Equipos SET estado = 'DISPONIBLE' WHERE ID_equipo = ?";

    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar();

        // Verificar si el equipo está en uso y obtener el RUT del estudiante que hizo el préstamo
        pst = cn.prepareStatement(sqlVerificarEquipoEnUso);
        pst.setLong(1, idEquipo);
        rs = pst.executeQuery();

        if (rs.next()) {
            String rutPrestamo = rs.getString("rut_estudiante");

            // Verificar si el RUT ingresado es el mismo que el registrado en el préstamo
            if (rutPrestamo.equals(rutEstudiante)) {
                // Actualizar la fecha de devolución en el registro del préstamo
                pst = cn.prepareStatement(sqlActualizarDevolucion);
                pst.setLong(1, idEquipo);
                pst.setString(2, rutEstudiante);

                int rowsAffected = pst.executeUpdate();

                // Actualizar el estado del equipo a 'DISPONIBLE'
                if (rowsAffected > 0) {
                    pst = cn.prepareStatement(sqlActualizarEstadoEquipo);
                    pst.setLong(1, idEquipo);
                    pst.executeUpdate();
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "El RUT ingresado no coincide con el del préstamo registrado.");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El equipo no está en uso actualmente.");
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al devolver el equipo: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    return false;
}
     public boolean verificarCredenciales(String rut, String contrasena) {
    String sqlVerificarTipoUsuario = "SELECT contrasena FROM Usuarios WHERE rut = ? AND tipo_usuario = 'Docente'";
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sqlVerificarTipoUsuario);
        pst.setString(1, rut);  // Se pasa el RUT al query
        
        rs = pst.executeQuery();

        // Si se encuentra un resultado, verificamos la contraseña
        if (rs.next()) {
            String contrasenaAlmacenada = rs.getString("contrasena");

            // Comparar la contraseña ingresada con la almacenada
            if (contrasenaAlmacenada.equals(contrasena)) {
                return true; // Las credenciales son válidas
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta.");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El RUT ingresado no pertenece a un docente.");
            return false;
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar credenciales: " + e.getMessage());
        return false;
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
public boolean insertarEquipo(long id, String estado, String condicion) {
    // Primero, verificamos si el equipo ya existe
    if (existeEquipo(id)) {
        JOptionPane.showMessageDialog(null, "El equipo con este ID ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;  // Si el equipo ya existe, no insertamos
    }
    
    String sql = "INSERT INTO equipos (ID_equipo, estado, condicion) VALUES (?, ?, ?)";
    
    Connection cn = null;
    PreparedStatement pst = null;
    
    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sql);
        
        pst.setLong(1, id);
        pst.setString(2, estado);
        pst.setString(3, condicion);
        
        int rowsAffected = pst.executeUpdate();
        return rowsAffected > 0; // Retorna true si se inserta al menos un registro
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar equipo: " + e.getMessage());
        return false;
    } finally {
        try {
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

public boolean existeEquipo(long id) {
    String sql = "SELECT 1 FROM equipos WHERE ID_equipo = ?";
    
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sql);
        pst.setLong(1, id);
        
        rs = pst.executeQuery();
        return rs.next(); // Si existe un resultado, el equipo ya está registrado
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar si el equipo existe: " + e.getMessage());
        return false;
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

   public boolean eliminarUsuario(String rut) {
    // Mostrar mensaje de confirmación
    int confirmacion = JOptionPane.showConfirmDialog(null, 
        "¿Seguro que quiere eliminar el usuario con RUT: " + rut + "?\n" + 
        "Esto también eliminará todos los préstamos vinculados a este RUT.", 
        "Confirmación", 
        JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        Connection cn = null;
        PreparedStatement pstEliminarPrestamos = null;
        PreparedStatement pstEliminarUsuario = null;

        try {
            cn = Conexion.conectar(); // Conexión a la base de datos
            
            // Primero, eliminar registros en prestamoequipos
            String sqlEliminarPrestamos = "DELETE FROM prestamoequipos WHERE rut_estudiante = ?";
            pstEliminarPrestamos = cn.prepareStatement(sqlEliminarPrestamos);
            pstEliminarPrestamos.setString(1, rut);
            pstEliminarPrestamos.executeUpdate(); // Ejecutar eliminación de préstamos

            // Luego, eliminar el usuario
            String sqlEliminarUsuario = "DELETE FROM usuarios WHERE rut = ?";
            pstEliminarUsuario = cn.prepareStatement(sqlEliminarUsuario);
            pstEliminarUsuario.setString(1, rut); // Asigna el RUT al parámetro de la consulta
            
            int rowsAffected = pstEliminarUsuario.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con el RUT especificado.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario: " + e.getMessage());
            return false;
        } finally {
            try {
                if (pstEliminarPrestamos != null) pstEliminarPrestamos.close();
                if (pstEliminarUsuario != null) pstEliminarUsuario.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
        return false;
    }
}


public void actualizarUsuario(String nuevoRut, String nombre, String semestre, String tipoUsuario, String contrasena, String correo, String carrera, String rutAntiguo) {
    // Verificar si ya existe un usuario con el nuevo RUT
    String sqlVerificarRut = "SELECT rut FROM usuarios WHERE rut = ? AND rut != ?";
    
    Connection cn = null;
    PreparedStatement pstVerificar = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pstVerificar = cn.prepareStatement(sqlVerificarRut);
        pstVerificar.setString(1, nuevoRut);
        pstVerificar.setString(2, rutAntiguo); // Aseguramos que no se verifique el mismo RUT

        rs = pstVerificar.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "El nuevo RUT ya está registrado en la base de datos.");
            return; // Salimos del método si el RUT ya existe
        }

        // Si el nuevo RUT es único, procedemos con la actualización
        String sqlActualizar = "UPDATE usuarios SET rut = ?, nombre = ?, semestre = ?, tipo_usuario = ?, contrasena = ?, correo = ?, carrera = ? WHERE rut = ?";
        PreparedStatement pstActualizar = null;

        try {
            pstActualizar = cn.prepareStatement(sqlActualizar);
            pstActualizar.setString(1, nuevoRut);
            pstActualizar.setString(2, nombre);
            pstActualizar.setString(3, semestre);
            pstActualizar.setString(4, tipoUsuario);
            pstActualizar.setString(5, contrasena); // Aquí se establece correctamente la contraseña
            pstActualizar.setString(6, correo);
            pstActualizar.setString(7, carrera);
            pstActualizar.setString(8, rutAntiguo); // RUT antiguo para la cláusula WHERE

            int rowsAffected = pstActualizar.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el usuario.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario: " + e.getMessage());
        } finally {
            if (pstActualizar != null) pstActualizar.close();
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar RUT: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstVerificar != null) pstVerificar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

public String[] obtenerDatosUsuario(String rut) {
    String sql = "SELECT nombre, semestre, tipo_usuario, contrasena, correo, carrera FROM usuarios WHERE rut = ?";
    String[] datosUsuario = new String[6]; // Para almacenar: nombre, semestre, tipo_usuario, correo, carrera

    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sql);
        pst.setString(1, rut);
        
        rs = pst.executeQuery();

        if (rs.next()) {
            datosUsuario[0] = rs.getString("nombre");
            datosUsuario[1] = rs.getString("semestre");
            datosUsuario[2] = rs.getString("tipo_usuario");
            datosUsuario[3] = rs.getString("contrasena");
            datosUsuario[4] = rs.getString("correo");
            datosUsuario[5] = rs.getString("carrera");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un usuario con el RUT especificado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener datos del usuario: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    return datosUsuario; // Retorna los datos obtenidos, puede ser null si no se encontró el usuario
}
public boolean eliminarEquipo(long idEquipo) {
    // Mensaje de confirmación
    int confirmacion = JOptionPane.showConfirmDialog(null, 
        "¿Seguro que quiere eliminar el equipo con ID: " + idEquipo + "?\n" +
        "Esto también eliminará todos los registros de préstamos vinculados a este equipo.",
        "Confirmación",
        JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        Connection cn = null;
        PreparedStatement pstEliminarPrestamos = null;
        PreparedStatement pstEliminarEquipo = null;

        try {
            cn = Conexion.conectar(); // Conexión a la base de datos

            // Primero, eliminar registros en PrestamoEquipos relacionados con el equipo
            String sqlEliminarPrestamos = "DELETE FROM PrestamoEquipos WHERE id_equipo = ?";
            pstEliminarPrestamos = cn.prepareStatement(sqlEliminarPrestamos);
            pstEliminarPrestamos.setLong(1, idEquipo);
            pstEliminarPrestamos.executeUpdate(); // Ejecutar eliminación de préstamos

            // Luego, eliminar el equipo de la tabla Equipos
            String sqlEliminarEquipo = "DELETE FROM Equipos WHERE ID_equipo = ?";
            pstEliminarEquipo = cn.prepareStatement(sqlEliminarEquipo);
            pstEliminarEquipo.setLong(1, idEquipo);
            
            int rowsAffected = pstEliminarEquipo.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Equipo eliminado correctamente.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un equipo con el ID especificado.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar equipo: " + e.getMessage());
            return false;
        } finally {
            try {
                if (pstEliminarPrestamos != null) pstEliminarPrestamos.close();
                if (pstEliminarEquipo != null) pstEliminarEquipo.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
        return false;
    }
}
public String[] obtenerDatosEquipos(long id) {
    String sql = "SELECT ID_equipo, estado, condicion, total_horas_uso, veces_usada FROM equipos WHERE ID_equipo = ?";
    String[] datosEquipo = new String[5]; 
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sql);
        pst.setLong(1, id);
        
        rs = pst.executeQuery();

        if (rs.next()) {
            datosEquipo[0] = rs.getString("ID_equipo");
            datosEquipo[1] = rs.getString("estado");
            datosEquipo[2] = rs.getString("condicion");
            datosEquipo[3] = rs.getString("total_horas_uso");
            datosEquipo[4] = rs.getString("veces_usada");
     
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un equipo con el ID especificado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener datos del equipo: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    return datosEquipo; // Retorna los datos obtenidos, puede ser null si no se encontró el usuario
}
public void actualizarEquipo(long nuevoID, String estado, String condicion, int horasDeUso, int vecesUsada, long IDAntiguo) {
    // Verificar si ya existe un usuario con el nuevo RUT
    String sqlVerificarID = "SELECT ID_equipo FROM equipos WHERE ID_equipo = ? AND ID_equipo != ?";
    
    Connection cn = null;
    PreparedStatement pstVerificar = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pstVerificar = cn.prepareStatement(sqlVerificarID);
        pstVerificar.setLong(1, nuevoID);
        pstVerificar.setLong(2, IDAntiguo); // Aseguramos que no se verifique el mismo ID

        rs = pstVerificar.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "El nuevo ID ya está registrado en la base de datos.");
            return; // Salimos del método si el ID ya existe
        }

        // Si el nuevo ID es único, procedemos con la actualización
        String sqlActualizar = "UPDATE equipos SET ID_equipo = ?, estado = ?, condicion = ?, total_horas_uso = ?, veces_usada = ? WHERE ID_equipo = ?";
        PreparedStatement pstActualizar = null;

        try {
            pstActualizar = cn.prepareStatement(sqlActualizar);
            pstActualizar.setLong(1, nuevoID);
            pstActualizar.setString(2, estado);
            pstActualizar.setString(3, condicion);
            pstActualizar.setInt(4, horasDeUso);
            pstActualizar.setInt(5, vecesUsada);
            pstActualizar.setLong(6, IDAntiguo); // ID antiguo para la cláusula WHERE

            int rowsAffected = pstActualizar.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Equipo modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el equipo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el equipo: " + e.getMessage());
        } finally {
            if (pstActualizar != null) pstActualizar.close();
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar ID: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstVerificar != null) pstVerificar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

public DefaultTableModel filtrarPorRut(String rut) {
    String[] nombresColumnas = {"id", "Rut estudiante", "Codigo equipo", "Fecha de prestamo", "Fecha de devolucion"};
    DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
    String sql = "SELECT * FROM prestamoequipos WHERE rut_estudiante = ?";
    
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sql);
        pst.setString(1, rut);
        
        rs = pst.executeQuery();
        
        while (rs.next()) {
            String[] registro = {
                rs.getString("id_prestamo"),
                rs.getString("rut_estudiante"),
                rs.getString("id_equipo"),
                rs.getString("fecha_prestamo"),
                rs.getString("fecha_devolucion")
            };
            modelo.addRow(registro);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al filtrar por RUT: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (cn != null) cn.close(); // Cerrar la conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
    return modelo;
}

public DefaultTableModel filtrarPorEquipo(long idEquipo) {
    String[] nombresColumnas = {"id", "Rut estudiante", "Codigo equipo", "Fecha de prestamo", "Fecha de devolucion"};
    DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
    String sql = "SELECT * FROM prestamoequipos WHERE id_equipo = ?";

    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar(); // Conexión a la base de datos
        pst = cn.prepareStatement(sql);
        pst.setLong(1, idEquipo);
        rs = pst.executeQuery();

        while (rs.next()) {
            String[] registro = {
                rs.getString("id_prestamo"),
                rs.getString("rut_estudiante"),
                rs.getString("id_equipo"),
                rs.getString("fecha_prestamo"),
                rs.getString("fecha_devolucion")
            };
            modelo.addRow(registro);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al filtrar por equipo: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (cn != null) cn.close(); // Cerrar la conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    return modelo;
}



     public DefaultTableModel mostrarAlumnos() {
        String[] nombresColumnas = {"Rut", "Nombre", "Semestre", "Correo", "Carrera"};
        String[] registros = new String[5];
        
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        
        String sql = "SELECT * FROM usuarios WHERE tipo_usuario='Estudiante'";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            cn = Conexion.conectar(); // Conexión a la base de datos
            
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            
            while (rs.next()) {
                registros[0] = rs.getString("rut");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("semestre");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("carrera");
                
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }
 public DefaultTableModel mostrarAdmins() {
        String[] nombresColumnas = {"Rut", "Nombre", "Semestre", "Correo", "Carrera"};
        String[] registros = new String[5];
        
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        
        String sql = "SELECT * FROM usuarios WHERE tipo_usuario='Docente'";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            cn = Conexion.conectar(); // Conexión a la base de datos
            
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            
            while (rs.next()) {
                registros[0] = rs.getString("rut");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("semestre");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("carrera");
                
                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }
 public int verificarEstadoEquipo(long idEquipo) {
    String sqlVerificarEstado = "SELECT estado FROM Equipos WHERE ID_equipo = ?";
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar();
        pst = cn.prepareStatement(sqlVerificarEstado);
        pst.setLong(1, idEquipo);
        rs = pst.executeQuery();

        if (rs.next()) {
            String estado = rs.getString("estado");
            if ("DISPONIBLE".equalsIgnoreCase(estado)) {
                return 1; // Disponible
            } else if ("USADO".equalsIgnoreCase(estado)) {
                return 0; // En uso
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al realizar el prestamo, verifique el codigo del equipo: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    return -1; // Error o equipo no encontrado
}
public String[] obtenerInfoPrestamo(long idEquipo) {
    String sqlObtenerPrestamo = "SELECT rut_estudiante, id_equipo FROM PrestamoEquipos WHERE id_equipo = ? AND fecha_devolucion IS NULL";
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        cn = Conexion.conectar();
        pst = cn.prepareStatement(sqlObtenerPrestamo);
        pst.setLong(1, idEquipo);
        rs = pst.executeQuery();

        if (rs.next()) {
            String rut = rs.getString("rut_estudiante");
            long id = rs.getLong("id_equipo");
            return new String[]{rut, String.valueOf(id)};
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener información del préstamo: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    return null; // No hay préstamo activo para este equipo
}

 public boolean existeRUT(String rut) {
    boolean existe = false;
    String sql = "SELECT COUNT(*) FROM Usuarios WHERE rut = ?";
    try (Connection conn = Conexion.conectar();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, rut);
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                existe = rs.getInt(1) > 0; // Verifica si el resultado es mayor a 0
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al verificar si el RUT existe: " + e.getMessage());
    }
    return existe;
}


}
