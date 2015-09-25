package designPattern.strategy.inter.moveImpl;

import designPattern.strategy.inter.MovingStrategy;

/**
 * 각 이동 방법을 실제로 구현함.
 * 
 * @author Administrator
 *
 */
public class FlyingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("나는 날아 다닌다.");
	}

	@Override
	public void moveI(String name) {
		System.out.println(name + " 날아 다닌다.");
	}

}
