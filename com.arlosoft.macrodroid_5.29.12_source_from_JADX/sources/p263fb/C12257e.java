package p263fb;

import java.io.Serializable;
import kotlin.jvm.internal.C13695i;

/* renamed from: fb.e */
/* compiled from: LookupLocation.kt */
public final class C12257e implements Serializable {

    /* renamed from: a */
    public static final C12258a f58890a = new C12258a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C12257e f58891c = new C12257e(-1, -1);
    private final int column;
    private final int line;

    /* renamed from: fb.e$a */
    /* compiled from: LookupLocation.kt */
    public static final class C12258a {
        private C12258a() {
        }

        public /* synthetic */ C12258a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C12257e mo68586a() {
            return C12257e.f58891c;
        }
    }

    public C12257e(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12257e)) {
            return false;
        }
        C12257e eVar = (C12257e) obj;
        return this.line == eVar.line && this.column == eVar.column;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ')';
    }
}
