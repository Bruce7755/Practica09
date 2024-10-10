package practica08;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the empleado01 database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado01.findAll", query="SELECT e FROM Empleado01 e")
public class Empleado01 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codEmpleado;
	
	private int codCargo;
	private String contrase�a;

	private String usuario;

	public Empleado01() {
	}

	public int getCodCargo() {
		return this.codCargo;
	}

	public void setCodCargo(int codCargo) {
		this.codCargo = codCargo;
	}

	public int getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getContrase�a() {
		return this.contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}