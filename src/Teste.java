public class Teste {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Programa p1 = new Programa();
		p1.setId(1);

		Thread t1 = new Thread(p1);
		//t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();

		Programa p2 = new Programa();
		p2.setId(2);

		// Cria uma segunda Thread, determina a prioridade como máxima e incia-a
		Thread t2 = new Thread(p2);
		//t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();

		//t2.sleep(30000);

		//t2.stop();
		// Minha teoria de porque não é uma boa prática utulizar o método
		// stop(): pois atrapalha a execução estrutural da thread e não pode ser
		// "achado" pelo Java (algo assim)
	}
}
