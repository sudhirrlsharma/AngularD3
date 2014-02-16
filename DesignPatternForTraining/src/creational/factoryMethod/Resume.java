package creational.factoryMethod;

public class Resume extends Document {

	@Override
	public void createPages() {
		this.getPages().add(new SkillsPage());
		this.getPages().add(new EducationPage());
		this.getPages().add(new ExperiencePage());
	}

}
