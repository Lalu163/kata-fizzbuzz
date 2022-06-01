import org.junit.Test;

public class GeneralFizzBuzzTest {
    @Test
    public void outputTheHundredFizzBuzzes(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i=1; i<=100; i++){
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
