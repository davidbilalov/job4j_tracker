package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int index = 0; index < users.length; index++) {
            String username = users[index].getUsername();
            if (validate(users[index]) && username.equals(login)) {
                System.out.println(username);
            } else {
                throw new UserNotFoundException("UserNotFoundException");
            }
        }
        return new User(login, true);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if(!user.isValid() || user.getUsername().length() <= 3) {
            throw new UserInvalidException("UserInvalidException");
        }
        return true;
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