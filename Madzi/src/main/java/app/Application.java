package app;

import app.views.StartView;
import app.views.View;

import java.util.Scanner;

public class Application {

	private static final View START_VIEW = new StartView();

	public static void main(String[] args) {
		START_VIEW.print();

		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {
			System.out.println(s.nextLine());
		}
	}
}
