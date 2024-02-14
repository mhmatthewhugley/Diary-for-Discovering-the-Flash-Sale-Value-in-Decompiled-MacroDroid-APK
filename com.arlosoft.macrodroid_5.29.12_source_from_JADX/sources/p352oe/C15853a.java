package p352oe;

import java.io.Serializable;

/* renamed from: oe.a */
/* compiled from: Clock */
public abstract class C15853a {

    /* renamed from: oe.a$a */
    /* compiled from: Clock */
    static final class C15854a extends C15853a implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;
        private final C15890p zone;

        C15854a(C15890p pVar) {
            this.zone = pVar;
        }

        /* renamed from: a */
        public C15890p mo75635a() {
            return this.zone;
        }

        /* renamed from: b */
        public C15858d mo75636b() {
            return C15858d.m95506E(mo75637d());
        }

        /* renamed from: d */
        public long mo75637d() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C15854a) {
                return this.zone.equals(((C15854a) obj).zone);
            }
            return false;
        }

        public int hashCode() {
            return this.zone.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.zone + "]";
        }
    }

    protected C15853a() {
    }

    /* renamed from: c */
    public static C15853a m95481c() {
        return new C15854a(C15890p.m95826w());
    }

    /* renamed from: a */
    public abstract C15890p mo75635a();

    /* renamed from: b */
    public abstract C15858d mo75636b();
}
