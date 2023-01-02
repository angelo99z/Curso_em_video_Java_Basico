
import java.util.Scanner;
import java.lang.Math.pow;

public class SistemaCalculadora {
    private Scanner s;

    public static void main(String[] args) throws Exception{
        SistemaCalculadora calc = new SistemaCalculadora();
        calc.s = new Scanner(System.in);
        calc.menu();
    }

    public void menu() throws Exception{
        int op = 0;
		while(op != (0)){
            System.out.println("");
			System.out.println("========================================");
            System.out.println("==================MENU==================");
			System.out.println("[1] Adição");
			System.out.println("[2] Divisão");
			System.out.println("[3] Multiplicação");
                        System.out.println("[4] Subtração");
                        System.out.println("[5] Elevado ao quadrado");
			System.out.println("[0] Sair");
			op = s.nextInt();

            switch (op){
                case 1:
                    this.adicao();
                    break;
                case 2:
                    this.divisao();
                    break;
                case 3:
                    this.multiplicacao();
                    break;
                case 4:
                    this.subtracao();
                    break;
                case 5:
                    this.quadrado();
                    break;    
                case 0:
                    System.out.println("=================SAINDO=================");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public void adicao() {
        System.out.println("========================================");
        System.out.println("==================ADIÇÃO================");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = a + b;
        
        System.out.println( "A adição dos números = " + c );
    }

    public void divisao(){
        System.out.println("========================================");
        System.out.println("==================DIVISÃO===============");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        if(b == 0){
            System.out.println("Não é possível fazer divisão por 0.");
        } else{
            c = a / b;
            System.out.println( "A divisão dos números = " + c );
        }
    }

    public void multiplicacao(){
        System.out.println("========================================");
        System.out.println("==============MULTIPLICAÇÃO=============");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = a * b;
        
        System.out.println( "A multiplicação dos números = " + c );
    }

    public void subtracao(){
        System.out.println("========================================");
        System.out.println("================SUBTRAÇÃO===============");
        System.out.println();
        
        float a, b, c = 0;
    
        System.out.println( "Digite os números: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = a - b;
        
        System.out.println( "A subtração dos números = " + c );
    }
    
    public void quadrado(){
        System.out.println("========================================");
        System.out.println("==============ELEVADO AO QUADRADO=============");
        System.out.println();
        
        float a, b = 0;
    
        System.out.println( "Digite o número: ");
        a = s.nextFloat();
        b = Math.pow(a,2) ;
        
        System.out.println( "A elevação ao quadrado do número = " + b );    
    }
}
