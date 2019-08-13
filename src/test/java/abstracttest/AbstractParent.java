package abstracttest;


import org.testng.annotations.*;

/**
 * @author hosni
 * @date 2019/06/24 17:31:48
 **/
public class AbstractParent {

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite");
    }

    @AfterGroups
    public void AfterGroups() {
        System.out.println("AfterGroups");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest");
    }
    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");
    }

    @Test(groups ="a")
    public void Test() {
        System.out.println("Test");
    }

    @Test(groups = "b")
    public void Test2() {
        System.out.println("Test2");
        throw new RuntimeException();
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("BeforeMethod");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeGroups
    public void BeforeGroups() {
        System.out.println("BeforeGroups");
    }

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite");
    }
}
