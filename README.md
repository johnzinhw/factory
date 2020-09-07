# FactoryMethod
### Propósito
Factory method na parte de criação de objetos, onde temos o produto e o criador de produtos, geralmente criador é uma classe abstrata que força suas subclasses (classes filhas) a criarem os objetos (no caso os produtos). Com esse padrão, você não utilizará das criações diretas de objetos com NEW, isso será feito pelo metodo factory.

## Exemplo
Você possui uma empresa de Transportes, ambas as classes Caminhão e Barco devem implementar a interface Transporte, que declara um método chamado delivery. Cada classe implementa esse método a sua maneira: caminhões entregam carga por terra, e barcos entregam carga por mar. O método factory na classe LogísticaViária retorna objetos de caminhão, enquanto o método fábrica na classe LogísticaMarítima retorna navios.

O código que usa o método factory (cliente) não vê diferença entre os produtos reais retornados por várias subclasses. O cliente trata todos os produtos como um Transporte. O cliente sabe que todos os objetos de transporte devem ter o método entregar, mas como exatamente ele funciona não é importante para o cliente.

[Exemplo de diagrama de class exemplificando como ficaria estrutura do Factory Method](https://refactoring.guru/images/patterns/diagrams/factory-method/structure.png)

### Exemplo Prático
Interface do produto
```java
public interface Button {
	void render();
	void onClick();
}
```
Implementações do produto
```java
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
```
Classe que consome o produto com factory method juntamente suas subclasses

```java
public abstract  class Dialog {
	public void renderWindows() {
		System.out.println("Rendering windows...");
		Button okButton = createButton();
		okButton.render();
		okButton.onClick();
		System.out.println("Rendering windows successful...");
	}
	
	public abstract Button createButton();
}


public class LinuxDialog extends Dialog{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}
}

public class MACDialog extends Dialog{

	@Override
	public Button createButton() {
		return new MACButton();
	}

}

```
E por último, metodo main que simula o lado do cliente
```java
public class Runner {
	static Dialog dialog;
	public static void main(String[] args) {
		System.out.println("Create linux dialog");
		initialize(LINUX);
		dialog.renderWindows();
		
		System.out.println("Create mac dialog");
		initialize(MAC);
		dialog.renderWindows();
	}
	
	public static void initialize(SO so) {
		switch (so) {
		case LINUX:
			dialog = new LinuxDialog();
			break;
		case MAC:
			dialog = new MACDialog();
			break;
		default:
			throw new ExceptionInInitializerError();
		}
	}
}

```
### Vantagens
- Evitar de mexer no código do lado do "cliente" que usar dessas operações
- Fácil manutenção, pois para adicionar por exemplo mais um produto especifico, bastante implementar a classe genérica do produto e criar um criador para ele, sem mexer no resto do código.
- Evita acoplamento entre produto e criador

[Para mais informações](https://refactoring.guru/pt-br/design-patterns/factory-method)
