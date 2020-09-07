package br.edu.univas.example;

public class LinuxButton implements Button{

	@Override
	public void render() {
		System.out.println("Rendering Linux button...");
		System.out.println("Rendering Linux successful...");
	}

	@Override
	public void onClick() {
		System.out.println("Onclick performing Linux button...");
		System.out.println("Onclick Linux successful...");
	}

}
