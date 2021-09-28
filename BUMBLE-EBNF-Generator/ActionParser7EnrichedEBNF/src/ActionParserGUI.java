import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ActionParserGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextPane textPane ;
	static EG1 parser = null;
	static List<String> equi_textual= new ArrayList<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionParserGUI frame = new ActionParserGUI();
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
	public ActionParserGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(97, 11, 324, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Syntaxes:");
		lblNewLabel.setBounds(10, 16, 84, 20);
		contentPane.add(lblNewLabel);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 62, 414, 188);
		contentPane.add(scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String sentence = textField.getText();
                // Put parens around sentence so that parser knows scope
               
                InputStream is = new ByteArrayInputStream(sentence.getBytes());
                if(parser == null) parser = new EG1(is);
                else EG1.ReInit(is);
                try
                {
                  switch (EG1.start())
                  {
                    case 0 :
                    	textPane.setText("expression parsed ok.");
                    break;
                    default :
                    break;
                  }
                }
                catch (Exception e1)
                {
                	textPane.setText("error in expression.\n"+
                		  				e1.getMessage());
                }
                catch (Error e2)
                {
                	textPane.setText("error in expression.\n"+
    		  						   e2.getMessage());
                }
                finally
                {
                  
                }
                if (textPane.getText().equals("expression parsed ok.")) {
                    
                    equi_textual=  EG1.getEqui();
               	 textPane.setText("Expression Paresed ok. \nEquivalent is: \n");
                    for(String  gi : equi_textual) {
                   	 textPane.setText(textPane.getText()+gi+" ");
                    }
                }
			}
		});
		btnNewButton.setBounds(431, 11, 80, 25);
		contentPane.add(btnNewButton);
	}
}
