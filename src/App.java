    import java.util.Scanner;
    import java.util.ArrayList;

    public class App {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            ArrayList<User> user = new ArrayList<User>();
            ArrayList<Book> book = new ArrayList<Book>();
            boolean running = true;

            while (running) {
                System.out.println("""
                    ╔════════════════════════════╗
                    ║    Sistema de biblioteca   ║
                    ╠════════════════════════════╣
                    ║   1. Cadastrar usuário     ║
                    ║   2. Listar usuários       ║
                    ║   3. Emprestar livro       ║
                    ║   4. Devolver livro        ║
                    ║   5. Listar acervo         ║
                    ║   0. Sair                  ║
                    ╚════════════════════════════╝  
                """);
                
                System.out.print("Digite: ");
                int value = scanner.nextInt();
                scanner.nextLine();

                switch (value) {
                    case 1:

                        System.out.print("\nDigite o nome do usuário: ");
                        String name = scanner.nextLine();

                        System.out.print("\nDigite o ID do usuário: ");
                        String nameId = scanner.nextLine();

                        User newUser = new User(name, nameId);
                        user.add(newUser);

                        break;
                    case 2:
                        if (user.size() == 0) {
                            System.out.println("\nNão há usuários.\n");
                        }
                        for(int i = 0; i < user.size(); i++){
                            System.out.println("\n" + (i + 1) + ". " + user.get(i).getName() + " | " + user.get(i).getNameId() + "\n");
                        }

                        break;
                    case 0:
                        running = false;
                        break;
                }
            }
        }
    }
