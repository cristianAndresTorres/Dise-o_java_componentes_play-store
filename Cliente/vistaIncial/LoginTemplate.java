package vistaIncial;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

import disegno.ObjDecoradorServicio;
import disegno.ObjGraficoServicio;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.Image;


public class LoginTemplate extends JFrame{
	//Atributos
	private JPanel jpVentana;
	private JPanel jpCentral;
	private JLabel txtTitulo1App;
	private JLabel txtTitulo2App;
    private JLabel txtTitulo3App;
    private JLabel txtTitulo4App;
    private JLabel txtTitulo5App;
    private JLabel txtTitulo6App;
    private JLabel txtTituloLogin;
	private JLabel txtTituloEnunciado;
	private JTextField jtfCorreo;
	private JPasswordField jpfContrasegna;
	private JLabel txtRecorUsu;
	private JLabel txtRecPass;
	private JLabel txtContrasegna;
	private JButton jbtnCrearCuenta;
	private JButton jbtnSiguiente;
	private JButton jbtncerrar;
    private JComboBox jcbIdioma;
        
    //Declaración objetos decoradores
    
    private ImageIcon inicesion,icerrar,auxd,aux;
    private JLabel logoL;
    private ObjDecoradorServicio objDecorador;
    
    //Declaración servicios 
    private ObjGraficoServicio objGrafico;
	
    private LoginComponent loginComponent;
    
	//Constructor
	public LoginTemplate(LoginComponent loginComponent) {
		
                       
		//----------------------------------------------
		//Parte logica del coponente
		this.loginComponent = loginComponent;
		
		
        this.inicializarObjDecoradores(); 
        this.objGrafico = ObjGraficoServicio.getServicioObjeto();
		this.crearPaneles();
		this.crearImagenes();
        this.crearJlabel();
        this.crearBox();
        this.crearBtn();
		this.angadirComponentes();
		this.crearComboBox();
		jpVentana.add(jpCentral);
		jpVentana.add(jcbIdioma);
		this.add(jpVentana);
		this.asignarEspeciVentana();
		
	}
	//Modularización utilizando metodos
	
	//Inicializa los objetos decoradores 
	public void inicializarObjDecoradores() {
		objDecorador = ObjDecoradorServicio.obtenerServicio();
        inicesion = new ImageIcon("Cliente/img/inicesion.png");
	}
	
	//Inicializa las etiquetas(Titulos)
	
	public void crearJlabel() {
		txtTitulo1App = objGrafico.crearJLabel
				("G", 122, 40, 40, 20, objDecorador.getFontTprincipal(), objDecorador.getColorAzulOscuro(),objDecorador.getcMano());
		txtTitulo2App = objGrafico.crearJLabel
				("o", 144, 40, 40, 20, objDecorador.getFontTprincipal(), objDecorador.getColorRojo(),objDecorador.getcMano());
		txtTitulo3App = objGrafico.crearJLabel
				("o", 166, 40, 40, 20, objDecorador.getFontTprincipal(), new Color(255,190,1),objDecorador.getcMano());
		txtTitulo4App = objGrafico.crearJLabel
				("g", 188, 40, 40, 20, objDecorador.getFontTprincipal(), objDecorador.getColorAzulOscuro(),objDecorador.getcMano());
		txtTitulo5App = objGrafico.crearJLabel
				("l", 210, 40, 40, 20, objDecorador.getFontTprincipal(), new Color(37,200, 8),objDecorador.getcMano());   
		txtTitulo6App = objGrafico.crearJLabel
				("e", 232, 40, 40, 20, objDecorador.getFontTprincipal(), objDecorador.getColorRojo(),objDecorador.getcMano());
		txtTituloLogin = objGrafico.crearJLabel
				("Iniciar sesion", 70, 60, 250, 30, objDecorador.getFontTprincipal(), Color.black,objDecorador.getcMano());
		txtTituloEnunciado = objGrafico.crearJLabel
				("Utiliza tu cuenta de Google", 120, 80, 150, 20, objDecorador.getFontOpc(),new Color(84, 153, 199),objDecorador.getcMano());
		txtRecorUsu = objGrafico.crearJLabel
				("¿Has olvidado tu correo electronico?", 80, 260, 250, 20, objDecorador.getFontOpc(),objDecorador.getColorAzulClaro(),objDecorador.getcMano());
		txtContrasegna = objGrafico.crearJLabel
				("Introduce tu contraseña", 80, 310, 250, 20, objDecorador.getFontOpc(),objDecorador.getColorGris(),objDecorador.getcMano());
		txtRecPass = objGrafico.crearJLabel
				("¿Has olvidado la contraseña?", 80, 370, 250, 20, objDecorador.getFontOpc(),objDecorador.getColorAzulClaro(),objDecorador.getcMano());		
		
	}
	
