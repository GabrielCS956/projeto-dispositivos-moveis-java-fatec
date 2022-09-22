/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddmn20222.models.beans;

/**
 *
 * @author lab04aluno
 */
public class UsuarioPessoa  {
        
    private int id;
    private int idUsuario;
    private int idPessoa;
    private String obs;
    private Usuario usu;
    private Pessoa pes;

    public UsuarioPessoa(int id) {
        this.id = id;
    }

    public UsuarioPessoa(String obs) {
        this.obs = obs;
    }

    public UsuarioPessoa(int idUsuario, int idPessoa, String obs) {
        this.idUsuario = idUsuario;
        this.idPessoa = idPessoa;
        this.obs = obs;
    }

    public UsuarioPessoa(int id, int idUsuario, int idPessoa, String obs) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idPessoa = idPessoa;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }

    @Override
    public String toString() {
        return "UsuarioPessoa{" + "id=" + id + ", idUsuario=" + idUsuario + ", idPessoa=" + idPessoa + ", obs=" + obs + '}';
    }
   
}
