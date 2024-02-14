package p402u6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.core.location.LocationRequestCompat;
import com.koushikdutta.async.C11694b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import p357p6.C16098b;
import p357p6.C16099c;
import p366q6.C16217a;
import p375r6.C16350a;
import p393t6.C16570a;
import p393t6.C16575b;
import p393t6.C16576c;
import p411v6.C16714a;
import p411v6.C16715b;
import p429x6.C16849a;
import p437y6.C16936a;
import p446z6.C17039a;
import p446z6.C17040b;
import p446z6.C17041c;
import p446z6.C17042d;
import p446z6.C17043e;
import p446z6.C17044f;
import p446z6.C17045g;
import p446z6.C17048j;

/* renamed from: u6.e */
/* compiled from: Ion */
public class C16642e {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static Comparator<C16641d> f67497A = new C16643a();

    /* renamed from: v */
    static final Handler f67498v = new Handler(Looper.getMainLooper());

    /* renamed from: w */
    static int f67499w = Runtime.getRuntime().availableProcessors();

    /* renamed from: x */
    static ExecutorService f67500x = Executors.newFixedThreadPool(4);

    /* renamed from: y */
    static ExecutorService f67501y;

    /* renamed from: z */
    static HashMap<String, C16642e> f67502z = new HashMap<>();

    /* renamed from: a */
    C16217a f67503a;

    /* renamed from: b */
    C16849a f67504b;

    /* renamed from: c */
    C16936a f67505c;

    /* renamed from: d */
    C16350a f67506d;

    /* renamed from: e */
    C16570a f67507e;

    /* renamed from: f */
    C17043e f67508f;

    /* renamed from: g */
    C17041c f67509g;

    /* renamed from: h */
    C17045g f67510h;

    /* renamed from: i */
    C17039a f67511i;

    /* renamed from: j */
    C17048j f67512j;

    /* renamed from: k */
    C17044f f67513k;

    /* renamed from: l */
    C17042d f67514l;

    /* renamed from: m */
    ArrayList<C16652i> f67515m = new ArrayList<>();

    /* renamed from: n */
    String f67516n;

    /* renamed from: o */
    C16576c<C16099c<C16714a>> f67517o = new C16576c<>();

    /* renamed from: p */
    C16645c f67518p = new C16645c();

    /* renamed from: q */
    C16715b f67519q;

    /* renamed from: r */
    Context f67520r;

    /* renamed from: s */
    C16650g f67521s = new C16650g(this);

    /* renamed from: t */
    private Runnable f67522t = new C16644b();

    /* renamed from: u */
    WeakHashMap<Object, C16647d> f67523u = new WeakHashMap<>();

    /* renamed from: u6.e$a */
    /* compiled from: Ion */
    static class C16643a implements Comparator<C16641d> {
        C16643a() {
        }

        /* renamed from: a */
        public int compare(C16641d dVar, C16641d dVar2) {
            int i = dVar.f67496b;
            int i2 = dVar2.f67496b;
            if (i == i2) {
                return 0;
            }
            return i < i2 ? 1 : -1;
        }
    }

    /* renamed from: u6.e$b */
    /* compiled from: Ion */
    class C16644b implements Runnable {
        C16644b() {
        }

