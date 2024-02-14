package p349ob;

import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p327mb.C15712a;

/* renamed from: ob.e */
/* compiled from: JvmMetadataVersion.kt */
public final class C15834e extends C15712a {

    /* renamed from: h */
    public static final C15835a f65278h = new C15835a((C13695i) null);

    /* renamed from: i */
    public static final C15834e f65279i = new C15834e(1, 7, 1);

    /* renamed from: j */
    public static final C15834e f65280j = new C15834e(new int[0]);

    /* renamed from: g */
    private final boolean f65281g;

    /* renamed from: ob.e$a */
    /* compiled from: JvmMetadataVersion.kt */
    public static final class C15835a {
        private C15835a() {
        }

        public /* synthetic */ C15835a(C13695i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15834e(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        C13706o.m87929f(iArr, "versionArray");
        this.f65281g = z;
    }

    /* renamed from: h */
    public boolean mo75618h() {
        boolean z;
        if (mo75147a() == 1 && mo75148b() == 0) {
            return false;
        }
        if (this.f65281g) {
            z = mo75153f(f65279i);
        } else {
            int a = mo75147a();
            C15834e eVar = f65279i;
            z = a == eVar.mo75147a() && mo75148b() <= eVar.mo75148b() + 1;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15834e(int... iArr) {
        this(iArr, false);
        C13706o.m87929f(iArr, "numbers");
    }
}
