package practica08;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cargoempleado database table.
 * 
 */
@Entity
@NamedQuery(name="Cargoempleado.findAll", query="SELECT c FROM Cargoempleado c")
public class Cargoempleado implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codCargo;

	private String nombreCargo;

	public Cargoempleado() {
	}

	public int getCodCargo() {
		return this.codCargo;
	}

	public void setCodCargo(int codCargo) {
		this.codCargo = codCargo;
	}

	public String getNombreCargo() {
		return this.nombreCargo;
	}

	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}

}