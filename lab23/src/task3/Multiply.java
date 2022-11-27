package task3;

public class Multiply extends MathOp {
    public Multiply(Op left, Op right) {
        super(left, right);
    }

    public Multiply(Op left, Variable vRight) {
        super(left, vRight);
    }

    public Multiply(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Multiply(Variable vLeft, Op right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() * right.getValue();
    }
}
