package expressions;

public class ExpressionsThing {
    public static void main(String[] args) {
        double one = 3.14 * 5 + 5;
        System.out.println("one = " + one);
        double two = 3.14 * ( 5 + 5 );
        System.out.println("two = " + two);
        double three = ( 3.14 * ( 5 + 5 ) );
        System.out.println("three = " + three);
        int four = (5 * 6);
        System.out.println("four = " + four);
        double five = (55*0.5);
        System.out.println("five = " + five);
        double six = (0.33 * 65);
        System.out.println("six = " + six);
        double seven = (five + six);
        System.out.println("seven = " + seven);

        double eight = (3.14 * (11.3 * 11.3));
        System.out.println("eight = " + eight);
        double nine = 27.7*27.7;
        System.out.println("nine = " + nine);
        double ten = ((nine + eight)/2.0);
        System.out.println("ten = " + ten);
        double eleven = (0.17 * 243.5);
        System.out.println("eleven = " + eleven);

        int twelve = (3 / 3);
        System.out.println("twelve = " + twelve);
        int thirteen = ((4 + 2) - 7);
        System.out.println("Thirteen = " + thirteen);
        int fourteen = (((7 + 9)/3)-1);
        System.out.println("fourteen = " + fourteen);
        int fifteen =  ((2+2)+6) / ( 8/4);
        System.out.println("fifteen = " + fifteen);
    }
}
