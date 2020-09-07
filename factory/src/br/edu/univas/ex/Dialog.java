package br.edu.univas.ex;

public abstract class Dialog {
	public void renderWindows () {
		System.out.println("Rendering windows");
		Button okButton = createButton();
		okButton.render();
		okButton.onClick();
		System.out.println("Sucessfull...");
	}
	
	public abstract Button createButton();

}
