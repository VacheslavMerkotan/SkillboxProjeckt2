package Booleans.src;

public class Loader {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 400; // g
        int eggsCount = 3; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 8;


        if (powderAmount >= 400)
            if (sugarAmount >= 10)
                if (milkAmount >= 1000)
                    if (oilAmount >= 30)

                        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
                System.out.println("Вы можите приготовить Pancakes");

        if (milkAmount >= 300)
            if (powderAmount >= 5)
                if (eggsCount >= 3)

                    //milk - 300 ml, powder - 5 g, eggs - 5
                    System.out.println("Вы можете приготовить Omelette");
        if (appleCount >= 3)
            if (milkAmount >= 100)
                if (powderAmount >= 300)
                    if (eggsCount >= 4)

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
       System.out.println("Вы можете приготовить Apple pie");
    }
}