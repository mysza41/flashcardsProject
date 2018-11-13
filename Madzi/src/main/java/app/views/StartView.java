package app.views;

import app.views.data.StartViewContent;
import app.views.data.ViewContent;

public class StartView implements View {

	private final ViewContent content;

	public StartView() {
		content = new StartViewContent();
	}

	@Override
	public void print() {
		System.out.println(content.getTitle());
		System.out.println();

		for (String choice: content.getChoices()) {
			System.out.println("\t" + choice);
		}
	}

	@Override
	public View handle(String position) {
		return null;
	}
}
