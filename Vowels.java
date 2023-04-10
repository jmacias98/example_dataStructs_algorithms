// import java.util.Scanner;

// public class Vowels {

//     static int checkVowel (char letter){
//         letter = Character.toUpperCase(letter);
//         if (letter == 'A'|| letter=='E' || letter=='I' || letter=='O' || letter=='U'){
//             return 1;
//         }

//         else {
//             return 0;
//         }
//     }
//     static int countVowels(String word, int len){
//         if (word.strip() == ""){
//             return 0;
//         }
//         if (len==1){
//             return checkVowel(word.charAt(len-1));
//         }
//         return countVowels(word, len-1) + checkVowel(word.charAt(len-1));
//     }
//     public static void main(String[] args) throws Exception { 
//         Scanner input = new Scanner(System.in);  // Create a Scanner object

//         System.out.print("Enter a Word: ");
//         String word = input.nextLine();
//         //String word = "";
//         System.out.println(countVowels(word,word.length()));
//     }
// }
public class Vowels {

	public static int mystery(int n, int b) {
        if (n/b == 1) {
                  return 1;
              }
        else {
                  return mystery(n/b, 1) + 1;
              }
    }
  public static void main(String[] args) {
    System.out.println("Results");
    System.out.println(mystery(4,2));
  }
}
