package hfjava.code.ch02;

public class Player {

	int number;

	public void guess() {
		number = (int) (Math.random() * 10);
	}
}
