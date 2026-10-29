package parametersmethod;

public class ParametersMethod {

    public static void main(String[] args) {

        // Problem 1
        int var = CheckOddEven(67);
        System.out.println(var);

        // Problem 2
        int check = classifyTriangle(1, 2, 3);
        System.out.println(check);

    }

    static int CheckOddEven(int number) {
        if (number % 2 == 0) {
            return 1;

        } else {
            return 0;
        }

    }

    static int classifyTriangle(int sidea, int sideb, int sidec) {
        if (sidea <= 0 || sideb <= 0 || sidec <= 0) {
            return 0;
        }

        // Check if the triangle is valid
        if (sidea + sideb <= sidec || sidea + sidec <= sideb || sideb + sidec <= sidea) {
            return 0;
        }

        // classify triangle
        if (sidea == sideb && sideb == sidec) {
            return 1;
        } else if (sidea == sideb || sidea == sidec || sideb == sidec) {
            return 2;
        } else {
            return 3;
        }

    }

}
