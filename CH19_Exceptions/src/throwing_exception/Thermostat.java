package throwing_exception;

public class Thermostat {
	public void setTemperature(double temperature) throws Exception {
		// 예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리
		if (temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다."); // 새 예외를 생성
		}
		
		System.out.println("온도 세팅 : " + temperature);
	}
}
