import java.util.*;

public class Problem1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");
        for(int i=0; i<5; i++){
            int integer = input.nextInt();
            list.add(integer);
        }
        for(int i=0; i<5; i++){
            double doub = input.nextDouble();
            list.add(doub);
        }

        sort(list);


        for(int i=0; i<10; i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        for(int i=0; i<10; i++){
            double min = list.get(i).doubleValue();
            int index=i;
            for(int j=i+1; j<10; j++){
                if(min>list.get(j).doubleValue()){
                    index=j;
                    min=list.get(j).doubleValue();
                }
            }
            Collections.swap(list, i, index);
        }
        
    }
}
