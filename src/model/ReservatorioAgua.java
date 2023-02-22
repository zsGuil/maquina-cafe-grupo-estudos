package model;

public class ReservatorioAgua {

	private int nivelAgua = 1000;
	
	public int getNivelAgua() {
		
		return nivelAgua;
	}
	
	public void retiraAgua() {
		nivelAgua -= 50;
		}	
	
	public void abastecer(int qntd) {
		nivelAgua += qntd;
	}
	
}
