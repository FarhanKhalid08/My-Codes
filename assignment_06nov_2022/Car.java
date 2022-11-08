package assignment_06nov_2022;

public class Car {
public static void main (String[] args) {
	System.out.println("My car Info");
	Car.Maker();
	Car.Model();
	Car.Type();
	Car.Gas();
	Car.Color();
	Car Exterior = new Car();
	Car Interior = new Car();
	Exterior.Engine();
	Exterior.Rim();
	Interior.Seats();
	Interior.Steering();
	Interior.Transmission();
}
public static void Maker() {
	System.out.println("Maker: Toyota");
}
public static void Model() {
	System.out.println("Model: Prius2");
}
public static void Type() {
	System.out.println("Type: Sedan");
}
public static void Gas() {
	System.out.println("Gas: Petrol");
}
public static void Color() {
	System.out.println("Color: White");
}
public void Rim() {
	System.out.println("Rim Size: 16");
}
public void Transmission() {
	System.out.println("Transmission: Automatic");
}
public void Seats() {
	System.out.println("Seats: Made of Cloth");
}
public void Steering() {
	System.out.println("Steering: Power Steering");
}
public void Engine() {
	System.out.println("Engine: 1.8 Liter");
}
}
