package com.quickFac.Forms;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class HeaderSection extends HorizontalLayout {

	private static final long serialVersionUID = 1L;

	public HeaderSection() {
		VerticalLayout AreaLogo = new VerticalLayout();
		VerticalLayout AreaUsuario = new VerticalLayout();
		
		AreaLogo.setSizeFull();
		AreaUsuario.setSizeFull();
		
		
		Image usuario = new Image("frontend/img/usuario.png", "Usuario");
		usuario.setHeight("50px");
		usuario.setWidth("50px");
		
		AreaUsuario.add(usuario);
		
		Image logo = new Image("frontend/img/logoemp.jpg", "Logo de Empresa");
		logo.setHeight("50px");
		logo.setWidth("50px");
		
		
		AreaLogo.add(logo);
		
			
		setMargin(false);
		setPadding(false);
		setSizeFull();	
//		add(AreaLogo, AreaUsuario);
		
		AreaUsuario.setDefaultHorizontalComponentAlignment(Alignment.END);
		setClassName("Headers");
	}

	
}
