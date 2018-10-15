package com.quickFac.modulo.facturas;

import org.springframework.beans.factory.annotation.Autowired;

import com.quickFac.Entities.Clientes;
import com.quickFac.Repository.ClientesRepository;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("facturas/NuevaFactura")
public class NuevaFactura extends VerticalLayout {

	HorizontalLayout datosClienteFactura = new HorizontalLayout();
	VerticalLayout datosCliente = new VerticalLayout();
	VerticalLayout datosFactura = new VerticalLayout();
	FormInfoCustomer fmtCliente = new FormInfoCustomer(this);
	
	public NuevaFactura(@Autowired ClientesRepository clientesRepo) {
	
		ComboBox<Clientes> selCliente = new ComboBox<>();
		selCliente.setItems(clientesRepo.findAll());
		selCliente.setItemLabelGenerator(Clientes::getDescrip_cliente);
		selCliente.addValueChangeListener(event -> {
			if(event.getValue() != null) {
				fmtCliente.setClientes(event.getValue());
			}
		});
		
		datosCliente.getStyle().set("border", "1px solid #9E9E9E");
		datosCliente.add(new Label("Datos del Cliente"));
		datosCliente.add(selCliente);
		datosCliente.setSizeFull();
		
		datosFactura.add(new Label("datos de la factura"));
		datosFactura.getStyle().set("border", "1px solid #9E9E9E");
		datosFactura.setSizeFull();
		
		datosClienteFactura.add(datosCliente, datosFactura);
		datosClienteFactura.setSizeFull();
		
		add(datosClienteFactura, fmtCliente);
	}

	
}
