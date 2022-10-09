import java.util.ArrayList;
import java.util.List;

public class CalculateFunction {
    private int totalNum;
    private int differenceNum;

    public CalculateFunction(int totalNum, int differenceNum) {
        this.totalNum = totalNum;
        this.differenceNum = differenceNum;
    }

    public String printArithmetic() {
        String arrResult = "";
        for (int i = 1; i < this.totalNum + 1; i++) {
            //Un = a+(n-1)b
            int firstSequence = 1;
            int calculatedArithmetic = firstSequence + (i-1) * this.differenceNum;
            arrResult = arrResult + " " + calculatedArithmetic;

        }

        return arrResult;
    }

    public String printGeometry() {
        String arrResult = "";
        for (int i = 1; i < this.totalNum + 1; i++) {
            //Un = a+(n-1)b
            int firstSequence = 1;
            int calculatedGeometry = (int) Math.pow(firstSequence * this.differenceNum, i - 1);
            arrResult = arrResult + " " + calculatedGeometry;
        }

        return arrResult;
    }

    public String printFactorial() {
        String arrResult = Integer.toString(this.totalNum);
        int calculateTotal = this.totalNum;
        for (int i = this.totalNum - 1; i > 0 ; i--) {
            calculateTotal = calculateTotal * i;
            arrResult = arrResult + " * " + i;
        }

        arrResult = arrResult + " = " + calculateTotal;
        return arrResult;
    }
}
