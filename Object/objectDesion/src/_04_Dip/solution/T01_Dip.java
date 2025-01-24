package _04_Dip.solution;




public class T01_Dip {

	public static void main(String[] args) {
		
		Pet pet = new Pet();
		
		pet.setPetInter(new Cat());
		System.out.println(pet.getPetInter());
	
		pet.setPetInter(new Dog());
		System.out.println(pet.getPetInter());
		
		pet.setPetInter(new Hamster());
		System.out.println(pet.getPetInter());
		
		
		
		
	}

}
