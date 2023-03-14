package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*thead processando em paralelo envio e-mail*/
		
		
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		
		
		
		
		/*div das threads*/
		
		
		/*thead processando em paralelo envio nota fiscal*/
		 Thread threadNFCE = new Thread (thread2);
		threadNFCE.start();
		
			
	
		
		/*codigo do sistema do usuario continua o fluxo de trabalho*/
		System.out.println("Fim do teste");
		
		/*Fluxo do sistema, cadastro, emissão*/
		JOptionPane.showInternalMessageDialog(null, "Sistema continua executando para o usuário");
		
		
	}
	
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*codigo da rotina*/
			/*Codigo para executar emmparalelo*/
			
			
			for(int pos=0; pos<10; pos++) {
				
			
				
				/*quero executar esse envio com tempo de parada, ou com tempo determinado*/
				
				
				System.out.println("Executando envio de nota fiscal (exemplo)");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			
			
			}
			/*fim do codigo paralelo*/
			
		}
	};
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			for(int pos=0; pos<10; pos++) {
				
				
				
				/*quero executar esse envio com tempo de parada, ou com tempo determinado*/
				
				
				System.out.println("Executando envio de e-mail (exemplo)");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			
			
			}
			/*fim do codigo paralelo*/
			
			
		}
	};
	
}
