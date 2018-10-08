package com.absract.factory;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		// TODO Auto-generated method stub
		return new ESUFOGun();
	}

	@Override
	public ESEngine addEngine() {
		// TODO Auto-generated method stub
		return new ESUFOEngine();
	}

}
