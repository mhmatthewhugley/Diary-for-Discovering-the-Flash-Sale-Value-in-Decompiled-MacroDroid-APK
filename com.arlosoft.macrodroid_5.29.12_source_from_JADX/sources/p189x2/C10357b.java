package p189x2;

import kotlin.jvm.internal.C13695i;

/* renamed from: x2.b */
/* compiled from: TaskerVariableHelper.kt */
public enum C10357b {
    FIRST_ELEMENT(0),
    COMMA_SEPARATED(1),
    NEW_LINE_SEPARATED(2);
    

    /* renamed from: a */
    public static final C10358a f23565a = null;

    /* renamed from: id */
    private final int f23570id;

    /* renamed from: x2.b$a */
    /* compiled from: TaskerVariableHelper.kt */
    public static final class C10358a {
        private C10358a() {
        }

        public /* synthetic */ C10358a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C10357b mo41024a(int i) {
            C10357b bVar;
            C10357b[] values = C10357b.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i2];
                if (bVar.mo41023e() == i) {
                    break;
                }
                i2++;
            }
            return bVar == null ? C10357b.FIRST_ELEMENT : bVar;
        }
    }

    static {
        f23565a = new C10358a((C13695i) null);
    }

    private C10357b(int i) {
        this.f23570id = i;
    }

    /* renamed from: d */
    public static final C10357b m40659d(int i) {
        return f23565a.mo41024a(i);
    }

    /* renamed from: e */
    public final int mo41023e() {
        return this.f23570id;
    }
}
