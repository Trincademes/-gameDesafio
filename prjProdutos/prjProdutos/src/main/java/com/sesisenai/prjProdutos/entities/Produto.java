package com.sesisenai.prjProdutos.entities;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name ="tb_produto")
public class Produto {
	//id, nome, preço
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome")
	private String name;
	@Column(name = "preco")

	private double price;
	
	public Produto() {
		
	}
public Produto(Long id, String name, double price) {
	super();
	this.id =id;
	this.name =name;
	this.price =price;
	
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id =id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name =name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price =price;
}


}

