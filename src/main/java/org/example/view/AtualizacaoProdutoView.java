package org.example.view;


import org.example.dao.ProdutoDao;
import org.example.exception.EntidadeNaoEncontradaException;
import org.example.model.Produto;

import java.sql.SQLException;
public class AtualizacaoProdutoView {
    public static void main(String[] args) {
        try {
            ProdutoDao dao = new ProdutoDao();
            Produto produto = dao.pesquisar(21);
            produto.setNome("Camisa Polo");
            produto.setDescricao("Camisa Polo Azul");
            produto.setEstoque(10);
            produto.setValor(50.0);
            dao.atualizar(produto);
            dao.fecharConexao();
            System.out.println("Produto atualizado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Produto não encontrado");
        }
    }
}
