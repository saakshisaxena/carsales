//Aurthor: Saakshi
//Program to make a car sale thing using records and accessor methods
import java.util.*;

//Class car as a record
class Car
{
	String name;
	boolean electric;
}

class carsales
{
	//main method
	public static void main (String[] p)
	{
		Car car1 = new Car();
		car1.name="Triumph";
		car1.electric= false;

		Car car2= new Car();
		car2.name="Mini E";
		car2.electric=true;

		Car car3= new Car();
		car3.name="Focus";
		car3.electric= false;
//Can use an initialization method .....put elec and name as arguments and return it to the respective car!!!!
		Car cars[]={car1, car2, car3};

		check(cars);
		return;
	}

	//Method to  check the user input with the records
	public static void check(Car cars[])
	{
		String ans=input("What car do you need to know about?");
		for(int i=0; i<cars.length; i++)
		{
			if(ans.equalsIgnoreCase(getname(cars[i])))
			{
				if(getelec(cars[i]))
				{
				print("The "+getname(cars[i])+" is electric.");
				}
				else
				{
				print("The "+getname(cars[i])+" is NOT electric");
				}
			System.exit(0);
			}//end of if 1
		
		}//end of for
		print("I do not know that make");
		return;
	}

	//Method to getname
	public static String getname(Car car)
	{
		return car.name;
	}

	//Method to get electricity of the car
	public static boolean getelec(Car car)
	{
		return car.electric;
	}

	//Method to accept data
	public static String input(String m)
	{
		Scanner scanner= new Scanner(System.in);
		print(m);
		return scanner.nextLine();
	}

	//Mehtod to print
	public static void print(String s)
	{
		System.out.println(s);
		return;
	}
}//end of class carsales

