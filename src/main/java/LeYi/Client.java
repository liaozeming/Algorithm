package LeYi;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        List<TroopItem> troopItemList = new ArrayList<>();
        Infantry infantry = new Infantry(1, 1, 1, 1000, 100);
        infantry.setOwn_num(10);
        infantry.setSelect_num(2);

        Arrow arrow = new Arrow(2, 2, 2, 2000, 200);
        arrow.setOwn_num(5);
        arrow.setSelect_num(1);

        Sowar sowar = new Sowar(3, 3, 3, 3000, 300);
        arrow.setOwn_num(3);
        arrow.setSelect_num(1);

        WarALong warALong = new WarALong(4, 4, 4, 4000, 400);
        arrow.setOwn_num(2);
        arrow.setSelect_num(0);

        troopItemList.add(infantry);
        user.setTroopItemList(troopItemList);
        user.setRes_max(1000);
        user.setMarch_size_max(10);
        List<TroopItem> troopItemList1 = user.getTroopItemList();
        int res_max = user.getRes_max();
        int march_size_max = user.getMarch_size_max();
        List<TroopItem> res = QuickSelectTroopList(res_max, march_size_max, troopItemList1);
    }

    //快速选择士兵
    //res_max 资源上限
    //march_size_max出兵数量上限
    private static List<TroopItem> QuickSelectTroopList(int res_max, int march_size_max, List<TroopItem> troopItemList1) {
        List<TroopItem> list = new ArrayList<>();
        //将兵种的load值从大到小排序
        Collections.sort(troopItemList1, new Comparator<TroopItem>() {
            @Override
            public int compare(TroopItem o1, TroopItem o2) {
                return o2.getLoad() - o1.getLoad();
            }
        });
        Iterator<TroopItem> iterator = troopItemList1.iterator();
        while (iterator.hasNext()) {
            TroopItem next = iterator.next();
            //得到剩余兵种的数量
            int i = next.getOwn_num() - next.getSelect_num();
            //得到该兵种的load总值
            int all = next.getLoad() * i;

        }
        return null;
    }


}
