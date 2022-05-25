package views;

import java.util.ArrayList;

import classes.Emprestimo;
import controllers.EmprestimoController;

public class ListarEmprestimos {
    public void menu(){
    EmprestimoController emprestimoControle = new EmprestimoController();
    ArrayList<Emprestimo> emprestimos = emprestimoControle.listar();
    System.out.println("\n - Listagem de Emprestimos - \n");
    for (Emprestimo emprestimoCadastrado : emprestimoControle.listar()){
        System.out.println(emprestimoCadastrado);
    }
}

}