package creational.abstractFactoryPattern;

public abstract class NationFactory {
	public abstract NetionSymbol getFlower();
	public abstract NetionSymbol getFruit();
	public abstract NetionSymbol getAnimal();
	public abstract NetionSymbol getBird(); 
	public abstract NetionSymbol getNetionaSymbol(SymbolType type);
	
}
