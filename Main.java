import java.util.Scanner;

public class Main {
    public static void KaminoFactory() {
        Scanner sc = new Scanner(System.in);

        int sequences=Integer.parseInt(sc.nextLine());
        String []sample=sc.nextLine().split("!+");


        int startIndex=-1;
        int bestSum=0;
        int sampleIndex=0;
        int bestIndex=0;
        int bestTotal=0;
        int bestStart=sample.length;
        String [] best = new String[0];
        while(!sample[0].equals("Clone them")){
            int sum=0;
            int totalSum=0;
            int sequenceSum=0;
            sampleIndex++;

            for(int i=0;i<sample.length;i++){
                String ch=sample[i];
                if(ch.equals("1")){
                    if(sum==0 && sequenceSum==0)
                        startIndex=i;
                    sum++;
                    totalSum++;
                    if(sum>sequenceSum && sequenceSum!=0)
                        startIndex=i-sum+1;
                }
                else{
                    if(sum>0){
                        if(sum>sequenceSum)
                            sequenceSum=sum;
                    }

                    sum=0;
                }

            }

            if(sequenceSum>bestSum ||
                    sequenceSum==bestSum && startIndex<bestStart ||
                    totalSum>bestTotal
            ) {
                bestTotal=totalSum;
                bestSum=sequenceSum;
                bestStart=startIndex;
                bestIndex=sampleIndex;
                best=sample;
            }

            sample=sc.nextLine().split("!+");
        }


        System.out.printf("Best DNA sample %d with sum: %d.\n",bestIndex,bestTotal);
        for (String s : best) {
            System.out.print(s + " ");
        }


    }



    public static void main(String[] args) {
        KaminoFactory();
    }
}