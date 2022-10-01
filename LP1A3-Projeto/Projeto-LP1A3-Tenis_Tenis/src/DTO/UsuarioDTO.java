package DTO;

public class UsuarioDTO {
    private String nome, senha;
    
    public UsuarioDTO (String nome, String senha){
        this.nome = nome;
        this.senha = senha;       
    }

    public UsuarioDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void FormCadastro (String nome, String senha){
        this.nome = nome;
        this.senha = senha;       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
