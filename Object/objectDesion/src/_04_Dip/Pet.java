package _04_Dip;

public class Pet {
	Dog dog;
	Cat cat;
	// 나중에 추가하려면 class를 변경
	Hamster ham;
	public Hamster getHam() {
		return ham;
	}
	public void setHam(Hamster ham) {
		this.ham = ham;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	
}
