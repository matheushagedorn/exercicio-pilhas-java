import java.util.Scanner;

public class ControleAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaEstatica pe1 = new PilhaEstatica();
        PilhaEstatica pe2 = new PilhaEstatica();

        for (int i = 1; i <= 20; i++) {
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Matrícula do aluno: ");
            String matriculaStr = scanner.nextLine();
            int matricula;
            try {
                matricula = Integer.parseInt(matriculaStr);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Matrícula inválida. Ignorando aluno.");
                continue;
            }
            System.out.print("Sexo do aluno (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            Aluno aluno = new Aluno(nome, matricula, sexo);
            if (sexo == 'F' || sexo == 'f') {
                pe1.push(aluno);
            } else if (sexo == 'M' || sexo == 'm') {
                pe2.push(aluno);
            } else {
                System.out.println("Sexo inválido. Ignorando aluno.");
            }
        }

        System.out.println("\nAlunos do sexo feminino (PE_1):");
        while (!pe1.isEmpty()) {
            Aluno aluno = pe1.pop();
            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula);
        }

        System.out.println("\nAlunos do sexo masculino (PE_2):");
        while (!pe2.isEmpty()) {
            Aluno aluno = pe2.pop();
            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula);
        }

        pe1.destroy();
        pe2.destroy();
    }
}