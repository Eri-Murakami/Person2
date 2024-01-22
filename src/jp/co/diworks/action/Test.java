package jp.co.diworks.action;

public class Test {
	//コンストラクタ
	
	public static void main(String[]args) {
		Person taro = new Person();	
	//演習③
			taro.name="taro";
			taro.age=18;
			 System.out.println(taro.name);
			 System.out.println(taro.age);
			 
	    Person jiro = new Person("jiro",20);
			 System.out.println(jiro.name);
			 System.out.println(jiro.age);
			
			//演習⑤
		Person saburo = new Person("saburo",0);
			 System.out.println(saburo.name);
			 System.out.println(saburo.age);
		
	    Person  age = new Person("名前なし",25);
			 System.out.println(age.name);
			 System.out.println(age.age);
			 
		Person hanako = new Person("hanako",17);
			 System.out.println(hanako.name);
			 System.out.println(hanako.age);
	}
	

}
