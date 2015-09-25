package designPattern.singleton.domain;

/**
 * <다른예제> : 정적 클래스를 이용한다.
 * 
 * 실제로 굳이 싱글턴 패턴을 사용하지 않고 정적 메서드로만 이루어진 정적 클래스를 사용해도 동일한 효과를 얻을 수 있다. Printer
 * 클래스를 싱글턴 패턴으로 구현하지 않고 정적클래스로 구현한 예다.
 * 
 * 정적 클래스를 이용하는 방법이 싱글턴 패턴을 이용하는 방법과 가장 차이가 나는 점은 객체를 전혀 생성하지 않고 메서드를 사용한다는 점이다.
 * 아무 문제 없이 counter 변수가 스레드 5개 덕분에 안전하게 공유되어 사용될 수 있음을 알 수 있다. 더욱이 정적 메서드를 사용하므로
 * 일반적으로 실행할 때 바인딩되는 (컴파일 타임에 바인딩되는) 인스턴스 메서드를 사용하는 것보다 성능 면에서 우수하다고 할 수 있다.
 * 
 * <문제점>
 * 
 * 정적 클래스를 사용할 수 없는 경우가 있다. 가장 대표적인 경우가 인터페이스를 구현해야 하는 경우다.
 * 정적 메서드는 인터페이스에서 사용할 수 없다.
 * 
 * @author Administrator
 *
 */
public class Printer {

	private static int counter = 0;

	public synchronized static void print(String str) {
		counter++; // 카운터 증가
		System.out.println(str + counter);
	}

}
