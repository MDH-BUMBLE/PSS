import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FileDialog;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javafx.stage.FileChooser;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class SCheckerDesign extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JTextArea textArea_1;
	JTextArea textArea;
	 public static List<String> inputlist = new ArrayList<String>();
	 public static List<String> reserved_words_list = new ArrayList<String>();
	 public static List<String> not_reserved = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		reserved_words_list.add("CON");
		reserved_words_list.add("for");
		reserved_words_list.add("int");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCheckerDesign frame = new SCheckerDesign();
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
	public SCheckerDesign() {
		setTitle("BUMBLE Language Analyzer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 334);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 479, 295);
		contentPane.add(panel);
		panel.setLayout(null);
		
	
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(115, 23, 246, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(191, 82, 170, 193);
		panel.add(scrollPane);
		
		textArea_1 = new JTextArea();
		textArea_1.setBackground(SystemColor.inactiveCaptionBorder);
		textArea_1.setLineWrap(true);
		textArea_1.setBorder(BorderFactory.createCompoundBorder(
		  textArea_1.getBorder(), 
		  BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		scrollPane.setViewportView(textArea_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(11, 82, 170, 193);
		panel.add(scrollPane_1);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBackground(SystemColor.inactiveCaptionBorder);
		textArea.setBorder(BorderFactory.createCompoundBorder(
		   textArea.getBorder(), 
		   BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		scrollPane_1.setViewportView(textArea);
		      
		JLabel lblNewLabel = new JLabel("Input Grammar Samples:");
		lblNewLabel.setBounds(11, 65, 139, 14);
		panel.add(lblNewLabel);
		
		JLabel lblSelectedTockens = new JLabel("Generated Tokens:");
		lblSelectedTockens.setBounds(191, 65, 115, 14);
		panel.add(lblSelectedTockens);
		
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
				    "TXT files", "txt");
				chooser.setFileFilter(filter);
				chooser.setCurrentDirectory(new java.io.File("D:\\"));
				int returnVal = chooser.showOpenDialog(panel);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					textField.setText( chooser.getSelectedFile()+"");						
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(10, 23, 95, 28);
		panel.add(btnNewButton);
		
		JButton btnParse = new JButton("Parse");
		btnParse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!textField.getText().equals(""))
						{
					 try {
						   
				            File f = new File(textField.getText());
				            Scanner sc = new Scanner(f);

				            while(sc.hasNextLine()){
				                String line = sc.nextLine();

				                String[] data = line.split("[ \\t\\n\\r]+");
				      	      for (String s : data){
				                inputlist.add(s);
				                }
				            }
				            } catch (FileNotFoundException b) {         
				            	b.printStackTrace();
				            	}
					  inputlist.removeAll(Arrays.asList("", null)); 
				       
				        System.out.println("Input List");  
				  	       for (String in : inputlist)
					  	      { 		
				  	    	 textArea.setText(textArea.getText() +in +"\n");
					  	           System.out.println(in); 
					  	      } 
				        
				        Set<String> set = new HashSet<>(inputlist);
				        inputlist.clear();
				        inputlist.addAll(set);
			          not_reserved.addAll(inputlist);
			          not_reserved.removeAll(reserved_words_list);
			        
			         
			         System.out.println("Non repeating and non reserved words");  
				       for (String res : not_reserved)
				  	      { 		      
				    	   textArea_1.setText(textArea_1.getText() +res +"\n");    
				    	   System.out.println(res); 
				  	      }  
					
						}
				else {
					textField.setText("Browse a file first");
				}
				}
			
		});
		btnParse.setForeground(Color.WHITE);
		btnParse.setBackground(new Color(65, 105, 225));
		btnParse.setBounds(371, 23, 95, 28);
		panel.add(btnParse);
		
		
		JButton btnSaveXml = new JButton("Save XML");
		btnSaveXml.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file name to save");   
				String path ="";
				int userSelection = fileChooser.showSaveDialog(contentPane);
				 
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				    //
				    // disable the "All files" option.
				    //
				    fileChooser.setAcceptAllFileFilterUsed(false);
				   
				    path = fileToSave.getAbsolutePath();
				    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
				    
				}
				if (!path.equals(""))
				 writeXmlFile(not_reserved, path);
				
			}
			
		});
		btnSaveXml.setForeground(Color.WHITE);
		btnSaveXml.setBackground(new Color(65, 105, 225));
		btnSaveXml.setBounds(371, 247, 95, 28);
		panel.add(btnSaveXml);
		
		
	}
	
	public static void writeXmlFile(List<String> list, String path) {

	    try {

	        DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
	        DocumentBuilder build = dFact.newDocumentBuilder();
	        Document doc = build.newDocument();

	        Element root = doc.createElement("File");
	        doc.appendChild(root);

	        Element Details = doc.createElement("TokenList");
	        root.appendChild(Details);


	        for (String dtl : list) {

	            Element name = doc.createElement("Token");
	            name.appendChild(doc.createTextNode(String.valueOf(dtl
	                    )));
	            Details.appendChild(name);


	        }

	        // Save the document to the disk file
	        TransformerFactory tranFactory = TransformerFactory.newInstance();
	        Transformer aTransformer = tranFactory.newTransformer();

	        // format the XML nicely
	        aTransformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");

	        aTransformer.setOutputProperty(
	                "{http://xml.apache.org/xslt}indent-amount", "4");
	        aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");

	        DOMSource source = new DOMSource(doc);
	        try {
	            // location and name of XML file you can change as per need
	            FileWriter fos = new FileWriter(path+".xml");
	            StreamResult result = new StreamResult(fos);
	            aTransformer.transform(source, result);

	        } catch (IOException e) {

	            e.printStackTrace();
	        }

	    } catch (TransformerException ex) {
	        System.out.println("Error outputting document");

	    } catch (ParserConfigurationException ex) {
	        System.out.println("Error building document");
	    }
	}
}
