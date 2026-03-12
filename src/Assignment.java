public class Assignment {
    static void main(String[] args) {

        int a=45;
        int b=39;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int c=8;

        if(c%2==0){
            System.out.println("Even no. : " +c);
        }else {
            System.out.println("Odd no. : " +c);
        }

        int d=102;
        int e=188;

        if(d>e){
            System.out.println("d is greater number: " +d);
        }else {
            System.out.println("e is greater number: " +e);
        }

        int f=5;

        if(f>0){
            System.out.println(f+ " is positive no.");
        } else if(f<0) {
            System.out.println(f+ " is negative");
        }else {
            System.out.println("This no. is zero: " +f);
        }

        int g=7;
        int h=8;
        int i=9;

        if(g>h && g>i){
            System.out.println("g is largest number: "+g);
        }else if(h>g && h>i){
            System.out.println("h is largest number: "+h);
        }else if(i>g && i>h){
            System.out.println("i is largest number: "+i);
        }

        int j=16;

        if(j%3==0 && j%5==0){
            System.out.println("This number is divisible by 3 and 5: " +j);
        }else {
            System.out.println("This number is not divisible by 3 and 5: " +j);
        }

        int age=18;

        if(age>=18){
            System.out.println("Eligible for Vote");
        }else {
            System.out.println("Not eligible for Vote");
        }

        int k=10;

        if(k>10 && k<50){
            System.out.println("The number is in the range of 10 and 50 : " +k);
        }else{
            System.out.println("The number is not in the range of 10 and 50 : " +k);
        }

        char ch='e';

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Character is Vowel: " +ch);
        }else{
            System.out.println("Character is Consonant: " +ch);
        }

        int l=5;

        System.out.println(++l);

        int m=5;
        System.out.println(--m);

        int n=199;

        if(n>100){
            System.out.println("Greater than 100 : " +n);
        }else {
            System.out.println("Less than 100 : " +n);
        }

        int marks=57;
        char grade;

        if(marks>=90){
            grade='A';
        }else if(marks>=80){
            grade='B';
        }else if(marks>=70){
            grade='C';
        }else if(marks>=60){
            grade='D';
        }else{
            grade='F';
        }

        System.out.println("Student marks: " +marks);
        System.out.println("Student grade: " +grade);

        int year=2028;

        if(year%4==0){
            System.out.println("This is leap year: " +year);
        }else {
            System.out.println("This is not leap year: " +year);
        }


        int x=16;
        int z=15;

        String result=x<z? x+" is minimum":z+" is minimum";

        System.out.println(result);


        int o=5;
        int p=10;
//        int s=0;

//        s=o;
//        o=p;
//        p=s;
//        o=(o+p)-(p=o);

//        o=o^p;
//        p=o^p;
//        o=o^p;

        o=o+p;
        p=o-p;
        o=o-p;


        System.out.println("o is "+o+" p is "+p);




    }
}
