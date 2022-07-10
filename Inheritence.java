// import java.io.*;
//import java.util.*;


class Bicycle
{
	 int gear;
	 int speed;
	 int cadence;


	Bicycle(int cadence, int speed, int gear)
	{
		this.cadence = cadence;
		this.gear = gear;
		this. speed = speed;
	}

	public void applyBreak(int decrement)
	{
		speed -= decrement;
	}

	public void speedUp(int increment)
	{
		speed += increment;
	}

	public void printDescription()
	{
		System.out.println("\nBike is "+ "in gear" + this.gear + 
			"with a cadence of"+ this.cadence +
		 " and travelling at a speed of" + this.speed+".");
	}
}

class MountainBike extends Bicycle
{
	private String suspension;

	public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType)
	{
		super(startCadence,startSpeed,startGear);

		this.setSuspension(suspensionType);
	}

	public String getSuspension()
	{
		return suspension;
	}

	public void setSuspension(String suspensionType)
	{
		this.suspension = suspensionType;
	}

	public void printDescription()
	{
		super.printDescription();
		System.out.println("The" + "MountainBike has a" + getSuspension() + " suspension.");
	}
}

class RoadBike extends Bicycle
{
	private int tireWidth;

	public RoadBike(int startCadence, int startSpeed, int startGear, int tireWidth)
	{
		super(startCadence,startSpeed,startGear);

		this.tireWidth = tireWidth;
	}

	public int getTireWidth()
	{
		return tireWidth;
	}

	public void setTireWidth(int newtireWidth)
	{
		this.tireWidth = newtireWidth;
	}

	public void printDescription()
	{
		super.printDescription();
		System.out.println("The RoadBike has" + getTireWidth() + " MM tires.");
	}
}
public class Inheritence {

   
    public static void main (String[] args) {
       Bicycle bike01, bike02, bike03;

       bike01 = new Bicycle(20, 10, 1);
       bike02 = new MountainBike(20, 10, 5, "Dual");
       bike03 = new RoadBike(40, 20, 8, 23);

       bike01.printDescription();
       bike02.printDescription();
       bike03.printDescription();



    }
}