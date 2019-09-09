package thomas;

public class Tester {
	public static void main(String[] args) {
		new Tester().Run();
		}
	public void Run() {
		int x = 8;
		this.doSomething(x);
		System.out.println(x);
		}
	private void doSomething(int x) {
		x = x + 1;
		
	}

}
