package designPattern.singleton;

/**
 * <프린터관리자만들기>
 * 
 * 갑돌이가 일하는 회사의 영업 부서도 회사 사정이 넉넉치 않아 10명의 직원들이 프린터 하나만 공유해서 사용해야 하는 실정이다.
 * 
 * <문제점>
 * 
 * 1. Printer 인스턴스가 아직 생성되지 않았을 때 스레드 1이 getPrinter 메서드의 if문을 실행해 이미 인스턴스가
 * 생성되었는지 확인한다. 현재 printer 변수는 null인 상태다.
 * 
 * 2. 만약 스레드 1이 생성자를 호출해 인스턴스를 만들기 전 스레드 2가 if문을 실행해 printer 변수가 null인지 확인한다. 현재
 * null 이므로 인스턴스를 생성하는 코드, 즉 생성자를 호출하는 코드를 실행하게 된다.
 * 
 * 3. 스레드 1도 스레드 2와 마찬가지로 인스턴스를 생성하는 코드를 실행하게 되면 결과적으로 Printer 클래스의 인스턴스가 2개
 * 생성된다.
 * 
 * <Keypoint>
 * 
 * 위 시나리오는 경합 조건(race condition)을 발생시킨다. 경합조건이란 메모리와 같은 동일한 자원을 2개 이상의 스레드가
 * 이용하려고 경합하는 현상을 말한다.
 * 
 * <해결책> : 다중 스레드 어플리케이션에서 발생하는 문제를 해결하는 방법 2가지
 * 
 * 1. 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
 * 
 * 2. 인스턴스를 만드는 메서드에 동기화하는 방법
 * 
 * <싱글턴> 패턴
 * 
 * 싱글턴 패턴은 인스턴스가 오직 하나만 생성되는 것을 보장하고 어디에서든 이 인스턴스에 접근할 수 있도록 하는 디자인 패턴이다.
 * 원래 싱글턴이라는 단어는 '단 하나의 원소만을 가진 집합' 이라는 수학 이론에서 유래되었다.
 * 
 * @author Administrator
 *
 */
public class Printer {

	// private static Printer printer = new Printer(); // 1. 정적변수에 인스턴스를 만들어 초기화
	// 함.
	private static Printer printer = null; // 2. 정적변수는 선언과 null로 초기화 한다.
	private int counter = 0;

	/**
	 * 기본 생성자
	 */
	private Printer() {
	}

	/**
	 * 1. 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
	 * 
	 * @return
	 */
	// public static Printer getPrinter() {
	// if (printer == null) { // Printer 인스턴스가 생성되었는지 검사
	// try {
	// Thread.sleep(1);
	// } catch (InterruptedException e) {
	// printer = new Printer(); // Printer 인스턴스 생성
	// }
	// }
	// return printer;
	// }

	/**
	 * 2. 인스턴스를 만드는 <메서드>에 <동기화>하는 방법
	 * 
	 * @return
	 */
	public synchronized static Printer getPrinter() {
		if (printer == null)
			printer = new Printer();
		return printer;
	}

	public void print(String str) {
		// counter++; // 카운터 값 증가
		// System.out.println(str + counter);
		synchronized (this) { // 오직 하나의 스레드만 접근을 허용함.
			counter++; // 카운터 값 증가
			System.out.println(str + counter);
		}

	}

}
