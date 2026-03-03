import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=======================");
        System.out.println("= Bem vindo - Biblioteca =");
        System.out.println("=======================");
        
        boolean running = true;
        while(running){
            System.out.println("=======================");
            System.out.println("=  MENU               =");
            System.out.println("=  1. Listar acervo   =");
            System.out.println("=  0. Sair            =");
            System.out.println("=======================");

            System.out.println("Escolha uma opção: ");

            String option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    
                break;
                case "0":
                    running = false;
                    System.out.println("Até a próxima");
                        
                break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
            
            
        }
    }
}
