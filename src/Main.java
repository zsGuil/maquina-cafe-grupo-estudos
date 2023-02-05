import service.SeletorBebidaService;

import java.math.BigDecimal;

public class Main {

    private static final SeletorBebidaService seletorBebidaService = new SeletorBebidaService();

    private BigDecimal precoBebida = BigDecimal.ZERO;
    private int nivelAcucar = 3;
    private int nivelAgua = 1000;

    public static void main(String[] args) {
        while (true) {
            seletorBebidaService.criarSeletorBebidas();
        }

    }

}
