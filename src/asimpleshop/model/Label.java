package asimpleshop.model;


/**
 * @uml.dependency   supplier="asimpleshop.model.ProductLabel"
 */
public class Label {

	/**
	 * @uml.property  name="label_pk"
	 */
	private String label_pk;

	/**
	 * Getter of the property <tt>label_pk</tt>
	 * @return  Returns the label_pk.
	 * @uml.property  name="label_pk"
	 */
	public String getLabel_pk() {
		return label_pk;
	}

	/**
	 * Setter of the property <tt>label_pk</tt>
	 * @param label_pk  The label_pk to set.
	 * @uml.property  name="label_pk"
	 */
	public void setLabel_pk(String label_pk) {
		this.label_pk = label_pk;
	}

	/**
	 * @uml.property  name="label"
	 */
	private String label;

	/**
	 * Getter of the property <tt>label</tt>
	 * @return  Returns the label.
	 * @uml.property  name="label"
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Setter of the property <tt>label</tt>
	 * @param label  The label to set.
	 * @uml.property  name="label"
	 */
	public void setLabel(String label) {
		this.label = label;
	}

}
