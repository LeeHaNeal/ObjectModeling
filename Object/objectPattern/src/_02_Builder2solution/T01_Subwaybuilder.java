package _02_Builder2solution;

public class T01_Subwaybuilder {

	public static void main(String[] args) {
		Subway menu1 = new Subwaybuilder().setBread("통밀").setCheese("모짜렐라").setSize(13).Build();
		System.out.println(menu1);
		
		Subway menu2 = new Subwaybuilder().setBread("통밀").setSize(14).setVagetable(true).setExtraTopping("김치").Build();
		System.out.println(menu2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
