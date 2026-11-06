interface Parkingcharge
{
void Calculatecharge();
void ParkingDetails();
}
abstract class Vehicleparking implements Parkingcharge
{
String vno;
String vtype;
int phours;
int charge;
Vehicleparking(String vno,String vtype,int phours)
{
this.vno=vno;
this.vtype=vtype;
this.phours=phours;
}
}
class Twowheeler extends Vehicleparking 
{
Twowheeler(String vno,String vtype,int phours)
{
super(vno,vtype,phours);
}
public void Calculatecharge()
{
if(phours<=2)
{
charge=phours*20;
}
charge=(2*20)+(phours-2)*10;
}
public void ParkingDetails()
{
System.out.println("\nTwo Wheeler Details\n");
System.out.println("Vehicle number="+vno);
System.out.println("Vehicle type="+vtype);
System.out.println("Parking hours="+phours);
System.out.println("Parking charge="+charge);
}
}
class Fourwheeler extends Vehicleparking 
{
Fourwheeler(String vno,String vtype,int phours)
{
super(vno,vtype,phours);
}
 public void Calculatecharge()
{
if(phours<=2)
{
charge=phours*50;
}
charge=(2*50)+(phours-2)*30;
}
public void ParkingDetails()
{
System.out.println("\nFour Wheeler Details\n");
System.out.println("Vehicle number="+vno);
System.out.println("Vehicle type="+vtype);
System.out.println("Parking hours="+phours);
System.out.println("Parking charge="+charge);
}
}
class Demo
{
public static void main(String args[])
{
Twowheeler t=new Twowheeler("KA05AB1234","Scooter",4);
Fourwheeler f=new Fourwheeler("ka03CD5678","Car",5);

t.Calculatecharge();
t.ParkingDetails();

f.Calculatecharge();
f.ParkingDetails();
}
}




