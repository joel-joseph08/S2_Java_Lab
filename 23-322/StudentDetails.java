class Student
{
	int std_id;
	String std_name;
	int mark1,mark2,mark3;
	
	Student()
	{
		std_id=30;
		std_name="Joel";
		mark1=23;
		mark2=45;
		mark3=56;
	}
	Student(int roll_no,String name,int m1,int m2,int m3)
	{
		std_id=roll_no;
		std_name=name;
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	Student(int mk1,int mk2,int mk3)
	{
		std_id=55;
		std_name="Sajo";
		mark1=mk1;
		mark2=mk2;
		mark3=mk3;
	}
	void display()
	{
		int total=mark1+mark2+mark3;
		int avg=total/3;
		System.out.println("STUDENT DETAILS");
		System.out.println("ID:" + std_id);
		System.out.println("Student Name:" + std_name);
		System.out.println("Marks:" + mark1);
		System.out.println(mark2);
		System.out.println(mark3);
		System.out.println("Total Mark=" + total);
		System.out.println("Average=" + avg);
		System.out.println("\n");
	}		
}
public class StudentDetails
{
	public static void main (String args[])
	{
		Student obj1=new Student();
		obj1.display();
		
		Student obj2=new Student(2,"Justin",43,65,76);
		obj2.display();
		
		Student obj3=new Student(44,98,21);
		obj3.display();
	}
}