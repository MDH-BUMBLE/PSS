import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.jar.Attributes;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



import java.awt.Color;
import java.awt.Component;

import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LangGrammarClass extends JFrame {

	private JPanel contentPane;
	private static JScrollPane scrollPane;
	private static DefaultMutableTreeNode category = null;
	private static DefaultMutableTreeNode book = null;

	 public static List<String> row= new ArrayList<String>();
	private static int sr_counter=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LangGrammarClass frame = new LangGrammarClass();
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
	public LangGrammarClass() {
		setTitle("BUMBLE Mapping Editor");
		setForeground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 559);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	        
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(169, 80, 175, 162);
		contentPane.add(scrollPane_2);
		
		JTextPane textPane = new JTextPane();
		scrollPane_2.setViewportView(textPane); 
		
		 scrollPane = new JScrollPane();
		 scrollPane.setBounds(10, 55, 152, 221);
		 contentPane.add(scrollPane);
		
		 List<Country> countl;
	     countl = new ArrayList<Country>();
		
		DefaultMutableTreeNode top =
		        new DefaultMutableTreeNode("Selection");
		 DefaultMutableTreeNode lang = new DefaultMutableTreeNode("Concepts");
		 DefaultMutableTreeNode operator = new DefaultMutableTreeNode("Operators");
	     DefaultMutableTreeNode fn = new DefaultMutableTreeNode("Symbols");
	     DefaultMutableTreeNode and = new DefaultMutableTreeNode("AND");
	     DefaultMutableTreeNode or = new DefaultMutableTreeNode("OR");
	     DefaultMutableTreeNode none = new DefaultMutableTreeNode("None");
		 top.add(lang);
		 top.add(operator);
		 top.add(fn);
		 operator.add(and);
		 operator.add(or);
		 operator.add(none);
		 
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("graphical-tree.xml");  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList flowList = doc.getElementsByTagName("Concept");
		    for (int i = 0; i < flowList.getLength(); i++) {
		        NodeList childList = flowList.item(i).getChildNodes();
		        for (int j = 0; j < childList.getLength(); j++) {
		        	
		            Node childNode = childList.item(j);
		            if ("name".equals(childNode.getNodeName())) {
		                System.out.println("ParentClass "+childList.item(j).getTextContent()
		                        .trim());
		                category = new DefaultMutableTreeNode(childList.item(j).getTextContent()
		                        .trim());
		        	    lang.add(category);
		            }
		            if ("SubConcept".equals(childNode.getNodeName())) {		            	 
		            	NodeList childListb = childList.item(j).getChildNodes();
				        for (int k = 0; k < childListb.getLength(); k++) {
				        	
				            Node childNodeb = childListb.item(k);
				            if ("name".equals(childNodeb.getNodeName())) {
				                System.out.println("child "+childListb.item(k).getTextContent()
				                        .trim());
				                book = new DefaultMutableTreeNode(childListb.item(k).getTextContent()
				                        .trim());
				        	    category.add(book);
				            }
		            }
		        }
		    }
		    }
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("forSymbol.xmi");  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList flowList = doc.getElementsByTagName("symbol");
			String id = null, path=null, name=null;
		    for (int i = 0; i < flowList.getLength(); i++) {
		        NodeList childList = flowList.item(i).getChildNodes();
		        for (int j = 0; j < childList.getLength(); j++) {
		        	
		            Node childNode = childList.item(j);
		            if ("id".equals(childNode.getNodeName())) {
		                id=childList.item(j).getTextContent()
		                        .trim();		            		        	   
		            }
		            if ("name".equals(childNode.getNodeName())) {
		                name=childList.item(j).getTextContent()
		                        .trim();		            		        	   
		            }
		            if ("path".equals(childNode.getNodeName())) {
		            	path=childList.item(j).getTextContent()
		                        .trim();

		        	    countl.add( new Country(id,name, path));
		        	 
		            }
	           
		    }
		    }
		   
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			 for (Country country : countl) {
		            DefaultMutableTreeNode node = new DefaultMutableTreeNode(country);
		            fn.add(node);
		        }
			
			JTree tree_1 = new JTree(top);
			
			   
			// DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree_1 .getCellRenderer();
		        Icon closedIcon = new ImageIcon("oi.png");
		        Icon openIcon = new ImageIcon("li.png");
		        Icon leafIcon = new ImageIcon("mi.png");
		
		     //   renderer.setClosedIcon(closedIcon);
		     //  renderer.setOpenIcon(openIcon);
		     //   renderer.setLeafIcon(leafIcon);
		       
		      // tree_1.setCellRenderer(new CountryTreeCellRenderer());
		       tree_1.setCellRenderer(new DefaultTreeCellRenderer() {
	                @Override
	                public Component getTreeCellRendererComponent
	                    (JTree tree, Object value, boolean selected,
	                     boolean expanded, boolean leaf, int row, boolean focus)
	                {
	                    JComponent c = (JComponent)
	                        super.getTreeCellRendererComponent
	                        (tree, value, selected, expanded, leaf, row, focus);
	                   
	                   
	                    
	                    Object o = ((DefaultMutableTreeNode) value).getUserObject();
	                    
	                    if (o instanceof Country) {        	 
	                        Country country = (Country) o;
	                        URL imageUrl =CountryTreeCellRenderer.class.getClassLoader().getResource(country.getFlagIcon());            
	                        if (imageUrl != null) {      	
	        				 setIcon(new ImageIcon(imageUrl));
	                        }
	                        setText(country.getid()+" "+country.getName().toString());
	                      
	                        
	                     
	                        
	                    } else {
	                    	Icon closedIcon = new ImageIcon("oi.png");
	        		        Icon openIcon = new ImageIcon("li.png");
	        		        Icon leafIcon = new ImageIcon("mi.png");
	        		        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
	        		        if (tree.getModel().getRoot().equals(nodo)) {
	        		           setIcon(openIcon);
	        		        } else if (nodo.getChildCount() > 0) {
	        		        	setIcon(closedIcon);
	        		        } else {
	        		        	setIcon(leafIcon);
	        		        }
	        		        
	                       
	                            c.setBackground(null);
	                            c.setOpaque(false);
	                      
	                    }
	                    return c;
	                }
	            });
		scrollPane.setViewportView(tree_1 );
		
		JSeparator separator = new JSeparator();
		separator.setForeground(UIManager.getColor("CheckBox.foreground"));
		separator.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		separator.setBounds(0, 287, 717, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		separator_1.setBackground(UIManager.getColor("Button.shadow"));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(361, 0, 11, 286);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Graphical Mapping");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(98, 7, 185, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblGrammar = new JLabel("Textual Mapping");
		lblGrammar.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblGrammar.setBounds(471, 7, 168, 37);
		contentPane.add(lblGrammar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(377, 55, 152, 221);
		contentPane.add(scrollPane_1);
		
		DefaultMutableTreeNode top1 =
		        new DefaultMutableTreeNode("Selection");
		 DefaultMutableTreeNode fnc = new DefaultMutableTreeNode("Concepts");
	     DefaultMutableTreeNode syn = new DefaultMutableTreeNode("Syntaxes");
	  
		 top1.add(fnc);
		 top1.add(operator);
		 top1.add(syn);
		 operator.add(and);
		 operator.add(or);
		 operator.add(none);
		 
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("textual-tree.xml");  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList flowList = doc.getElementsByTagName("Concept");
		    for (int i = 0; i < flowList.getLength(); i++) {
		        NodeList childList = flowList.item(i).getChildNodes();
		        for (int j = 0; j < childList.getLength(); j++) {
		        	
		            Node childNode = childList.item(j);
		            if ("name".equals(childNode.getNodeName())) {
		                System.out.println("ParentClass "+childList.item(j).getTextContent()
		                        .trim());
		                category = new DefaultMutableTreeNode(childList.item(j).getTextContent()
		                        .trim());
		        	    fnc.add(category);
		            }
		            if ("SubConcept".equals(childNode.getNodeName())) {		            	 
		            	NodeList childListb = childList.item(j).getChildNodes();
				        for (int k = 0; k < childListb.getLength(); k++) {
				        	
				            Node childNodeb = childListb.item(k);
				            if ("name".equals(childNodeb.getNodeName())) {
				                System.out.println("child "+childListb.item(k).getTextContent()
				                        .trim());
				                book = new DefaultMutableTreeNode(childListb.item(k).getTextContent()
				                        .trim());
				        	    category.add(book);
				            }
		            }
		        }
		    }
		    }
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("textual-syntax.xml");  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList flowList = doc.getElementsByTagName("TokenList");
		    for (int i = 0; i < flowList.getLength(); i++) {
		        NodeList childList = flowList.item(i).getChildNodes();
		        for (int j = 0; j < childList.getLength(); j++) {
		        	
		            Node childNode = childList.item(j);
		            if ("Token".equals(childNode.getNodeName())) {
		                System.out.println("ParentClass "+childList.item(j).getTextContent()
		                        .trim());
		                category = new DefaultMutableTreeNode(childList.item(j).getTextContent()
		                        .trim());
		        	   syn.add(category);
		            }
		        //    if ("FunctionsSubClass".equals(childNode.getNodeName())) {		            	 
		        //    	NodeList childListb = childList.item(j).getChildNodes();
				// (int k = 0; k < childListb.getLength(); k++) {
				        	
				//            Node childNodeb = childListb.item(k);
				 //           if ("name".equals(childNodeb.getNodeName())) {
				 //.out.println("child "+childListb.item(k).getTextContent()
				  //                      .trim());
				  //              book = new DefaultMutableTreeNode(childListb.item(k).getTextContent()
				  //                      .trim());
				  //.add(book);
				 //           }
		          //  }
		       // }
		    }
		    }
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
		
		JTree tree_2 = new JTree(top1);

		 DefaultTreeCellRenderer renderer1 = (DefaultTreeCellRenderer) tree_2 .getCellRenderer();
	     
	        renderer1.setClosedIcon(closedIcon);
	        renderer1.setOpenIcon(openIcon);
	        renderer1.setLeafIcon(leafIcon);
		scrollPane_1.setViewportView(tree_2);
		
		JLabel lblNewLabel_2 = new JLabel("View");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(173, 55, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				 DefaultMutableTreeNode node = (DefaultMutableTreeNode)
	                		tree_1.getLastSelectedPathComponent();
				 
				 String jTreeVarSelectedPath = "";
				    Object[] paths = tree_1.getSelectionPath().getPath();
				    for (int i=0; i<paths.length; i++) {
				        jTreeVarSelectedPath += paths[i];
				        if (i+1 <paths.length ) {
				            jTreeVarSelectedPath += File.separator;
				        }
				    }
				 
	                if (node == null) return;
	                if(jTreeVarSelectedPath .contains("Concepts")) {
	                	Object nodeInfo = node.getUserObject();
	                	if(!nodeInfo.toString().equals("Concepts")) {
	                		
			                textPane.setText(textPane.getText()+"Concepts: \""+nodeInfo.toString()+"\"\n");
	                	}
	                	
	                }
	                if(jTreeVarSelectedPath .contains("Operators")) {
	                	Object nodeInfo = node.getUserObject();
	                	if(!nodeInfo.toString().equals("Operators")) {
	                		
	                		 textPane.setText(textPane.getText()+"Operators: \""+nodeInfo.toString()+"\"\n");
	                	}
		               
	                }
	                if(jTreeVarSelectedPath .contains("Symbols")) {
	                	Object nodeInfo = node.getUserObject();
	                	Country symbol = (Country) nodeInfo;
	              
	                	 textPane.setText(textPane.getText()+"Symbols: \""+symbol.id+". "+symbol.name+"\"\n");
	                }	                
			}
		});
		btnNewButton.setBounds(179, 253, 68, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				textPane.setText("");
			}
		});
		btnReset.setBounds(259, 253, 68, 23);
		contentPane.add(btnReset);
		
		
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(539, 80, 168, 162);
		contentPane.add(scrollPane_2_1);
		
						
		JTextPane textPane_1 = new JTextPane();
		scrollPane_2_1.setViewportView(textPane_1);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                		tree_2.getLastSelectedPathComponent();
			 
			 String jTreeVarSelectedPath = "";
			    Object[] paths = tree_2.getSelectionPath().getPath();
			    for (int i=0; i<paths.length; i++) {
			        jTreeVarSelectedPath += paths[i];
			        if (i+1 <paths.length ) {
			            jTreeVarSelectedPath += File.separator;
			        }
			    }
			 
			    if (node == null) return;
                if(jTreeVarSelectedPath .contains("Concepts")) {
                	Object nodeInfo = node.getUserObject();
                	if(!nodeInfo.toString().equals("Concepts")) {
                		
                		textPane_1.setText(textPane_1.getText()+"Concepts: \""+nodeInfo.toString()+"\"\n");
                	}
                	
                }
                if(jTreeVarSelectedPath .contains("Operators")) {
                	Object nodeInfo = node.getUserObject();
                	if(!nodeInfo.toString().equals("Operators")) {
                		
                		textPane_1.setText(textPane_1.getText()+"Operators: \""+nodeInfo.toString()+"\"\n");
                	}
	               
                }
                if(jTreeVarSelectedPath .contains("Syntaxes")) {
                	Object nodeInfo = node.getUserObject();
                	if(!nodeInfo.toString().equals("Syntaxes")) {
                		
                		textPane_1.setText(textPane_1.getText()+"Syntaxes: \""+nodeInfo.toString()+"\"\n");
                	}
	               
                }                     
		}
			
		});
		btnNewButton_1.setBounds(549, 253, 68, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnReset_1 = new JButton("Reset");
		btnReset_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				textPane_1.setText("");
			}
		});
		btnReset_1.setBounds(625, 253, 68, 23);
		contentPane.add(btnReset_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("View");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(542, 55, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 348, 697, 122);
		contentPane.add(scrollPane_3);
		
		String[] colNames = {
			       "Sr#", "Graphical Mapping", "Textual Mapping",
			};

	     int[] columnsWidth = { 45, 330, 330};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);  
		JTable table = new JTable(model);
	    int i = 0;
        for (int width : columnsWidth) {
            TableColumn column = table.getColumnModel().getColumn(i++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }
	
		scrollPane_3.setViewportView(table);
		Icon aboutIcon = new ImageIcon("mi.png");
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				sr_counter++;
				String language= textPane.getText();
				language= language.replace("\n"," , ");
				  if (language != null && language.length() > 0 && language.charAt(language.length() - 2) == ',') {
					  language = language.substring(0, language.length() - 2);
				    }
				  String grammar= textPane_1.getText();
				  grammar= grammar.replace("\n"," , ");
					  if (grammar != null && grammar.length() > 0 && grammar.charAt(grammar.length() - 2) == ',') {
						  grammar = grammar.substring(0, grammar.length() - 2);
					    }
					 
				 table.getColumnModel().getColumn(1).setCellRenderer(new WordWrapCellRenderer());
					
			     table.getColumnModel().getColumn(2).setCellRenderer(new WordWrapCellRenderer());
					
				 model.addRow(new Object[]{Integer.toString(sr_counter),language , grammar});
			}
			
		});
		btnNewButton_2.setBounds(361, 308, 77, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset All");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				model.setRowCount(0);
			}
			
		});
		btnNewButton_3.setBounds(445, 308, 84, 29);
		contentPane.add(btnNewButton_3);
		
		
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_4.setBounds(630, 478, 77, 31);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Save");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				
				fileChooser.setDialogTitle("Specify a file to save");   
				String path ="";
				int userSelection = fileChooser.showSaveDialog(contentPane);
				 
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				   
				    fileChooser.setAcceptAllFileFilterUsed(false);
				    path = fileToSave.getAbsolutePath();
				    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
				    
				}
				
				writeXmlFile(table, path);
			}
			
		});
		btnNewButton_5.setBounds(543, 478, 77, 31);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Update");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				int i = table.getSelectedRow();
				   sr_counter++;
					String language= textPane.getText();
					language= language.replace("\n"," , ");
					  if (language != null && language.length() > 0 && language.charAt(language.length() - 2) == ',') {
						  language = language.substring(0, language.length() - 2);
					    }
					  String grammar= textPane_1.getText();
					  grammar= grammar.replace("\n"," , ");
						  if (grammar != null && grammar.length() > 0 && grammar.charAt(grammar.length() - 2) == ',') {
							  grammar = grammar.substring(0, grammar.length() - 2);
						    }
						 
					 table.getColumnModel().getColumn(1).setCellRenderer(new WordWrapCellRenderer());
						
				     table.getColumnModel().getColumn(2).setCellRenderer(new WordWrapCellRenderer());
						
				     
			            model.setValueAt(language, i, 1);
			            model.setValueAt(grammar, i, 2);
			}
		});
		btnNewButton_6.setBounds(625, 308, 77, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("Delete");
		btnNewButton_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
			//	 DefaultTableModel model = (DefaultTableModel) table.getModel();
				int[] rows = table.getSelectedRows();
				   for(int i=0;i<rows.length;i++){
				     model.removeRow(rows[i]-i);
				   }
			}
		});
		btnNewButton_6_1.setBounds(539, 308, 77, 29);
		contentPane.add(btnNewButton_6_1);
		
		
		
		
		
	}
	public static void writeXmlFile(JTable table,String path) {

	    try {

	        DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
	        DocumentBuilder build = dFact.newDocumentBuilder();
	        Document doc = build.newDocument();

	        Element root = doc.createElement("Analysis");
	        doc.appendChild(root);

	        Element Details = doc.createElement("Rows");
	       
	        for (int r = 0; r < table.getRowCount(); r++)
			{
	        	 root.appendChild(Details);
				for (int i = 0; i < table.getColumnCount(); i++) {
				   row.add((String) table.getValueAt(r, i));
				   
				}
				 for (String res : row)
		  	      { 
		    	   System.out.print(res); 
		    	   Element name = doc.createElement("Token");
		            name.appendChild(doc.createTextNode(String.valueOf(res
		                    )));
		            Details.appendChild(name);
		  	      }  
				 System.out.println(""); 
				 row.clear();
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
	
	class CountryTreeCellRenderer implements TreeCellRenderer {
        private JLabel label;
        private DefaultTreeCellRenderer defaultRenderer = new DefaultTreeCellRenderer();
        private Color backgroundNonSelectionColor;
        
        private  Color backgroundSelectionColor;
		private boolean selected;
		private boolean hasFocus;
       
        CountryTreeCellRenderer() {
            label = new JLabel();
            backgroundNonSelectionColor = defaultRenderer.getBackgroundNonSelectionColor();
            backgroundSelectionColor = defaultRenderer.getBackgroundSelectionColor();
            
        }

        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
                                                      boolean leaf, int row, boolean hasFocus) {
        	
            Object o = ((DefaultMutableTreeNode) value).getUserObject();
           
            if (o instanceof Country) {        	 
                Country country = (Country) o;
                URL imageUrl =CountryTreeCellRenderer.class.getClassLoader().getResource(country.getFlagIcon());            
                if (imageUrl != null) {      	
				 label.setIcon(new ImageIcon(imageUrl));
                }
                label.setText(country.getid()+" "+country.getName());
                this.selected = selected;
                
                if(this.selected) {label.setBackground( backgroundNonSelectionColor);label.setOpaque(true);}
                
            } else {
            	Icon closedIcon = new ImageIcon("oi.png");
		        Icon openIcon = new ImageIcon("li.png");
		        Icon leafIcon = new ImageIcon("mi.png");
		        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
		        if (tree.getModel().getRoot().equals(nodo)) {
		            label.setIcon(openIcon);
		        } else if (nodo.getChildCount() > 0) {
		        	label.setIcon(closedIcon);
		        } else {
		        	label.setIcon(leafIcon);
		        }
		        
                this.selected = selected;
                
                if(this.selected) {label.setBackground( backgroundNonSelectionColor);label.setOpaque(true);}
                label.setText("" + value);
            }
            return label;
        }
    }

    class Country {
        private String name;
        private String id;
        private String flagIcon;

        Country(String id, String name, String path) {
        	this.id=id;
            this.name = name;
            this.flagIcon = path;
        }

        public String getName() {
            return name;
        }

        public void setName(String id) {
            this.name = name;
        }
        public String getid() {
            return id;
        }

        public void setid(String id) {
            this.id = id;
        }

        public String getFlagIcon() {
            return flagIcon;
        }

        public void setFlagIcon(String flagIcon) {
            this.flagIcon = flagIcon;
        }
    }
}
