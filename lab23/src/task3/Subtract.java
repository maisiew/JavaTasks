package task3;

public class Subtract extends MathOp {
    public Subtract(Op left, Op right) {
        super(left, right);
    }

    public Subtract(Op left, Variable vRight) {
        super(left, vRight);
    }

    public Subtract(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Subtract(Variable vLeft, Op right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() - right.getValue();
    }
}
