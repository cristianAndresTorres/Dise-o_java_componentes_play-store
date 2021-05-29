package disegno;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class ObjDecoradorServicio {
	//Atributos
	private static ObjDecoradorServicio servicioDercorador;
	
	private Color colorGris, colorGrisMedio,colorGrisClaro, colorAzulOscuro, colorAzulClaro, colorRojo, colorNaranja, colorVerde;
    private Color colorVerdeClaro, colorRojoClaro, colorNaranjaClaro;
	private Font fontTprincipal,fontOpc,fontSecion;
    private Cursor cMano;
    private Border borderLogin;
    private ImageIcon icerrar;
	
	//Constructor
	private ObjDecoradorServicio() {
		colorGris =new Color(95, 106, 106);
		colorGrisClaro =new Color(190,206,211);
		colorGrisMedio = new Color(242, 243, 244);
		colorAzulOscuro =new Color(1,117,245);
		colorAzulClaro = new Color(56, 154, 241);
		
		colorNaranja = new Color(220, 118, 51);
		colorNaranjaClaro = new Color(240, 178, 122);
		
		colorRojo = new Color(240, 35, 10);
		colorRojoClaro = new Color(241, 148, 138);
		
		colorVerde = new Color(46, 204, 113);
		colorVerdeClaro = new Color(130, 224, 170);
		
		
        fontTprincipal = new Font("Engravers MT",Font.BOLD,17);
        fontOpc = new Font("Daytona Pro Condensed",Font.BOLD,12);
        fontSecion = new Font("Daytona Pro Condensed",Font.BOLD,13);
        cMano =new Cursor(Cursor.HAND_CURSOR);
        borderLogin = BorderFactory.createLineBorder(colorGris, 1, true);
        icerrar = new ImageIcon("Cliente/img/cerrar.png");
        
		
	}
	
	//Patron creacional-Singleton
	public static ObjDecoradorServicio obtenerServicio() {
		if(servicioDercorador == null)
			servicioDercorador = new ObjDecoradorServicio();
		
		return servicioDercorador;
	}
	
	//-------------------------------------------------------------------------------------------
	//Metodos getters

	public static ObjDecoradorServicio getServicioDercorador() {
		return servicioDercorador;
	}

	public Color getColorGris() {
		return colorGris;
	}

	public Color getColorGrisClaro() {
		return colorGrisClaro;
	}
	public Color getColorAzulOscuro() {
		return colorAzulOscuro;
	}
	public Color getColorAzulClaro() {
		return colorAzulClaro;
	}
	public Color getColorGrisMedio() {
		return colorGrisMedio;
	}
	
	
	public Color getColorRojo() {
		return colorRojo;
	}
	
	public Color getColorRojoClaro() {
		return colorRojoClaro;
	}
	
	public Color getColorNaranja() {
		return colorNaranja;
	}
	
	public Color getColorNaranjaClaro() {
		return colorNaranjaClaro;
	}
	
	public Color getColorVerde() {
		return colorVerde;
	}
	
	public Color getColorVerdeClaro() {
		return colorVerdeClaro;
	}
	public Font getFontTprincipal() {
		return fontTprincipal;
	}

	public Font getFontOpc() {
		return fontOpc;
	}

	public Font getFontSecion() {
		return fontSecion;
	}

	public Cursor getcMano() {
		return cMano;
	}

	public Border getBorderLogin() {
		return borderLogin;
	}

	public ImageIcon getIcerrar() {
		return icerrar;
	}
	

}
