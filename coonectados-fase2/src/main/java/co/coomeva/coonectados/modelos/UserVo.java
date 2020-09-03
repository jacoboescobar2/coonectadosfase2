package co.coomeva.coonectados.modelos;

public class UserVo {

	private static final long serialVersionUID = 3560972546182458142L;
	private String tipodocumento;
	private String cedula;
	private String accesstoken;
	private String usuario;
	private String pass;
	private boolean find;

	// -----prepagada liqui nueva
	private String cedulaColaborador;
	private String codigoProceso;
	private String identificacion;
	private String nombre;
	private String fechaNacimiento;
	private String parentesco;
	private String genero;
	private String eps;
	private String plan;

	public String getCedulaColaborador() {
		return cedulaColaborador;
	}

	public void setCedulaColaborador(String cedulaColaborador) {
		this.cedulaColaborador = cedulaColaborador;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getAccesstoken() {
		return accesstoken;
	}

	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isFind() {
		return find;
	}

	public void setFind(boolean find) {
		this.find = find;
	}

	public String getCodigoProceso() {
		return codigoProceso;
	}

	public void setCodigoProceso(String codigoProceso) {
		this.codigoProceso = codigoProceso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
