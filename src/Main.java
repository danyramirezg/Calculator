public class Main {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('+', 100.0d, 50.0d);
        equations[1] = new MathEquation('-',25.0d, 92.0d);
        equations[2] = new MathEquation('*', 225.0d, 34.0d);
        equations[3] = new MathEquation('/', 100.0d, 5.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }

//    public static MathEquation create(double leftVal, double rightVal, char opCode) {
//
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
