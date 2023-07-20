package entities;

public abstract class Lesson {
	
	protected String title;
	
	public Lesson() {
	}

	public Lesson(String title) {
		this.title = title;
	}
	
	public abstract int duration();
}
