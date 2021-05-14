package Group2;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        Test5 test5 = new Test5();
        int[] ints = test5.relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ints));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (map.get(arr2[i]) == null) {
                continue;
            }
            int num = map.get(arr2[i]);
            for (int k = 0; k < num; k++) {
                res[j + k] = arr2[i];
            }
            j += num;
            map.remove(arr2[i]);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            int num = entry.getValue();
            for (int i = 0; i < num; i++) {
                res[j + i] = entry.getKey();
            }
            j += num;
        }
        return res;
    }

}
