// This program creates a linked list and 100 random integers from
// 1 to 1000. Those integers are inserted in list and are sorted.
// Additional Calculations are made and displayed on GUI window. 
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<String> array = new ArrayList<String>();
        Random random = new Random();

        int avg, min = 1;
        int max = 1001;

        for(int i=0;i<100;i++ ){
            linkedList.add(random.nextInt(min,max));
        }
        System.out.println("Linked List of 100 Random Integers: ");
        System.out.print(linkedList);

        Collections.sort(linkedList);
        System.out.println("\n\nSorted Linked List: ");
        System.out.print(linkedList);

        double sum = 0;
        for(int i = 0; i < linkedList.size(); i++){
            sum += linkedList.get(i);
        }
        System.out.println("\n\nSum of Linked List: " + sum);

        avg = (int) (sum / linkedList.size());
        System.out.println("Average of Linked List: " + avg);

        double m = 0;
        if (linkedList.size() % 2 == 1)
            m = linkedList.get((linkedList.size() + 1) / 2 - 1);
        else {
            double lower = linkedList.get(linkedList.size() / 2 - 1);
            double upper = linkedList.get(linkedList.size() / 2);

            m = (lower + upper) / 2.0;
        }
        System.out.println("Median of Linked List: "+m);
        System.out.println("Max Value in Linked List: " + Collections.max(linkedList));   
        System.out.println("Min Value in Linked List: " + Collections.min(linkedList)); 

        JFrame frame = new JFrame();
        JList contactsView = new JList(linkedList.toArray());
        frame.add(contactsView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sorted Linked List");   
        frame.setSize(350,300);
        frame.setLocationRelativeTo(null);
        frame.add(new JScrollPane(contactsView));
        frame.setVisible(true);

        String median1 = ("Median of Linked List: "+m);
        String max1 = ("Max Value in Linked List: " + Collections.max(linkedList));   
        String min1 = ("Min Value in Linked List: " + Collections.min(linkedList)); 
        String avg1 = ("Average of Linked List: " + avg);
        String sum1 = ("Sum of Linked List: " + sum);

        array.add(median1);
        array.add(max1);
        array.add(min1);
        array.add(avg1);
        array.add(sum1);
        JList calculationsList = new JList(array.toArray());

        JFrame frame2 = new JFrame();
        frame2.add(calculationsList);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setTitle("List Calculations");   
        frame2.setSize(400,230);
        frame2.setLocationRelativeTo(null);
        frame2.add(new JScrollPane(calculationsList));
        frame2.setVisible(true);
    }
    
}
// OUTPUT:
// Linked List of 100 Random Integers: 
// [561, 123, 43, 183, 337, 174, 422, 557, 494, 54, 358, 605, 205, 720, 997, 185, 236, 999, 429, 949, 126, 184, 186, 582, 683, 604, 746, 855, 268, 371, 145, 562, 483, 330, 913, 904, 632, 864, 631, 693, 985, 411, 649, 123, 993, 346, 267, 689, 321, 446, 592, 135, 677, 170, 318, 649, 205, 644, 210, 270, 99, 79, 683, 659, 612, 918, 19, 145, 751, 487, 127, 120, 475, 554, 495, 446, 710, 805, 505, 809, 639, 373, 64, 980, 325, 371, 354, 345, 185, 616, 200, 339, 581, 655, 614, 879, 856, 77, 946, 55]

// Sorted Linked List:
// [19, 43, 54, 55, 64, 77, 79, 99, 120, 123, 123, 126, 127, 135, 145, 145, 170, 174, 183, 184, 185, 185, 186, 200, 205, 205, 210, 236, 267, 268, 270, 318, 321, 325, 330, 337, 339, 345, 346, 354, 358, 371, 371, 373, 411, 422, 429, 446, 446, 475, 483, 487, 494, 495, 505, 554, 557, 561, 562, 581, 582, 592, 604, 605, 612, 614, 616, 631, 632, 639, 644, 649, 649, 655, 659, 677, 683, 683, 689, 693, 710, 720, 746, 751, 805, 809, 855, 856, 864, 879, 904, 913, 918, 946, 949, 980, 985, 993, 997, 999]

// Sum of Linked List: 47445.0
// Average of Linked List: 474
// Median of Linked List: 479.0
// Max Value in Linked List: 999
// Min Value in Linked List: 19
