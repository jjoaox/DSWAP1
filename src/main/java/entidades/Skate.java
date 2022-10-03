package entidades;

public class Skate {
	private Integer id;
	private String tipoSkate;
	private String marcaSkate;
	
	@Override
	public String toString() {
		return tipoSkate + " - " + marcaSkate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoSkate() {
		return tipoSkate;
	}
	public void setTipoSkate(String tipoSkate) {
		this.tipoSkate = tipoSkate;
	}
	public String getMarcaSkate() {
		return marcaSkate;
	}
	public void setMarcaSkate(String marcaSkate) {
		this.marcaSkate = marcaSkate;
	}
	
	
}
