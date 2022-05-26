package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class criaConexao {

    public static Connection getConexao() throws SQLException {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Conectando com o Banco"); 
            return DriverManager.getConnection("jdbc:postgresql:agendabd","postgres","feuc@");
        } catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
                    
        
        }
    }
}