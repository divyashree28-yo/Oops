abstract class Student
{
int usn;
String name;
Student(int usn, String name)
{
this.usn=usn;
this.name=name;
}
abstract void writeExam();
}
class EngineeringStudent extends Student
{
EngineeringStudent(int usn, String name)
{
super(usn,name);
}
void writeExam()
{
System.out.println("Engineering student details:");
System.out.println("Name="+name);
System.out.println("USN="+usn);
}
}
class MedicalStudent extends Student
{
MedicalStudent(int usn, String name)
{
super(usn,name);
}
void writeExam()
{
System.out.println("Medical student details:");
System.out.println("Name="+name);
System.out.println("USN="+usn);
}
}
class Demo
{
public static void main(String args[])
{
EngineeringStudent e=new EngineeringStudent(102,"Disha");
MedicalStudent m=new MedicalStudent(108,"Diya");
e.writeExam();
m.writeExam();
}
}


