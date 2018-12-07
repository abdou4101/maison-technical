import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/**
 * @author abdessamad
 *
 */
public class Part {
	
	
	/**
	 * @param list
	 * @param taille
	 * @return
	 */
	public static <T> Collection<List<T>> part(List<T> list, int taille) {
		
//		Map<Integer, List<Integer>> groups = list.stream()
//				.collect(Collectors.groupingBy(s -> ((s-1)/2)));
//		List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
////		System.out.println(subSets);
//		return subSets;
		
		 final AtomicInteger cpt = new AtomicInteger(0);

	        Collection<List<T>> partitioned = list.stream()
	                .collect(Collectors.groupingBy(it -> cpt.getAndIncrement() / taille))
	                .values();
	        
	        return partitioned;
	}
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(new Integer(1));
//		list.add(2);
//		list.add(3);
//		list.add(6);
//		list.add(5);
//		
//		 List<Item> list = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
//	                new Item("banana", 20, new BigDecimal("19.99")),
//	                new Item("orang", 10, new BigDecimal("29.99")),
//	                new Item("watermelon", 10, new BigDecimal("29.99")),
//	                new Item("papaya", 20, new BigDecimal("9.99")),
//	                new Item("apple", 10, new BigDecimal("9.99")),
//	                new Item("banana", 10, new BigDecimal("19.99")),
//	                new Item("apple", 20, new BigDecimal("9.99"))
//	        );
//		final List<Object> list = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","X");

	
//		Collection<List<Integer>> liste = Part.part(list, 2);
//		System.out.println(liste);
//		
//		System.out.println(liste.stream()
//        .flatMap(List::stream)
//        .collect(Collectors.toList()));
		
//		final List<String> list = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","X");
//
//        final AtomicInteger counter = new AtomicInteger(0);
//        final int size = 5;
//
//        final Collection<List<String>> partitioned = list.stream()
//                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
//                .values();

//        partitioned.forEach(System.out::println);
		
		List<String> liste = Arrays.asList("A","B","C","D","E","F","G","H","I","G","K","L","G","N","O","P","X");
		Map<String, Integer> counts = new HashMap<String, Integer>();
		
//		for(String car : liste)
//	    {
//			if(counts.containsKey(car)) {
//				counts.put(car, counts.get(car) + 1);
//			} else {
//				counts.put(car, 1);
//			}
//	    }
		
//		liste.stream().filter(n -> Collections.frequency(liste, n) > 1)
//		.forEach(System.out::print);
		
		System.out.println(liste);// pas d'effet de bord
		
		List<String> liste1 = new ArrayList<String>(liste);
//		liste.stream().filter(n -> liste.indexOf(n) % 2 == 0).forEach(System.out::print);
		liste1.removeIf(n -> liste.indexOf(n) % 2 == 0);
		
		System.out.println(liste1);
		
//		System.out.println(counts);
		

	}

}
