import java.util.Scanner;

class copyThePositiveElementFromOneArrayToAnother{
    void copy1(){
    //     int[] b= new int[10];
    //     //int[] a= new int[5];
    //     int a[]={1,2,3,-5,5};
    //     int j=0;
    //     System.out.println("enter the element in the array and the size is 5");
    //     Scanner input = new Scanner(System.in);
    //     int length = a.length;
    //     System.out.println(a.length);
    //     int i=0;
    //     while(i<length){
    //         if(a[i]>0){
    //             b[j]=a[i];
    //         j++;
    //         }
            
    //         i++;
    //     }
    //     for(j=0;j<length;j++){
    //         System.out.println(b[j]);
    //     }
        
    //     }
    // }
    int[] a={2,3,4,5,-2,1
    };
    int[] b=new int[a.length];
    int i,j=0;
    for(i=0;i<a.length;i++){
        if(a[i]>0){
            b[j]=a[i];
            j++;
        }
        
    }
    for(j=0;j<a.length;j++){
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

class leapYear{
    void  leapYearCheck(){
        int n;
        System.out.println("enter the year: ");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    // return true; void method cannot return anything 
                    System.out.println("it is leap year");
                }
                else{
                    System.out.println("it is not a leap year");
                }
            }
            else{
                System.out.println("it is leap year");//if the year is not 
            }
        }
        else{
            System.out.println("it is not leap year");
        }
    }
}

    class findTheSumOfTheDigits{
        int sumOfDigits(int n){
            int sum=0;
            while(n>0){
            sum=sum+n%10;
            n=n/10;
            //you don't evrey time to increment the value it check the condition and run the code until the codition is true
            //this is the place where we use the while loop and where to use the for and while loop is a concern for newbie The for loop is typically used when you know the number of iterations in advance or when you need to iterate over a range of values. It consists of three parts: initialization, condition, and iteration.
            }

            
            //System.out.println(sum);
            return sum;
    }
}

class reverseNumber{
     void revNum(){
        int number;
        int revnumber=0;
        System.out.println("enter the number i will reverse it: ");
        Scanner input =new Scanner(System.in);
        number=input.nextInt();
        while(number>0){
            revnumber=(revnumber*10)+number%10;
            number=number/10;
        }
        System.out.println(revnumber);

     }
}

class encap{
    private String name;
    private int age;
    private String gender;
        // Getter for 'name'
    public String getName() {
        return name;
    }
    
    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for 'age'
    public int getAge() {
        return age;
    }
    
    // Setter for 'age'
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter for 'gender'
    public String getGender() {
        return gender;
    }
    
    // Setter for 'gender'
    public void setGender(String gender) {
        this.gender = gender;
    }
    void display(){
        System.out.println("name:"+name+"age: "+age+"gender: "+gender);
    }
}

class factorofnum{//Factors can be used to distribute chocolates among children. For example, if you have 12 chocolates and 4 children, you can distribute the chocolates evenly by giving each child 3 chocolates. In this case, the factors of 12 are 1, 2, 3, 4, 6 and 12. You can use these factors to divide the chocolates evenly among the children.
    void factor(int num){
        for(int i=1;i<num;i++){
            if(num%i==0)
                System.out.print(i);
        }
    }
}
class prime{
    void findPrime(int n){
        int i,f=0;
        for(i=2;i<n;i++){
            if(n%i==0){
                f=1;
            }
        }
        if(f==1){
            System.out.println("not a prime");
        }
        else{
            System.out.println(" a prime");
        }
    }
}

class pattern{
    static void basicpattern1(){
        System.out.println("enter the number to print in right angle");
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
    static void basicpatternrev2(){
        System.out.println("enter the number to print in right angle");
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    static void basicpattern2(){
        System.out.println("enter the number to print in right angle");
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    static void basicpattern3(){
        System.out.println("enter the number to print in right angle");
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    static void basicpattern4(){
        System.out.println("enter the number to print in right angle");
        Scanner input = new Scanner(System.in);
        int n;
        int num=1;
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println(" ");
        }
    }
    static void diamondpattern(){
        System.out.println("enter the odd number for printing the diamod");
        Scanner input =new Scanner(System.in);
        int row;
        row =input.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row-1;i>=1;i--){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void basicpattern5(){
        int r=4;
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void basicpattern6(){
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void basicpattern7(){
        int r=5;
        for(int i=r;i>=1;i--){
            for(int j=r;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void basicpattern8(){
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=r;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void basicpattern9(){
        int r=5;
        for(int i=r;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void basicpatternx(){
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(i==j||i+j==r+1){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




public class LogicProgramms{
    public static void main (String []args){
        //copyThePositiveElementFromOneArrayToAnother ca=new copyThePositiveElementFromOneArrayToAnother();
        //ca.copy1();
       // arrSorting as=new arrSorting();
       // as.out(); 
        //leapYear lc=new leapYear();
        //lc.leapYearCheck();
        //int result;
        //findTheSumOfTheDigits sod = new findTheSumOfTheDigits();
        //result=sod.sumOfDigits(1234);
        //System.out.println("sum of the digits is :"+result);
        //reverseNumber rn=new reverseNumber();
        //rn.revNum();
        //encap eca=new encap();
        //eca.setAge(20);
        //eca.setGender("male");
        //eca.setName("nobody");
        //eca.display();
        //factorofnum fc=new factorofnum();
        //fc.factor(12);
        //prime p=new prime();
        //p.findPrime(1051);
        //pattern.basicpattern1();
        //pattern.basicpatternrev2();
        //pattern.basicpattern2();
        //pattern.basicpattern3();
        //pattern.basicpattern4();
        //pattern.diamondpattern();
        //pattern.basicpattern5();
        //pattern.basicpattern6();
        //pattern.basicpattern8();
        //pattern.basicpattern9();
        pattern.basicpatternx();

    }
}
