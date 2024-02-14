package p391sd;

import p373qd.C16293h;

/* renamed from: sd.c */
/* compiled from: Evaluator */
public abstract class C16533c {

    /* renamed from: sd.c$a */
    /* compiled from: Evaluator */
    public static final class C16534a extends C16533c {

        /* renamed from: a */
        private final String f67265a;

        public C16534a(String str) {
            this.f67265a = str;
        }

        /* renamed from: a */
        public boolean mo79334a(C16293h hVar, C16293h hVar2) {
            return hVar2.mo78912s(this.f67265a);
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.f67265a});
        }
    }

    /* renamed from: sd.c$b */
    /* compiled from: Evaluator */
    public static final class C16535b extends C16533c {

        /* renamed from: a */
        private final String f67266a;

        public C16535b(String str) {
            this.f67266a = str;
        }

        /* renamed from: a */
        public boolean mo79334a(C16293h hVar, C16293h hVar2) {
            return hVar2.mo78875o0(this.f67266a);
        }

        public String toString() {
            return String.format(".%s", new Object[]{this.f67266a});
        }
    }

    /* renamed from: sd.c$c */
    /* compiled from: Evaluator */
    public static final class C16536c extends C16533c {

        /* renamed from: a */
        private final String f67267a;

        public C16536c(String str) {
            this.f67267a = str;
        }

        /* renamed from: a */
        public boolean mo79334a(C16293h hVar, C16293h hVar2) {
            return this.f67267a.equals(hVar2.mo78880s0());
        }

        public String toString() {
            return String.format("#%s", new Object[]{this.f67267a});
        }
    }

    /* renamed from: sd.c$d */
    /* compiled from: Evaluator */
    public static final class C16537d extends C16533c {

        /* renamed from: a */
        private final String f67268a;

        public C16537d(String str) {
            this.f67268a = str;
        }

        /* renamed from: a */
        public boolean mo79334a(C16293h hVar, C16293h hVar2) {
            return hVar2.mo78885z0().equals(this.f67268a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f67268a});
        }
    }

    protected C16533c() {
    }

    /* renamed from: a */
    public abstract boolean mo79334a(C16293h hVar, C16293h hVar2);
}
