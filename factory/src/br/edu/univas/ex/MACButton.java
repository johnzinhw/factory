package br.edu.univas.ex;

public class MACButton implements Button{

	@Override
	public void render() {
		System.out.println("Rendering mac");
		System.out.println("Rendering mac successfull");
		
	}

	@Override
	public void onClick() {
		System.out.println("Click mac button");
		System.out.println("Click mac successfull");
		
	}

}
