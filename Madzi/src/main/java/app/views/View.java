package app.views;

public interface View {

	void print();

	View handle(String position);
}
