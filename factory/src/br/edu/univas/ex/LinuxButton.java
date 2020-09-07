package br.edu.univas.ex;

public class LinuxButton implements Button {

	@Override
	public void render() {
		System.out.println("Rendering linux");
		System.out.println("Rendering linux successfull");
		
	}

	@Override
	public void onClick() {
		System.out.println("Click linux button");
		System.out.println("Click linux successfull");
		
	}

}
