package TestIf;

public class TestIf
{
    public static void main(String[] args) {
        int salary = 1500;
        boolean b = true;

        if (salary < 200) {
            System.out.println("З/П очень низкая");
        } else if (salary < 400 && b == false || true) {
            System.out.println("З/П среднего размера");
        } else if (b == true) {
            System.out.println("З/П высокая");
        }





        //else {
        //  System.out.println("З/П отличная");
        }
    }
