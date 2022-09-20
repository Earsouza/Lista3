package Lista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nome;
		LocalDate dataNasc;
		Long cpf;
		Long matricula;
		Long siape;
		int dia;
		int mes;
		int ano;

		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Professor> listaProfessores = new ArrayList<>();

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {

			System.out.printf("Informe o nome do %dº Aluno: \n", i + 1);
			nome = s.nextLine();

			System.out.printf("Informe a data de nascimento do %dº Aluno (dd/mm/aa): \n", i + 1);
			System.out.printf("Dia: ");
			dia = Integer.valueOf(s.nextLine());
			System.out.printf("Mes: ");
			mes = Integer.valueOf(s.nextLine());
			System.out.printf("Ano: ");
			ano = Integer.valueOf(s.nextLine());
			dataNasc = LocalDate.of(ano, mes, dia);

			System.out.printf("Informe o cpf do %dº Aluno: \n", i + 1);
			cpf = Long.valueOf(s.nextLine());

			System.out.printf("Informe a matricula do %dº Aluno: \n", i + 1);
			matricula = Long.valueOf(s.nextLine());

			Aluno a = new Aluno();
			a.setNome(nome);
			a.setCpf(cpf);
			a.setDataNasc(dataNasc);
			a.setMatricula(matricula);
			listaAlunos.add(a);

		}

		for (int i = 0; i < 1; i++) {

			System.out.printf("Informe o nome do %dº Professor: \n", i + 1);
			nome = s.nextLine();

			System.out.printf("Informe a data de nascimento do %dº Professor (dd/mm/aaaa): \n", i + 1);
			System.out.printf("Dia: ");
			dia = Integer.valueOf(s.nextLine());
			System.out.printf("Mes: ");
			mes = Integer.valueOf(s.nextLine());
			System.out.printf("Ano: ");
			ano = Integer.valueOf(s.nextLine());
			dataNasc = LocalDate.of(ano, mes, dia);

			System.out.printf("Informe o cpf do %dº Professor: \n", i + 1);
			cpf = Long.valueOf(s.nextLine());

			System.out.printf("Informe a siape do %dº Professor: \n", i + 1);
			siape = Long.valueOf(s.nextLine());

			Professor p = new Professor();
			p.setNome(nome);
			p.setCpf(cpf);
			p.setDataNasc(dataNasc);
			p.setSiape(siape);
			listaProfessores.add(p);

		}

		for (Professor p : listaProfessores) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("CPF: " + p.getCpf());
			System.out.println("Data de Nascimento: " + p.getDataNasc());
			System.out.println("Siape:" + p.getSiape() + "\n\n");
		}

		for (Aluno a : listaAlunos) {
			System.out.println("Nome: " + a.getNome());
			System.out.println("CPF: " + a.getCpf());
			System.out.println("Data de Nascimento: " + a.getDataNasc());
			System.out.println("Matricula:" + a.getMatricula() + "\n\n");
		}

		s.close();
	}

}
