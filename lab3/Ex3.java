package lab3;

public class Ex3 {
	public static int calculateAge(int ageDad, int ageChild) {
		int years = 0;
		ageDad = 35;
		ageChild = 4;
		do {
			ageDad++;
			ageChild++;
			years++;
		} while (ageDad != 2 * ageChild);
		return years;
	}

	public static void main(String[] args) {
		System.out.println("Sau " + calculateAge(35, 4) + " năm tuổi cha bằng 2 lần tuổi con");
	}

}
