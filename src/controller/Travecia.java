package controller;

import java.util.concurrent.Semaphore;

public class Travecia extends Thread {
	private int carros;
    private Semaphore semaforo;
    String carro;
    String direcao;
    
    public Travecia (int carros,Semaphore semaforo ) {
 	   this.carros = carros;
 	   this.semaforo = semaforo;
    }
    public void run() {
    	 try {
  		   semaforo.acquire();
  		 CarroAtravessando();
  		
  	   }catch(InterruptedException e1){
               e1.getStackTrace();
  		   
  	   }finally {
  		   semaforo.release();
  	   }
     }
    
    public void CarroAtravessando() {
    	
 	   if(carros == 1) {
 		   carro = "Verde";
 		   direcao = "esquerda";
 			   System.out.println("O carro "+ carro +" está na rua a "+direcao);
 			  try {
				   Thread.sleep(1000);
			   }catch(InterruptedException e) {
				    e.printStackTrace();	
				    }
			   
 			 
 			   System.out.println("O "+carro+" foi para a rua na direita");
 			   
 	   }
    
    
 	  if(carros == 2) {
		   carro = "Vermelho";
		   direcao = "acima";
			   System.out.println("O carro "+ carro +" está na rua a "+direcao);
			   try {
				   Thread.sleep(1000);
			   }catch(InterruptedException e) {
				    e.printStackTrace();	
				    }
			   
			   
			   System.out.println("O "+carro+" desceu a rua");
			   
	   }
    

 	 if(carros == 3) {
		   carro = "Azul";
		   direcao = "direita";
			   System.out.println("O carro "+ carro +" está na rua a "+direcao);
			   try {
				   Thread.sleep(1000);
			   }catch(InterruptedException e) {
				    e.printStackTrace();	
				    }
			   
 	 
			   System.out.println("O "+carro+" foi para a rua na esquerda");
 	 }
    

	    if(carros == 4) {
		   carro = "Amarelo";
		   direcao = "abaixo";
			   System.out.println("O carro "+ carro +" está na rua a "+direcao);
			   try {
				   Thread.sleep(1000);
			   }catch(InterruptedException e) {
				    e.printStackTrace();	
				    }
			   System.out.println("O "+carro+" subiu a rua");
	   }
		  
    } 
   }


