package designPattern.strategy.inter.attackImpl;

import designPattern.strategy.inter.AttackStrategy;


/**
 * 각 공격 방법을 실제로 구현함.
 * 
 * @author Administrator
 *
 */
public class PunchStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("나는 강한 펀치 공격을 한다.");
	}

}
