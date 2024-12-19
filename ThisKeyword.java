package selenium;

public class ThisKeyword {
int a =9;

} 
class B extends ThisKeyword{
	int a =13;
	void show() {
		System.out.println(a);
	}
	
}  
class Test{
	public static void main(String[] args) {
		B rb= new B();
        rb.show();
	}
	
}


