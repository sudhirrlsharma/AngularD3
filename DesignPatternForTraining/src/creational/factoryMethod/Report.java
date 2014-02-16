package creational.factoryMethod;

public class Report extends Document {

	@Override
	public void createPages() {
		this.getPages().add(new IntroductionPage());
		this.getPages().add(new ResultsPage());
		this.getPages().add(new ConclusionPage());
		this.getPages().add(new SummaryPage());
		this.getPages().add(new BibliographyPage());
	}

}
