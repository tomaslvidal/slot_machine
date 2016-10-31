import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class slot_machine extends JFrame {

	private JPanel contentPane;
	private JTextField monto;
	private JTextField ran1;
	private JTextField ran2;
	private JTextField ran3;
	private JTextField resultado;
	private JTextField apuesta;
	private JButton btnTirar;
	private JButton btnMonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					slot_machine frame = new slot_machine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public slot_machine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		monto = new JTextField();
		monto.setBounds(10, 11, 86, 20);
		contentPane.add(monto);
		monto.setColumns(10);
		
		
		btnMonto = new JButton("Monto");
		btnMonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String montos=monto.getText();
				int Montos= Integer.valueOf(montos);
				btnMonto.setVisible(false);
				btnMonto.setEnabled(false);
				monto.setEditable(false);
				apuesta.setVisible(true);
				btnTirar.setVisible(true);
				
			
				
				
				
			}
		});
		btnMonto.setBounds(124, 10, 89, 23);
		contentPane.add(btnMonto);
		
		ran1 = new JTextField();
		ran1.setBounds(124, 85, 86, 20);
		contentPane.add(ran1);
		ran1.setColumns(10);
		ran1.setEditable(false);
		
		ran2 = new JTextField();
		ran2.setBounds(124, 130, 86, 20);
		contentPane.add(ran2);
		ran2.setColumns(10);
		ran2.setEditable(false);
		
		
		ran3 = new JTextField();
		ran3.setBounds(124, 172, 86, 20);
		contentPane.add(ran3);
		ran3.setColumns(10);
		ran3.setEditable(false);
		
		
		resultado = new JTextField();
		resultado.setBounds(307, 130, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		resultado.setEditable(false);
		
		apuesta = new JTextField();
		apuesta.setBounds(10, 85, 86, 20);
		contentPane.add(apuesta);
		apuesta.setColumns(10);
		apuesta.setVisible(false);
		
		
		btnTirar = new JButton("Tirar");
		btnTirar.setVisible(false);
		btnTirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tirar=monto.getText();
				int Tirar= Integer.valueOf(tirar);
				String Apuesta=apuesta.getText();
				int Aapuesta= Integer.valueOf(Apuesta);
				if(Aapuesta<=Tirar){
				int random1= (int)((Math.random()*3)+1);
				String random1_string= String.valueOf(random1); ;
				int random2= (int)((Math.random()*3)+1);
				String random2_string= String.valueOf(random2); ;
				int random3= (int)((Math.random()*3)+1);
				String random3_string= String.valueOf(random3); ;
				ran1.setText(random1_string);
				ran2.setText(random2_string);
				ran3.setText(random3_string);
					if(Tirar!=0){
								
								if(random1==random2&& random1==random3){
									resultado.setText("Ganaste");
									int apuesta2=Aapuesta*random1;
									Tirar=Tirar+apuesta2;
									String Tirar_string= String.valueOf(Tirar);
									monto.setText(Tirar_string);
									btnTirar.setVisible(true);
			
									
									
								}else{
									resultado.setText("Perdiste!");
									Tirar=Tirar-Aapuesta;
									String Tirar_string= String.valueOf(Tirar);
									monto.setText(Tirar_string);
									btnTirar.setVisible(true);
									
								
								}
						}
				}
				// despues agregar else 
				
				
			}
		});
		btnTirar.setBounds(10, 129, 89, 23);
		contentPane.add(btnTirar);
	}

}
