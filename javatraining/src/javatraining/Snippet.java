package javatraining;

public class Snippet {
	public static Map<Integer, Integer> numberOfOccurances(ArrayList<Integer> input1) {
	
			Map<Integer, Integer> output = new HashMap<Integer, Integer>();
			for (Integer integer : input1) {
				if (output.containsKey(integer)) {
					output.put(integer, (output.get(integer)) + 1);
	
				} else {
					output.put(integer, 1);
				}
	
			}
			return output;
	
		}
}

