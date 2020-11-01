import tableboard.*;
import bd.*;
import games.*;
public class Testfile{
	public static void main(String[] args) {
		System.out.println("HOLA MUNDO!");
		Board tablero = new Board(69);
		Api.connect("test");
		Mimica testing = new Mimica();
		testing.timedRound();
	}
}
