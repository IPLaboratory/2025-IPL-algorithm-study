import java.util.Scanner;
import java.util.ArrayList;

public class test12312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> saveList = new ArrayList<>();
        
        int cn = sc.nextInt(); 
        sc.nextLine(); 
        
        for(int i = 1; i <= cn; i++) {
        	ArrayList<Integer> compareList = new ArrayList<>();
        	compareList.add(cn);
        	compareList.add(i);
        	
        	while(true) {
        		int size = compareList.size();
        		int number = compareList.get(size - 2) - compareList.get(size - 1);
        		
        		if(number < 0) {
        			break;
        		}
        		compareList.add(number);
        	}
        	
        	if(compareList.size() > saveList.size()) {
        		saveList = compareList;
        	}
        }
        System.out.println(saveList.size());
        
        for(int i = 0; i < saveList.size(); i++) {
        	int temp = saveList.get(i);
        	System.out.print(temp);
        	System.out.print(" ");
        }
    }
}