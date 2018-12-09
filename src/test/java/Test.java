import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 类说明
 *
 * @author iceb
 * @version $Id: SeTest.java, v0.1 2017/6/28.17:19 Exp $
 */

class SeTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("用例前执行打印本句！");
        System.out.println("每条Test用例是互不相干的");
        System.out.println("用例开始执行…………");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("用例结束后运行");
    }
    @Test
    public void actions() {
        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        //引用火狐浏览器驱动
        WebDriver driver = new ChromeDriver();
        //打开禅道界面
        driver.get("https://mail.qq.com/cgi-bin/loginpage");
        //查找搜索框
        driver.findElement(By.id("switcher_plogin")).click();
        driver.findElement(By.id("u")).sendKeys("1017946794@qq.com");
        driver.findElement(By.id("p")).sendKeys("XIAOPI1012521");
        driver.findElement(By.id("login_button")).click();

        try {
            //页面等待
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //关闭浏览器进程及驱动
        //driver.close();

    }

}
