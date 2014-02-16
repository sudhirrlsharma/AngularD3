package creational.abstractFactoryPattern.inidian;

import creational.abstractFactoryPattern.NationFactory;
import creational.abstractFactoryPattern.NetionSymbol;
import creational.abstractFactoryPattern.SymbolType;
import creational.abstractFactoryPattern.american.Buffalo;
import creational.abstractFactoryPattern.american.Eagle;
import creational.abstractFactoryPattern.american.Persea;
import creational.abstractFactoryPattern.american.Rose;

public class IndianNationFactory extends NationFactory{

	@Override
	public NetionSymbol getFlower() {
		return new Lotus();
	}

	@Override
	public NetionSymbol getFruit() {
		return new Mango();
	}

	@Override
	public NetionSymbol getAnimal() {
		return new Tiger();
	}

	@Override
	public NetionSymbol getBird() {
		return new Peacock();
	}

	@Override
	public NetionSymbol getNetionaSymbol(SymbolType type) {
		NetionSymbol netionSymbol = null;
		switch (type) {

		case BIRD:
			netionSymbol = new Peacock();
			break;

		case ANIMAL:
			netionSymbol = new Tiger();
			break;

		case FLOWER:
			netionSymbol = new Lotus();
			break;
		case FRUIT:
			netionSymbol = new Mango();
			break;
		default:
			// throw some exception
			break;
		}
		return netionSymbol;
	}


}
