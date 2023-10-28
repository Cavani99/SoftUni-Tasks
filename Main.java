import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());
        List<Car> cars=new ArrayList<>();
        for (int i = 1; i <=number ; i++) {
            String [] input=sc.nextLine().split(" ");

            int engineSpeed= Integer.parseInt(input[1]);
            int enginePower= Integer.parseInt(input[2]);

            int cargoWeight= Integer.parseInt(input[3]);
            String cargoType=input[4];

            double tire1Press=Double.parseDouble(input[5]);
            int tir1Age=Integer.parseInt(input[6]);
            double tire2Press=Double.parseDouble(input[7]);
            int tir2Age=Integer.parseInt(input[8]);
            double tire3Press=Double.parseDouble(input[9]);
            int tir3Age=Integer.parseInt(input[10]);
            double tire4Press=Double.parseDouble(input[11]);
            int tir4Age=Integer.parseInt(input[12]);

            Car car=new Car(input[0],new Engine(engineSpeed,enginePower)
                    ,new Cargo(cargoWeight,cargoType),new Tire(tire1Press,tir1Age,tire2Press,tir2Age,tire3Press,tir3Age,tire4Press,tir4Age));

            cars.add(car);
        }

        String type=sc.nextLine();
        for (Car car:cars) {
            if(type.equals("fragile")){
                if(car.getCargo().getCargoType().equals(type)
                        && car.getTire().getTire1Pressure()<1 || car.getTire().getTire2Pressure()<1
                        || car.getTire().getTire3Pressure()<1 || car.getTire().getTire4Pressure()<1){
                    System.out.println(car.getModel());
                }
            } else if (type.equals("flamable")) {
                if(car.getCargo().getCargoType().equals(type) &&
                        car.getEngine().getEnginePower()>250){
                    System.out.println(car.getModel());
                }
            }
        }

    }
}