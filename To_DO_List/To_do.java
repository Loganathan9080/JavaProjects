package To_DO_List;

import java.util.ArrayList;
import java.util.Scanner;

public class To_do {

	public static void main(String[] args) {
		
		ArrayList<String> tasks = new ArrayList<String>();
		ArrayList<Boolean> taskStatus = new ArrayList<Boolean>();
		Scanner sc = new Scanner(System.in);
             
		System.out.println("Welcome to To-Do-List");
		while (true) {
			Menu();
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				System.out.println("Enter your task: ");
				String taskName = sc.nextLine();
				tasks.add(taskName);
				taskStatus.add(false);
				System.out.println("Task \"" + taskName + "\"Added Succefully. \n");
				break;
			case 2:
				System.out.println("Your To-Do-List: ");
				if (tasks.isEmpty()) {
					System.out.println("Non tasks found.\n");

				} else {
					for (int i = 0; i < tasks.size(); i++) {
						String task = tasks.get(i);
						String status = taskStatus.get(i) ? "[x]" : "[]";
						System.out.println((i + 1) + "." + status + " " + task);
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Enter the task numer to mark as completed: ");
				int taskNumber = sc.nextInt();
				if (taskNumber >= 1 && taskNumber <= tasks.size()) {
					taskStatus.set(taskNumber - 1, true);
					System.out.println("Task \"" + tasks.get(taskNumber - 1) + "\" marked as completed.");
				} else {
					System.out.println("Invalid task number.");
				}
				break;
			case 4:
				System.out.println("Thank you for using To-Do-List. GoodBye!");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

	private static void Menu() {
		System.out.println();
		System.out.println("Options: ");
		System.out.println("1.Add new Task ");
		System.out.println("2.View Task");
		System.out.println("3.Mark the Task as completes");
		System.out.println("4.Exit");
		System.out.println();
		System.out.println("Enter your choice: ");

	}

}
