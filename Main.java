import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,Integer>materials=new LinkedHashMap<>();

        materials.put("shards",0);
        materials.put("fragments",0);
        materials.put("motes",0);

        while(true) {

            String []input=sc.nextLine().split(" ");
            boolean LegendaryObtained=false;
            for (int i = 0; i < input.length; i++) {
                int value = Integer.parseInt(input[i]);
                i++;
                String material = input[i].toLowerCase();

                if(!materials.containsKey(material)){
                    materials.put(material,value);
                }else{
                    materials.put(material,materials.get(material)+value);
                }

                if(materials.get(material)>=250 && material.equals("shards")){
                    System.out.println("Shadowmourne obtained!");
                    materials.put(material,materials.get(material.toLowerCase())-250);
                    LegendaryObtained=true;
                    break;
                }else if(materials.get(material)>=250 && material.equals("fragments")){
                    System.out.println("Valanyr obtained!");
                    materials.put(material,materials.get(material.toLowerCase())-250);
                    LegendaryObtained=true;
                    break;
                }else if(materials.get(material)>=250 && material.equals("motes")){
                    System.out.println("Dragonwrath obtained!");
                    materials.put(material,materials.get(material.toLowerCase())-250);
                    LegendaryObtained=true;
                    break;
                }


            }
            if(LegendaryObtained)
                break;
        }

        for (Map.Entry<String,Integer>entry: materials.entrySet()){

            System.out.printf("%s: %d\n",entry.getKey(),entry.getValue());

        }

    }
}