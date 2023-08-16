package Repository.Impl;

import Conexion.ConexionBD;
import Domain.Models.Producto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Implement {
    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }

    private Producto createProduct(ResultSet resultSet) throws
            SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("id" ));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getDouble("precio"));
        producto.setFechaRegistro(resultSet.getDate("fecha_registro").toLocalDate());
        return producto;
    }
}