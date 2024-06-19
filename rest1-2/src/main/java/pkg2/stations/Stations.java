package pkg2.stations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stations {

	public static void main(String[] args) throws FileNotFoundException {
		double lat1 =8.88113000;
		double long1 = 76.58469000;
		double x1,y1,distance;
		ArrayList<String>location=new ArrayList<String>();
		ArrayList<Double>latitude = new ArrayList<Double>();
		ArrayList<Double>longitude = new ArrayList<Double>();
		ArrayList<Double>temp=new ArrayList<Double>();
		File f1= new File("stations.txt");
		Scanner sc = new Scanner(f1);
		while(sc.hasNext()) {
			String[] arr1=sc.nextLine().split(",");
			location.add(arr1[0]);
			latitude.add(Double.parseDouble(arr1[2]));
			longitude.add(Double.parseDouble(arr1[3]));
		}
		for(int i = 0;i<location.size();i++) {
			x1=latitude.get(i);
			y1=longitude.get(i);
			distance=Math.sqrt(Math.pow(lat1-x1, 2)+Math.pow(long1-y1, 2));
			
			temp.add(distance);
		}
		double min = Collections.min(temp);
		int pos = temp.indexOf(min);
		String nearest =location.get(pos);
		System.out.println(nearest);

	}

}
