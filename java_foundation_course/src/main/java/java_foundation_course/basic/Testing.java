package java_foundation_course.basic;

public class Testing {
	public static void main(String[] args) {
       System.out.println("Amit Kumar Sahay");
       
       int x=2,y=3,z=2;
       
       System.out.println(x == y);//false
       System.out.println(x == z);//true
       System.out.println(x !=y);//true
       
       String s1="Amit";
       String s2="Amit";
       String s3=new String("Amit");
       System.out.println("-----------------------------------");
       System.out.println(s1 == s2); //true
       System.out.println(s1 == s3); //false
       System.out.println(s1.equals(s3)); //true
       System.out.println("---------------------------------------");
       System.out.println((10 > 5) || (10 > 20)); //true    ||  Or operator
       System.out.println(10 >5 && 10 > 20); //false    &&  And operator
       System.out.println( !(10>5));//false
	}
}
/*
    ==   -> it checks reference. if both reference pointing to same object then true
    .equals(stringOBJ)   -> this method checks content of the String
*/