package jp.co.diworks.action;

public class Person {
//コンストラクタ
	
	public String name = null;
	public int age = 0;

//演習②
	public Person() {}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
//演習④
	//コントラスタ③
	public Person(String name) {
		this.name = name;
		this.age = 0;
	}
	
	//コントラスタ④
	public Person(int age) {
		this.name = "名前なし";
		this.age = age;
	}
	
	//コントラスタ⑤
	public Person(int age,String name) {
		this.name = name;
		this.age = age;
	}
	
}
