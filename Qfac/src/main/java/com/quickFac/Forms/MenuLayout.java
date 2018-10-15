package com.quickFac.Forms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLayout;

public class MenuLayout extends VerticalLayout implements RouterLayout {

	private static final long serialVersionUID = 1L;
	
	private boolean cotiza = false;
	private boolean factura = true;
	private boolean cxc = true ;
	private boolean compras = true ;
	private boolean cxp = true ;

	public MenuLayout() {
		Image logo = new Image("frontend/img/logoemp.jpg", "Logo de Empresa");
		logo.setHeight("100px");
		logo.setWidth("100px");
		
		Image usuario = new Image("frontend/img/usuario.png", "Usuario");
		usuario.setHeight("50px");
		usuario.setWidth("50px");
		
		ComboBox<String> usercustom = new ComboBox<String>();
		
		Label lblMenu = new Label("Menu");
		
		VerticalLayout Addmenu = new VerticalLayout();
		
		if(cotiza) {
			Button bntcotiza = new Button("Cotizaciones");
			bntcotiza.setIcon(new Icon(VaadinIcon.QUOTE_LEFT));	
			bntcotiza.addClickListener(e -> {
				bntcotiza.getUI().ifPresent(ui -> ui.navigate("cotizaciones"));
			});
			
			Addmenu.add(bntcotiza);
		}
		
		if(factura) {
			Button bntfact = new Button("Facturación");
			bntfact.setIcon(new Icon(VaadinIcon.CASH));	
			bntfact.addClickListener(e -> {
				bntfact.getUI().ifPresent(ui -> ui.navigate("facturas"));
			});
			
			Addmenu.add(bntfact);
		}
		
		if(cxc) {
			Button bntcxc = new Button("Cuentas por Cobrar");
			bntcxc.setIcon(new Icon(VaadinIcon.MONEY));	
			bntcxc.addClickListener(e -> {
				bntcxc.getUI().ifPresent(ui -> ui.navigate("cxc"));
			});
			
			Addmenu.add(bntcxc);
		}
		
		if(compras) {
			Button bntcmp = new Button("Compras");
			bntcmp.setIcon(new Icon(VaadinIcon.HANDSHAKE));	
			bntcmp.addClickListener(e -> {
				bntcmp.getUI().ifPresent(ui -> ui.navigate("compras"));
			});
			
			Addmenu.add(bntcmp);
		}
		
		if(cxp) {
			Button bntcxp = new Button("Cuentas por Pagar");
			bntcxp.setIcon(new Icon(VaadinIcon.INVOICE));	
			bntcxp.addClickListener(e -> {
				bntcxp.getUI().ifPresent(ui -> ui.navigate("cxp"));
			});
			
			Addmenu.add(bntcxp);
		}
		
		add(logo, usuario, usercustom, lblMenu, Addmenu);
	}

	
}
