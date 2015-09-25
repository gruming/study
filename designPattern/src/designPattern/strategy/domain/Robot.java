package designPattern.strategy.domain;

import designPattern.strategy.inter.AttackStrategy;
import designPattern.strategy.inter.MovingStrategy;

/**
 * Robot클래스, 이동과 공격을 실행하는 메서드가 있고, 이를 상속받아 구체적인 로봇을 만듦.
 *	
 * <문제점>
 * 1. 기존 로봇의 공격 또는 이동방법을 수정하려면 어떤 변경 작업을 해야 하는가?
 * 예를 들어 아톰이 날 수는 없고 오직 걷게만 만들고 싶다면? 또는 태권V를 날게 하려면?
 * 2. 새로운 로봇을 만들어 기존의 공격 또는 이동 방법을 추가하거나 수정하려면?
 * 예를 들어 새로운 로봇으로 지구의 용사 선가드를 만들어 태권V의 미사일 공격 기능을 추가하려면?
 * 
 * <스트래티지패턴>이란 전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴이다. <전략>이란 어떤 목적을 달성하기 위해 일을 수행하는 방식,
 * 비즈니스 규칙, 문제를 해결하는 알고리즘 등으로 이해할 수 있다.
 * 
 * - 프로그램에서 전략을 실행할 때는 쉽게 전략을 바꿔야 할 필요가 있는 경우가 많이 발생한다. 특히 게임 프로그래밍에서 게임 캐릭터가
 * 자신이 처한 상황에 따라 공격이나 행동하는 방식을 바꾸고 싶을 때 스트래티지 패턴은 매우 유용하다.
 * 
 * <팁>스트래티지 패턴은 같은 문제를 해결하는 여러 알고리즘이 클래스별로 캡슐화되어 있고 이들이 필요할 때 교체할 수 있도록 함으로써 동일한
 * 문제를 다른 알고리즘으로 해결할 수 있게 하는 디자인 패턴이다.
 * 
 * 
 * @author Administrator
 *
 */
public abstract class Robot {

	private String name; // 로봇 이름
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;

	/**
	 * 모든 로봇의 기본 생성자
	 */
	public Robot() {
	}

	/**
	 * 모든 로봇의 임의의 생성자
	 * 
	 * @param name
	 */
	public Robot(String name) {
		this.name = name;
	}

	/**
	 * 모든 로봇이름 getter
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 모든 이동기술
	 */
	public void move() {
		// movingStrategy.move();
		movingStrategy.moveI(name);
	}

	/**
	 * 모든 공격기술
	 */
	public void attack() {
		attackStrategy.attack();
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

}
