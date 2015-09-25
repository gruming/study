package designPattern.strategy.domain;

/**
 * Robot 클래스를 상속받아 실제 로봇을 구현함.
 * 
 * @author Administrator
 *
 */
public class Atom extends Robot {

	/**
	 * 아톰 기본 생성자
	 */
	public Atom() {
		super();
	}

	/**
	 * 아톰 임의의 생성자
	 * 
	 * @param name
	 */
	public Atom(String name) {
		super(name);
	}

	// @Override
	// public void attack() {
	// System.out.println("나는 강한 펀치 공격을 한다.");
	// }
	//
	// @Override
	// public void move() {
	// //System.out.println("나는 날 수 있다.");
	// System.out.println("나는 날 수 없고 걸어다닌다.");
	// }

}
