import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.set_titulo("curso java");
        curso1.set_descricao("descrição curso java");
        curso1.set_cargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.set_titulo("curso java");
        curso2.set_descricao("descrição curso java");
        curso2.set_cargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.set_titulo("mentoria java");
        mentoria1.set_descricao("descrição curso java");
        mentoria1.set_data(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.set_nome("Bootcamp Java Developer");
        bootcamp1.set_descricao("Descricao bootcamp java developer");
        bootcamp1.get_conteudos().add(curso1);
        bootcamp1.get_conteudos().add(curso2);
        bootcamp1.get_conteudos().add(mentoria1);

        Dev devAdelia = new Dev();
        devAdelia.set_nome("Adélia");
        devAdelia.inscreverBootcamp(bootcamp1);
        System.out.println("conteudos incritos adelia:"+ devAdelia.getConteudosInscritos());
        devAdelia.progredir();
        devAdelia.progredir();
        System.out.println("conteudos concluidos adelia:"+ devAdelia.get_conteudosConcluidos());
        System.out.println("XP: " + devAdelia.calcularTotalXp());

        Dev devVitor = new Dev();
        devVitor.set_nome("Vitor");
        devVitor.inscreverBootcamp(bootcamp1);
        System.out.println("conteudos incritos vitor:"+ devVitor.getConteudosInscritos());
        devVitor.progredir();
        System.out.println("conteudos concluidos vitor:"+ devVitor.get_conteudosConcluidos());
        System.out.println("XP: " + devVitor.calcularTotalXp());




    }
}