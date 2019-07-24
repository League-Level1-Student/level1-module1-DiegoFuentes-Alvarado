package _05_vault;

public class JamesBond {
	
	
public static void main(String[] args) {	
	JamesBond james = new JamesBond();
	Vault va = new Vault();
	
	int e = james.findCode(va);
	System.out.println(e);
	}
	int findCode (Vault v) {
		for(int c = 0; c < 1000000; c++) {
			if (v.tryCode(c)) {
				return c;
			}
		}
		return -1;
	}
	
}
