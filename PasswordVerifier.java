package HW3;

public class PasswordVerifier {
    /*Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.*/
    public void verifyPassword(String password) throws Exception {

        if (password.length() < 8){
            throw new Exception("Пароль не должен быть менеее 8 символов");
        }


        boolean containDigits = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)){
                containDigits = true;
                break;
            }
        }
        if (!containDigits){
            throw  new Exception("Пароль должен содержать хотя бы одну цифру");
        }

        boolean containsUppercase = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)){
                containsUppercase = true;
                break;
            }
        }
        if (!containsUppercase){
            throw  new Exception("Пароль должен содержать хотя бы одну заглавную букву");
        }
    }

}
