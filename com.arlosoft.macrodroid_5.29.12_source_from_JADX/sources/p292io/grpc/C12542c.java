package p292io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p292io.grpc.C12900j;

/* renamed from: io.grpc.c */
/* compiled from: CallOptions */
public final class C12542c {

    /* renamed from: k */
    public static final C12542c f59449k = new C12542c();

    /* renamed from: a */
    private C12977s f59450a;

    /* renamed from: b */
    private Executor f59451b;

    /* renamed from: c */
    private String f59452c;

    /* renamed from: d */
    private C12530b f59453d;

    /* renamed from: e */
    private String f59454e;

    /* renamed from: f */
    private Object[][] f59455f = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

    /* renamed from: g */
    private List<C12900j.C12901a> f59456g = Collections.emptyList();

    /* renamed from: h */
    private Boolean f59457h;

    /* renamed from: i */
    private Integer f59458i;

    /* renamed from: j */
    private Integer f59459j;

    /* renamed from: io.grpc.c$a */
    /* compiled from: CallOptions */
    public static final class C12543a<T> {

        /* renamed from: a */
        private final String f59460a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final T f59461b;

        private C12543a(String str, T t) {
            this.f59460a = str;
            this.f59461b = t;
        }

        /* renamed from: b */
        public static <T> C12543a<T> m83731b(String str) {
            Preconditions.m5393t(str, "debugString");
            return new C12543a<>(str, (Object) null);
        }

        public String toString() {
            return this.f59460a;
        }
    }

    private C12542c() {
    }

    /* renamed from: a */
    public String mo69076a() {
        return this.f59452c;
    }

    /* renamed from: b */
    public String mo69077b() {
        return this.f59454e;
    }

    /* renamed from: c */
    public C12530b mo69078c() {
        return this.f59453d;
    }

    /* renamed from: d */
    public C12977s mo69079d() {
        return this.f59450a;
    }

    /* renamed from: e */
    public Executor mo69080e() {
        return this.f59451b;
    }

    /* renamed from: f */
    public Integer mo69081f() {
        return this.f59458i;
    }

    /* renamed from: g */
    public Integer mo69082g() {
        return this.f59459j;
    }

    /* renamed from: h */
    public <T> T mo69083h(C12543a<T> aVar) {
        Preconditions.m5393t(aVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f59455f;
            if (i >= objArr.length) {
                return aVar.f59461b;
            }
            if (aVar.equals(objArr[i][0])) {
                return this.f59455f[i][1];
            }
            i++;
        }
    }

    /* renamed from: i */
    public List<C12900j.C12901a> mo69084i() {
        return this.f59456g;
    }

    /* renamed from: j */
    public boolean mo69085j() {
        return Boolean.TRUE.equals(this.f59457h);
    }

    /* renamed from: k */
    public C12542c mo69086k(C12530b bVar) {
        C12542c cVar = new C12542c(this);
        cVar.f59453d = bVar;
        return cVar;
    }

    /* renamed from: l */
    public C12542c mo69087l(C12977s sVar) {
        C12542c cVar = new C12542c(this);
        cVar.f59450a = sVar;
        return cVar;
    }

    /* renamed from: m */
    public C12542c mo69088m(Executor executor) {
        C12542c cVar = new C12542c(this);
        cVar.f59451b = executor;
        return cVar;
    }

    /* renamed from: n */
    public C12542c mo69089n(int i) {
        Preconditions.m5381h(i >= 0, "invalid maxsize %s", i);
        C12542c cVar = new C12542c(this);
        cVar.f59458i = Integer.valueOf(i);
        return cVar;
    }

    /* renamed from: o */
    public C12542c mo69090o(int i) {
        Preconditions.m5381h(i >= 0, "invalid maxsize %s", i);
        C12542c cVar = new C12542c(this);
        cVar.f59459j = Integer.valueOf(i);
        return cVar;
    }

    /* renamed from: p */
    public <T> C12542c mo69091p(C12543a<T> aVar, T t) {
        Preconditions.m5393t(aVar, "key");
        Preconditions.m5393t(t, "value");
        C12542c cVar = new C12542c(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f59455f;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (aVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        int length = this.f59455f.length;
        int i2 = i == -1 ? 1 : 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length + i2;
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
        cVar.f59455f = objArr2;
        Object[][] objArr3 = this.f59455f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            cVar.f59455f[this.f59455f.length] = new Object[]{aVar, t};
        } else {
            cVar.f59455f[i] = new Object[]{aVar, t};
        }
        return cVar;
    }

    /* renamed from: q */
    public C12542c mo69092q(C12900j.C12901a aVar) {
        C12542c cVar = new C12542c(this);
        ArrayList arrayList = new ArrayList(this.f59456g.size() + 1);
        arrayList.addAll(this.f59456g);
        arrayList.add(aVar);
        cVar.f59456g = Collections.unmodifiableList(arrayList);
        return cVar;
    }

    /* renamed from: r */
    public C12542c mo69093r() {
        C12542c cVar = new C12542c(this);
        cVar.f59457h = Boolean.TRUE;
        return cVar;
    }

    /* renamed from: s */
    public C12542c mo69094s() {
        C12542c cVar = new C12542c(this);
        cVar.f59457h = Boolean.FALSE;
        return cVar;
    }

    public String toString() {
        MoreObjects.ToStringHelper d = MoreObjects.m5334c(this).mo22194d("deadline", this.f59450a).mo22194d("authority", this.f59452c).mo22194d("callCredentials", this.f59453d);
        Executor executor = this.f59451b;
        return d.mo22194d("executor", executor != null ? executor.getClass() : null).mo22194d("compressorName", this.f59454e).mo22194d("customOptions", Arrays.deepToString(this.f59455f)).mo22195e("waitForReady", mo69085j()).mo22194d("maxInboundMessageSize", this.f59458i).mo22194d("maxOutboundMessageSize", this.f59459j).mo22194d("streamTracerFactories", this.f59456g).toString();
    }

    private C12542c(C12542c cVar) {
        this.f59450a = cVar.f59450a;
        this.f59452c = cVar.f59452c;
        this.f59453d = cVar.f59453d;
        this.f59451b = cVar.f59451b;
        this.f59454e = cVar.f59454e;
        this.f59455f = cVar.f59455f;
        this.f59457h = cVar.f59457h;
        this.f59458i = cVar.f59458i;
        this.f59459j = cVar.f59459j;
        this.f59456g = cVar.f59456g;
    }
}
