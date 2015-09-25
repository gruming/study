package designPattern.strategy.inter.attackImpl;

import designPattern.strategy.inter.AttackStrategy;


/**
 * 각 공격 방법을 실제로 구현함.
 * 
 * @author Administrator
 *
 */
public class MissileStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("나는 미사일 공격을 한다.");
	}

}
