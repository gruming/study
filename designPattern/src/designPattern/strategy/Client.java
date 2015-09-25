package designPattern.strategy;

import designPattern.strategy.domain.Atom;
import designPattern.strategy.domain.Dongli;
import designPattern.strategy.domain.Robot;
import designPattern.strategy.domain.Sungard;
import designPattern.strategy.domain.TaekwonV;
import designPattern.strategy.inter.attackImpl.MissileStrategy;
import designPattern.strategy.inter.attackImpl.PunchStrategy;
import designPattern.strategy.inter.moveImpl.FlyingStrategy;
import designPattern.strategy.inter.moveImpl.WalkingStrategy;

public class Client {

	public static void main(String[] args) {

		System.out.println("=========== 구분선 ===========");
		
		Robot taekwonV = new TaekwonV("태권V");
		// 이동 전략을 걸어다닌다 로 전략 설정을 하였음.
		taekwonV.setMovingStrategy(new WalkingStrategy());
		// 공격 전략을 미사일 로 전략 설정을 하였음.
		taekwonV.setAttackStrategy(new MissileStrategy());
		
		System.out.println("내 이름은 " + taekwonV.getName() + " 이다.");
		taekwonV.move();
		taekwonV.attack();

		System.out.println("=========== 구분선 ===========");

		Robot atom = new Atom("아톰");
		// 이동 전략을 날아다닌다 로 전략 설정을 하였음.
		atom.setMovingStrategy(new FlyingStrategy());
		// 공격 전략을 강한 펀치 로 전략 설정을 하였음.
		atom.setAttackStrategy(new PunchStrategy());
		
		System.out.println("내 이름은 " + atom.getName() + " 이다.");
		atom.move();
		atom.attack();

		System.out.println("=========== 구분선 ===========");

		// 썬가드 로봇을 추가함.
		Robot sungard = new Sungard("썬가드");
		// 이동 전략을 설정
		sungard.setMovingStrategy(new FlyingStrategy());
		// 공격 전략을 설정
		sungard.setAttackStrategy(new MissileStrategy());
		
		System.out.println("내 이름은 " + sungard.getName() + " 이다.");
		sungard.move();
		sungard.attack();

		System.out.println("=========== 구분선 ===========");
		
		//동일 로봇을 추가함.
		Robot dongil = new Dongli("동일");
		//이동 전략을 설정
		dongil.setMovingStrategy(new FlyingStrategy());
		//공격 전략을 설정
		dongil.setAttackStrategy(new PunchStrategy());
		
		System.out.println("내 이름은 " + dongil.getName() + " 이다.");
		dongil.move();
		dongil.attack();
		
		
	}

}
