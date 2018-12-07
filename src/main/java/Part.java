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
		
		 final AtomicInteger cpt = new AtomicInteger(0);

	        Collection<List<T>> partitioned = list.stream()
	                .collect(Collectors.groupingBy(it -> cpt.getAndIncrement() / taille))
	                .values();
	        return partitioned;
	}
	
	public static void main(String[] args) {

		List<String> liste = Arrays.asList("A","B","C","D","E","F","G","H","I","G","K","L","G","N","O","P","X");
		Map<String, Integer> counts = new HashMap<String, Integer>();

		System.out.println(liste);// pas d'effet de bord
		
		List<String> liste1 = new ArrayList<String>(liste);
		liste1.removeIf(n -> liste.indexOf(n) % 2 == 0);
		//cdcdcdcdcdcdcdcdcd

	}

}
