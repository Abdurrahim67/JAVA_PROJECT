package practice.repeat.repeat_practiceDay10;

import java.util.Scanner;

public class UzunKeliime1 {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        
        String cümle=scan.nextLine();

        System.out.println("enUzunkelime1(cümle) = " + enUzunkelime1(cümle));


        //ben bugün javayi daha cok sevdim ama cok zorlandim
    }

    public static String enUzunkelime1(String cümle) {
        
        String arr[]=cümle.split(" ");
        int max=0;
        String enUzunKelime="";
        
        for (int i = 0; i < arr.length ; i++) {
            
            if(arr[i].length()>max){
                
                max=arr[i].length();
                enUzunKelime=arr[i];
    
            }
            
        }
        
        
        
     return enUzunKelime;   
    }
    

}
