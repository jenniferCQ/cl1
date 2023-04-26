package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_producto database table.
 * 
 */
@Entity
@Table(name="tb_producto")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_prod")
	private String idProd;

	@Column(name="cod_mar")
	private int codMar;

	@Column(name="cod_pro")
	private int codPro;

	@Column(name="des_pro")
	private String desPro;

	@Column(name="des_prod")
	private String desProd;

	@Column(name="est_prod")
	private byte estProd;

	@Column(name="pre_pro")
	private float prePro;

	@Column(name="prepro_prod")
	private BigDecimal preproProd;

	@Column(name="stk_prod")
	private int stkProd;

	@Column(name="stock_pro")
	private int stockPro;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="idcategoria")
	private Categoria tbCategoria;

	//bi-directional many-to-one association to Proveedor
	@ManyToOne
	@JoinColumn(name="idproveedor")
	private Proveedor tbProveedor;

	public Producto() {
	}

	public String getIdProd() {
		return this.idProd;
	}

	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}

	public int getCodMar() {
		return this.codMar;
	}

	public void setCodMar(int codMar) {
		this.codMar = codMar;
	}

	public int getCodPro() {
		return this.codPro;
	}

	public void setCodPro(int codPro) {
		this.codPro = codPro;
	}

	public String getDesPro() {
		return this.desPro;
	}

	public void setDesPro(String desPro) {
		this.desPro = desPro;
	}

	public String getDesProd() {
		return this.desProd;
	}

	public void setDesProd(String desProd) {
		this.desProd = desProd;
	}

	public byte getEstProd() {
		return this.estProd;
	}

	public void setEstProd(byte estProd) {
		this.estProd = estProd;
	}

	public float getPrePro() {
		return this.prePro;
	}

	public void setPrePro(float prePro) {
		this.prePro = prePro;
	}

	public BigDecimal getPreproProd() {
		return this.preproProd;
	}

	public void setPreproProd(BigDecimal preproProd) {
		this.preproProd = preproProd;
	}

	public int getStkProd() {
		return this.stkProd;
	}

	public void setStkProd(int stkProd) {
		this.stkProd = stkProd;
	}

	public int getStockPro() {
		return this.stockPro;
	}

	public void setStockPro(int stockPro) {
		this.stockPro = stockPro;
	}

	public Categoria getTbCategoria() {
		return this.tbCategoria;
	}

	public void setTbCategoria(Categoria tbCategoria) {
		this.tbCategoria = tbCategoria;
	}

	public Proveedor getTbProveedor() {
		return this.tbProveedor;
	}

	public void setTbProveedor(Proveedor tbProveedor) {
		this.tbProveedor = tbProveedor;
	}

}