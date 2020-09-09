package co.coomeva.coonectados.bitacora.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLA_PRUEBA_UNO")
public class BitacoraServicio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "SERVICIO")
	private Integer servicio;

	@Column(name = "TIMESTAMP_ERROR")
	private String timestamp_error;

	@Column(name = "CODIGO_ERROR")
	private Integer codigo_error;

	@Column(name = "DESCRIPCION_ERROR")
	private Integer descripcion_error;

	@Column(name = "ARCHIVO")
	private Integer archivo;

	@Column(name = "NUMERO_REGISTRO")
	private Long numero_registro;

	@Column(name = "ESTADO")
	private String estado;

	@Column(name = "MESSAGE")
	private Long mensaje;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getServicio() {
		return servicio;
	}

	public void setServicio(Integer servicio) {
		this.servicio = servicio;
	}

	public String getTimestamp_error() {
		return timestamp_error;
	}

	public void setTimestamp_error(String timestamp_error) {
		this.timestamp_error = timestamp_error;
	}

	public Integer getCodigo_error() {
		return codigo_error;
	}

	public void setCodigo_error(Integer codigo_error) {
		this.codigo_error = codigo_error;
	}

	public Integer getDescripcion_error() {
		return descripcion_error;
	}

	public void setDescripcion_error(Integer descripcion_error) {
		this.descripcion_error = descripcion_error;
	}

	public Integer getArchivo() {
		return archivo;
	}

	public void setArchivo(Integer archivo) {
		this.archivo = archivo;
	}

	public Long getNumero_registro() {
		return numero_registro;
	}

	public void setNumero_registro(Long numero_registro) {
		this.numero_registro = numero_registro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getMensaje() {
		return mensaje;
	}

	public void setMensaje(Long mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Bitacora [id= "+id+" servicio= "+servicio+"]";
	}
	

}
