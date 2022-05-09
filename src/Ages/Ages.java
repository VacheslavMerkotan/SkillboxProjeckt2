package Ages;

public class Ages {
    public static void main (String[] args){
        int vasyaAge = 50;
        int katyaAge = 60;
        int mishaAge = 60;

        int min = 1;
        int middle = 1;
        int max = 1;

        if (vasyaAge < katyaAge && vasyaAge < mishaAge)
            min = vasyaAge;
        if (mishaAge < katyaAge && mishaAge < vasyaAge)
            min = mishaAge;
        if (katyaAge < mishaAge && katyaAge < vasyaAge)
            min = katyaAge;
            System.out.println("Минимальный возраст " + min);

            if (vasyaAge < katyaAge && vasyaAge < mishaAge)
            middle = vasyaAge;
            if (mishaAge < katyaAge && mishaAge > vasyaAge)
            middle = mishaAge;
            if (katyaAge < mishaAge && katyaAge > vasyaAge)
            middle = katyaAge;
        System.out.println("Средний возраст " + middle);


        if (vasyaAge > katyaAge && vasyaAge > mishaAge)
            max = vasyaAge;
        if (mishaAge > katyaAge && mishaAge > vasyaAge)
            max = mishaAge;
        if (katyaAge > mishaAge && katyaAge > vasyaAge)
            max = katyaAge;
        System.out.println("Максимальный возраст " + max);


    }
}