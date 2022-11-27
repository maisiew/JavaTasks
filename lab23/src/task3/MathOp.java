package task3;

public abstract class MathOp extends Op{
    protected Op left, right;
    protected Variable vLeft, vRight;
    public MathOp(Op left, Op right){
        this.left = left;
        this.right = right;
    }

    public MathOp(Op left, Variable vRight) {
        this.left = left;
        this.vRight = vRight;
    }

    public MathOp(Variable vLeft, Variable vRight) {
        this.vLeft = vLeft;
        this.vRight = vRight;
    }
    public MathOp (Variable vLeft, Op right){
        this.vLeft = vLeft;
        this.right = right;
    }

    public abstract double getValue();

    public double evaluate(double v){
        if(right == null)
            right = vRight.toConst(v);
        if(left == null)
            left = vLeft.toConst(v);
        if(left instanceof MathOp)
            ((MathOp) left).evaluate(v);
        if(right instanceof MathOp)
            ((MathOp) right).evaluate(v);
        return getValue();
    }
}
