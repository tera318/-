package zikosyoukai;


class Person{
	 // インスタンスフィールドを定義
	
	public static int count = 0;
	
	public String name;

	public int age;

	public double height;
	
	public double weight;


	 // コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;

	 }
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	 public void print(){
		  System.out.println("\n名前は" + this.name + "です");
		  System.out.println("年は" + this.age + "です");
		  System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
		 }
	 
	 public void printCount(){
		  System.out.println("\n合計" + Person.count + "人です");
		 }
	}
