package _02_Builder2solution2;

public class T01_Subwaybuilder {

	public static void main(String[] args) {
		Subway menu1 = new Subwaybuilder(15,"통밀","머스터드").setCheese("모짜렐라").Build();
		System.out.println(menu1);
		
		Subway menu2 = new Subwaybuilder(14,"밀","핫소스").setVagetable(true).setExtraTopping("김치").Build();
		System.out.println(menu2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
