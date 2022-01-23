package CodeBro;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import junit.framework.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;

//@Listeners({TestListener.class})
@Epic("Moje prywante testy środowiska")
@Feature("Weryfikacja imienia")
public class CB01 {

    public static String mojeimie = "Bartek";

    public static void main(String[] args){
        System.out.println("Twoje imię to: " + mojeimie);
    }

    @Step("Imie {0} jest poprawne")
    public void verifyName(String mojeimie){
        Assert.assertEquals("Bartek", mojeimie);
    }

}
