package dominio;
import java.util.ArrayList;
import java.util.List;

public class Dev{
    private Pessoa pessoa;
    private List<Curso> conteudosInscritos;
    private List<Curso> conteudosConcluidos;

    public Dev(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.conteudosInscritos = new ArrayList<>();
        this.conteudosConcluidos = new ArrayList<>();
    }

    public Dev() {
        this(null);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Curso> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Curso> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Curso> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<Curso> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //METODOS

    public boolean inscreverBootcamp(Bootcamp bc){
        if(bc != null){
            this.conteudosInscritos.addAll(bc.getConteudos());
            bc.getDevsInscritos().add(this);

            return true;
        }

        return false;
    }

    public boolean concluirCurso(Curso conteudo){
        if(!conteudosInscritos.isEmpty()){
            this.conteudosInscritos.remove(conteudo);
            this.conteudosConcluidos.add(conteudo);

            return true;
        }

        return false;
    }

    public double calcularXP(){
        double soma = 0;

        for(Curso c:conteudosConcluidos){
            soma+= c.calcularXp();
        }

        return soma;
    }
}
