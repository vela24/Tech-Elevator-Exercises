package Vehicle;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TollCalculatorApp {

	public static void main(String[] args) {
		
		List<VehicleInterface> transport = new ArrayList<VehicleInterface>(); // made a list and added vehicle elements to that list.
		
		Car car = new Car(0 , true);   //random miles 10 - 240 , whether has trailer or not.
		Tank tank = new Tank(0);
		Truck truck = new Truck(0 , 6);
		
		transport.add(car);
		transport.add(tank);
		transport.add(truck);
		
		
		String vehicle = "Vehicle";
		String distanceTraveled = "Distance Traveled";
		String tollAmount = " Toll";
		
		System.out.println(String.format("%-29s  %-15s %-10s" , vehicle , "$" + tollAmount , distanceTraveled ));
		System.out.println("----------------------------------------------------------------");
		
		double totalMiles = 0;
		double totalRevenue = 0.00d;
		for (VehicleInterface ride : transport) {
			totalMiles += ride.getDistance();
			totalRevenue += ride.calculateToll();
			System.out.printf("%-30s %s%-14.2f %-20.2f %n", ride.getVehicleType(),  "$",ride.calculateToll(), ride.getDistance());
			
		}
		DecimalFormat text = new DecimalFormat("0.##");
		System.out.println("");
		System.out.println("Total Miles Traveled: " + text.format(totalMiles) + " mi");
		System.out.println("Total Revenue: $" + text.format(totalRevenue));

	}

}