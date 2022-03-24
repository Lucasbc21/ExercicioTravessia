package view;

import java.util.concurrent.Semaphore;

import controller.Travecia;

public class Carros {
	public static void main(String [] args) {
		Semaphore semaforo = new Semaphore(1);
		
		for(int carros = 1;carros < 5; carros++) {
			Travecia thread = new Travecia(carros, semaforo);
			thread.start();
		}
	}
}
