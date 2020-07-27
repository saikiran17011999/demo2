package Singleton;

public class SingletonDemo {
	static Singleton s1 = null, s2 = null;

	public static void main(String s[]) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			s1 = Singleton.getInstance();
		});
		Thread t2 = new Thread(() -> {
			s2 = Singleton.getInstance();
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		if (s1 == s2) {
			System.out.println("Same/Single Object");
		} else {
			System.out.println("Not Singleton Object");
		}
	}
}







