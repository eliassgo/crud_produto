package org.example.view;

import org.example.dao.ProdutoDao;
import org.example.exception.EntidadeNaoEncontradaException;

import java.sql.SQLException;

public class RemocaoProdutoView {

    public static void main(String[] args) {
        try {
            ProdutoDao dao = new ProdutoDao();
            dao.remover(21);
            dao.fecharConexao();
            System.out.println("Produto Removido!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Produto não encontrado");
        }
    }

}