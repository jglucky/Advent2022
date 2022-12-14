package advent2022;

import java.util.ArrayList;

import util.loadFile;

public class Day2 {
	static ArrayList<String> fileContent = new ArrayList<>();

	int points = 0;
	
	String x, y;
    String[] split;
    
	public static void main(String... args) {
		
		fileContent = loadFile.load("advent2.txt");
		
		System.out.println("Advent Day 2");
		
		new Day2().day2part1();
    	new Day2().day2part2();
    	//new Day2().test();
    }
	
    public void day2part1() {

    	for (String i: fileContent) {    		  
    		   split = i.split(" ");
               x = split[0];
               y = split[1];
    		  
		    	switch (x) {
				    	case "A":
				    		switch (y) {
				        		case "Y": points +=8; break;
				        		case "X": points +=4; break;
				        		case "Z": points +=3; break;
				    		}
				    		break;
				    	case "B":
				    		switch (y) {
				        		case "Y": points +=5; break;
				        		case "X": points +=1; break;
				        		case "Z": points +=9; break;
				    		}
				    		break;
				    	case "C":
				    		switch (y) {
				        		case "Y": points +=2; break;
				        		case "X": points +=7; break;
				        		case "Z": points +=6; break;
				    		}
				    		break;
				    }
	    }
        System.out.println("Part 1 Answer: " + points);

    }
    
    public void day2part2() {
    	
    	
    	for (String i: fileContent) {     
 		   split = i.split(" ");
            x = split[0];
            y = split[1];
            
            switch (x) {
         
	     	case "A": //rock
	     		switch (y) {
	         		case "Y": points +=4; break; //draw rock 4
	         		case "X": points +=3; break; //Lose Scissors 3
	         		case "Z": points +=8; break; //win paper 8
	     		}
	     		break;
	     	case "B": //Paper
	     		switch (y) {
	         		case "Y": points +=5; break; //draw paper 5
	         		case "X": points +=1; break; //Lose rock 1
	         		case "Z": points +=9; break; //win scissors 9
	     		}
	     		break;
	     	case "C": //Scissors
	     		switch (y) {
	         		case "Y": points +=6; break; //draw scissors 6
	         		case "X": points +=2; break; //Lose paper 2
	         		case "Z": points +=7; break; //win rock 7
     		}
     		break;
    	}
    	}
        System.out.println("Part 2 Answer: " + points);

    }
    
    public void test() {
    }
}
