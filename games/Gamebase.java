package games;
//TIMER NEEDES
import java.util.Timer;
import java.util.TimerTask;

//Api
import bd.Api;

import misc.Consts;

public abstract class Gamebase{
	public String name;
	public float roundPoints;
	public float pensalizationValue;
	public int rounds;
	public float acumulatedPoints;

	//Constructor: Default
	public Gamebase(){
		this.name = "GAME-DEBUG: ";
		this.roundPoints = 1.0f;
		this.pensalizationValue = 1.0f;
		this.rounds = 2;
		this.acumulatedPoints = 0.0f;
	}
	public Gamebase(String name, float roundPoints, float pensalizationValue, int rounds){
		this.name = name;
		this.roundPoints = roundPoints;
		this.pensalizationValue = pensalizationValue;
		this.rounds = rounds;
	}

	//METODOS
	// - TimeRound: Performs a timed routine,waits for user input
	public float timedRound(){
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			@Override
			public void run(){
				timedRoutine();
				timer.cancel();
			}
		};

		timer.schedule(task, 1000, Consts.timerTic);
		return 0.0f;
	}

	// - timedRoutine: the rutine to be called, @overriden
	public void timedRoutine(){
		System.out.println("DEBUG"+ this.name);
	}
}
