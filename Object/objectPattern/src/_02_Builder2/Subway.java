package _02_Builder2;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean Vagetable;
	private  String Source;
	public void setSize(int size) {
		this.size = size;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
	}
	public void setVagetable(boolean vagetable) {
		Vagetable = vagetable;
	}
	public void setSource(String source) {
		Source = source;
	}
	
	public Subway() {
		
	}
	
	public Subway(int size) {
	this.size = size;
	}
	
	public Subway(int size, String bread) {
		this.size = size;
		this.bread = bread;
		
	}
	public Subway(int size, String bread, String cheese) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		
	}
	
	public Subway(int size, String bread, String cheese, String extraTopping) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		
	}
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vagetable) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		Vagetable = vagetable;
		
	}
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vagetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		Vagetable = vagetable;
		Source = source;
	}
	
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping=" + extraTopping
				+ ", Vagetable=" + Vagetable + ", Source=" + Source + "]";
	}
	
	
	
	
}
