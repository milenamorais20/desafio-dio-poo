import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Python");
        curso2.setDescricao("descricao curso Python");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Curso Java Developer");
        bootcamp.setDescricao("Descrição Curso Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMilena = new Dev();
        devMilena.setNome("Milena");
        devMilena.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Milena: "+ devMilena.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Milena: "+ devMilena.getConteudosConcluidos());
        System.out.println("XP: "+ devMilena.calcularTotalXp());

        System.out.println("=============");

        devMilena.progredir();
        System.out.println("Conteudos Inscritos Milena: "+ devMilena.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Milena: "+ devMilena.getConteudosConcluidos());
        System.out.println("XP: "+ devMilena.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Milena");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

        System.out.println("=============");

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Inscritos Joao: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());
    }
}
