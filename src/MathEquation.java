public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public double getLeftVal() {
        return leftVal;
    }
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    public double getRightVal() {
        return rightVal;
    }
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    public double getopCode(){
        return opCode;
    }
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }
    public double getResult(){
        return result;
    }
    private void setResult(){
        this.result = result;
    }

    public void execute() {
        switch (opCode) {
            case '+':
                result = leftVal + rightVal;
                break;
            case '-':
                result = leftVal - rightVal;
                break;
            case '*':
                result = leftVal * rightVal;
                break;
            case '/':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
//                    if (rightVal[i] != 0)
//                        results[i] = leftVal[i] / rightVal[i];
//                    else
//                        rightVal[i] = 0.0d;
            default:
                System.out.println("Error. Invalid operator code");
                result = 0.0d;
                break;
        }
    }
}
