package br.edu.univas.example;

public class MACButton implements Button{

	@Override
	public void render() {
		System.out.println("Rendering Mac button...");
		System.out.println("Rendering successful...");
	}

	@Override
	public void onClick() {
		System.out.println("Onclick performing Mac button...");
		System.out.println("Onclick Mac successful...");
	}

}
