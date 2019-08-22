import java.util.*;
public class Main {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {	
		Moto moto = new Moto();
    	byte opcao = -1;
    	 
    	do {
			do {
    			System.out.println("\n ***************  CADASTRO DE MOTOS  ***************** ");
    			System.out.println(" [1] INCLUIR MOTOS ");
    			System.out.println(" [2] ALTERAR MOTOS ");
    			System.out.println(" [3] CONSULTAR MOTOS ");
    			System.out.println(" [4] EXCLUIR MOTOS ");
    			System.out.println(" [0] SAIR");
    			System.out.print("\nDigite a opcao desejada: ");
    			opcao = leia.nextByte();
    			if (opcao < 0 || opcao > 4) {
    				System.out.println("opcao Invalida, digite novamente.\n");
    			}
    		}while (opcao < 0 || opcao > 4);
			
			switch (opcao) {
				case 0:
					System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
					break;
				case 1: 
					moto.incluir(); 
					break;
				case 2:
					moto.alterar();
					break;
				case 3: 
					moto.consultar();
					break;
				case 4: 
					moto.excluir();
					break;
			}
    	} while ( opcao != 0 );
    	leia.close();
	}

}
