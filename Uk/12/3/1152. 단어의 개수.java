import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int cnt=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i].isBlank() == false){
                cnt++;
            }
        }
        System.out.println(cnt);            
        sc.close();
    }
}
