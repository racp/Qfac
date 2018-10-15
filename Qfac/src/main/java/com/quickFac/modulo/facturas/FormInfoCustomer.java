package com.quickFac.modulo.facturas;

import com.quickFac.Entities.Clientes;
import com.quickFac.Repository.ClientesRepository;
import com.quickFac.modulo.utils.TextLine;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.Binder;

public class FormInfoCustomer extends VerticalLayout {
	
	private TextLine cliNombre = new TextLine();
	
	private TextLine clidireccion = new TextLine();
	private TextLine cliProvincia = new TextLine();
	private TextLine cliPais = new TextLine();
	private TextLine cliVendedor = new TextLine();
	private TextLine cliRnc = new TextLine();
	private TextLine cliFecVenc = new TextLine();
	ClientesRepository clientesRepo;
	
	Binder<Clientes> binder = new Binder<>();
	Clientes clientes;
	private NuevaFactura myUI;
	
	public FormInfoCustomer(NuevaFactura nuevaFactura) {
		
		this.myUI = nuevaFactura;
		
		
		binder.forField(cliNombre).bind(Clientes::getDescrip_cliente, Clientes::setDescrip_cliente);
		binder.forField(clidireccion).bind(Clientes::getDireccion, Clientes::setDireccion);
		
		binder.forField(cliRnc).bind(Clientes::getDescrip_cliente, Clientes::setDescrip_cliente);
		
		
		add(cliNombre, clidireccion, cliProvincia, cliPais, cliVendedor, cliRnc, cliFecVenc);
	}
	
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
		binder.setBean(clientes);
	}
	
	public void save() {
		clientesRepo.save(clientes);
	}
}
