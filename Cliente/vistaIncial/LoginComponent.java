package vistaIncial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.UsuarioServicio;
import vistaPrincipal.VistaPrincipalComponent;


public class LoginComponent implements ActionListener{
	private boolean estado =false;
	private UsuarioServicio sUsuario;
	private LoginTemplate loginTemplate;
	
	

	VistaPrincipalComponent vistaPrincipalComponent;
	//Constructor------------------------------------
	public LoginComponent() {
		sUsuario = UsuarioServicio.getService();
	
		//Parte grafica del componente
		loginTemplate = new LoginTemplate(this);
	}

	//Metodos getters and setters--------------------
	public LoginTemplate getLoginTemplate() {
		return loginTemplate;
	}
	//------------------------------------------------
	//A la escucha
	@Override
	public void actionPerformed(ActionEvent e) {
		//Para ingrezar
		if(  e.getSource() == loginTemplate.getJbtnSiguiente()) {
			
			EnviardatosDelUsu();
	
		}
		//Para crearCuenta
		if(e.getSource() == loginTemplate.getJbtnCrearCuenta())	
			JOptionPane.showMessageDialog(null, "Opción Crear-Cuenta", "Advertencia", 1);
		//Para salir del aplicativo
		if(e.getSource() == loginTemplate.getJbtncerrar())
			System.exit(0);
	}
	public void EnviardatosDelUsu() {
		String nombreUsu = loginTemplate.getJtfCorreo().getText();
		String pass = new String(loginTemplate.getJpfContrasegna().getPassword());
		if(sUsuario.verificarDatosUsuario(nombreUsu, pass)){
	        JOptionPane.showMessageDialog(null, "Ingreso Exitoso", "Advertencia", 1);
	        ingrezar();
			loginTemplate.setVisible(false);
	    }
	    else {
	        JOptionPane.showMessageDialog(null, "correo o contraseña incorrecto", "error", 2);
	        this.loginTemplate.setVisible(true);
	}
}
	
	public void ingrezar() {
		if(vistaPrincipalComponent==null) {
			
			vistaPrincipalComponent = new VistaPrincipalComponent(this);
		}else {
			vistaPrincipalComponent.getVentanaPrincipalTem().setVisible(true);
		}
	}


}
