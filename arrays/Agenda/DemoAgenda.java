package Agenda;

public class DemoAgenda {
    public static void main(String args[]) {
        Agenda agenda = new Agenda();

        agenda.criarCompromisso("00:00", 2, 12, 2024, "Aniversario Felipe");
        agenda.criarCompromisso("02:00", 2, 12, 2024, "Acordar Felipe");
        agenda.criarCompromisso("04:00", 2, 12, 2024, "Se arrumar");
        agenda.criarCompromisso("08:00", 2, 12, 2024, "Ir pra aula");
        agenda.criarCompromisso("16:00", 2, 12, 2024, "Festa Felipe");
        agenda.criarCompromisso("00:00", 1, 1, 2024, "Ano novo");

        agenda.listaDia(2, 12, 2024);
    }
}
