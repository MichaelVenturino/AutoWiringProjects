package SpringBeanGroup.SpringAutoWiringBasic;

public class A {
	
//Instantiates B	
B b;
//A constructor is just a print statement
A(){System.out.println("a is created");}

//Getters and setters for B in this class
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}

//Print method for A class
void print(){System.out.println("hello a");} 

//Calls both prints methods from A and B
public void display(){  
    print();  
    b.print();  
}  
}
