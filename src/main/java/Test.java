import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binder bnd =(a,b)->a>b?a:b;
		Supplier<String> s=()->"Hello";
		Consumer<String> c=(str)->System.out.println(str);
		c.accept("Janu");
		System.out.println(s.get());
		Predicate<Integer> p=(n)->n>0?true:false;
		System.out.println(p.test(-9));
		
		display((a,b)->a+b);
	
		System.out.println("Testing Jenkin");
		System.out.println("Modified");
	}

	
	public static void display(Binder b) {
		
		System.out.println(b.max(10, 20));
		
	}
}
