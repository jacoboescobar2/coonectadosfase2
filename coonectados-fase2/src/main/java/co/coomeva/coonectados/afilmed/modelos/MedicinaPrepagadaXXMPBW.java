package co.coomeva.coonectados.afilmed.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASOCIADO_PRUEBA")
public class MedicinaPrepagadaXXMPBW implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="IDENTIFICACION")
	private Integer identificacion;
	
	@Column(name="NOMBRE")
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	/*@Column(name="QBWCNS")
	private Integer consecutivo;
	
	@Column(name="QBWSOC")
	private String sucursal;
	
	@Column(name="QBWNCR")
	private Integer contrato;
	
	@Column(name="QBWNFA")
	private Integer familia;
	
	@Column(name="QBWNUS")
	private Integer usuario;
	
	@Column(name="QBWNIC")
	private Long nitEmpleado;
	
	@Column(name="QBWPTF")
	private String planTarifario;
	
	@Column(name="QBWNIU")
	private Long nitBeneficiario;
	
	@Column(name="QBWDEC")
	private String nombreEmpleado;
	
	@Column(name="QBWTCT")
	private String tipoContrato;
	
	@Column(name="QBWPLP")
	private String formaDePago;
	
	@Column(name="QBWTPT")
	private String tipoTarifa;
	
	@Column(name="QBWUNI")
	private String unificado;
	
	@Column(name="QBWGRP")
	private String grupo;
	
	@Column(name="QBWDEU")
	private String nombreBeneficiario;
	
	@Column(name="QBWNAC")
	private String fechaNacimiento;
	
	@Column(name="QBWANO")
	private Integer edad;
	
	@Column(name="QBWSEX")
	private String sexo;
	
	@Column(name="QBWPAR")
	private String parentesco;
	
	@Column(name="QBWCON")
	private String idEps;
	
	@Column(name="QBWVLC")
	private Integer valorCuota;
	
	@Column(name="QBWVAL")
	private Integer valorDescuentoSocial;
	
	@Column(name="QBWVSR")
	private Integer valorDescuentoEps;
	
	@Column(name="QBWVRG")
	private Integer valorIVA;
	
	@Column(name="QBWTCC")
	private Integer totalActual;
	
	@Column(name="QBWPTFF")
	private Integer novedadPTF;
	
	@Column(name="QBWVLCF")
	private Integer valorCoutaFactura;
	
	@Column(name="QBWVALF")
	private Integer dsctoCiaFuturo;
	
	@Column(name="QBWVSRF")
	private Integer dsctoEpsFuturo;
	
	@Column(name="QBWVRGF")
	private Integer valorIvaFuturo;
	
	@Column(name="QBWMSG")
	private String mensajeAdvertencia;
	
	@Column(name="QBWTIME")
	private Integer fechaAsignacion;
	
	@Column(name="PLAN_CODI")
	private String planCodi;
	
	@Column(name="TARI")
	private String tari;
	
	@Column(name="PLAN_CODI_NUEVO")
	private String planCodinuevo;
	
	@Column(name="TARI_NUEVO")
	private String tariNueva;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getConsecutivo() {
		return consecutivo;
	}
	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public Integer getContrato() {
		return contrato;
	}
	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}
	public Integer getFamilia() {
		return familia;
	}
	public void setFamilia(Integer familia) {
		this.familia = familia;
	}
	public Integer getUsuario() {
		return usuario;
	}
	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
	public Long getNitEmpleado() {
		return nitEmpleado;
	}
	public void setNitEmpleado(Long nitEmpleado) {
		this.nitEmpleado = nitEmpleado;
	}
	public String getPlanTarifario() {
		return planTarifario;
	}
	public void setPlanTarifario(String planTarifario) {
		this.planTarifario = planTarifario;
	}
	public Long getNitBeneficiario() {
		return nitBeneficiario;
	}
	public void setNitBeneficiario(Long nitBeneficiario) {
		this.nitBeneficiario = nitBeneficiario;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	public String getTipoTarifa() {
		return tipoTarifa;
	}
	public void setTipoTarifa(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	public String getUnificado() {
		return unificado;
	}
	public void setUnificado(String unificado) {
		this.unificado = unificado;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getNombreBeneficiario() {
		return nombreBeneficiario;
	}
	public void setNombreBeneficiario(String nombreBeneficiario) {
		this.nombreBeneficiario = nombreBeneficiario;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getIdEps() {
		return idEps;
	}
	public void setIdEps(String idEps) {
		this.idEps = idEps;
	}
	public Integer getValorCuota() {
		return valorCuota;
	}
	public void setValorCuota(Integer valorCuota) {
		this.valorCuota = valorCuota;
	}
	public Integer getValorDescuentoSocial() {
		return valorDescuentoSocial;
	}
	public void setValorDescuentoSocial(Integer valorDescuentoSocial) {
		this.valorDescuentoSocial = valorDescuentoSocial;
	}
	public Integer getValorDescuentoEps() {
		return valorDescuentoEps;
	}
	public void setValorDescuentoEps(Integer valorDescuentoEps) {
		this.valorDescuentoEps = valorDescuentoEps;
	}
	public Integer getValorIVA() {
		return valorIVA;
	}
	public void setValorIVA(Integer valorIVA) {
		this.valorIVA = valorIVA;
	}
	public Integer getTotalActual() {
		return totalActual;
	}
	public void setTotalActual(Integer totalActual) {
		this.totalActual = totalActual;
	}
	public Integer getNovedadPTF() {
		return novedadPTF;
	}
	public void setNovedadPTF(Integer novedadPTF) {
		this.novedadPTF = novedadPTF;
	}
	public Integer getValorCoutaFactura() {
		return valorCoutaFactura;
	}
	public void setValorCoutaFactura(Integer valorCoutaFactura) {
		this.valorCoutaFactura = valorCoutaFactura;
	}
	public Integer getDsctoCiaFuturo() {
		return dsctoCiaFuturo;
	}
	public void setDsctoCiaFuturo(Integer dsctoCiaFuturo) {
		this.dsctoCiaFuturo = dsctoCiaFuturo;
	}
	public Integer getDsctoEpsFuturo() {
		return dsctoEpsFuturo;
	}
	public void setDsctoEpsFuturo(Integer dsctoEpsFuturo) {
		this.dsctoEpsFuturo = dsctoEpsFuturo;
	}
	public Integer getValorIvaFuturo() {
		return valorIvaFuturo;
	}
	public void setValorIvaFuturo(Integer valorIvaFuturo) {
		this.valorIvaFuturo = valorIvaFuturo;
	}
	public String getMensajeAdvertencia() {
		return mensajeAdvertencia;
	}
	public void setMensajeAdvertencia(String mensajeAdvertencia) {
		this.mensajeAdvertencia = mensajeAdvertencia;
	}
	public Integer getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(Integer fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public String getPlanCodi() {
		return planCodi;
	}
	public void setPlanCodi(String planCodi) {
		this.planCodi = planCodi;
	}
	public String getTari() {
		return tari;
	}
	public void setTari(String tari) {
		this.tari = tari;
	}
	public String getPlanCodinuevo() {
		return planCodinuevo;
	}
	public void setPlanCodinuevo(String planCodinuevo) {
		this.planCodinuevo = planCodinuevo;
	}
	public String getTariNueva() {
		return tariNueva;
	}
	public void setTariNueva(String tariNueva) {
		this.tariNueva = tariNueva;
	}*/
	
}
