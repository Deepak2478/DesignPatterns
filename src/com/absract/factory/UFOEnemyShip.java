package com.absract.factory;

public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	@Override
	void makeShip() {
		  System.out.println("Making enemy ship " + getName());
		  // The specific weapon & engine needed were passed in
		  // shipFactory. We are assigning those specific part
	      // objects to the UFOEnemyShip here
	      weapon = shipFactory.addESGun();
	      engine = shipFactory.addEngine();
	}
	 public UFOEnemyShip(EnemyShipFactory shipFactory){
		 this.shipFactory = shipFactory;
	 }

}
