package dto;

public class Admin {
private Integer idAdmin;	
private String usuario;
private String contrase�a;
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
public String getContrase�a() {
	return contrase�a;
}
public void setContrase�a(String contrase�a) {
	this.contrase�a = contrase�a;
}
public Admin(Integer idAdmin, String usuario, String contrase�a) {
	super();
	this.idAdmin = idAdmin;
	this.usuario = usuario;
	this.contrase�a = contrase�a;
}
public Admin(String usuario, String contrase�a) {
	super();
	this.usuario = usuario;
	this.contrase�a = contrase�a;
}
public Admin() {
	super();
}



}
