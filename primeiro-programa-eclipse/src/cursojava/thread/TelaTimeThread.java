package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel ("Time Thread1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel ("Time Thread2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	};
	
	private Thread thread1Time;
	
	
	

	public TelaTimeThread() { /*Executa o que estiver dentro no momento da abertura ou execução*/
		
		
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluida*/
		
		
		GridBagConstraints gridbagConstraints = new GridBagConstraints(); /*Controlador posição de componentes*/
		gridbagConstraints.gridx=0;
		gridbagConstraints.gridy=0;
		gridbagConstraints.gridwidth=2;
		gridbagConstraints.insets = new Insets(5, 10, 5, 5);
		gridbagConstraints.anchor= GridBagConstraints.WEST;
		
		
		
		
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
	jPanel.add(descricaoHora, gridbagConstraints);
	
	mostraTempo.setPreferredSize(new Dimension(200,25));

	gridbagConstraints.gridy ++;
	mostraTempo.setEditable(false);
	jPanel.add(mostraTempo, gridbagConstraints);
	
	descricaoHora2.setPreferredSize(new Dimension (200, 25));
		gridbagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridbagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridbagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridbagConstraints);
		
	
		
		gridbagConstraints.gridwidth=1;
		
		jButton.setPreferredSize(new Dimension(92,25));
		gridbagConstraints.gridy ++;
		jPanel.add(jButton, gridbagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92,25));
		gridbagConstraints.gridx ++;
		jPanel.add(jButton2, gridbagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { /*executa o click no botão*/
				
				thread1Time = new Thread(thread);
				thread1Time.start();
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				
			}
		});
		
		
		
		
		
		
		
		
		
		add(jPanel, BorderLayout.WEST);
		/*sempre será o último comando*/
		setVisible(true); /*Torna a tela visível*/
		
		
	}
	
	
	
	
}
