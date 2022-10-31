package henrique;
import java.util.Scanner;
public class atividadesalario {
public static void main (String[]args) {
	double salario=0, novosalario=0;
	int cod=0, meses=0;
	Scanner ler= new Scanner (System.in);
	
	
	  while(cod!=4) {
		  System.out.println("Digite 1 para ir para novo salario, 2 para ferias, 3 paradecimo terceiro e 4 para finalizar progama:");
			cod=ler.nextInt();
			 System.out.println("Qual seu salario atual: ");
			  salario=ler.nextDouble();
	switch (cod) {
		case (1):
	  
	  if (salario<=350) {
		  novosalario=(salario*1.15);
		  System.out.println("O seu novo salario é:"+novosalario);
	  }
	  else if (salario>350 & salario<=600) {
		  novosalario=(salario*1.10);
		  System.out.println("O seu novo salario é:"+novosalario);
	  }
	  else if (salario>600) {
		  novosalario=salario*1.05;
		  System.out.println("O seu novo salario é:"+novosalario);
	  }
	  break;
	  
		case (2):
			novosalario=(salario*0.33)+salario;
		System.out.println("O seu salario de ferias é:"+novosalario);
		break;
		
		case(3):
			System.out.println("Quantos meses você faz parte da instituição:");
		    meses=ler.nextInt();
		    
		    if (meses<12);
		    novosalario=(salario*meses)/12;
		    System.out.println("O seu decimo terceiro será de:"+novosalario);
		    break;
		    
	
	}
	  }
	
	
}
}
