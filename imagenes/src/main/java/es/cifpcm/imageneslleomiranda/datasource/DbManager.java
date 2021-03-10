/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.imageneslleomiranda.datasource;

import es.cifpcm.imageneslleomiranda.pojos.Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author l
 */
public class DbManager {
    
    static Connection conn = null;
    
    
    public static Connection getConnection() {
         try  {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelitos", "root", "");
            return conn;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static Hotel get(String cod_hotel) throws SQLException {
        Hotel hotel = null;
        try {
            conn = getConnection();          
            String query = "SELECT * FROM `precios_habitacion` WHERE cod_hotel = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, cod_hotel);
            ResultSet rset = pstmt.executeQuery();
            while (rset.next()) {
                 hotel = new Hotel(rset.getInt("id_precioshab"),rset.getInt("precio"),rset.getString("cod_hotel"));
                
            }

            conn.close();
            conn = null;
        } finally {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlex) {
                    // ignore, as we can't do anything about it here
                }

                conn = null;
            }
        }
        return hotel;
    }

    
    
}
