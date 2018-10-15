package com.quickFac.Forms;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ContentLayout extends HorizontalLayout {


	private static final long serialVersionUID = 1L;

	public ContentLayout() {
		VerticalLayout section1 = new VerticalLayout(new Label("Section 1"));
		VerticalLayout section2 = new VerticalLayout(new Label("Section 2"));
		
		section1.setSizeFull();
		section2.setSizeFull();
		
		setSizeFull();
		add(section1, section2);
	}

	
}
