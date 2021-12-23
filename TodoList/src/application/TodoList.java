package application;

import java.util.Scanner;

//뭐가 있어야하나
//1. 투두리스트 표시
//2. 투두리스트 입력 -> 투두리스트 표시
//3. 투두리스트 완료 -> 투두리스트에서 삭제 -> 완료된 투두리스트로 이동
//4. 투두리스트 삭제 -> 투두리스트에서 삭제

public class TodoList {

	private boolean isRunning = true;
	Scanner scanner = new Scanner(System.in);
	// 저장된 투두리스트
	Listed listed = new Listed();

	public void run() {
		while (isRunning) {
			menu();
		}
		scanner.close();
//		
//		DeleteList();
//		DoneList();
//		
	}

	private void menu() {
		// 리스트를 표시
		System.out.println("✔ Todo List");
		System.out.println("===================");
		System.out.println("1. 진행 중인 투두리스트를 확인");
		System.out.println("2. 투두리스트를 추가");
		System.out.println("3. 투두리스트를 삭제");
		System.out.println();
		System.out.print("옵션을 선택 > ");

		int select = scanner.nextInt();

		switch (select) {
		case 1:
			displayList();
			break;
		case 2:
			insertList();
			break;
		case 3:
			System.out.println("[투두리스트를 삭제합니다]");
			break;
		default:
			System.out.println("1~3까지의 옵션 번호를 입력해주세요");
			break;
		}

	}

	private void displayList() {
		// 저장된 투드리스트 항목을 표시
		System.out.println();
		System.out.println("[진행 중인 투두리스트입니다]");
		System.out.println(listed.toString());
		System.out.println();

	}

	// 새로운 투두리스트 항목을 추가
	private void insertList() {
		System.out.println();
		System.out.println("[투두리스트를 추가합니다]");

		String insert = scanner.nextLine();
		// 입력한 항목을 저장 -> 아직 구현 안했음
		listed.add(new Listed(insert));

	}

}
