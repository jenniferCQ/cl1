package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_proveedor database table.
 * 
 */
@Entity
@Table(name="tb_proveedor")
@NamedQuery(name="Proveedor.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedor;

	private String codigoProveedor;

	@Column(name="descrip_prove")
	private String descripProve;

	private String direccion;

	private String email;

	private int estado;

	@Column(name="nom_prove")
	private String nomProve;

	@Column(name="nombre_rs")
	private String nombreRs;

	private String razSocial;

	private String ruc;

	private String telefono;


	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="tbProveedor")
	private List<Producto> tbProductos;

	public Proveedor() {
	}

	public int getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getCodigoProveedor() {
		return this.codigoProveedor;
	}

	public void setCodigoProveedor(String codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}

	public String getDescripProve() {
		return this.descripProve;
	}

	public void setDescripProve(String descripProve) {
		this.descripProve = descripProve;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNomProve() {
		return this.nomProve;
	}

	public void setNomProve(String nomProve) {
		this.nomProve = nomProve;
	}

	public String getNombreRs() {
		return this.nombreRs;
	}

	public void setNombreRs(String nombreRs) {
		this.nombreRs = nombreRs;
	}

	public String getRazSocial() {
		return this.razSocial;
	}

	public void setRazSocial(String razSocial) {
		this.razSocial = razSocial;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Producto> getTbProductos() {
		return this.tbProductos;
	}

	public void setTbProductos(List<Producto> tbProductos) {
		this.tbProductos = tbProductos;
	}

	public Producto addTbProducto(Producto tbProducto) {
		getTbProductos().add(tbProducto);
		tbProducto.setTbProveedor(this);

		return tbProducto;
	}

	public Producto removeTbProducto(Producto tbProducto) {
		getTbProductos().remove(tbProducto);
		tbProducto.setTbProveedor(null);

		return tbProducto;
	}

}