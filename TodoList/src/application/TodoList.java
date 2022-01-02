package application;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

	private boolean isRunning = true;
	Scanner scanner = new Scanner(System.in);
	// 투두리스트 저장
	private ArrayList<Listed> listed = new ArrayList<>();
	

	/**
	 * 프로그램 실행
	 */
	public void run() {
		while (isRunning) {
			menu();
		}
		scanner.close();
	}
	
	/**
	 * 메뉴 표시
	 */
	private void menu() {
		System.out.println("✅ Todo List Menu");
		System.out.println("===========================");
		System.out.println("‖ 1. 진행 중인 투두리스트를 확인　‖");
		System.out.println("‖ 2. 투두리스트를 추가　　　　  ‖");
		System.out.println("‖ 3. 투두리스트를 삭제　　　 　 ‖");
		System.out.println("‖ 4. 투두리스트를 종료　　　 　 ‖");
		System.out.println("===========================\n");
		System.out.print("옵션 선택 > ");

		String select = scanner.nextLine(); 

		switch (select) { 
		case "1":
			displayList();
			break;
		case "2":
			insertList();
			break;
		case "3":
			deleteList();
			break;
		case "4":
			System.out.print("\n=========투두리스트를 종료합니다.=========");
			System.out.println("\n==============ByeBye================\n");
			isRunning = false;
			break;
		default:
			System.out.println("⛔1부터 4까지의 숫자를 선택하여 입력해주세요.\n");
		}

	}
	
	/**
	 * 저장된 투두리스트 항목을 표시
	 */
	private void displayList() {
		
		System.out.println();
		
		if(listed.size()>0) {
			System.out.println("[진행 중인 투두리스트입니다]");
			display();
		} else {
			System.out.println("⛔진행 중인 투두리스트가 없습니다.\nTodo를 추가하시겠습니까?(y/n)");
			System.out.print("> ");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.nextLine(); //y나 n을 입력받음
			
			if(choice.equals("y")) { // 문자열이 같은 지 비교하기위해서 equals()
				insertList(); 
				displayList();
			} else if(choice.equals("n")) {
				System.out.println();
			} else {
				System.out.println("⛔y나 n을 입력해주세요.");
				displayList();
			}
		}
		
		System.out.println();

	}

	/**
	 * 새로운 투두리스트 항목을 추가
	 */
	private void insertList() {
		System.out.println();
		System.out.println("[투두리스트를 추가합니다]");
		System.out.println("※메뉴로 돌아가려면 0을 입력하세요.\n");
		System.out.print("> ");
		Scanner scanner = new Scanner(System.in);
		String insert = scanner.nextLine();
		
		if(insert.equals("0")) {
			System.out.println();
			menu();
		} else {
			listed.add(new Listed(insert));
			System.out.println("👏 「" + insert + "」 Todo가 추가되었습니다.");
			displayList(); 
		}

	}
	
	/**
	 * 저장된 투두리스트 항목을 삭제
	 */
	private void deleteList() {
		System.out.println();
		System.out.println("[투두리스트를 삭제합니다]");
		
		try {
			if(listed.size()>0) {
				display();
				System.out.println();
				System.out.println("-> 삭제할 투두리스트의 번호를 입력하세요");
				System.out.println("※메뉴로 돌아가려면 0을 입력하세요.\n");
				System.out.print("> ");
				Scanner scanner = new Scanner(System.in);
				int del = scanner.nextInt(); // 입력받은 번호가 del에 담김
				
				if(del == 0) {
					System.out.println();
				} else {
					listed.remove(del-1);
					System.out.println("👏 "+del+"번 Todo를 삭제하였습니다.");
					displayList();
				}
				
			} else {
				System.out.println("⛔삭제할 Todo가 없습니다.\n");
			}
		} catch (Exception e) {
			System.out.println("⛔정확한 숫자를 입력해주세요.");
			deleteList();
		}
			
	}
	/**
	 * 투두리스트 출력
	 */
	private void display() {
		
		for(int i = 0; i < listed.size(); i++) {
			System.out.printf("%d. %s \n",i+1,listed.get(i));
		}
	}
}
