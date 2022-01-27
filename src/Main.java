import br.com.dalcimar.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java\n");
        curso1.setDescricao(" Introdução a liguagem Java\n");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js\n");
        curso2.setDescricao("Curso básico de Javascript\n");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java\n");
        mentoria.setDescricao("Boas práticas em Java\n");
        mentoria.setDate(LocalDate.now());
        
        /*System.out.println("curso1 = " + curso1);
        System.out.println("curso2 = " + curso2);
        System.out.println("mentoria = " + mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDalcimar = new Dev();
        devDalcimar.setNome("Dalcimar");
        devDalcimar.indcreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dalcimar: " + devDalcimar.getConteudoInscritos());
        devDalcimar.progredir();
        devDalcimar.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dalcimar: " + devDalcimar.getConteudoInscritos());
        System.out.println("Conteúdos Concuídos Dalcimar: " + devDalcimar.getConteudoConcluidos());
        System.out.println("XP: " + devDalcimar.calcularTotalXp());

        System.out.println("----------");

        Dev devAriano = new Dev();
        devAriano.setNome("Ariano");
        devAriano.indcreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ariano" + devAriano.getConteudoInscritos());
        devAriano.progredir();
        devAriano.progredir();
        devAriano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ariano" + devAriano.getConteudoInscritos());
        System.out.println("Conteúdos Concuídos Ariano: " + devDalcimar.getConteudoConcluidos());
        System.out.println("XP: " + devAriano.calcularTotalXp());
    }
}
