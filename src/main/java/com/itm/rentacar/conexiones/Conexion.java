package com.itm.rentacar.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;

import com.itm.rentacar.constantes.ConstantesCodigoRespuesta;
import com.itm.rentacar.constantes.ConstantesMensajes;
import com.itm.rentacar.dto.AtributosConexionDto;
import com.itm.rentacar.dto.RespuestaConexionDto;

public class Conexion {
	
	String url;
	String user;
	String pass;
	Connection con;
	
	public RespuestaConexionDto conectar(AtributosConexionDto atributos) {
		RespuestaConexionDto respuestaConexion = new RespuestaConexionDto();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = atributos.getUrl();
			user = atributos.getUser();
			pass = atributos.getPass();
			con = DriverManager.getConnection(url, user, pass);
			if (con != null) {
				respuestaConexion.setCodigoRespuesta(ConstantesCodigoRespuesta.codigoExitoso);
				respuestaConexion.setDescripcionRespuesta(ConstantesMensajes.MensajeConexion);
				respuestaConexion.setCon(con);
			} else {
				respuestaConexion.setCodigoRespuesta(ConstantesCodigoRespuesta.codigoError);
				respuestaConexion.setDescripcionRespuesta(ConstantesMensajes.MensajeConexionError);
				respuestaConexion.setCon(con);
			}
		} catch (Exception e) {
			respuestaConexion.setCodigoRespuesta(ConstantesCodigoRespuesta.codigoError);
			respuestaConexion.setDescripcionRespuesta(e.getMessage());
		} 
		return respuestaConexion;
		
	}

}
