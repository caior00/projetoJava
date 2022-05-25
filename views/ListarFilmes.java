package views;

import classes.Filme;
import controllers.FilmeController;

public class ListarFilmes {
 public void menu(){
     FilmeController filmeControle = new FilmeController();
     System.out.println("- Lista de Filmes");
     for (Filme filmeCadastrado : filmeControle.listar()) {
        System.out.println(filmeCadastrado);
     }
 }   
}
