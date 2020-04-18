import javax.print.attribute.standard.PresentationDirection;

public class Main {

    public static void main(String[] args) {

//        double[] righNums = {50.0d, 40.0d, 30.0d, 2.0d};
//        double[] leftNums = {30.0d, 40.0d, 50.0d, 1.0d};
//        char[] operator = {'+', '-', '*', '/', '%'};
//        double[] results = new double[operator.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, '+');
        equations[1] = create(25.0d, 92.0d, '-');
        equations[2] = create(225.0d, 34.0d, '*');
        equations[3] = create(11.0d, 57.0d, '/');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {

        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
}
