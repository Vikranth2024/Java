package pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
public class Wordbuildinggame {
	public static void main(String[] args) throws FileNotFoundException {
		String compchoice="";
		String userchoice="";
		String lastchar1="";
		int len1,len2;
		int randnum1 = 0;
		Random r1 = new Random();
		ArrayList<String> words = new ArrayList<>();
		List<String> temp1 = new ArrayList<>();
		File f1 = new File("dictionary.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		
		while(sc1.hasNext()) {
			words.add(sc1.nextLine());
		}
		randnum1 = r1.nextInt(words.size());
		compchoice = words.get(randnum1);
		System.out.println("Computer : "+compchoice);
		len1=compchoice.length();
		words.remove(compchoice);
		lastchar1=compchoice.substring(len1-1,len1);
		System.out.println(lastchar1);
		
		while(true) {
			System.out.print("User : ");
			userchoice = sc2.nextLine();
			if(userchoice.startsWith(lastchar1) && words.contains(userchoice)){
				len2 = userchoice.length();
				String lastchar2 = userchoice.substring(len2-1,len2);
				temp1 = words.stream().filter(w->w.startsWith(lastchar2)).collect(Collectors.toList());
				randnum1=r1.nextInt(temp1.size());	
				compchoice = 
				System.out.println("computer : "+);
				}
			else {
				System.out.println("Computer wins");
				break;
			}
			
		}
		
		
	}

}
