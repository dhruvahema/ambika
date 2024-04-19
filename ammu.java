abstract class ammu{
	void music() {
		System.out.println("play music");
		
	}
	abstract void drive();
}
class BMW extends car{
	void drive() {
		System.out.println("car is movig");
	}
}
public class filereader{
	public static void main(String[] args) {
		BMW b = new BMW();
		b.drive();
		b.music();
	}
}