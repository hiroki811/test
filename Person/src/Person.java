
public class Person {

		public String name = null;
        public int age = 0;
        public String phoneNumber = null;
        public String addres = null;
        
        public Person(){
        	
        }
        
        public Person(String name, int age){
        	this.name=name;
        	this.age= age;
        }
        public Person(String name){//3
        	this.name= name;
        	this.age= 0;
        }
        public Person(int age){//4
        	this.name = "���O�Ȃ�";
        	this.age=age;
        }
        public Person(int age,String name){//5
        	this.name=name;
        	this.age=age;
        }
       
        public void talk(){
        	System.out.println(this.name + "���b��");
        } 	
        public void walk(){
        System.out.println(this.name + "������");
        	
        }
        public void run(){
        	System.out.println(this.name + "����");
        }
       
}