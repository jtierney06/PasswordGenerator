public class PasswordGenerator{
    private String prefix;
    private int rand;
    private static int countPass = 0;

    public PasswordGenerator(int num, String pre){
        rand = num;
        prefix = pre; 
    }

    public PasswordGenerator(int num){
        prefix = "A";
        rand = num;
    }

    public int pwCount(){
        return countPass;
    }

    public String pwGen(){
        String numbers = generateNumbers();
        countPass++;
        return prefix + "." + numbers;
    }

    public String generateNumbers(){
        String number = "";
        for (int i = 0; i < rand; i++){
           int digits = (int)(Math.random() * 10);
           number += digits;
        }
        return number;
    }


}