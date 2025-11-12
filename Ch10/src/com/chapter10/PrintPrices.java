package com.chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintPrices {
	public static void main(String[] args) {
		String path = "/home/oreillyj/Documents/CSCE145/inventory.csv"; //absolute path
//		String path = "../../inventory.csv"; //relative path
		ArrayList<Item> items = new ArrayList<Item>();
		try {
			Scanner inventory = new Scanner(new File(path));
			inventory.nextLine(); // clear column headers
			while(inventory.hasNextLine()) {
				String line = inventory.nextLine();
				String[] row = line.split(",");
				Item i = new Item(row[0],Double.parseDouble(row[2]), // note 2-1 flip
						Integer.parseInt(row[1]), row[3]);
				items.add(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(Item i : items) {
			System.out.println(i.getDescription() +": $"+i.getPrice());
		}
	}
}
