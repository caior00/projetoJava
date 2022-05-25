package controllers;
import java.util.ArrayList;

import classes.Cliente;

public class ClienteController {

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listar() {
        return clientes;
    }

    public Cliente buscarPorRg(String rg){
        for (Cliente clienteCadastrado : clientes) {
            if(clienteCadastrado.getRg().equals(rg)){
                return clienteCadastrado;
            }
        }
        return null;
    }

}