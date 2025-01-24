package _02_Builder2solution2;

public class Subwaybuilder {
	
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private  String source;
	
	// 반드시 넣어야 되는 것들은 생성자로 만든다.
	public Subwaybuilder(int size , String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}
	
	// 생성자에 넣지 않은 필드들은 setter메서드 이용
	public Subwaybuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public Subwaybuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}
	public Subwaybuilder setVagetable(boolean vagetable) {
		vagetable = vagetable;
		return this;
	}
	
	
	// 3. Subway객체를 생성하여 리턴 : Subway생성자 호출로
	public Subway Build() {
		return new Subway( size, bread, cheese, extraTopping, vagetable ,source);
	}
	
	@Override
	public String toString() {
		return "Subwaybuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vagetable=" + vagetable + ", source=" + source + "]";
	}
	
	
	
	
	
}
