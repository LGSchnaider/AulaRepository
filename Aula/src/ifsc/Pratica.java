package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Pratica extends JFrame {

	private JPanel contentPane;
	private String textoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pratica frame = new Pratica();
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
	public Pratica() {
		 ArrayList<String> saveArea = new ArrayList();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Opções");
		lblNewLabel.setBounds(10, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		String[] vetorJogos = {"Zelda", "Mario"};
		

	
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(66, 11, 216, 22);
		
		comboBox.addItem("The legenda of zelda");
		comboBox.addItem("Super Machista Opressor");
		comboBox.addItem("Sonico");
		comboBox.addItem("Final Fantasia 11");
		comboBox.addItem("Bom de guerra");
		comboBox.addItem("O ultimo de noxx");
		comboBox.addItem("Resendevil 4");
		contentPane.add(comboBox);
		


		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 371, 211);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String save = (String) comboBox.getSelectedItem();
				if(textoTotal == null) {
					textoTotal = save;
				}else {
					textoTotal = textoTotal + "\n" + save;
				}
				
				textArea.setText(textoTotal);

			}
		});
		btnAdicionar.setBounds(292, 11, 89, 23);
		contentPane.add(btnAdicionar);
	}
}
