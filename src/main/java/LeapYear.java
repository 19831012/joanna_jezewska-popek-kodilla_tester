public class LeapYear {

    public static boolean leapYear (int year){
        if  (year %4 != 0)  return false;

        else if (year %100 != 0) return true;

        else if (year %400 != 0) return false;

        else return true;
    }

    public static void main(String[] args) {
        if (leapYear(2003)) System.out.println("przestępny");
        else System.out.println("nieprzestępny");
    }
}
