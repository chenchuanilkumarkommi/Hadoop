package hadoop.com;

public class Main {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.insert("value");
		a.insert(8);
		a.insert(9.0);
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		a.remove(2);
		a.insert(10);
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
