package org.example.view;

import org.example.dao.ProdutoDao;
import org.example.model.Produto;

import java.sql.SQLException;

public class CadastroProdutoView {
    public static void main(String[] args) {
        try {
            ProdutoDao dao = new ProdutoDao();
            Produto produto = new Produto("Calça azul", "Calça Jeans azul", 50.0, 10);
            dao.cadastrar(produto);
            dao.fecharConexao();
            System.out.println("Produto cadastrado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
