package me.dio.projeto.dominio;

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
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLigia = new Dev();
        devLigia.setNome("Lígia");
        devLigia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Lígia: " + devLigia.getConteudosInscritos());
        devLigia.progredir();
        devLigia.progredir();
        devLigia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos - Lígia: " + devLigia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos - Lígia: " + devLigia.getConteudosConcluidos());
        System.out.println("XP: " + devLigia.calcularTotalXp());

        System.out.println("---------");

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - José: " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos - José: " + devJose.getConteudosInscritos());
        System.out.println("Conteúdos concluídos - José: " + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());
    }
}
