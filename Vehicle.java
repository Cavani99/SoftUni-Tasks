import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Vehicle(String type,String model,String color,int power){
        this.type=type;
        this.model=model;
        this.color=color;
        this.horsePower=power;
    }

    private String type;
    private String model;
    private String color;
    private int horsePower;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Vehicle> vehicleList=new ArrayList<>();

        String [] vehicle=sc.nextLine().split(" ");

        double sumTruck=0;
        int trucks=0;
        double sumCar=0;
        int cars=0;
        while(!vehicle[0].equals("End")){
            Vehicle vehicle1=new Vehicle(vehicle[0],vehicle[1],vehicle[2],Integer.parseInt(vehicle[3]));


            vehicleList.add(vehicle1);

            if(vehicle1.getType().equals("car")){
                cars++;
                sumCar+=vehicle1.getHorsePower();
            }else {
                trucks++;
                sumTruck+=vehicle1.getHorsePower();
            }


            vehicle=sc.nextLine().split(" ");
        }

        String model=sc.nextLine();
        while(!model.equals("Close the Catalogue")){
            for (Vehicle v:vehicleList) {
                if(v.getModel().equals(model)){
                    if(v.getType().equals("car"))
                     System.out.println("Type: Car");
                    else
                        System.out.println("Type: Truck");

                    System.out.printf("Model: %s\n",v.getModel());
                    System.out.printf("Color: %s\n",v.getColor());
                    System.out.printf("Horsepower: %d\n",v.getHorsePower());

                    break;
                }
            }

            model=sc.nextLine();
        }

        if(cars>0)
         System.out.printf("Cars have average horsepower of: %.2f.\n",sumCar/cars);
        else
            System.out.printf("Cars have average horsepower of: %.2f.\n",0.00);

        if(trucks>0)
            System.out.printf("Trucks have average horsepower of: %.2f.",sumTruck/trucks);
        else
            System.out.printf("Trucks have average horsepower of: %.2f.",0.00);

    }

}
