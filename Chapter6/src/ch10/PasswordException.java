package ch10;

public class PasswordException extends IllegalArgumentException{

	public PasswordException(String message) {
		super(message);
	}

	/*
	 * 패스워드에 대한 예외 처리 하기
		패스워드를 입력할 때 다음과 같은 경우 오류처리를 합니다.
		비밀번호는 null일 수 없습니다.
		비밀번호의 길이는 5이상입니다.
		비밀번호는 문자로만 이루어져서는 안됩니다.(하나이상의 숫자나 특수문자를 포함)
	 */
}
