package randomNumberGenerator;

import java.io.File;
import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class RandomNumberGenerator{
	
	public static void overloadGenerator() {
		
		Random rand = new Random();
		int num;
		int count = 0;
		
		try(BufferedReader fileReader = new BufferedReader(new FileReader("points.txt"))){
			FileWriter myWriter = new FileWriter("points.txt");
			if (fileReader.lines() == null) {
				do {
					num = rand.nextInt(100);
					myWriter.write(num + ",");
					count++;
				}while(count != 100);
			}else {
				File file = new File("points.txt");
				do {
					num = rand.nextInt(100);
					myWriter.write(num + ",");
					count++;
				}while(count != 100);

			}
			myWriter.close();
			fileReader.close();
		}catch(Exception e) {
			System.out.print("failed");
		}
	}
	
	
	public static void main(String[] args) {
		try{
			File file = new File("points.txt");
			FileWriter myWriter = new FileWriter("points.txt");
			
			if(file.createNewFile()) {
				System.out.print(file.getName() + "is created");
			}else {
				overloadGenerator();
			} 
			System.out.print("wrote successfully");
			myWriter.close();
			
		}catch(Exception e) {
			System.out.print(false);
		}
	}
}
