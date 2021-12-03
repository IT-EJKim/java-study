package custome_exception_exceptions;
// Exception을 상속받아서새 예외 클래스를 만들다
public class TempOutOfRangeException extends Exception {


	private static final long serialVersionUID = -1250305471176744178L;

	public TempOutOfRangeException(String message) {
		super(message); //입력된 메세지로 새 예외 객체 생성
	}
	

}
