package capturarLetra;

import java.util.Scanner;

public class LetraC {
	public static void main(String[] args) {
		//branch feature?
		String nome;
	    String []soC = new String[5];
	    Scanner sc = new Scanner(System.in);
	    int total = 0;
	    for(int c = 0; c < soC.length; c++ ){
	        System.out.println(" Digite o seu nome:");
	        nome = sc.next();
	        if(nome.charAt(0) == 'C'){
	        	soC[total] = nome;
	        	total++;
	        }
	    }
	    //teste feito para criar uma nova branch
	    for(int i = 0; i < total; i++){
	    		  System.out.println( " Posição " + i + " " + soC[i]);
	    	  }
	    System.out.println(total);
	
	}
	}

