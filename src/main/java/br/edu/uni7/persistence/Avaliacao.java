package br.edu.uni7.persistence;

import java.util.Date;
import java.util.List;

public class Avaliacao {

	private Long id;
	
	private Date data;
	
	private Produto produto;
	
	private Usuario autor;	
	
	private List<ItemAvaliacao> itensAvaliacao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public List<ItemAvaliacao> getItensAvaliacao() {
		return itensAvaliacao;
	}

	public void setItensAvaliacao(List<ItemAvaliacao> itensAvaliacao) {
		this.itensAvaliacao = itensAvaliacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
