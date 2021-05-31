package Principal;

import java.time.LocalDate;

public class aula1_main {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
        // Data de Nascimento: 22-03-1986

        System.out.println(" ");

        LocalDate localDate = LocalDate.now();
        System.out.print("Data corrente: ");
        System.out.print(localDate.getDayOfMonth());
        System.out.print("-");
        System.out.print(localDate.getMonthValue());
        System.out.print("-");
        System.out.print(localDate.getYear());



        System.out.print("teste");
    }
}
