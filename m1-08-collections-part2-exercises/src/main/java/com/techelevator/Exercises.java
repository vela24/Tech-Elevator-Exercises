package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		if(animalName==null) {
			return "unknown";
		}
		String animalToSearch = animalName.toLowerCase();			//animalToSearch<String>
		
		Map<String, String> animalKingdom = new HashMap<String, String>();
		animalKingdom.put("rhino", "Crash");
		animalKingdom.put("giraffe", "Tower");
		animalKingdom.put("elephant", "Herd");
		animalKingdom.put("lion", "pride");
		animalKingdom.put("crow", "Murder");
		animalKingdom.put("pigeon", "Kit");
		animalKingdom.put("flamingo", "Pat");
		animalKingdom.put("deer", "Herd");
		animalKingdom.put("dog", "Pack");
		animalKingdom.put("crocodile", "Float");
		
		if(animalName.equals("") || animalKingdom.containsKey(animalToSearch)!=true){
			return "unknown";
		}
		return animalKingdom.get(animalToSearch);
		
		
		
		
		//Set<String> students = new HashSet<String>(); 
		
	}

	private Object length() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		if(itemNumber==null) {
			return 0.00;
		}
		
		if(itemNumber.equals("")) {
			return 0.00;
		}
		
	//	String saleSearch = itemNumber.toLowerCase();
		
		Map<String, String> couponBook = new HashMap<String, String>();
		couponBook.put("kitchen4001", "0.20");
		couponBook.put("garage1070", "0.15");
		couponBook.put("livingroom", "0.10");
		couponBook.put("kitchen6073", "0.40");
		couponBook.put("bedroom3434", "0.60");
		couponBook.put("bath0073", "15");
		String key = itemNumber.toLowerCase();
		Double response = new Double(couponBook.get(key));
		if(response==null) {
			return new Double(0.00);
		}
		return response;
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
	
		Integer paulBank = peterPaul.get("Paul");
		Integer peterBank = peterPaul.get("Peter");
		Integer PaulTran = peterBank/2;	
		
		if(peterBank > 0 && paulBank < 1000) {
			paulBank = paulBank + PaulTran;
			peterBank = peterBank - PaulTran;
			peterPaul.put("Paul", paulBank); // or do i call back "Paul"?
			peterPaul.put("Peter", peterBank); // or do i call back "Peter"?
			return peterPaul;
		} 
		
		return peterPaul;
	}
	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		Integer paulBank = peterPaul.get("Paul");
		Integer peterBank = peterPaul.get("Peter");
		Integer PeterPaulPartnership = 0;
		
		if(peterBank >= 5000 && paulBank >= 10000) {
			PeterPaulPartnership = (paulBank/4) + (peterBank/4);
			peterBank = peterBank - (peterBank/4);
			paulBank = paulBank - (paulBank/4);
			peterPaul.put("Paul", paulBank);
			peterPaul.put("Peter", peterBank);
			peterPaul.put("PeterPaulPartnership", PeterPaulPartnership);
			return peterPaul;
		}
		
		return peterPaul;
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {	
		Map<String, String> strMain = new HashMap<String, String>();
		for (String str : words) {
			//1st time str = code
			Character cStart = str.charAt(0); //gets first character
			Character cEnd = str.charAt(str.length() -1); //gets last character
			strMain.put(cStart.toString(), cEnd.toString()); //adds the key value to the map
		}
		
		return strMain;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> mapMain = new HashMap<String, Integer>();
		for(String str : words) {
			if (mapMain.get(str) == null) {
				mapMain.put(str, 1);
			} else {
				mapMain.put(str, mapMain.get(str) + 1);
			}
		}
		return mapMain;
	}
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> mapMain = new HashMap<Integer, Integer>();
		for(Integer nums : ints) {
			if(mapMain.get(nums) == null) {
				mapMain.put(nums,  1);
			}
			else {
				mapMain.put(nums,  mapMain.get(nums) + 1);
			}
		}
		
		return mapMain;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> mapMain = new HashMap<String, Boolean>();

		for (String str : words) {
			if (mapMain.get(str) == null) {
				mapMain.put(str, false);
			} else {
				mapMain.put(str, true);
			}

		}

		return mapMain;
	}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
//		Map<String, Integer> mapMain = new HashMap<String, Integer>();
//		Map<String, Integer> mapMain2 = new HashMap<String, Integer>();
		
		for(String str : remoteWarehouse.keySet()) {
			
			int map2Val = remoteWarehouse.get(str);
			if(mainWarehouse.get(str)==null) {
				mainWarehouse.put(str, map2Val);
			}
			else {
				mainWarehouse.put(str,  mainWarehouse.get(str) + map2Val);
			}
		}

		
		return mainWarehouse;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		Map<String, Integer> mainMap = new HashMap<String, Integer>();
		for (String str : words) {
			String subStr = str.substring(str.length() - 2, str.length());
			System.out.println("String: "+str +", subStr: "+subStr);
			for (int i = 0; i < str.length() -3; i++) {
				String currentSub = str.substring(i, i + 2);
				System.out.println("currentSub: "+currentSub);
				if (currentSub.equals(subStr)) {
					System.out.println("found");
					if (mainMap.get(str) == null) {
						mainMap.put(str, 1);
					} else {
						mainMap.put(str, mainMap.get(str) + 1);
					}
					System.out.println("mainMap key val : "+ mainMap.get(str));
				} else {
					System.out.println("not equal currentSub: "+currentSub + ", subStr: "+subStr);
				}
			}
		}
		return mainMap;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		return null;
	}

}
