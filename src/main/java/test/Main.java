package test;

/**
 * @author hs
 * @date 2019年1月25日, 0025 下午 09:10:37
 */
public class Main implements Test3  {
    public void work(PersonOperation t) {
        t.work();
    }
    public static void main(String[] args)throws Exception {
        inter.Main m = new inter.Main();
        PersonOperation po = new ManPersonOperation();
        PersonOperation wpo = new WomanPersonOperation();
        m.work(po);
        m.work(wpo);
    }
    @Override
    public void a()throws RuntimeException{

    }
}

