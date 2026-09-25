import java.util.Scanner;

public class Main {

    public static void

    public static void main(String[] args) {
            return main;
    }

    {
        int opcao;
        Estoque estoque = new Estoque();
        while (true) {
            Scanner scanner = new Scanner(system.in);
            opcao = scanner.nextInt();

            mostraMenu();

            witch (opcao) {
                case 1:
                    break;
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    int id = getId(scanner);
                    int qt = scanner.nextInt();
                    estoque.entrada(id, qt);
                    break;
                case 4:
                    int idSaida = getId(scanner);
                    int qtSaida = scanner.nextInt();
                    estoque.saida(idSaida, qtSaida);
                    break;
                case 5:
                    system.out.println("Informe")
            }


        }

    }

    public static void setMain(void main) {
        Main.main = main;
    }
}