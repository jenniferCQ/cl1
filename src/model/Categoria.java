package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_categoria database table.
 * 
 */
@Entity
@Table(name="tb_categoria")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_categoria")
	private int codCategoria;

	private String descripcion;

	private int idcategoria;

	private int idTipo;

	@Column(name="nom_categoria")
	private String nomCategoria;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="tbCategoria")
	private List<Producto> tbProductos;

	public Categoria() {
	}

	public int getCodCategoria() {
		return this.codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getNomCategoria() {
		return this.nomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}

	public List<Producto> getTbProductos() {
		return this.tbProductos;
	}

	public void setTbProductos(List<Producto> tbProductos) {
		this.tbProductos = tbProductos;
	}

	public Producto addTbProducto(Producto tbProducto) {
		getTbProductos().add(tbProducto);
		tbProducto.setTbCategoria(this);

		return tbProducto;
	}

	public Producto removeTbProducto(Producto tbProducto) {
		getTbProductos().remove(tbProducto);
		tbProducto.setTbCategoria(null);

		return tbProducto;
	}

}