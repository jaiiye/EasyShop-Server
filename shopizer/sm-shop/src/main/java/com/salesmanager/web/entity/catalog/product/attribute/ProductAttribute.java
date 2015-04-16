package com.salesmanager.web.entity.catalog.product.attribute;

import java.io.Serializable;

import com.salesmanager.web.entity.Entity;

public class ProductAttribute extends Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProductOption option;
	private ProductOptionValue optionValue;
	public void setOptionValue(ProductOptionValue optionValue) {
		this.optionValue = optionValue;
	}
	public ProductOptionValue getOptionValue() {
		return optionValue;
	}
	public void setOption(ProductOption option) {
		this.option = option;
	}
	public ProductOption getOption() {
		return option;
	}

}
