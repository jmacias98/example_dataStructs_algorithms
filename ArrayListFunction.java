import java.util.ArrayList;
public class ArrayListFunction {
    public static void main (String[] args){

        ArrayList<Integer> elements = new ArrayList<>(); // creating a new array
        ArrayList<String> stringElements = new ArrayList<>();
        stringElements.add("Hello");
        stringElements.add("World");
        stringElements.add("Python");
        stringElements.add("Better");

        elements.add(10);
        elements.add(67);
        elements.add(90);

        int count = elements.size();
        int count2 = stringElements.size();
        System.out.println("Count: " + count2); // string list print Count: 4
        System.out.println("Count: " + count); // counts elements in array Count: 3

        for (int i = 0; i < elements.size(); i++){ // start at 0, go number of times in array, keep going
            int value = elements.get(i);
            System.out.println("Element is: " + value); // priting elements in array 
            // Element is: 10
            // Element is: 67
            // Element is: 90
        }
        for (int variable : elements){
            System.out.println(variable); // another way of print elements in array instead of for i=0; i<elements...
            // 10
            // 67
            // 90
        }
        int index = elements.indexOf(67); // 1 
        System.out.println(index); 

        elements.set(0, 666);
        for (int values : elements){
            System.out.println("New List: "+ values);
            // New List: 666
            // New List: 67
            // New List: 90
        }
        
    } 
}
