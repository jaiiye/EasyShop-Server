package com.salesmanager.web.entity.catalog.product;

import java.io.Serializable;
import java.util.List;

import com.salesmanager.web.entity.catalog.category.Category;
import com.salesmanager.web.entity.catalog.manufacturer.Manufacturer;
import com.salesmanager.web.entity.catalog.product.attribute.PersistableProductAttribute;

public class PersistableProduct extends ProductEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProductDescription> descriptions;//always persist descriptions
	private List<PersistableProductAttribute> attributes;//persist attribute and save reference
	private List<PersistableImage> images;//persist images and save reference
	private List<Category> categories;//save reference
	private List<RelatedProduct> relatedProducts;//save reference
	private Manufacturer manufacturer;
	
	public List<ProductDescription> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<ProductDescription> descriptions) {
		this.descriptions = descriptions;
	}

	public List<PersistableImage> getImages() {
		return images;
	}
	public void setImages(List<PersistableImage> images) {
		this.images = images;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<RelatedProduct> getRelatedProducts() {
		return relatedProducts;
	}
	public void setRelatedProducts(List<RelatedProduct> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setAttributes(List<PersistableProductAttribute> attributes) {
		this.attributes = attributes;
	}
	public List<PersistableProductAttribute> getAttributes() {
		return attributes;
	}

}
