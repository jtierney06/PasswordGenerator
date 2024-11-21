public class Main {
    public static void main(String[] args){
        PasswordGenerator pw1 = new PasswordGenerator(4 , "chs");
        System.out.println("Password 1: " + pw1.pwGen());
        System.out.println("Password count: " + pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println("Password 2: " + pw2.pwGen());
        System.out.println("Password 2 count: " + pw2.pwCount());

    }
    
    
}
