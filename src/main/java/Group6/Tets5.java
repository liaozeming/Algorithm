package Group6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tets5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] s1 = s.split(",");
            List<String> list = new ArrayList<>();
            for (int i = 0; i < s1.length; i++) {
                list.add(s1[i]);
            }
            Collections.sort(list);
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < list.size(); j++) {
                stringBuffer.append((String) list.get(j));
                if (j != list.size() - 1) {
                    stringBuffer.append(",");
                }
            }
            System.out.println(stringBuffer);
        }
    }
}
