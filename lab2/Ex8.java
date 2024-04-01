package lab2;

import java.util.Random;

public class Ex8{
    private static final String[] CAN = { "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quý" };
    private static final String[] CHI = { "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi" };

    public static String convertToLunarYear(int year) {
        int canIndex = (year - 4) % 10;
        int chiIndex = (year - 4) % 12;

        return CAN[canIndex] + " " + CHI[chiIndex];
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int year=rd.nextInt(10000)+1;
        String lunarYear = convertToLunarYear(year);
        System.out.println("Năm " + year + " là năm " + lunarYear);
    }
	public static Object calculateSum(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
