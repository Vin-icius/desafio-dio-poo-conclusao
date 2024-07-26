package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private Pessoa mentor;
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP + 20.0;
    }

    public Mentoria(Pessoa mentor,LocalDate data) {
        this.mentor=mentor;
        this.data = data;
    }

    public Mentoria() {
        this(null,null);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Pessoa getMentor() {
        return mentor;
    }

    public void setMentor(Pessoa mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
