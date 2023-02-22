package service;

import model.ReservatorioAgua;

public class PreparadorBebidaService {

	private final ReservatorioAgua reservatorio = new ReservatorioAgua();
	
    public void prepararAguaQuente() throws InterruptedException {
    	
    	System.out.println("Quantidade atual de água: " + reservatorio.getNivelAgua());
    	
    	reservatorio.retiraAgua();
    	
        System.out.println("Esquentando água...");
        Thread.sleep(3000);

        System.out.println("Água fervida!");
        Thread.sleep(1000);
        
        System.out.println("Quantidade atual de água: " + reservatorio.getNivelAgua());
        
    }

    public void prepararCafe() throws InterruptedException {
    	
    	reservatorio.retiraAgua();
    	
        System.out.println("Esquentando água...");
        Thread.sleep(3000);

        System.out.println("Misturando pó de café...");
        Thread.sleep(1000);

        System.out.println("Filtrando café...");
        Thread.sleep(1000);

        System.out.println("Café pronto!");
        Thread.sleep(1000);
    }

    public void prepararCafeComLeite() throws InterruptedException {
    	
    	reservatorio.retiraAgua();
    	
        System.out.println("Esquentando água...");
        Thread.sleep(3000);

        System.out.println("Misturando pó de café...");
        Thread.sleep(1000);

        System.out.println("Misturando leite em pó...");
        Thread.sleep(1000);

        System.out.println("Filtrando café com leite...");
        Thread.sleep(1000);

        System.out.println("Café com leite pronto!");
        Thread.sleep(1000);
    }

    public void prepararCapuccino() throws InterruptedException {
    	
    	reservatorio.retiraAgua();
    	
        System.out.println("Esquentando água...");
        Thread.sleep(3000);

        System.out.println("Misturando pó de café...");
        Thread.sleep(1000);

        System.out.println("Misturando leite em pó...");
        Thread.sleep(1000);

        System.out.println("Misturando chocolate em pó...");
        Thread.sleep(1000);

        System.out.println("Filtrando café com leite...");
        Thread.sleep(1000);

        System.out.println("Capuccino pronto!");
        Thread.sleep(1000);
    }

    public void prepararCha() throws InterruptedException {
    	
    	reservatorio.retiraAgua();
    	
        System.out.println("Esquentando água...");
        Thread.sleep(3000);

        System.out.println("Misturando chá em pó...");
        Thread.sleep(1000);

        System.out.println("Filtrando chá...");
        Thread.sleep(1000);

        System.out.println("Chá pronto!");
        Thread.sleep(1000);
    }

}
