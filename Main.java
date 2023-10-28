import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get engines
        int numberEngines=Integer.parseInt(sc.nextLine());
        List <Engine> engines=new ArrayList<>();
        for (int i = 1; i <=numberEngines ; i++) {
            String [] info=sc.nextLine().split(" ");

            Engine engine=new Engine(info[0],Integer.parseInt(info[1]));

            engine.setDisplacement(-1);
            engine.setEfficiency("n/a");
            for (int j = 2; j < info.length ; j++) {
                try {
                    engine.setDisplacement(Integer.parseInt(info[j]));
                }catch (NumberFormatException e){
                    engine.setEfficiency(info[j]);
                }

            }
            engines.add(engine);
        }

        //get cars
        int numberCars=Integer.parseInt(sc.nextLine());
        List <Car> cars=new ArrayList<>();
        for (int i = 1; i <=numberCars ; i++) {
            String [] info=sc.nextLine().split(" ");

            Engine engine = null;
            for (int j = 0; j < engines.size(); j++) {
                if(info[1].equals(engines.get(j).getModel())){
                    engine=engines.get(j);
                    break;
                }
            }
            Car car=new Car(info[0],engine);

            car.setWeight(-1);
            car.setColor("n/a");
            for (int k = 2; k < info.length ; k++) {
                try {
                    car.setWeight(Integer.parseInt(info[k]));
                }catch (NumberFormatException e){
                    car.setColor(info[k]);
                }

            }
            cars.add(car);
        }

        //print cars
        for (Car car:cars) {
            System.out.println(car.getModel()+":");

            System.out.println("  "+car.getEngine().getModel()+":");
            System.out.printf("    Power: %d\n",car.getEngine().getEnginePower());

            if(car.getEngine().getDisplacement()==-1)
                System.out.println("    Displacement: n/a");
            else
                System.out.printf("    Displacement: %d\n",car.getEngine().getDisplacement());

            System.out.printf("    Efficiency: %s\n",car.getEngine().getEfficiency());

            if(car.getWeight()==-1)
                System.out.println("  Weight: n/a");
            else
                System.out.printf("  Weight: %d\n",car.getWeight());

            System.out.printf("  Color: %s\n",car.getColor());
        }

    }
}