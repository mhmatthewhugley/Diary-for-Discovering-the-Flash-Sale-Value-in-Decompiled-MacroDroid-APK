package p401te;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import p352oe.C15858d;
import p352oe.C15864f;
import p352oe.C15892q;
import p383re.C16501d;

/* renamed from: te.f */
/* compiled from: ZoneRules */
public abstract class C16631f {

    /* renamed from: te.f$a */
    /* compiled from: ZoneRules */
    static final class C16632a extends C16631f implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;
        private final C15892q offset;

        C16632a(C15892q qVar) {
            this.offset = qVar;
        }

        /* renamed from: a */
        public C15892q mo79501a(C15858d dVar) {
            return this.offset;
        }

        /* renamed from: b */
        public C16627d mo79502b(C15864f fVar) {
            return null;
        }

        /* renamed from: c */
        public List<C15892q> mo79503c(C15864f fVar) {
            return Collections.singletonList(this.offset);
        }

        /* renamed from: d */
        public boolean mo79504d(C15858d dVar) {
            return false;
        }

        /* renamed from: e */
        public boolean mo79505e() {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16632a) {
                return this.offset.equals(((C16632a) obj).offset);
            }
            if (!(obj instanceof C16624b)) {
                return false;
            }
            C16624b bVar = (C16624b) obj;
            if (!bVar.mo79505e() || !this.offset.equals(bVar.mo79501a(C15858d.f65317a))) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public boolean mo79507f(C15864f fVar, C15892q qVar) {
            return this.offset.equals(qVar);
        }

        public int hashCode() {
            return ((((this.offset.hashCode() + 31) ^ 1) ^ 1) ^ (this.offset.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.offset;
        }
    }

    C16631f() {
    }

    /* renamed from: g */
    public static C16631f m99033g(C15892q qVar) {
        C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
        return new C16632a(qVar);
    }

    /* renamed from: a */
    public abstract C15892q mo79501a(C15858d dVar);

    /* renamed from: b */
    public abstract C16627d mo79502b(C15864f fVar);

    /* renamed from: c */
    public abstract List<C15892q> mo79503c(C15864f fVar);

    /* renamed from: d */
    public abstract boolean mo79504d(C15858d dVar);

    /* renamed from: e */
    public abstract boolean mo79505e();

    /* renamed from: f */
    public abstract boolean mo79507f(C15864f fVar, C15892q qVar);
}
