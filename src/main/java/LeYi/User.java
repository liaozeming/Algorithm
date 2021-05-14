package LeYi;

import java.util.ArrayList;
import java.util.List;

//用户
public class User {
    //拥有的兵种
    List<TroopItem> troopItemList = new ArrayList<>();

    public List<TroopItem> getTroopItemList() {
        return troopItemList;
    }

    public void setTroopItemList(List<TroopItem> troopItemList) {
        this.troopItemList = troopItemList;
    }

    int res_max;
    int march_size_max;

    public int getRes_max() {
        return res_max;
    }

    public void setRes_max(int res_max) {
        this.res_max = res_max;
    }

    public int getMarch_size_max() {
        return march_size_max;
    }

    public void setMarch_size_max(int march_size_max) {
        this.march_size_max = march_size_max;
    }
}
