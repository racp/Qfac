package com.quickFac.Forms;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout.Orientation;

public class MainLayout extends VerticalLayout {

	
	private static final long serialVersionUID = 1L;

	SplitLayout lowerSection = new SplitLayout();
	HeaderSection header = new HeaderSection();
	HorizontalLayout footer = new HorizontalLayout();
	MenuLayout menuLayout = new MenuLayout();
	ContentLayout contentLayout = new ContentLayout();
	
	public MainLayout() {
		footer.add(new Label("Sistemas Predictivos y Tecnologicos, SIPTEC Reservados todos los derechos"));
		
		header.add(menuLayout);
		header.add(contentLayout);
		
		lowerSection.addToPrimary(menuLayout);
		lowerSection.addToSecondary(contentLayout);
		lowerSection.setOrientation(Orientation.HORIZONTAL);
		
		
		lowerSection.setSizeFull();
		menuLayout.setHeight("100%");
		menuLayout.setWidth("20%");
		contentLayout.setSizeFull();
		footer.setSizeFull();

		
		footer.setJustifyContentMode(JustifyContentMode.CENTER);
		add(header);
		add(lowerSection);
		add(footer);
	}
	
	
}
