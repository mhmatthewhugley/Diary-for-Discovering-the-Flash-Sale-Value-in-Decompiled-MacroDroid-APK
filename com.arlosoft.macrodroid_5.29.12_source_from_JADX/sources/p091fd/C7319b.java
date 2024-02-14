package p091fd;

import p097gd.C7354d;

/* renamed from: fd.b */
/* compiled from: CurveFittedDistanceCalculator */
public class C7319b implements C7320c {

    /* renamed from: a */
    private double f17903a;

    /* renamed from: b */
    private double f17904b;

    /* renamed from: c */
    private double f17905c;

    public C7319b(double d, double d2, double d3) {
        this.f17903a = d;
        this.f17904b = d2;
        this.f17905c = d3;
    }

    /* renamed from: a */
    public double mo37277a(int i, double d) {
        double d2;
        if (d == 0.0d) {
            return -1.0d;
        }
        C7354d.m30376a("CurveFittedDistanceCalculator", "calculating distance based on mRssi of %s and txPower of %s", Double.valueOf(d), Integer.valueOf(i));
        double d3 = (d * 1.0d) / ((double) i);
        if (d3 < 1.0d) {
            d2 = Math.pow(d3, 10.0d);
        } else {
            d2 = (this.f17903a * Math.pow(d3, this.f17904b)) + this.f17905c;
        }
        C7354d.m30376a("CurveFittedDistanceCalculator", "avg mRssi: %s distance: %s", Double.valueOf(d), Double.valueOf(d2));
        return d2;
    }
}
