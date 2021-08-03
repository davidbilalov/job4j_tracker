package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        String username =  users[0].getUsername();
            if (validate(users[0]) && username.equals(login)) {
                System.out.println(username);
            }
            else {
                throw new UserNotFoundException("UserNotFoundException");
            }


        return new User(login, true);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if(user.isValid() && user.getUsername().length() > 3) {
            return true;
        } else {
            throw new UserInvalidException("UserInvalidException");
        }
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}