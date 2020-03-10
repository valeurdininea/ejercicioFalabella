// Falabella
package pruebaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; //SE AGREGA
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaSelenium {
    private static WebDriver driver = null;  
    public static void main(String[] args) throws InterruptedException {
       // 
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        
   //String resultado;                                  //A
  //for (int i = 0; i < 3; i++) {
    driver.get("https://secure.falabella.com.ar/falabella-ar/myaccount/register.jsp");
   
    driver.manage().window().maximize(); 
    driver.findElement(By.id("user")).sendKeys("Antonella"); 
    driver.findElement(By.id("apellidopaterno")).sendKeys("Gomez"); 
    Thread.sleep(1000);
    driver.findElement(By.id("mail")).sendKeys("anto@falabella.com.ar");
    Thread.sleep(3000);
    driver.findElement(By.id("clave1")).sendKeys("electrodomestico");
    driver.findElement(By.id("clave2")).sendKeys("electrodomestico");
    driver.findElement(By.id("dni")).sendKeys("39758993");
    driver.findElement(By.cssSelector("label:nth-child(2) > #tipodireccion_0")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("day")).click();//
    {
      WebElement dropdown = driver.findElement(By.id("day"));
      dropdown.findElement(By.xpath("//option[. = '10']")).click();
    }
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'Jul']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'Oct']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("year")).click();
    Thread.sleep(1000);
    {
      WebElement dropdown = driver.findElement(By.id("year"));
      dropdown.findElement(By.xpath("//option[. = '2002']")).click();
    }
    driver.findElement(By.id("year")).click();
    Thread.sleep(3000);
//driver.findElement(By.id("celular")).click();
    driver.findElement(By.id("celular")).sendKeys("1143215897");
 
    driver.findElement(By.name("/atg/userprofiling/ProfileFormHandler.editValue.receiveEmail")).click();
    Thread.sleep(3000); 
    driver.findElement(By.id("agreelegaleId")).click();
    Thread.sleep(1000); 
    driver.findElement(By.id("boton_Ar")).click();
    Thread.sleep(1000);
  //      } del FOR
    //driver.close();
    }  
}




/* 
String Datos[][] = new String[3][2];
        Datos[0][0]="Admin";
        Datos[0][1]="4321";
        
        Datos[1][0]="Pepe";
        Datos[1][1]="555";
        
        Datos[2][0]="Ana";
        Datos[2][1]="9876";     
    ..........
    driver.findElement(By.id("usuario")).sendKeys(Datos[i][0]);
    driver.findElement(By.id("clave")).sendKeys(  Datos[i][1]);
    Thread.sleep(3000);
    driver.findElement(By.id("Ingresar")).click();
   
    resultado = driver.getPageSource();              //A
    resultado.indexOf("Ingreso INCorrecto. -");      //A
    
    driver.findElement(By.id("Volver")).click();

*/