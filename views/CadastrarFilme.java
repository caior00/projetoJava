package views;

import classes.Filme;
import controllers.FilmeController;
import util.Console;

public class CadastrarFilme {
    public void menu(){

        Filme filme = new Filme();
        FilmeController filmeController = new FilmeController();
        System.out.println(" -  Cadastro de Filmes - ");
        filme.setTitulo(Console.readString("Digite o nome do Filme: "));
        filme.setCodigo(Console.readString("Digite o codigo do Filme: "));
        filme.setGenero(Console.readString("Digite o genero do Filme: "));
        filme.setAnoLancamento(Console.readString("Digite o ano de lancamento do Filme: "));
        filme.setDuracaoMinutos(Console.readString("Digite a duracao do Filme em minutos: "));
        filmeController.cadastrar(filme);
        System.out.println("Filme cadastrado");
    }
}
