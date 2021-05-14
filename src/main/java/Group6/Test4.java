package Group6;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        List list = new ArrayList();
        for (int j = 0; j < i; j++) {
            list.add(scanner.next());
        }
        Collections.sort(list);
        StringBuffer stringBuffer = new StringBuffer();
        for (int j = 0; j < list.size(); j++) {
            stringBuffer.append((String) list.get(j)).append(" ");
        }
        System.out.println(stringBuffer);
    }
}
