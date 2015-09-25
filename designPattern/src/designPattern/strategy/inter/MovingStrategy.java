package designPattern.strategy.inter;

/**
 * 각 로봇이 취할 수 있는 이동 방법에 대한 인터페이스
 * 
 * @author Administrator
 *
 */
public interface MovingStrategy {
	public void move();
	public void moveI(String name);
}
