package p318lb;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p327mb.C15712a;
import p424wa.C16788e;

/* renamed from: lb.a */
/* compiled from: BuiltInsBinaryVersion.kt */
public final class C15617a extends C15712a {

    /* renamed from: g */
    public static final C15618a f64878g = new C15618a((C13695i) null);

    /* renamed from: h */
    public static final C15617a f64879h = new C15617a(1, 0, 7);

    /* renamed from: i */
    public static final C15617a f64880i = new C15617a(new int[0]);

    /* renamed from: lb.a$a */
    /* compiled from: BuiltInsBinaryVersion.kt */
    public static final class C15618a {
        private C15618a() {
        }

        public /* synthetic */ C15618a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C15617a mo74971a(InputStream inputStream) {
            C13706o.m87929f(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C16788e eVar = new C16788e(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C13616u.m87774u(eVar, 10));
            Iterator it = eVar.iterator();
            while (it.hasNext()) {
                ((C13603n0) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] E0 = C13566b0.m87401E0(arrayList);
            return new C15617a(Arrays.copyOf(E0, E0.length));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15617a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C13706o.m87929f(iArr, "numbers");
    }

    /* renamed from: h */
    public boolean mo74970h() {
        return mo75153f(f64879h);
    }
}
