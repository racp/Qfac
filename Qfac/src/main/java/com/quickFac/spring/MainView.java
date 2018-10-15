package com.quickFac.spring;

import com.quickFac.Forms.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public MainView() {
		MainLayout root = new MainLayout();
		root.setPadding(false);
		root.setMargin(false);

		add(root);
	}

}
