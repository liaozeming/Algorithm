package LeYi;

//兵种抽象类
public abstract class TroopItem {
    int id;
    int type;
    int level;
    int load;
    int force;
    int own_num;
    int select_num;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public TroopItem(int id, int type, int level, int load, int force) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.load = load;
        this.force = force;
    }

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
