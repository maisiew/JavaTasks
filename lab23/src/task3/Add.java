package task3;

public class Add extends MathOp {
    public Add(Op left, Op right) {
        super(left, right);
    }

    public Add(Op left, Variable vRight) {
        super(left, vRight);
    }

    public Add(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Add(Variable vLeft, Op right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }
}
