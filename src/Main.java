public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 17;

        if(age >= 18){
            System.out.println("Человек совершеннолетний");
        }else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        //Задание2
        int temper = 20;

        if(temper > 5){
            System.out.println("На улице холодно, нужно надеть шапку");
        }else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //Задание 3
        int speed = 100;
        if(speed > 60){
            System.out.println("Скорость превышена, придется заплатить штраф");
        }else {
            System.out.println("Превышения скорости нет, можно ездить спокойно");
        }

        //Задание 4
        int humanAge = 25;

        if(humanAge >= 2 && humanAge <= 6){
            System.out.println("Человеку нужно ходжить в детский сад");
        }else if(humanAge >= 7 && humanAge <= 17){
            System.out.println("Человеку нужно ходить в школу");
        }else if(humanAge >= 18 && humanAge <= 24){
            System.out.println("Человеку нужно учиться в угиверситете");
        }else{
            System.out.println("Человеку пора на работу");
        }

        //Задание 5
        int childAge = 15;

        if(childAge < 5){
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого");
        }else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        //Задание 6
        int wagonCapacity = 102;
        int wagonSittingCapacity = 60;
        int wagonStandingCapacity = wagonCapacity - wagonSittingCapacity;

        int numberOfPassengers = 102;
        int numberOfSittingPassengers = 60;
        int numberOfStandingPassengers = numberOfPassengers - numberOfSittingPassengers;
        int freeSitPlace = wagonSittingCapacity - numberOfSittingPassengers;
        int freeStandPlace = wagonStandingCapacity - numberOfStandingPassengers;

        if(numberOfPassengers < wagonCapacity){
            System.out.println("В вагоне есть свободные места");
        }
        if(numberOfSittingPassengers < wagonSittingCapacity){
            System.out.println("В вагоне " + freeSitPlace + " сидящих мест");
        }
        if(numberOfStandingPassengers < wagonStandingCapacity){
            System.out.println("В вагоне " + freeStandPlace + " стоящих места");
        }else {
            System.out.println("Свободных мест в вагоне нет");
        }

        //Задание 7
        int one = 10;
        int two = 15;
        int three = 20;

        if(one > two && one > three){
            System.out.println("Число " + one + " наибольшее");
        }else if (two > one && two > three){
            System.out.println("Число " + two + " наибольшее");
        } else if(three > one && three > two) {
            System.out.println("Число " + three + " наибольшее");
        }

    }
}