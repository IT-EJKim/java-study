package writing_lineByline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\JAVA\\java-study\\CH20_ReadingWirting\\test.txt";
		
		// 위의 파일 주소로 파일 객체 생성.
		// 메소드 exists()는 파일이 있으면 true, 없으면 false 리턴
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		// 파일 쓰기
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) { // () 안에 넣어주면 자동으로 버퍼 클로즈됨
			br.write("오렌지");
			br.newLine();
			br.write("애플");
			br.newLine();
			br.write("바나나");
			br.newLine();
			br.write("배");
			br.newLine();
			
		} catch (IOException e) {
			// 파일을 쓸 수 없음
			System.out.println("파일을 쓸 수 없음 : " + fileLocation);
		}

	}
	
}
