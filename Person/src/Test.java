class Test {
	public static void main(String[] args) {
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
	
		Person s = new Person(25);
		System.out.println(s.age);
		System.out.println(s.name);
		
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}