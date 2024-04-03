//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.
abstract class Marks{
    public abstract int getpercentage();
}
class A extends Marks{
    private float sub1,sub2,sub3,sub4;
    public A(float s1,float s2,float s3,float s4)
{
    this.sub1=s1;
    this.sub2=s2;
    this.sub3=s3;
    this.sub4=s4;
}
@Override
public int getpercentage(){
    return (int) ((sub1+sub2+sub3)/300*100);
}
    
}
class B extends Marks{
    private float sub1,sub2,sub3,sub4;
    public B(float s1,float s2,float s3,float s4)
{
    this.sub1=s1;
    this.sub2=s2;
    this.sub3=s3;
    this.sub4=s4;
}
@Override
public int getpercentage(){
    return (int) ((sub1+sub2+sub3+sub4)/400*100);
}
    
}

public class question9 {
public static void main(String[] args) {
    A studentA=new A(80,90,70,90);
    B studentB=new B(90,80,90,80);
    System.out.println("persentage of studentA is :" + studentA.getpercentage() + "%");
    System.out.println("percentage of studentB is: " + studentB.getpercentage() + "%");

}
    
}
