package test; // test용 패키지

import java.util.Random;

import application.RandomWord;

public class Test { 
	public static void main(String[] args) {
//		RandomWord r = new RandomWord();
//		r.getWords();
//		System.out.println(r.toString());
		
//		랜덤으로 단어를 가져오는 방법?
		Random random = new Random();
		
		String[] words = { "아이유", "고양이", "강아지", "늑대", "여우"};
		
		for(int i =0; i<100; i++) {
			int randomIndex = random.nextInt(words.length); // 단어의 길이만큼 0~(배열갯수-1) 만큼 랜덤으로 출력
			System.out.println(words[randomIndex]); 
			
		}
	}
}
