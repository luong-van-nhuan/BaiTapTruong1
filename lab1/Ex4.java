package lab1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        int bankinh = input.nextInt();
        if(bankinh <= 0){
            System.out.println("Bán kính luôn lớn hơn 0 vui lòng nhập lại");
        }else {
            System.out.println("Chu vi hình tròn = " + (2 * Math.PI  * bankinh) );
            System.out.println("Diện tích hình tròn = " + (Math.pow(bankinh,2)) * Math.PI);
        }
    }
}
