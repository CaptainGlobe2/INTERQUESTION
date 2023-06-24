import java.util.Scanner;

class copyThePositiveElementFromOneArrayToAnother{
    void copy1(){
        int[] b= new int[10];
        //int[] a= new int[5];
        int a[]={1,2,3,-5,5};
        int j=0;
        System.out.println("enter the element in the array and the size is 5");
        Scanner input = new Scanner(System.in);
        int length = a.length;
        System.out.println(a.length);
        int i=0;
        while(i<length){
            if(a[i]>0){
                b[j]=a[i];
            j++;
            }
            
            i++;
        }
        for(j=0;j<length;j++){
            System.out.println(b[j]);
        }
        
        }
    }

class arrSorting{
    void out(){
        int[] k={4,3,6,7,8};
        int temp=0;
        for(int i=0;i<k.length-1;i++){
            for(int j=i+1;j<k.length-1;j++){
                if(k[i]>k[j]){
                    temp=k[i];
                    k[i]=k[j];
                    k[j]=temp;


                }
                
            }
            
            }
            for(int m=0;m<k.length;m++){
                System.out.print(k[m]);
            
        }
    }
}


public class LogicProgramms{
    public static void main (String []args){
        copyThePositiveElementFromOneArrayToAnother ca=new copyThePositiveElementFromOneArrayToAnother();
        //ca.copy1();
        arrSorting as=new arrSorting();
        as.out(); 
    }
}