import java.util.Collection;
import java.util.HashSet;


public class BancoDeDados {
	public static void main(String[] args) {
		Collection<String> sqls = new HashSet<String>();
		
		ProduzSQL p1 = new ProduzSQL(0, 10000, sqls);
		Thread t1 = new Thread(p1);
		
		ProduzSQL p2 = new ProduzSQL(10000, 20000, sqls);
		Thread t2 = new Thread(p2);
		
		ProduzSQL p3 = new ProduzSQL(20000, 30000, sqls);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();
		
		// Faz com que nós (nós = thread que roda o main)
		// aguardemos o fim dessas 	três threads

	}

}
