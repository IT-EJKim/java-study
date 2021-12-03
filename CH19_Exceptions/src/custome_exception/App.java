package custome_exception;

import custome_exception_exceptions.TempTooHighException;
import custome_exception_exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(36);
		} catch (TempTooHighException e) {
			// 온도가 높을떄
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// 온도가 낮을때
			System.out.println(e.getMessage());
		}

	}

}
