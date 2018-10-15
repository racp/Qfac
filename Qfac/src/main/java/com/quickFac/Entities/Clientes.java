package com.quickFac.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clientes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_cliente;
	private int cod_cliente;
	private String descrip_cliente;
	private int tip_cliente;
	private int tip_comprobante;
	private String contacto_cliente;
	private String direccion;
	private int ciudad;
	private int pais;
	private String telefono;
	private String celular;
	private String email;
	private double limite_credito;
	private String id_tributaria;
	private int listaPrecios;
	private int diasCredito;
	private double saldoActual;
	private boolean respondeOfertas;
	private boolean estado;
	private Date fechaInactivo;
	private Date fechaIngreso;
	private int vendedor;
	
	public int getVendedor() {
		return vendedor;
	}
	public void setVendedor(int vendedor) {
		this.vendedor = vendedor;
	}
	public long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getDescrip_cliente() {
		return descrip_cliente;
	}
	public void setDescrip_cliente(String descrip_cliente) {
		this.descrip_cliente = descrip_cliente;
	}
	public int getTip_cliente() {
		return tip_cliente;
	}
	public void setTip_cliente(int tip_cliente) {
		this.tip_cliente = tip_cliente;
	}
	public int getTip_comprobante() {
		return tip_comprobante;
	}
	public void setTip_comprobante(int tip_comprobante) {
		this.tip_comprobante = tip_comprobante;
	}
	public String getContacto_cliente() {
		return contacto_cliente;
	}
	public void setContacto_cliente(String contacto_cliente) {
		this.contacto_cliente = contacto_cliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCiudad() {
		return ciudad;
	}
	public void setCiudad(int ciudad) {
		this.ciudad = ciudad;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getLimite_credito() {
		return limite_credito;
	}
	public void setLimite_credito(double limite_credito) {
		this.limite_credito = limite_credito;
	}
	public String getId_tributaria() {
		return id_tributaria;
	}
	public void setId_tributaria(String id_tributaria) {
		this.id_tributaria = id_tributaria;
	}
	public int getListaPrecios() {
		return listaPrecios;
	}
	public void setListaPrecios(int listaPrecios) {
		this.listaPrecios = listaPrecios;
	}
	public int getDiasCredito() {
		return diasCredito;
	}
	public void setDiasCredito(int diasCredito) {
		this.diasCredito = diasCredito;
	}
	public double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}
	public boolean isRespondeOfertas() {
		return respondeOfertas;
	}
	public void setRespondeOfertas(boolean respondeOfertas) {
		this.respondeOfertas = respondeOfertas;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Date getFechaInactivo() {
		return fechaInactivo;
	}
	public void setFechaInactivo(Date fechaInactivo) {
		this.fechaInactivo = fechaInactivo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public Clientes(int id_cliente, int cod_cliente, String descrip_cliente, int tip_cliente, int tip_comprobante,
			String contacto_cliente, String direccion, int ciudad, int pais, String telefono, String celular,
			String email, double limite_credito, String id_tributaria, int listaPrecios, int diasCredito,
			double saldoActual, boolean respondeOfertas, boolean estado, Date fechaInactivo, Date fechaIngreso) {
		super();
		this.id_cliente = id_cliente;
		this.cod_cliente = cod_cliente;
		this.descrip_cliente = descrip_cliente;
		this.tip_cliente = tip_cliente;
		this.tip_comprobante = tip_comprobante;
		this.contacto_cliente = contacto_cliente;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
		this.telefono = telefono;
		this.celular = celular;
		this.email = email;
		this.limite_credito = limite_credito;
		this.id_tributaria = id_tributaria;
		this.listaPrecios = listaPrecios;
		this.diasCredito = diasCredito;
		this.saldoActual = saldoActual;
		this.respondeOfertas = respondeOfertas;
		this.estado = estado;
		this.fechaInactivo = fechaInactivo;
		this.fechaIngreso = fechaIngreso;
	}
	
	public Clientes() {
		
	}
	
	
}
