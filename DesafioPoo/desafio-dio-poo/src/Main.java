import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDesc("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getMentoria().add(mentoria);

        Pessoa camila = new Pessoa("Camila","camila@gmail.com","(11)99999-9999");
        Dev devCamila = new Dev();
        devCamila.setPessoa(camila);
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.concluirCurso(bootcamp.getConteudos().get(0));
        devCamila.concluirCurso(bootcamp.getConteudos().get(0));
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXP());

        System.out.println("-------");

        Pessoa joao = new Pessoa("Joao","joao@gmail.com","(22)11111-9999");
        Dev devJoao = new Dev();
        devJoao.setPessoa(joao);
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.concluirCurso(bootcamp.getConteudos().get(0));
        devJoao.concluirCurso(bootcamp.getConteudos().get(0));
        devJoao.concluirCurso(bootcamp.getConteudos().get(0));
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXP());
    }
}