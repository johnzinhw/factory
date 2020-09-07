package br.edu.univas.main;

import br.edu.univas.example.Button;
import br.edu.univas.example.Dialog;
import br.edu.univas.example.LinuxButton;

public class Runner {
	
	public static void main(String[] args) throws Exception {
		String so = "linux";
		if(so.equals("linux")) {
			Button linuxButton = new LinuxButton();
			Dialog dialog = new Dialog();
			dialog.renderWindows(linuxButton);
		}else if(so.equals("mac")) {
			Button macButton = new LinuxButton();
			Dialog dialog = new Dialog();
			dialog.renderWindows(macButton);
		}else {
			throw new Exception("Parametro invalido");
		}
		
		
		
	}
	
	
}
