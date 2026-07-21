package br.com.alura.domain;

public class Abrigo {

    public Abrigo() {

    } //construtor default

    public Abrigo(String nome, String telefone, String email) {
        //não precisa passa o ID no construtor, pq é alto gerado pelo BD
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
