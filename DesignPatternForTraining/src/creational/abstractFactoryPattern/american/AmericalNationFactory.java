package creational.abstractFactoryPattern.american;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import creational.abstractFactoryPattern.NationFactory;
import creational.abstractFactoryPattern.NetionSymbol;
import creational.abstractFactoryPattern.SymbolType;

public class AmericalNationFactory extends NationFactory {

	@Override
	public NetionSymbol getFlower() {
		return new Rose();
	}

	@Override
	public NetionSymbol getFruit() {
		return new Persea();
	}

	@Override
	public NetionSymbol getAnimal() {
		return new Buffalo();
	}

	@Override
	public NetionSymbol getBird() {
		return new Eagle();
	}

	@Override
	public NetionSymbol getNetionaSymbol(SymbolType type) {
		NetionSymbol netionSymbol = null;
		switch (type) {

		case BIRD:
			netionSymbol = new Eagle();
			break;

		case ANIMAL:
			netionSymbol = new Buffalo();
			break;

		case FLOWER:
			netionSymbol = new Rose();
			break;
		case FRUIT:
			netionSymbol = new Persea();
			break;
		default:
			// throw some exception
			break;
		}
		return netionSymbol;
	}

}
