
public class Main {
    public static void main(String[] args) {


        //1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если нет 18 то он не достиг совершеннолетия, нужно немного подождать");
        }

//2

        int temp = 17;
        if (temp >= 5) {
            System.out.println("сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("можно идти без шапки");
        }

//3

        int speed = 63;
        if (age >= 60) {
            System.out.println("Если скорость превышена надо заплатить штраф");
        } else {
            System.out.println("скорость не превышена, можно ездить спокойно");
        }
//4
        age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println("если человеку от 2 до 6 лет,то ему нужно ходить в детский сад");
        } else if (age <= 17) {
            System.out.println("если человеку от 7 до 17лет,то ему нужно ходить в школу");
        } else if (age > 24) {

            System.out.println("если человеку от 18 до 24лет,то его место в университете");
        } else {
            System.out.println("если человеку больше 24 лет, то ему пора ходить на работу");
        }

//5
        age = 15;
        if (age > 5) {
            System.out.println("если ребенку меньше 5 лет,то он не может кататься на аттракционе");
        } else if (age <= 14) {
            System.out.println("если ребенку больше 5 лет, но меньше 14, то он может кататься только в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("если ребенку больше 14 лет,то он может кататься на аттракционе без сопровождения взрослого");
        }
//6
        int passentgers = 74;
        if (passentgers < 60) {
            System.out.println("в вагоне есть сидячие места");
            if (passentgers < 102) {
                System.out.println("в вагоне есть стоячие места");
            } else {
                System.out.println("в вагоне нет мест");
            }
//7
            int one = 1;
            int two = 2;
            int three = 3;
            if (one > two && one > three) {
                System.out.println("one  максимум");
            } else {
                if (two > three) {
                    System.out.println("two  максимум");
                } else {
                    System.out.println("three  максимум");
                }
            }
        }
    }
}

