package p392se;

import p352oe.C15855b;
import p383re.C16501d;

/* renamed from: se.g */
/* compiled from: TemporalAdjusters */
public final class C16553g {

    /* renamed from: se.g$b */
    /* compiled from: TemporalAdjusters */
    private static final class C16555b implements C16552f {

        /* renamed from: a */
        private final int f67333a;

        /* renamed from: c */
        private final int f67334c;

        /* renamed from: n */
        public C16550d mo75646n(C16550d dVar) {
            int q = dVar.mo75647q(C16540a.DAY_OF_WEEK);
            int i = this.f67333a;
            if (i < 2 && q == this.f67334c) {
                return dVar;
            }
            if ((i & 1) == 0) {
                int i2 = q - this.f67334c;
                return dVar.mo75670e((long) (i2 >= 0 ? 7 - i2 : -i2), C16541b.DAYS);
            }
            int i3 = this.f67334c - q;
            return dVar.mo75667b((long) (i3 >= 0 ? 7 - i3 : -i3), C16541b.DAYS);
        }

        private C16555b(int i, C15855b bVar) {
            C16501d.m98548i(bVar, "dayOfWeek");
            this.f67333a = i;
            this.f67334c = bVar.getValue();
        }
    }

    /* renamed from: a */
    public static C16552f m98723a(C15855b bVar) {
        return new C16555b(0, bVar);
    }

    /* renamed from: b */
    public static C16552f m98724b(C15855b bVar) {
        return new C16555b(1, bVar);
    }
}
