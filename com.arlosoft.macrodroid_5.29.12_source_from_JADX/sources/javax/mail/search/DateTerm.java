package javax.mail.search;

import java.util.Date;

public abstract class DateTerm extends ComparisonTerm {
    private static final long serialVersionUID = 4818873430063720043L;
    protected Date date;

    protected DateTerm(int i, Date date2) {
        this.comparison = i;
        this.date = date2;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof DateTerm) && ((DateTerm) obj).date.equals(this.date) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public int getComparison() {
        return this.comparison;
    }

    public Date getDate() {
        return new Date(this.date.getTime());
    }

    public int hashCode() {
        return this.date.hashCode() + super.hashCode();
    }

    /* access modifiers changed from: protected */
    public boolean match(Date date2) {
        switch (this.comparison) {
            case 1:
                if (date2.before(this.date) || date2.equals(this.date)) {
                    return true;
                }
                return false;
            case 2:
                return date2.before(this.date);
            case 3:
                return date2.equals(this.date);
            case 4:
                return !date2.equals(this.date);
            case 5:
                return date2.after(this.date);
            case 6:
                if (date2.after(this.date) || date2.equals(this.date)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
