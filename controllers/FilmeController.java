package controllers;
import java.util.ArrayList;

import classes.Filme;

public class FilmeController {

    private static ArrayList<Filme> filmes = new ArrayList<Filme>();

    public void cadastrar(Filme filme) {
        filmes.add(filme);
    }

    public ArrayList<Filme> listar() {
        return filmes;
    }

    public Filme buscarPorCodigo(String codigo){
        for (Filme filmeCadastrado : filmes) {
            if(filmeCadastrado.getCodigo().equals(codigo)){
                return filmeCadastrado;
            }
        }
        return null;
    }

    
}