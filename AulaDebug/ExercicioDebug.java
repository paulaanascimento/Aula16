import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDebug {
    public static double calcularAreaRetanguloComInputUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double areaRetangulo = base * altura;

        System.out.println("O valor da área é de: " + areaRetangulo);

        return areaRetangulo;
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        double areaRetangulo = base * altura;

        System.out.println("\nO valor da área do retangulo de base " + base + " e altura " + altura + " é: " + areaRetangulo);

        return areaRetangulo;
    }

    public static void calcularSomaAreas() {
        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetangulo(16, 8);
        System.out.println("\nA area total de construção é de: " + somaAreas);
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

    public static List<Integer> retornarListaNumeros() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listaNumero = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o " + (i+1) + " numero");
            listaNumero.add(scanner.nextInt());
        }

        return listaNumero;
    }

    public static void mostrarMensagemComQuantidade(List<Integer> quantidade, List<String> mensagem) {
        for (int i = 0; i < quantidade.size(); i++) {
            System.out.println(quantidade.get(i).toString() + " " + mensagem.get(i));
        }
    }

    public static List<String> retornarListaNomes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a capacidade: ");
        int capacidade = scanner.nextInt();

        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < capacidade; i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(scanner.next());
        }

        return listaNomes;
    }

    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");
        calcularSomaAreas();


        System.out.println("\n=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);


        System.out.println("\n=========================================================");
        System.out.println("Exemplo de array");
        System.out.println("=========================================================");
        List<String> listaNomes = retornarListaNomes();
        System.out.println(listaNomes);

        System.out.println("\n=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        System.out.println("=========================================================");
        mostrarMensagemComQuantidade(listaNumerosArray, listaNomes);

    }
}
