import java.util.Scanner;

class TempatureSample{
	int month, day, year;
	double tempature;
}

public class TempaturesByDate {
	public static void main(String[] args) throws Exception{
		String site = "https://academic.udayton.edu";
		String path = "/kissock/http/Weather/gsod95-current/CODENVER.txt";
		Scanner inFile = new Scanner((new java.net.URL(site+path)).openStream());

		TempatureSample[] tempDB = new TempatureSample[10000];
		int numRecords, i = 0;
		
		while (inFile.hasNextInt() && i<tempDB.length){
			TempatureSample e = new TempatureSample();
			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.tempature = inFile.nextDouble();
			if (e.tempature == -99)
				continue;
			tempDB[i] = e;
			i++;
		}
		inFile.close();
		numRecords = i;
		
		System.out.println(numRecords+" daily tempatures loaded.");
		
		double total = 0, avg;
		int count = 0;
		for (i=0; i<numRecords; i++){
			if (tempDB[i].month == 2){
				total += tempDB[i].tempature;
				count++;
			}
		}
		
		avg = total/count;
		avg = roundToOneDecimal(avg);
		System.out.print("Average daily tempature over " + count);
		System.out.println(" days in February: "+avg);
	}
	
	public static double roundToOneDecimal(double d){
		return Math.round(d*10)/10.0;
	}
}
