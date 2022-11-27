package task3;

public class Divide extends MathOp {
    public Divide(Op left, Variable vRight) {
        super(left, vRight);
    }

    public Divide(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Divide(Variable vLeft, Op right) {
        super(vLeft, right);
    }

    public Divide(Op left, Op right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() / right.getValue();
    }
}
