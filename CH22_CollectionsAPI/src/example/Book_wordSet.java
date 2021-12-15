package example;

import java.io.BufferedReader;
import java.io.File;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 리스트에 넣기
		// 이때 리스트는 단어가 중복 되지않는다.
//		File dracula = new File("dracula.txt");
		File moby = new File("MobyDick.txt");
//		System.out.println(dracula.exists()); // 파일이 있는 지 확인
		System.out.println(moby.exists()); // 파일이 있는 지 확인
		
//		TreeSet<String> draList = LoadWords(dracula);
//		TreeSet<String> mobyList = LoadWords(moby);
		
//		System.out.println(draList.size());
//		System.out.println(mobyList.size()); // 단어의 갯수
		
//		displayWords(draList);
	}
	/**
	 * list 입력받아 그 안에 단어들을 출력한다.
	 * @param draList
	 */

	private static void displayWords(TreeSet<String> draList) {
		int count = 0 ;
		
	}

	/**
	 * 입력된 파일을 읽어서 단어를 저장해서마지막에 트리셋 리스트로 리턴
	 * @param file
	 * @return wordSet
	 */
//	private static TreeSet<String> LoadWords(File dracula) {
//		TreeSet<String> wordSet = new TreeSet<>();
//		// 파일 읽기
//		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//			//파일 읽기
//			String line = null;
//			//한 줄 읽기
//			while ((line = reader.readLine()) != null) { //파일끝에 더이상 문자가 없으면 null
//				
//			}
//		}
//		return null;
	}


