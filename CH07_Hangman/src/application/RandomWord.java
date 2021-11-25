package application;

import java.util.Random;

public class RandomWord {

	// 스페이스바로 띄어진 단어들을 문자열로 str에 저장
	private String str = "departure relation restaurant information satisfaction department collection passenger efficiency opportunity economics definition management preparation contribution significance painting consequence explanation proposal technology industry situation elevator criticism understanding measurement requirement entertainment football presentation conversation recognition professor location assistance replacement competition politics cigarette inspection attitude chocolate apartment organization atmosphere television supermarket classroom president";
	private String[] words = str.split(" "); // str의 문자열을 스페이스 바 단위로 나눠서 배열안으로 하나씩 넣음
	
	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 영문 철자의 배열. 문자배열. 선언.(철자를 맞추면 저장)
	private Random random = new Random();
	
	public RandomWord() {
		// 생성자에 랜덤 단어를 선택
		selectWord = words[random.nextInt(words.length)]; //1. 랜덤으로 선택 수정
		characters = new char[selectWord.length()]; // 선택단어의 길이만큼 문자배열 크기
	}
	
	public void getWords() { // 현재 words 배열에 있는 전체 단어를 출력
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public String toString() {
		// 단어를 _로 출력한다.
//		String text = "";
		StringBuilder sb = new StringBuilder();
		for(char c : characters) {
//			if(c=='\u0000') {// 문자의 초기값. 숫자의 0이나 문자열의 null 이랑 같은거임. 아직 맞추지 못한 문자
//				sb.append("_");
//			}
//			else {
//				sb.append(c); // 맞춘 문자일 경우
//			}
//			------아래처럼 표현 가능
			
			sb.append(c == '\u0000' ? '_' : c); // 못맞추면 _ 맞춘건 c
			sb.append(" "); //철자를 한칸씩 스페이스
		}
		
//		System.out.println(selectWord); //정답출력(테스트용)
		return sb.toString(); //선택된 랜덤 단어를 가져옴
	}

	public void addGuess(char c) {
		// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for(int i = 0; i < selectWord.length(); i++) { // 단어길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
		
	}

	public boolean isCompleted() {
		// 철자를 다 맞췄는지 체크해서 true와 false로 리턴
		
		for(char c : characters) {
			if(c=='\u0000') {
				return false; // 아직 맞춰야할 문자가 있음
			}
		}
		return true; // 다 맞췄음
	}
}
