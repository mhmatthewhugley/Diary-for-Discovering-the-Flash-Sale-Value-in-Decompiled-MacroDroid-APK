package javax.mail.search;

public abstract class IntegerComparisonTerm extends ComparisonTerm {
    private static final long serialVersionUID = -6963571240154302484L;
    protected int number;

    protected IntegerComparisonTerm(int i, int i2) {
        this.comparison = i;
        this.number = i2;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof IntegerComparisonTerm) && ((IntegerComparisonTerm) obj).number == this.number && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public int getComparison() {
        return this.comparison;
    }

    public int getNumber() {
        return this.number;
    }

    public int hashCode() {
        return this.number + super.hashCode();
    }

    /* access modifiers changed from: protected */
    public boolean match(int i) {
        switch (this.comparison) {
            case 1:
                if (i <= this.number) {
                    return true;
                }
                return false;
            case 2:
                if (i < this.number) {
                    return true;
                }
                return false;
            case 3:
                if (i == this.number) {
                    return true;
                }
                return false;
            case 4:
                if (i != this.number) {
                    return true;
                }
                return false;
            case 5:
                if (i > this.number) {
                    return true;
                }
                return false;
            case 6:
                if (i >= this.number) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
