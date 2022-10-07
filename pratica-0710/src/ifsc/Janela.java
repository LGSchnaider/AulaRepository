package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 223, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtN1 = new JTextField();
		txtN1.setBounds(104, 42, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);

		txtN2 = new JTextField();
		txtN2.setBounds(104, 73, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);

		txtN3 = new JTextField();
		txtN3.setBounds(104, 104, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(104, 11, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nota 01");
		lblNewLabel.setBounds(33, 45, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 02");
		lblNewLabel_1.setBounds(33, 76, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota 03");
		lblNewLabel_2.setBounds(33, 107, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setBounds(33, 14, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String nota1 = txtN1.getText();
				String nota2 = txtN2.getText();
				String nota3 = txtN3.getText();
				if (!nome.isEmpty() && !nota1.isEmpty() && !nota2.isEmpty() && !nota3.isEmpty()) {

					double n1 = Double.valueOf(nota1);
					double n2 = Double.valueOf(nota2);
					double n3 = Double.valueOf(nota3);
					double media = (n1 + n2 + n3) / 3;
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Média: " + Math.round(media));
				}
			}
		});
		btnCalcular.setBounds(101, 146, 89, 23);
		contentPane.add(btnCalcular);
	}
}
