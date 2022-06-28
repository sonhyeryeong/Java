import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
	private static Random random;

	public static Set<Integer> lotto() {
		Set<Integer> set = new HashSet<>();
		random = new Random();

		while (set.size() < 6) {
			set.add(random.nextInt(45) + 1);
		}

		return set;
	}

	public static void main(String[] args) {
		List<Set<Integer>> list = new ArrayList<>();
		Integer[] arr = new Integer[5];
		random = new Random();

		Set<Integer> lottos = lotto();
				
		Integer bonus;
		while(true) {
			Integer r = random.nextInt(45) + 1;
			if(!lottos.contains(r)) {
				bonus = r;
				break;
			}
		}
		System.out.println(lottos);
		System.out.println(bonus);
		
		while (list.size() < 1000000) {
			list.add(lotto());
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (Set<Integer> s : list) {
			Set<Integer> setDuplicate = new HashSet<>();
			setDuplicate.addAll(s);
			setDuplicate.retainAll(lottos);
			if (setDuplicate.size() == 6) {
				arr[0]++;
			} else if (setDuplicate.size() == 5) {
				if (s.contains(bonus)) {
					arr[1]++;
				} else {
					arr[2]++;
				}
			} else if (setDuplicate.size() == 4) {
				arr[3]++;
			} else if (setDuplicate.size() == 3) {
				arr[4]++;
			}

		}
		
		int i = 0;
		
		for(int num : arr ) {
			System.out.print(++i + "등 " + num);
			System.out.println();
		}
		
		System.out.println(Arrays.toString(arr));

//		System.out.println(list);

	}

}