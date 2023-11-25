import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        Scanner scanner = new Scanner(System.in);
        Arvore arvore = new Arvore();
        sc = new Scanner(new File("C:\\Users\\12110561\\IdeaProjects\\av2_Estrutura\\dados.txt"));

        int num = 0;

        Arvore.Node raiz = null;

        do {

            System.out.println("<Inserir 1> <Excluir 2> <Pesquisar 3> <Pré ordem 4> <Sair 5>");
            num = scanner.nextInt();
        }