public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while (counter <= 20){
		if (counter % 2 == 1){
			System.out.println(counter + " is odd.");
		}else{
			System.out.println(counter + " is even.");
		}
		counter++;
	}
  }
}