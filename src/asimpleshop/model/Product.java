package asimpleshop.model;

import java.util.List;

/**
 * @uml.dependency   supplier="asimpleshop.model.Image"
 * @uml.dependency   supplier="asimpleshop.model.ProductDescription"
 * @uml.dependency   supplier="asimpleshop.model.ProductLabel"
 * @uml.dependency   supplier="asimpleshop.model.Label"
 */
public class Product {
	/**
	 * @uml.property   name="productImageList"
	 */
	private List<Image> productImageList;
	/**
	 * @uml.property   name="name"
	 */
	private String name = "";
	/**
	 * @uml.property   name="price"
	 */
	private Float price = 0F;
	/**
	 * @uml.property   name="promotion"
	 */
	private Float promotion = 0F;
	/**
	 * @uml.property   name="priceCurrency"
	 */
	private String priceCurrency = ""; // such as CAD
	/**
	 * @uml.property   name="promotionUnit"
	 */
	private String promotionUnit = "";// such as percent

	public List<Image> getProductImageList() {
		return productImageList;
	}

	public void setProductImageList(List<Image> productImageList) {
		this.productImageList = productImageList;
	}

	/**
	 * @return
	 * @uml.property name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @uml.property name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 * @uml.property name="price"
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price
	 * @uml.property name="price"
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return
	 * @uml.property name="promotion"
	 */
	public Float getPromotion() {
		return promotion;
	}

	/**
	 * @param promotion
	 * @uml.property name="promotion"
	 */
	public void setPromotion(Float promotion) {
		this.promotion = promotion;
	}

	/**
	 * @return
	 * @uml.property name="priceCurrency"
	 */
	public String getPriceCurrency() {
		return priceCurrency;
	}

	/**
	 * @param priceCurrency
	 * @uml.property name="priceCurrency"
	 */
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	/**
	 * @return
	 * @uml.property name="promotionUnit"
	 */
	public String getPromotionUnit() {
		return promotionUnit;
	}

	/**
	 * @param promotionUnit
	 * @uml.property name="promotionUnit"
	 */
	public void setPromotionUnit(String promotionUnit) {
		this.promotionUnit = promotionUnit;
	}

	/**
	 * @uml.property   name="product_pk"
	 */
	private String product_pk;

	/**
	 * Getter of the property <tt>product_pk</tt>
	 * 
	 * @return Returns the product_pk.
	 * @uml.property name="product_pk"
	 */
	public String getProduct_pk() {
		return product_pk;
	}

	/**
	 * Setter of the property <tt>product_pk</tt>
	 * 
	 * @param product_pk
	 *            The product_pk to set.
	 * @uml.property name="product_pk"
	 */
	public void setProduct_pk(String product_pk) {
		this.product_pk = product_pk;
	}

	/**
	 * @uml.property   name="prodcuDescription"
	 */
	private ProductDescription prodcuDescription;

	/**
	 * Getter of the property <tt>prodcuDescription</tt>
	 * 
	 * @return Returns the prodcuDescription.
	 * @uml.property name="prodcuDescription"
	 */
	public ProductDescription getProdcuDescription() {
		return prodcuDescription;
	}

	/**
	 * Setter of the property <tt>prodcuDescription</tt>
	 * 
	 * @param prodcuDescription
	 *            The prodcuDescription to set.
	 * @uml.property name="prodcuDescription"
	 */
	public void setProdcuDescription(ProductDescription prodcuDescription) {
		this.prodcuDescription = prodcuDescription;
	}

	/**
	 * @uml.property  name="productLableList"
	 */
	private String productLableList;

	/**
	 * Getter of the property <tt>productLableList</tt>
	 * @return  Returns the productLableList.
	 * @uml.property  name="productLableList"
	 */
	public String getProductLableList() {
		return productLableList;
	}

	/**
	 * Setter of the property <tt>productLableList</tt>
	 * @param productLableList  The productLableList to set.
	 * @uml.property  name="productLableList"
	 */
	public void setProductLableList(String productLableList) {
		this.productLableList = productLableList;
	}

}
