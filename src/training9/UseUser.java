package training9;

import java.util.*;

public class UseUser {

    public static List<User> generateUsers(int count) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            userList.add(new User("user" + i));
        }
        return userList;
    }


    public static HashMap<User, Integer> generateRandomScore(List<User> arrlist) {
        HashMap<User, Integer> mapScore = new HashMap<>();
        for (User user : arrlist
        ) {
            int value = (int) (Math.random() * 20000 + 10);
            mapScore.put(user, value);
        }
        return mapScore;
    }

    public static Integer findScore(HashMap<User, Integer> mapscore, String name) {
        Integer score = 0;
        for (User user : mapscore.keySet()
        ) {
            if (user.getName().equals(name)) {
                score = mapscore.get(user);
                break;
            }
        }
        return score;
    }

    public static String inputName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя пользователя : ");
        String name = scan.nextLine();
        scan.close();
        return name;
    }

    public static void main(String[] args) {

        System.out.println(findScore(generateRandomScore(generateUsers(10)), inputName()));

    }
}
