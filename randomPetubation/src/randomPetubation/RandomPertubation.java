package randomPetubation;

import data.Data;
import data.Graph;

import java.util.LinkedList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RandomPertubation {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		try (BufferedReader fileReader = new BufferedReader(new FileReader("points/points.txt"))) {
			
			String line;
			
			while((line = fileReader.readLine()) != null) {
				String[] lineItems = line.split(",");
				data.setSize(lineItems.length + 1);
				
				try {
					//n times of row and two column (first column is for labeling and second column is for the actual value)
					for (int i = 0; i < lineItems.length; i++) {
						data.setData(i, (double)Integer.parseInt(lineItems[i]));
					}
				}catch(Exception e) {
					System.out.print("try again");
				}
			}
			System.out.print(Arrays.deepToString(data.getData()));
			fileReader.close();
			
			
			double x = data.getData().length;
			
			double w;
			double w2;
			double w3;
			double w4;
			
			double y;
			
			double loss ;
			
			Random rand = new Random();
			LinkedList<String> save = new LinkedList<>(); 
			double lossSum = 0;
			double lossAverage = 0;
			
			do{
				w = rand.nextDouble(50);
				w2 = rand.nextDouble(50);
				w3 = rand.nextDouble(50);
				w4 = rand.nextDouble(50);
				
				y = w*x + w2*(x*x) + w3*(x*x*x) + w4*(x*x*x*x);
				
				for(int i = 0; i < data.getData().length; i++) {
					y = w*i + w2*(i*i) + w3*(i*i*i) + w4*(i*i*i*i); // add a bias if you want like random double number at the end
					loss = Math.abs(data.getData()[i][0] - y);
					lossSum += Math.abs(data.getData()[i][0] - y);
					
					if (i == data.getData().length - 1) {
						lossAverage = lossSum / data.getData().length;
						if (lossAverage < 10) {
							save.add(w+"x "+w2+"x^2 "+w3+"x^3 "+w4+"x^4");
						}else if (lossAverage < 3) {
							save.add(w+"x "+w2+"x^2 "+w3+"x^3 "+w4+"x^4");
							System.out.print(save);
							break;
						}
					}
			
					if (loss > 10) {
						System.out.print("failed");
						break;
					}else {
						System.out.println(w+"x "+w2+"x^2 "+w3+"x^3 "+w4+"x^4");
					}	
				}
			}while(true);
		}catch(Exception e) {
			 e.printStackTrace();
			 System.out.print(e.getMessage());
		}
		
		
	}
}