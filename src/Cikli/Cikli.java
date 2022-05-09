package Cikli;

public class Cikli {
    public static void main (String[] args)
    {
        for (int age = 15; age < 40; age++)
        {
            System.out.print(age + " лет; вы можете: ");
            if (age >= 16 && age < 18) {
                System.out.print("Иметь ученические права");
            }
            else if (age >= 18) {
                System.out.print("иметь обычные права");
            }
            else
            {
                System.out.print("жить обычной жизнью");
            }
            if (age >= 35) {
                System.out.print("вы можете балотироватья в президенты РФ");
            }
            System.out.println();
        }

    }
}
