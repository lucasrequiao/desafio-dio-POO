import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de javascript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de java.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp de java!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Lucas" + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
        devLucas.progredir();
        System.out.println("--");
        System.out.println("Conteúdos concluídos de Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Lucas" + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
        devLucas.progredir();
        System.out.println("--");
        System.out.println("Conteúdos concluídos de Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Lucas" + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
        devLucas.progredir();
        System.out.println("--");
        System.out.println("Conteúdos concluídos de Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Lucas" + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João" + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdos concluídos de João" + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de João" + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());






    }
}
