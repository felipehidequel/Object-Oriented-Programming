package estrutural.composite.autentication;

public class NumberValidator implements PasswordValidation{
    public boolean validate(String password){
        return password.matches(".*[0-9].*");
    }
}
