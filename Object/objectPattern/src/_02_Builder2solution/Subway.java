package _02_Builder2solution;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean Vagetable;
	private  String Source;
	
	public Subway() { }
	
	
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vagetable, String source) {
		super();
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
