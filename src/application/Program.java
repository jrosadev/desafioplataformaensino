package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sn.nextInt();
		
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da " + i + "° aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = sn.next().charAt(0);
			System.out.print("Título: ");
			sn.nextLine();
			String title = sn.nextLine();
			if (ch == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sn.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sn.nextInt();
				list.add(new Video(title, url, seconds));
			} else {
				System.out.print("Descrição: ");
				String description = sn.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sn.nextInt();
				list.add(new Task(title, description, questionCount));
			}
			System.out.println();
		}
		int totalDuration = 0;
		for (Lesson each : list) {
			int ld = each.duration();
			totalDuration += ld;
		}
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");		
		sn.close();
	}
}
