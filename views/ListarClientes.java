package views;


import classes.Cliente;
import controllers.ClienteController;

public class ListarClientes {

    public void menu(){
        ClienteController clienteControle = new ClienteController();      
        System.out.println("\n - Lista de Clientes - \n");
        for (Cliente clienteCadastrado : clienteControle.listar()) {
            System.out.println(clienteCadastrado);
        }
    }
    
}