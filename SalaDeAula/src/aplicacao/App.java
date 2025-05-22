package aplicacao;

import java.util.Scanner;

import estrutura.Aluno;
import modelo.FilaAlunos;

public class App {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    FilaAlunos filaAlunos = new FilaAlunos();
	    int option;

	    do {
	        System.out.println(
	            "\nMenu: \n1-Add Student\n2-Remove Student\n3-Search Student (by name)\n4-Search Student (by index)\n5-Check Size\n6-Print Queue\n0-Exit");
	        System.out.print("Choose an option: ");
	        option = sc.nextInt();
	        sc.nextLine();

	        switch (option) {
	            case 1: {
	                System.out.print("Name: ");
	                String name = sc.nextLine();

	                System.out.print("Registration: ");
	                String registration = sc.nextLine();

	                System.out.print("Cpf: ");
	                String cpf = sc.nextLine();

	                System.out.print("Age: ");
	                int age = sc.nextInt();
	                sc.nextLine();

	                filaAlunos.addEnd(new Aluno(name, registration, cpf, age));
	                System.out.println("Student added successfully!");
	                break;
	            }

	            case 2: {
	                Aluno removed = filaAlunos.removeStart();
	                System.out.println(removed != null ? "Removed: " + removed : "The queue is empty.");
	                break;
	            }

	            case 3: {
	                System.out.print("Student name: ");
	                String name = sc.nextLine();
	                Aluno student = filaAlunos.getStudent(name);
	                System.out.println(student != null ? student : "Student not found.");
	                break;
	            }

	            case 4: {
	                System.out.print("Student index: ");
	                int index = sc.nextInt();
	                sc.nextLine();
	                Aluno student = filaAlunos.getStudent(index);
	                System.out.println(student != null ? student : "Student not found.");
	                break;
	            }

	            case 5: {
	                System.out.println("Queue size: " + filaAlunos.getSize());
	                break;
	            }

	            case 6: {
	                System.out.println(filaAlunos.toString());
	                break;
	            }

	            case 0:
	                System.out.println("Exiting...");
	                break;

	            default:
	                System.out.println("Please choose a valid option.");
	        }

	    } while (option != 0);
	    
	    sc.close();
	}
}




	
	