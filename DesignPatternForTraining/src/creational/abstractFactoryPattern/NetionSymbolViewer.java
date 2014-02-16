package creational.abstractFactoryPattern;

import creational.abstractFactoryPattern.inidian.IndianNationFactory;

public class NetionSymbolViewer {
	NationFactory nationFactory;
	public NetionSymbolViewer(NationFactory nationFactory) {
		this.nationFactory=nationFactory;
	}
	
	public String displayNationSymbol(){
		NetionSymbol animal = nationFactory.getAnimal();
		NetionSymbol bird = nationFactory.getBird();
		NetionSymbol flower = nationFactory.getFlower();
		NetionSymbol fruit =nationFactory.getFruit();
		return "National symbols [Animal:" + animal.showName() + ", bird:" + bird.showName() +  ", flower:" + flower.showName() + " fruit:" + fruit.showName() + " ]";
	}
}
