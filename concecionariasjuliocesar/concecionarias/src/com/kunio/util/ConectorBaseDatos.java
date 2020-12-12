package com.kunio.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConectorBaseDatos {
    private static Connection connection = null;

    public static Connection getConnection() {

        if(connection != null){

            return connection;

        }else {

            try {

                Properties properties = new Properties();

                properties.load(new FileInputStream("bd.properties"));


                String driver = properties.getProperty("driver");

                String url = properties.getProperty("url");

                String user = properties.getProperty("user");

                String password = properties.getProperty("password");


                Class.forName(driver);


                connection = DriverManager.getConnection(url, user, password);

            } catch (IOException e) {

                System.out.println("Error al mensaje: " + e.getMessage());

            } catch (ClassNotFoundException e) {

                System.out.println("Error al cargar el mensaje-: " + e.getMessage());

            } catch (SQLException throwables) {

                System.out.println("Error en la conexion a la BaseDedatos: " + throwables.getMessage());
            }
        }

        return connection;
    }
}
