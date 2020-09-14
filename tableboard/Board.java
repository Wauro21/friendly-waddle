package tableboard;
import java.util.ArrayList;

public class Board{
	// atributos
	private int spaceCounter; //Size of the board
	private ArrayList<Places> box;
	private Places test; // [TEMPORAL]

	// - Constructores

	// - Constructor de pruebas [TEMPORAL]
	public Board(int size){
		System.out.println("This is my size " + size);
		box = new ArrayList<Places>();
		box.add(new Places());
		for(Places iterador: box){
			System.out.println(iterador.getName());
		}
		spaceCounter = 0;
	}


	// - Metodos

}
