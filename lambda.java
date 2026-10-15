import java.util.ArrayList;
public class lambda{
    public static void main(String[] args){
        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(23);
        System.out.println(numbers);
        numbers.forEach (a->{if (a==23)
            System.out.println("This number is found");
        });

    }

}
