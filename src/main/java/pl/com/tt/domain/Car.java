package pl.com.tt.domain;

public class Car {

	private String brand;
	
	private String model;
	
	private long productionYear;

	
	public Car() {
		
	}
	
	public Car(String brand, String model, long productionYear) {
		super();
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(long productionYear) {
		this.productionYear = productionYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ (int) (productionYear ^ (productionYear >>> 32));
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (productionYear != other.productionYear)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", productionYear="
				+ productionYear + "]";
	}
	
}
