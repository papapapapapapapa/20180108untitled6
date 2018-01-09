import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int data[][] = new int[3][3];
        boolean flag = false;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                data[i][j] = scn.nextInt();
            }
        }
        if (data[0][0] == data[0][1] && data[0][1] ==data[0][2]){
            flag = true;
        }else if (data[1][0] == data[1][1] && data[1][1] ==data[1][2]){
            flag = true;
        }else if (data[2][0] == data[2][1] && data[2][1] ==data[2][2]){
            flag = true;
        }else if (data[0][0] == data[1][0] && data[1][0] ==data[2][0]){
            flag = true;
        }else if (data[0][1] == data[1][1] && data[1][1] ==data[2][1]){
            flag = true;
        }else if (data[0][2] == data[1][2] && data[1][2] ==data[2][2]){
            flag = true;
        }else if (data[0][0] == data[1][1] && data[1][1] ==data[2][2]){
            flag = true;
        }else if (data[0][2] == data[1][1] && data[1][1] ==data[2][0]){
            flag = true;
        }
        if (flag == true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
