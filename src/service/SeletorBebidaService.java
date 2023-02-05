package service;

import java.util.Scanner;

public class SeletorBebidaService {

    private Scanner entrada = new Scanner(System.in);

    private final PreparadorBebidaService preparadorBebidaService = new PreparadorBebidaService();

    public void criarSeletorBebidas() {

        System.out.println("""
                -- Selecione o tipo da bebida -- \n
                
                1. Café \n
                2. Café com Leite \n
                3. Capuccino \n
                4. Chá de Limão \n
                5. Água quente \n
                """);

        int escolha = entrada.nextInt();

        try {
            switch (escolha) {
                case 1 -> preparadorBebidaService.prepararCafe();
                case 2 -> preparadorBebidaService.prepararCafeComLeite();
                case 3 -> preparadorBebidaService.prepararCapuccino();
                case 4 -> preparadorBebidaService.prepararCha();
                case 5 -> preparadorBebidaService.prepararAguaQuente();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao preparar a bebida. \n" + e);
        }


    }
}
