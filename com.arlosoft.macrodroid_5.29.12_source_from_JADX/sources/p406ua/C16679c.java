package p406ua;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import p326ma.C15710b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo71668d2 = {"Lua/c;", "", "", "b", "<init>", "()V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ua.c */
/* compiled from: Random.kt */
public abstract class C16679c {

    /* renamed from: a */
    public static final C16680a f67568a = new C16680a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C16679c f67569c = C15710b.f65018a.mo75146b();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo71668d2 = {"Lua/c$a;", "Lua/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "b", "defaultRandom", "Lua/c;", "<init>", "()V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ua.c$a */
    /* compiled from: Random.kt */
    public static final class C16680a extends C16679c implements Serializable {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, mo71668d2 = {"Lua/c$a$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: ua.c$a$a */
        /* compiled from: Random.kt */
        private static final class C16681a implements Serializable {

            /* renamed from: a */
            public static final C16681a f67570a = new C16681a();
            private static final long serialVersionUID = 0;

            private C16681a() {
            }

            private final Object readResolve() {
                return C16679c.f67568a;
            }
        }

        private C16680a() {
        }

        public /* synthetic */ C16680a(C13695i iVar) {
            this();
        }

        private final Object writeReplace() {
            return C16681a.f67570a;
        }

        /* renamed from: b */
        public int mo79577b() {
            return C16679c.f67569c.mo79577b();
        }
    }

    /* renamed from: b */
    public abstract int mo79577b();
}
