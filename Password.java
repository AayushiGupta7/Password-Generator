import java.util.*;
public class Password
{
    public static void main(String[] args)
    {
        int length = 10;
        System.out.println(new_password(length));

    }
    static char[] new_password(int len)
    {
        System.out.println("Your new password is: ");
        String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        String small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_+=-/.?<>)";
        String values = capital_chars+small_chars+numbers+symbols;

        Random rnd_method = new Random();
        char[] password = new char[len];

        for(int i=0;i<len;i++)
        {
            password[i] = values.charAt(rnd_method.nextInt(values.length()));
        }
        return password;
    }
}
