package raion;

public class Raion {

	public static void main(String[] args) {
		
		doubutu r1 = new doubutu("トラ",2.5,50);
		
		r1.setAnimal("ライオン");
		r1.setBody(2.1);
		r1.setSpeed(80);
		
		System.out.println("動物名：" + r1.getAnimal());
		System.out.println("体長：" + r1.getBody() + "m");
		System.out.println("速度：" + r1.getSpeed() + "km/h");
		

	}

}


class doubutu {

	private String animal;
	private double body;
	private int speed;
	
	doubutu(String animal,double body,int speed){
		this.animal = animal;
		this.body = body;
		this.speed = speed;
	}
	
	public String getAnimal() {
		return animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public double getBody() {
		return body;
	}
	
	public void setBody(double body) {
		this.body = body;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
