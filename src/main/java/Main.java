import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Python");
        curso2.setDescricao("descricao curso Python");
        curso2.setCargaHoraria(10);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
