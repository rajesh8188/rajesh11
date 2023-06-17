package native_app;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appiumDemo.Capabitity;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import   java.time.Duration;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
public class demo_native  extends Capabitity{
    
    AndroidDriver<AndroidElement> driver;
    TouchAction taction;
    
    @BeforeTest
    public void set_up() throws MalformedURLException
    {
        driver=test();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(enabled = false)
    public void Tc1() throws InterruptedException
    {
        System.out.println("Im in the nativeapp");
        driver.findElement(MobileBy.AccessibilityId("Accessibility")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("Animation")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("App")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("Content")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("Graphics")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("Media")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("NFC")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("OS")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("Preference")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("Text")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        driver.findElement(MobileBy.AccessibilityId("Views")).click();
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        
        
        
    }
    @Test(enabled = false)
    public void Tc2() throws InterruptedException
    {
    	 driver.findElement(MobileBy.AccessibilityId("Preference")).click();
         Thread.sleep(3000);
         driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
         Thread.sleep(3000);
         driver.findElement(MobileBy.id("android:id/text1")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
         Thread.sleep(3000);
         // if we are using android ui automator to identify an element using an attribute 
        //  then we can use ui selector method  for selecting the attribute   
         driver.findElement(MobileBy.AndroidUIAutomator("uiselector().text(\"wifi setting\")")).click();
         Thread.sleep(3000);
         driver.findElement(MobileBy.id("android:id/edit")).sendKeys("Rajesh");
//         Thread.sleep(3000);
//         driver.hideKeyboard();
         driver.findElement(By.xpath("//*[@text='WiFi settings'")).click();
         Thread.sleep(3000);
         driver.findElement(MobileBy.id("android:id/button1")).click();
         Thread.sleep(3000);       
         driver.pressKey(new KeyEvent(AndroidKey.BACK));
         Thread.sleep(3000);
         driver.pressKey(new KeyEvent(AndroidKey.BACK));
         Thread.sleep(3000);
         driver.pressKey(new KeyEvent(AndroidKey.BACK));
         
    	
    }
    @Test(enabled = false)
    public void notifications() {
    	driver.openNotifications();
    	driver.findElementsByClassName("android.widget.ImageView").get(0).click();
    }
    @Test(enabled = false)
    public void scroll() throws InterruptedException {
    	 driver.findElement(MobileBy.AccessibilityId("Views")).click();
         //if we have to  scroll we need three things 1.ui automator2.ui selector 3.ui scrollable scroll into view
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
    	AndroidElement ele= driver.findElementByAndroidUIAutomator("new UiSelector.clickable(true)");
//    Dimension count=ele.getSize()
    	System.out.println(	ele.getSize());
  // down there is another method to scroll
    	driver.findElementByAndroidUIAutomator("text(\"views\")").click();
    	 driver.findElement(MobileBy.AccessibilityId("Expandable Lists")).click();
         Thread.sleep(4000);
         driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter")).click();
         TouchAction taction=new TouchAction(driver); 
         AndroidElement lp=driver.findElementByAndroidUIAutomator("text(\"Fish Names\")");
         Thread.sleep(4000);

         //taction.longPress(LongPressOptions().withElement(element(lp)).withDuration(ofSeco))
         taction.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
    	        
}
    @Test(enabled = false)
    public void DragAndDrop() {
    	driver.findElement(MobileBy.AccessibilityId("Views")).click();
        driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
        driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
    	driver.findElementsByClassName("android.widget.RadialTimePickerView$RadialPickerTouchHelper").get(11).click();
    }
    @Test(enabled = false)
    public void DragAndDrop1() throws InterruptedException {
    	driver.findElement(MobileBy.AccessibilityId("Views")).click();
    	 Thread.sleep(4000);
    	 driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
//    	AndroidElement drag=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
//    	AndroidElement drop=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_3"));
//    	 taction.longPress(longPressOptions().withElement(element(drag)).withDuration(ofSeconds(5))).moveTo(element(drop)).release().perform();
//            AndroidElement drag=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
        AndroidElement drag=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
        AndroidElement drop=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_2"));
        TouchAction tactions=new TouchAction(driver);
        tactions.longPress(longPressOptions().withElement(element(drag)).withDuration(ofSeconds(5))).moveTo(element(drop)).release().perform();
    }
    @Test
    public void Switching_apps() throws InterruptedException {
    	driver.findElement(MobileBy.AccessibilityId("OS")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(MobileBy.AccessibilityId("Enable SMS broadcast receiver")).click();
    	 Thread.sleep(4000);
    	  driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_recipient")).sendKeys("Rajesh");
    	  Thread.sleep(3000);
         driver.hideKeyboard();
    	  Thread.sleep(3000);
    	  driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("(650)555-1212");
    	  Thread.sleep(3000);
    	  driver.findElement(MobileBy.AccessibilityId("Send")).click();
    	  driver.activateApp("com.google.android.apps.messages");
    	//  driver.findElement(By.xpath(""))
    }
}

