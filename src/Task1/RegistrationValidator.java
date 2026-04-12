package Task1;

public class RegistrationValidator {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        System.out.println("Логин: " + login + ", Пароль: " + password + ", Повторный пароль: " + confirmPassword);

        if(login == null || login.length() >= 20 || login.contains(" ")){
            throw new WrongLoginException("Логин должен быть меньше 20 символов и не содержать пробелы");
        }

        if(password == null || password.length() >= 20 || password.contains(" ")){
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов и не содержать пробелы");
        }

        boolean hasDigit = false;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit = true;
                break;
            }
        }

        if(!hasDigit){
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
        }

        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароль и подтверждение не совпадают");
        }

        return true;
    }
}
