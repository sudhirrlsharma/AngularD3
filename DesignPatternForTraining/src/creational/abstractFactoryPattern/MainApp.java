package creational.abstractFactoryPattern;

import creational.abstractFactoryPattern.inidian.IndianNationFactory;

public class MainApp {
	
	public static void main(String[] args) {
		NationFactory nationFactory =  new IndianNationFactory();
		NetionSymbolViewer viewer = new NetionSymbolViewer( new IndianNationFactory());
		System.out.println(viewer.displayNationSymbol());
		System.out.println("National " + SymbolType.ANIMAL + " is "+  nationFactory.getNetionaSymbol(SymbolType.ANIMAL).showName());
		
		
	}
}
