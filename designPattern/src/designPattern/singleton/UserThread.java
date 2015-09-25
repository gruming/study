package designPattern.singleton;

import designPattern.singleton.domain.Printer;

public class UserThread extends Thread {

	/**
	 * User 클래스 임의의 생성자
	 * 
	 * @param name
	 */
	public UserThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// Printer printer = Printer.getPrinter();
		// printer.print(Thread.currentThread().getName() + " print using "
		// + printer.toString() + ".");
		// super.run();
		
		Printer.print(Thread.currentThread().getName() + " print using " + ".");
	}

}
