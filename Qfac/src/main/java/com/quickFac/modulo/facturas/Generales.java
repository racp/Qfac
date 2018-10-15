package com.quickFac.modulo.facturas;

import java.util.Date;

public class Generales {

	private Date fecha;
	private int tipFactura;
	private int numFactura;
	private int numComprobante;
	private String cliente;
	private int estado;
	private double total;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTipFactura() {
		return tipFactura;
	}
	public void setTipFactura(int tipFactura) {
		this.tipFactura = tipFactura;
	}
	public int getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	public int getNumComprobante() {
		return numComprobante;
	}
	public void setNumComprobante(int numComprobante) {
		this.numComprobante = numComprobante;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public Generales(Date fecha, int tipFactura, int numFactura, int numComprobante, String cliente, int estado,
			double total) {
		super();
		this.fecha = fecha;
		this.tipFactura = tipFactura;
		this.numFactura = numFactura;
		this.numComprobante = numComprobante;
		this.cliente = cliente;
		this.estado = estado;
		this.total = total;
	}
	
	
}
