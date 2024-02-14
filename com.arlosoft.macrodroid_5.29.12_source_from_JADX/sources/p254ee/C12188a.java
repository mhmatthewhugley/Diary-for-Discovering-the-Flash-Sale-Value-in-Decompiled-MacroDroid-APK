package p254ee;

/* renamed from: ee.a */
/* compiled from: SequenceNumber */
public class C12188a {

    /* renamed from: a */
    private static int f58616a = 1;

    /* renamed from: a */
    public static synchronized int m82856a() {
        int i;
        synchronized (C12188a.class) {
            i = f58616a;
            f58616a = i + 1;
        }
        return i;
    }
}
