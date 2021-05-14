package LeYi;

//弓箭兵
public class Arrow extends TroopItem {
    public Arrow(int id, int type, int level, int load, int force) {
        super(id, type, level, load, force);
    }

    int own_num;
    int select_num;

    public int getOwn_num() {
        return own_num;
    }

    public void setOwn_num(int own_num) {
        this.own_num = own_num;
    }

    public int getSelect_num() {
        return select_num;
    }

    public void setSelect_num(int select_num) {
        this.select_num = select_num;
    }
}
