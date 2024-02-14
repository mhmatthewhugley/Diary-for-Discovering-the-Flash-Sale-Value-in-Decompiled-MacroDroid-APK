package p366q6;

import java.util.Hashtable;

/* renamed from: q6.e */
/* compiled from: AsyncSocketMiddleware */
public class C16221e extends C16224h {

    /* renamed from: a */
    String f66512a;

    /* renamed from: b */
    int f66513b;

    /* renamed from: c */
    int f66514c;

    /* renamed from: d */
    protected C16217a f66515d;

    /* renamed from: e */
    boolean f66516e;

    /* renamed from: f */
    Hashtable<String, Object> f66517f;

    /* renamed from: g */
    int f66518g;

    public C16221e(C16217a aVar, String str, int i) {
        this.f66514c = 300000;
        this.f66517f = new Hashtable<>();
        this.f66518g = Integer.MAX_VALUE;
        this.f66515d = aVar;
        this.f66512a = str;
        this.f66513b = i;
    }

    /* renamed from: a */
    public void mo78743a(boolean z) {
        this.f66516e = z;
    }

    public C16221e(C16217a aVar) {
        this(aVar, "http", 80);
    }
}
