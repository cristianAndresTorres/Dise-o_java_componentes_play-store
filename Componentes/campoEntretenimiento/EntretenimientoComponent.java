package campoEntretenimiento;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import campoApps.AppsTemplate;

public class EntretenimientoComponent implements ActionListener{
	//Atributos
	private Timer timer;
	private int estadosAnt, estadoAct=0;
	
	private EntretenimientoTemplate entretenimientoTemplate;
	
	public EntretenimientoComponent() {
		entretenimientoTemplate = new EntretenimientoTemplate(this);
		//Tiempo
		timer = new Timer(1,  this);
	}
	
	public EntretenimientoTemplate getTemplate() {
		return entretenimientoTemplate;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.estadosAnt = this.estadoAct;
		if((e.getSource()==entretenimientoTemplate.getBtnAnimacion_der()) &&(entretenimientoTemplate.getPanelAnimacion().getX()<0)) {
			this.estadoAct = 1;
		}else if((e.getSource()==entretenimientoTemplate.getBtnAnimacion_izq()) &&(entretenimientoTemplate.getPanelAnimacion().getX()<2500)) {
			this.estadoAct = 2;			
		}
		this.timer.start();
		this.animacion();
		
	}
	
	public void animacion() {
		switch(estadoAct) {
		case 1:
			if(entretenimientoTemplate.getPanelAnimacion().getX() == 0) {
				timer.stop();
			}else {
				entretenimientoTemplate.getPanelAnimacion().setLocation(
						entretenimientoTemplate.getPanelAnimacion().getX()+1, entretenimientoTemplate.getPanelAnimacion().getY());
						
			}
			break;
		case 2:
			if((entretenimientoTemplate.getPanelAnimacion().getX() == -2250)) {
				timer.stop();
			}else {
				entretenimientoTemplate.getPanelAnimacion().setLocation(
						entretenimientoTemplate.getPanelAnimacion().getX()-1, entretenimientoTemplate.getPanelAnimacion().getY());
			}
			break;
		}
	}

}
