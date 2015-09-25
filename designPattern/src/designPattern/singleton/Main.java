package designPattern.singleton;

public class Main {

	private static final int THREAD_NUM = 5;

	public static void main(String[] args) {

		UserThread[] user = new UserThread[THREAD_NUM]; // User 배열 선언
		
		
		for (int i = 0; i < THREAD_NUM; i++) {
			user[i] = new UserThread((i + 1) + "-thread"); // User 인스턴스 생성 = 초기화 = 객체 생성 = 주소 정해짐
			user[i].start();
		}
	}
}
