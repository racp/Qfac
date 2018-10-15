package com.quickFac.modulo.facturas;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("facturas")
public class Facturas extends VerticalLayout{

	
		
	public Facturas() {
	
		Button addFacturas = new Button(new Icon(VaadinIcon.PLUS_CIRCLE_O));
		addFacturas.addClickListener(event -> {
			addFacturas.getUI().ifPresent(ui -> ui.navigate("facturas/NuevaFactura"));
			
		});
		
		Grid<Generales> gridFacturas = new Grid<>();
		gridFacturas.setHeightByRows(true);
		gridFacturas.addColumn(Generales::getFecha).setHeader("Fecha");
		gridFacturas.addColumn(Generales::getTipFactura).setHeader("Factura de");
		gridFacturas.addColumn(Generales::getNumFactura).setHeader("# de Factura");
		gridFacturas.addColumn(Generales::getNumComprobante).setHeader("# de Comprobante");
		gridFacturas.addColumn(Generales::getCliente).setHeader("Cliente").setFlexGrow(2);
		gridFacturas.addColumn(Generales::getEstado).setHeader("Estado");
		gridFacturas.addColumn(Generales::getTotal).setHeader("Total");
		
		add(addFacturas, gridFacturas );
	}

	
}
