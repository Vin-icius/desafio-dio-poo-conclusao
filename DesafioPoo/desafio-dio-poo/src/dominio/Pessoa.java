package dominio;

public class Pessoa {
    private String nome;
    private String email;
    private String numero_telefone;

    public Pessoa(String nome, String email, String numero_telefone) {
        this.nome = nome;
        this.email = email;
        this.numero_telefone = numero_telefone;
    }

    public Pessoa() {
        this("","","");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }
}
