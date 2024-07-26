package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String desc;
    private LocalDate dataIni;
    private LocalDate dataFim;
    private List<Dev> devsInscritos = new ArrayList<>();
    private List<Curso> conteudos = new ArrayList<>();
    private List<Mentoria> mentoria = new ArrayList<>();

    public Bootcamp(String nome, String desc, LocalDate dataIni, LocalDate dataFim, List<Dev> devsInscritos, List<Curso> conteudos, List<Mentoria> mentoria) {
        this.nome = nome;
        this.desc = desc;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
        this.devsInscritos = devsInscritos;
        this.conteudos = conteudos;
        this.mentoria=mentoria;
    }

    public Bootcamp() {
        this.nome = "";
        this.desc = "";
        this.dataIni = LocalDate.now();
        this.dataFim = LocalDate.now().plusDays(45);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getDataIni() {
        return dataIni;
    }

    public void setDataIni(LocalDate dataIni) {
        this.dataIni = dataIni;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(List<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public List<Curso> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Curso> conteudos) {
        this.conteudos = conteudos;
    }

    public List<Mentoria> getMentoria() {
        return mentoria;
    }

    public void setMentoria(List<Mentoria> mentoria) {
        this.mentoria = mentoria;
    }
}
