/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddmn20222.models.daos;

import backenddmn20222.models.beans.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class DaoPessoa {
    
    public Pessoa inserir (Pessoa pes) {
       pes.setId(1000);
       return pes;
    }

    public Pessoa buscar (Pessoa pes) {
       pes.setId(1000);
       return pes;
    }

    public Pessoa alterar (Pessoa pes) {
       pes.setId(1000);
       return pes;
    }

    public Pessoa excluir (Pessoa pes) {
       pes.setId(1000);
       return pes;
    }

    public List<Pessoa> listar(Pessoa pes) {
        List<Pessoa> listaPes = new ArrayList<>();
        listaPes.add(pes);
        return listaPes;
    }
    
}
