package br.edu.univas.example;

public class Dialog {
	public void renderWindows(Button button) {
		System.out.println("Rendering windows...");
		Button okButton = button;
		okButton.render();
		okButton.onClick();
		System.out.println("Rendering windows successful...");
	}
}
