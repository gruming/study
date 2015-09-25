package designPattern.strategy.domain;

/**
 * Robot 클래스를 상속받아 실제 로봇을 구현함.
 * 
 * @author Administrator
 *
 */
public class TaekwonV extends Robot {

	/**
	 * 태권브이의 기본 생성자
	 */
	public TaekwonV() {
		super();
	}

	/**
	 * 태권브이의 임의의 생성자
	 * 
	 * @param name
	 */
	public TaekwonV(String name) {
		super(name);
	}

	// @Override
	// public void attack() {
	// System.out.println("나는 미사일 공격을 한다.");
	// }
	//
	// @Override
	// public void move() {
	// //System.out.println("나는 오직 걸어다닌다.");
	// System.out.println("나는 날 수 있다.");
	// }

}
