interface Parkingcharge
{
void Caclulatecharge();
void ParkingDetails();
}
class Vehicleparking
{
int vno;
String vtype;
int phours;
int charge;
Vehicleparking(int vno,String vtype,int phours)
{
this.vno=vno;
this.vtype=vtype;
this.phours=phours;
}
}
class Twowheeler extends Vehicleparking implements Parkingcharge
{
Twowheeler(int vno,String vtype,int phours)
{
super(vno,vtype,phours);
}
public void Calculatecharge()
{
if(phours==2)
{
charge=phours*20;
}
charge+=10*phours;
}
public void ParkingDetails()
{
System.out.println("Vehicle number="+vno);
System.out.println("Vehicle type="+vtype);
System.out.println("Parking hours="+phours);
System.out.println("Parking charge="+charge);
}
}
class Fourwheeler extends Vehicleparking implements Parkingcharge
{
Fourwheeler(int vno,String vtype,int phours)
{
super(vno,vtype,phours);
}
 public void Calculatecharge()
{
if(phours==2)
{
charge=phours*50;
}
charge+=30*phours;
}
public void ParkingDetails()
{
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
Twowheeler t=new Twowheeler(123,"Scooter",2);
Fourwheeler f=new Fourwheeler(125,"Car",5);

t.Calculatecharge();
t.ParkingDetails();

f.Calculatecharge();
f.ParkingDetails();
}
}




