package org.example;
import org.example.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            Connection conexao = ConnectionFactory.getConnection();
            Statement stm = conexao.createStatement();
            stm.executeUpdate("INSERT INTO tb_produto (cd_produto, nm_produto, ds_produto, vl_produto, nr_estoque) VALUES (seq_produto.nextval, 'Camiseta Branca', 'Camiseta de Algodão', 10.99, 100)");
            System.out.println("Produto cadastrado!");
            stm.close();
            conexao.close();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
