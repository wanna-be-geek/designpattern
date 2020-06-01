package pattern.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image=new ProxyImage("test.img");
        //从磁盘加载
        image.display();
        System.out.println("");

        //不需要加载
        image.display();
    }
}
