package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ABS_MARKOV_MATRIX")
public class ABSMarkovMatrix {

	@EmbeddedId
	private ABSMarkovMatrixPK absMarkovMatrixPK;
	
	@Column
	private BigDecimal VALUE;

	public ABSMarkovMatrixPK getAbsMarkovMatrixPK() {
		return absMarkovMatrixPK;
	}

	public void setAbsMarkovMatrixPK(ABSMarkovMatrixPK absMarkovMatrixPK) {
		this.absMarkovMatrixPK = absMarkovMatrixPK;
	}

	public BigDecimal getVALUE() {
		return VALUE;
	}

	public void setVALUE(BigDecimal vALUE) {
		VALUE = vALUE;
	}

	public ABSMarkovMatrix(ABSMarkovMatrixPK absMarkovMatrixPK, BigDecimal vALUE) {
		super();
		this.absMarkovMatrixPK = absMarkovMatrixPK;
		VALUE = vALUE;
	}
	
	public ABSMarkovMatrix() {}
	
}
