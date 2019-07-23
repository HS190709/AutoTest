package test;

/**
 * @author hs
 * @date 2019年1月25日, 0025 下午 09:09:06
 */
public class ManPersonOperation implements PersonOperation{
    @Override
    public void sing(String singName) {
        System.out.println("男人喜欢唱：" + singName );
    }

    @Override
    public void work() {
        System.out.println("man work hard");
    }
}
