/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddmn20222.models.daos;

import backenddmn20222.models.beans.UsuarioPessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class DaoUsuarioPessoa {
        
    public UsuarioPessoa inserir(UsuarioPessoa usuEnt) {
        usuEnt.setId(1);
        return usuEnt;
    }

    public UsuarioPessoa alterar(UsuarioPessoa usuEnt) {
        return usuEnt;
    }

    public List<UsuarioPessoa> listar(UsuarioPessoa usuEnt) {
        List<UsuarioPessoa> listaUsu = new ArrayList<>();
        listaUsu.add(usuEnt);
        return listaUsu;
    }

    public UsuarioPessoa excluir(UsuarioPessoa usuEnt) {
        return usuEnt;
    }

    public UsuarioPessoa buscar(UsuarioPessoa usuEnt) {
        return usuEnt;
    }
    
}
