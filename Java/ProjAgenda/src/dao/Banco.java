package dao;

import Modelo.Acesso;
import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Banco {

    private Connection conexao;

    public Banco() throws Exception {
        this.conexao = criaConexao.getConexao();

    }
    
    public void EntradaAcesso(String nome_usuario) throws SQLException{
        String sql = "insert into acesso(nome_usuario, data_acesso, hora_acesso) values (?,?,?)";
        
        Acesso acesso = new Acesso();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome_usuario);
        stmt.setString(2, acesso.getDataAcesso());
        stmt.setString(3, acesso.getHoraAcesso());
        stmt.execute();
        stmt.close();
    }

    public boolean ValidarLogin(String nomeUsuario, String senha) throws SQLException {
        boolean autenticado = false;
        String sql = "select nome_usuario, senha from login where nome_usuario = ? and senha = ?";

        PreparedStatement stmt;

        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeUsuario);
        stmt.setString(2, senha);
        
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()){
            Login login = new Login();
            login.setNomeUsuario(rs.getString("nome_usuario"));
            login.setSenha(rs.getString("senha"));
            autenticado = true;
            EntradaAcesso(nomeUsuario);
        }
        rs.close();
        stmt.close();
        return autenticado;
                
    }

}
