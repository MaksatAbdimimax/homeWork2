public class Main {


    public static void main(String[] args) {// spisok 5 metodov kotorye doljny otobrajatsya
        System.out.println(weatherTest(19, 21));
        System.out.println(weatherTest(32, -34));
        System.out.println(weatherTest(98, 32));
        System.out.println(weatherTest(14, -24));
        System.out.println(weatherTest(27, 2));
    }

    public static String weatherTest(int ageOfPeople, int temperature) {// tut byl sozdan metod
        if (ageOfPeople > 20 && ageOfPeople < 45 && temperature > -20 && temperature < 30)
            return "You can go for a walk ";
        else if (ageOfPeople < 20 && temperature > 0 && temperature < 28)
            return "You can go for a walk ";
        else if (ageOfPeople > 45 && temperature > -10 && temperature < 25)
            return "You can go for a walk ";
        else
            return "Stay home ";
    }
}


