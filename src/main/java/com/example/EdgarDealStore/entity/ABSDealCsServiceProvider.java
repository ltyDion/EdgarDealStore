package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ABS_DEAL_CS_SERVICE_PROVIDER")
public class ABSDealCsServiceProvider {

	@EmbeddedId
	private ABSDealCsServiceProviderPK pk;

	public ABSDealCsServiceProviderPK getPk() {
		return pk;
	}

	public void setPk(ABSDealCsServiceProviderPK pk) {
		this.pk = pk;
	}

	public ABSDealCsServiceProvider(ABSDealCsServiceProviderPK pk) {
		super();
		this.pk = pk;
	}

	public ABSDealCsServiceProvider() {
		super();
	}
	
	
}
