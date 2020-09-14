package tableboard;
import java.util.Random;
import misc.Consts;
// -> This class contains or imports all the gamas that can be created
// -> For simplicity empty Constructor should do the job of generating a game
public class Places{

// -> Atributos
private String nameToShow;
private int points;
private int contesters; // A limited number, -1 to indicate ALL players
private int rounds;
private int punish;

//-> Constructor
	public Places(){
		// -> Random game to be created:
		System.out.printf("Hola soy un número aleatorio %d \n", new Random().nextInt(Consts.numberOfGames));
		//-Should be loaded from a DB on execution
		this.nameToShow = "Nunca Nunca";
		this.points = 2;
		this.contesters = -1;
		this.rounds = 2;
		this.punish = 1; //Numbers of "sips"
	}
	//Getters:
	public String getName(){
		return this.nameToShow;
	}
}
