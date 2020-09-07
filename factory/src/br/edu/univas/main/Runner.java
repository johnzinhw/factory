package br.edu.univas.main;

import static br.edu.univas.ex.SO.Linux;
import static br.edu.univas.ex.SO.Mac;

import br.edu.univas.dialog.LinuxDialog;
import br.edu.univas.dialog.MACDialog;
import br.edu.univas.ex.Dialog;
import br.edu.univas.ex.SO;

public class Runner {
	static Dialog dialog;
	public static void main (String[] args) {
		initialize (Mac);
		dialog.renderWindows();
		
		initialize (Linux);
		dialog.renderWindows();
		
	}
	
	public static void initialize (SO so) {
		switch (so) {
		case Linux:
			dialog = new LinuxDialog();
			break;
		case Mac:
			dialog = new MACDialog();
			break;
		default:
			throw new ExceptionInInitializerError();
		}
	}
	
	

}
