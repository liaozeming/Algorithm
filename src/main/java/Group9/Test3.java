package Group9;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int rowIndex = 3;
        Test3 test3 = new Test3();
        List<Integer> row = test3.getRow(rowIndex);
        System.out.println(row.toString());
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex == 0) return list;
        list.add(1);
        list = dfs(list, rowIndex, 1);
        return list;
    }

    private List<Integer> dfs(List<Integer> list, int rowIndex, int i) {
        if (i == rowIndex)
            return list;
        List<Integer> temp = new ArrayList<>(list);
        for (int j = 0; j < temp.size() - 1; j++) {
            int add = temp.get(j) + temp.get(j + 1);
            list.set(j + 1, add);
        }
        list.add(1);
        return dfs(list, rowIndex, i + 1);
    }
}