        public void run() {
            if (!C16640c.m99057a(C16642e.this)) {
                ArrayList arrayList = null;
                for (String b : C16642e.this.f67517o.mo79393a()) {
                    Object b2 = C16642e.this.f67517o.mo79394b(b);
                    if (b2 instanceof C16641d) {
                        C16641d dVar = (C16641d) b2;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(dVar);
                    }
                }
                if (arrayList != null) {
                    Collections.sort(arrayList, C16642e.f67497A);
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        C16642e.this.f67517o.mo79395c(((C16641d) it.next()).f67494a, null);
                        C16576c<C16099c<C16714a>> cVar = C16642e.this.f67517o;
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: u6.e$c */
    /* compiled from: Ion */
    public class C16645c {

        /* renamed from: a */
        C17040b f67525a = new C16646a();

        /* renamed from: u6.e$c$a */
        /* compiled from: Ion */
        class C16646a implements C17040b {
            C16646a() {
            }
        }

        public C16645c() {
        }

        /* renamed from: a */
        public C16645c mo79549a(C16652i iVar) {
            C16642e.this.f67515m.add(iVar);
            return this;
        }
    }

    /* renamed from: u6.e$d */
    /* compiled from: Ion */
    static class C16647d extends WeakHashMap<C16098b, Boolean> {
        C16647d() {
        }
    }

    static {
        int i = f67499w;
        f67501y = i > 2 ? Executors.newFixedThreadPool(i - 1) : Executors.newFixedThreadPool(1);
    }

    private C16642e(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f67520r = applicationContext;
        this.f67516n = str;
        C16217a aVar = new C16217a(new C11694b("ion-" + str));
        this.f67503a = aVar;
        aVar.mo78737b().mo78742c(new BrowserCompatHostnameVerifier());
        this.f67503a.mo78737b().mo79306d(false);
        C16217a aVar2 = this.f67503a;
        C16849a aVar3 = new C16849a(applicationContext, this.f67503a.mo78737b());
        this.f67504b = aVar3;
        aVar2.mo78740e(aVar3);
        File file = new File(applicationContext.getCacheDir(), str);
        try {
            this.f67506d = C16350a.m98042a(this.f67503a, file, 10485760);
        } catch (IOException e) {
            C16651h.m99068a("unable to set up response cache, clearing", e);
            C16575b.m98803a(file);
            try {
                this.f67506d = C16350a.m98042a(this.f67503a, file, 10485760);
            } catch (IOException unused) {
                C16651h.m99068a("unable to set up response cache, failing", e);
            }
        }
        this.f67507e = new C16570a(new File(applicationContext.getFilesDir(), str), LocationRequestCompat.PASSIVE_INTERVAL, false);
        m99059b();
        this.f67503a.mo78739d().mo78743a(true);
        this.f67503a.mo78737b().mo78743a(true);
        this.f67519q = new C16715b(this);
        C16645c e2 = mo79544e();
        C17048j jVar = new C17048j();
        this.f67512j = jVar;
        C16645c a = e2.mo79549a(jVar);
        C17044f fVar = new C17044f();
        this.f67513k = fVar;
        C16645c a2 = a.mo79549a(fVar);
        C17043e eVar = new C17043e();
        this.f67508f = eVar;
        C16645c a3 = a2.mo79549a(eVar);
        C17041c cVar = new C17041c();
        this.f67509g = cVar;
        C16645c a4 = a3.mo79549a(cVar);
        C17045g gVar = new C17045g();
        this.f67510h = gVar;
        C16645c a5 = a4.mo79549a(gVar);
        C17039a aVar4 = new C17039a();
        this.f67511i = aVar4;
        C16645c a6 = a5.mo79549a(aVar4);
        C17042d dVar = new C17042d();
        this.f67514l = dVar;
        a6.mo79549a(dVar);
    }

    /* renamed from: b */
    private void m99059b() {
        C16217a aVar = this.f67503a;
        C16936a aVar2 = new C16936a(this);
        this.f67505c = aVar2;
        aVar.mo78740e(aVar2);
    }

    /* renamed from: g */
    public static C16642e m99060g(Context context) {
        return m99061h(context, "ion");
    }

    /* renamed from: h */
    public static C16642e m99061h(Context context, String str) {
        Objects.requireNonNull(context, "Can not pass null context in to retrieve ion instance");
        C16642e eVar = f67502z.get(str);
        if (eVar != null) {
            return eVar;
        }
        HashMap<String, C16642e> hashMap = f67502z;
        C16642e eVar2 = new C16642e(context, str);
        hashMap.put(str, eVar2);
        return eVar2;
    }

    /* renamed from: c */
    public void mo79542c() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f67523u.keySet());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo79543d(it.next());
        }
    }

    /* renamed from: d */
    public void mo79543d(Object obj) {
        C16647d remove;
        synchronized (this) {
            remove = this.f67523u.remove(obj);
        }
        if (remove != null) {
            for (C16098b bVar : remove.keySet()) {
                if (bVar != null) {
                    bVar.cancel();
                }
            }
        }
    }

    /* renamed from: e */
    public C16645c mo79544e() {
        return this.f67518p;
    }

    /* renamed from: f */
    public Context mo79545f() {
        return this.f67520r;
    }
}
