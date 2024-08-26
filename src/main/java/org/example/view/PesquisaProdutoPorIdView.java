package org.example.view;


import org.example.dao.ProdutoDao;
import org.example.exception.EntidadeNaoEncontradaException;
import org.example.model.Produto;
import java.sql.SQLException;

public class PesquisaProdutoPorIdView {
    public static void main(String[] args) {
        try {
            ProdutoDao dao = new ProdutoDao();

            Produto produto = dao.pesquisar(4);

            System.out.println(produto.getCodigo()+ " " + produto.getNome() + ", " + produto.getDescricao());

            System.out.println("R$ " + produto.getValor() + ", " + produto.getEstoque());

            dao.fecharConexao();

        } catch (SQLException e) {

            System.err.println(e.getMessage());

        } catch (EntidadeNaoEncontradaException e) {

            System.err.println("Codigo  não  existe  na tabela");}
    }
}