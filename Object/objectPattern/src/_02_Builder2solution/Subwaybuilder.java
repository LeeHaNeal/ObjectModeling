package _02_Builder2solution;

public class Subwaybuilder {
	// 1.인스턴스 변수를 동일하게 넣는다.
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private  String source;

	
	
	/*
	 2. 속성의 setter메소드 구현
	 	- 반환형 : 내 겍체
	
	- 메소드를 지정 하는 방법
		1) 속성명 : setter메서드와 구분을 위해 -> size(int size)
		2) set속성명 -> setSize(int size) 
		3) with속성명 : setter메소드와 구분을 위해 'with'라는 키워드 사용 -> withSize(int size)
		*/
		
	public Subwaybuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public Subwaybuilder setBread(String bread) {
		this.bread = bread;
		return this;
	}
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
	public Subwaybuilder setSource(String source) {
		source = source;
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
