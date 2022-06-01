public class FizzBuzzConverter {
    public String convert(int toConvert) {

        if(toConvert%15==0){
            return "FizzBuzz";
        }

        if(toConvert%5==0){
            return "Buzz";
        }

        if(toConvert%3==0){
            return "Fizz";
        }

        return String.valueOf(toConvert);
    }
}
