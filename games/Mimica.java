package games;
//Api
import bd.Api;
public class Mimica extends Gamebase{

	//Constructor: Default
	public Mimica(){
		super();
		this.name = this.name + "MIMICA";
	}
	//METODOS
	@Override
	public void timedRoutine(){
		Api.connect();
	}

}