	//Iniciza las cajas (campos de texto) 
	public void crearBox(){
		jtfCorreo = objGrafico.crearJTextField
				("Correo electronico o telefono", 75, 220,
						250, 40, Color.white, objDecorador.getColorGris(), objDecorador.getColorAzulOscuro(), objDecorador.getBorderLogin());

		jpfContrasegna = objGrafico.crearJPasswordField
				("654321", 75, 330,
						250, 40, Color.white, objDecorador.getColorGris(), objDecorador.getColorAzulOscuro(), objDecorador.getBorderLogin());
	}
	
	//Inicializa los botones 
	public void crearBtn() {
		jbtnCrearCuenta = objGrafico.crearBoton
				("Crear cuenta", 40, 420, 130, 40, Color.white, objDecorador.getColorAzulOscuro(), objDecorador.getcMano(),null);
		
		jbtncerrar = objGrafico.crearBoton
				(null, 850, 20, 15, 15, null, null, objDecorador.getcMano(), aux);
		
		jbtnSiguiente = objGrafico.crearBoton
				("Siguiente", 230, 420, 130, 40, Color.white, objDecorador.getColorAzulOscuro(), objDecorador.getcMano(), null);
	
		//Estan a la escucha/Espera
		jbtnCrearCuenta.addActionListener(loginComponent);
		jbtncerrar.addActionListener(loginComponent);
		jbtnSiguiente.addActionListener(loginComponent);
	}
	
	//Se crean los paneles de la ventana
	public void crearPaneles() {
		jpVentana = objGrafico.crearPanel(0, 0, 900, 650, Color.white);
		jpCentral = objGrafico.crearPanel(500/2, 25, 400, 500, new Color(174, 214, 241, 50));

	}
	
	//Se añaden los componentes a cada jPanel
	public void angadirComponentes() {
		jpCentral.add(txtTitulo1App);
        jpCentral.add(txtTitulo2App);
        jpCentral.add(txtTitulo3App);
        jpCentral.add(txtTitulo4App);
        jpCentral.add(txtTitulo5App);
        jpCentral.add(txtTitulo6App);
                  
                
		jpCentral.add(txtTituloLogin);
		jpCentral.add(txtTituloEnunciado);
		jpCentral.add(jtfCorreo);
		jpCentral.add(txtRecorUsu);
		jpCentral.add(txtContrasegna);
		jpCentral.add(jpfContrasegna);
		jpCentral.add(txtRecPass);
		jpCentral.add(jbtnCrearCuenta);
		jpCentral.add(jbtnSiguiente);
		jpVentana.add(jbtncerrar);
		
	}

	public void crearComboBox() {
		jcbIdioma = new JComboBox();
		jcbIdioma.addItem("Idioma");
		jcbIdioma.addItem("Ingles");
		jcbIdioma.addItem("Español");
		
		jcbIdioma.setSize(80, 30);
		jcbIdioma.setLocation((jpVentana.getWidth() - jpCentral.getWidth())/2, 550);
		jcbIdioma.setBackground(Color.white);
		jcbIdioma.setForeground(objDecorador.getColorGris());
		((JLabel)jcbIdioma.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		jcbIdioma.setFocusable(false);
		
	}

	public void crearImagenes() {
		auxd = new ImageIcon(inicesion.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING));
        logoL= new JLabel();
        logoL.setBounds(150, 100, 100, 100);
        logoL.setIcon(auxd);
        jpCentral.add(logoL);
        aux = new ImageIcon((objDecorador.getIcerrar()).getImage().getScaledInstance(10, 10, Image.SCALE_AREA_AVERAGING));        
		
	}
	
	public void asignarEspeciVentana() {
		this.setTitle("Login Usuario");
		this.setSize(1200, 700);
		this.setLocationRelativeTo(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
        this.setUndecorated(true);
		this.setVisible(true);
		
	}
	//---------------------------------------------------------------------
	//Getters
	//Botones
	public JButton getJbtnCrearCuenta() {return jbtnCrearCuenta;}
	public JButton getJbtnSiguiente() {	return jbtnSiguiente;}
	public JButton getJbtncerrar() {return jbtncerrar;}
	//Cajas de texto
	public JTextField getJtfCorreo() {return jtfCorreo;}
	public JPasswordField getJpfContrasegna() {return jpfContrasegna;}
}