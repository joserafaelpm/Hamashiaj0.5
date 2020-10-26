package dto;

public class Admin {
private Integer idAdmin;	
private String usuario;
private String contraseña;
public Integer getIdAdmin() {
	return idAdmin;
}
public void setIdAdmin(Integer idAdmin) {
	this.idAdmin = idAdmin;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getContraseña() {
	return contraseña;
}
public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}
public Admin(Integer idAdmin, String usuario, String contraseña) {
	super();
	this.idAdmin = idAdmin;
	this.usuario = usuario;
	this.contraseña = contraseña;
}
public Admin(String usuario, String contraseña) {
	super();
	this.usuario = usuario;
	this.contraseña = contraseña;
}
public Admin() {
	super();
}



}
