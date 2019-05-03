package com.itm.rentacar.dto;

import java.sql.Connection;

public class RespuestaConexionDto {

	int codigoRespuesta;
	String descripcionRespuesta;
	Connection con;

	public int getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(int codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}

	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

}
