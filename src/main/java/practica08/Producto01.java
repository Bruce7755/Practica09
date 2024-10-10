package practica08;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the producto01 database table.
 * 
 */
@Entity
@NamedQuery(name="Producto01.findAll", query="SELECT p FROM Producto01 p")
public class Producto01 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codProdu;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private double precio;

	public Producto01() {
	}

	public int getCodProdu() {
		return this.codProdu;
	}

	public void setCodProdu(int codProdu) {
		this.codProdu = codProdu;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}