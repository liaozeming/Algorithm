public class Main {
    public static void main(String[] args) {
        Father father=new Son();
        father.run();
        Son son=new Son();
        son.show();
        new Father() {
            @Override
            public void run() {
                super.run();
            }
            public void show() {
                System.out.println("女儿洗澡");
            }
        }.show();

    }
}
