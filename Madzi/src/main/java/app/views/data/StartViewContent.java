package app.views.data;

import java.util.Arrays;
import java.util.List;

public class StartViewContent implements ViewContent {

	private final String title = "Wybierz istniejący profil lub wybierz nowy";

	private final List<String> choices = Arrays.asList("[1] Lista profili",
	                                                   "[2] Stwórz nowy profil");

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public List<String> getChoices() {
		return choices;
	}
}
