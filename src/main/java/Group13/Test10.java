package Group13;

import java.util.*;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月01日 2:15
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}

public class Test10 {
    public static void main(String[] args) {
        List<Employee> employees =new ArrayList<>();

    }

    public int getImportance(List<Employee> employees, int id) {
        //存储员工id
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(id);
        //员工id 价值
        Map<Integer,Integer> map=new HashMap<>();
        //员工id 子员工
        Map<Integer,List<Integer>> map1=new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            map.put(employees.get(i).id,employees.get(i).importance);
            map1.put(employees.get(i).id,employees.get(i).subordinates);
        }
        int res=0;
        while (!queue.isEmpty())
        {
            res+=map.get(queue.peek());
//            增加子员工
            for (int i = 0; i < map1.get(queue.peek()).size(); i++) {
                queue.add(map1.get(queue.peek()).get(i));
            }
            queue.poll();
        }



        return res;
    }

}