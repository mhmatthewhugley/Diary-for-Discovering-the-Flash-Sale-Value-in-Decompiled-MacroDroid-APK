package p431x8;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import p245de.greenrobot.event.EventBusException;

/* renamed from: x8.c */
/* compiled from: EventBus */
public class C16857c {

    /* renamed from: p */
    public static String f68056p = "Event";

    /* renamed from: q */
    private static final C16861d f68057q = new C16861d();

    /* renamed from: r */
    private static final Map<Class<?>, List<Class<?>>> f68058r = new HashMap();

    /* renamed from: a */
    private final Map<Class<?>, CopyOnWriteArrayList<C16869l>> f68059a;

    /* renamed from: b */
    private final Map<Object, List<Class<?>>> f68060b;

    /* renamed from: c */
    private final Map<Class<?>, Object> f68061c;

    /* renamed from: d */
    private final ThreadLocal<C16860c> f68062d;

    /* renamed from: e */
    private final C16862e f68063e;

    /* renamed from: f */
    private final C16856b f68064f;

    /* renamed from: g */
    private final C16855a f68065g;

    /* renamed from: h */
    private final C16868k f68066h;

    /* renamed from: i */
    private final ExecutorService f68067i;

    /* renamed from: j */
    private final boolean f68068j;

    /* renamed from: k */
    private final boolean f68069k;

    /* renamed from: l */
    private final boolean f68070l;

    /* renamed from: m */
    private final boolean f68071m;

    /* renamed from: n */
    private final boolean f68072n;

    /* renamed from: o */
    private final boolean f68073o;

    /* renamed from: x8.c$a */
    /* compiled from: EventBus */
    class C16858a extends ThreadLocal<C16860c> {
        C16858a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C16860c initialValue() {
            return new C16860c();
        }
    }

    /* renamed from: x8.c$b */
    /* compiled from: EventBus */
    static /* synthetic */ class C16859b {

        /* renamed from: a */
        static final /* synthetic */ int[] f68075a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                x8.m[] r0 = p431x8.C16870m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f68075a = r0
                x8.m r1 = p431x8.C16870m.PostThread     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f68075a     // Catch:{ NoSuchFieldError -> 0x001d }
                x8.m r1 = p431x8.C16870m.MainThread     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f68075a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x8.m r1 = p431x8.C16870m.BackgroundThread     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f68075a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x8.m r1 = p431x8.C16870m.Async     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p431x8.C16857c.C16859b.<clinit>():void");
        }
    }

    /* renamed from: x8.c$c */
    /* compiled from: EventBus */
    static final class C16860c {

        /* renamed from: a */
        final List<Object> f68076a = new ArrayList();

        /* renamed from: b */
        boolean f68077b;

        /* renamed from: c */
        boolean f68078c;

        /* renamed from: d */
        C16869l f68079d;

        /* renamed from: e */
        Object f68080e;

        /* renamed from: f */
        boolean f68081f;

        C16860c() {
        }
    }

    public C16857c() {
        this(f68057q);
    }

    /* renamed from: a */
    static void m99892a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m99892a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    public static C16861d m99893b() {
        return new C16861d();
    }

    /* renamed from: d */
    private void m99894d(C16869l lVar, Object obj, Throwable th) {
        if (obj instanceof C16866i) {
            if (this.f68069k) {
                String str = f68056p;
                Log.e(str, "SubscriberExceptionEvent subscriber " + lVar.f68113a.getClass() + " threw an exception", th);
                C16866i iVar = (C16866i) obj;
                String str2 = f68056p;
                Log.e(str2, "Initial event " + iVar.f68105c + " caused exception in " + iVar.f68106d, iVar.f68104b);
            }
        } else if (!this.f68068j) {
            if (this.f68069k) {
                String str3 = f68056p;
                Log.e(str3, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + lVar.f68113a.getClass(), th);
            }
            if (this.f68071m) {
                mo80018i(new C16866i(this, th, obj, lVar.f68113a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    /* renamed from: h */
    private List<Class<?>> m99895h(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f68058r;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m99892a(list, cls2.getInterfaces());
                }
                f68058r.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: j */
    private void m99896j(Object obj, C16860c cVar) throws Error {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.f68073o) {
            List<Class<?>> h = m99895h(cls);
            int size = h.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= m99897k(obj, cVar, h.get(i));
            }
        } else {
            z = m99897k(obj, cVar, cls);
        }
        if (!z) {
            if (this.f68070l) {
                StringBuilder sb = new StringBuilder();
                sb.append("No subscribers registered for event ");
                sb.append(cls);
            }
            if (this.f68072n && cls != C16863f.class && cls != C16866i.class) {
                mo80018i(new C16863f(this, obj));
            }
        }
    }

    /* renamed from: k */
    private boolean m99897k(Object obj, C16860c cVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f68059a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C16869l lVar = (C16869l) it.next();
            cVar.f68080e = obj;
            cVar.f68079d = lVar;
            try {
                m99898l(lVar, obj, cVar.f68078c);
                if (cVar.f68081f) {
                    return true;
                }
            } finally {
                cVar.f68080e = null;
                cVar.f68079d = null;
                cVar.f68081f = false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private void m99898l(C16869l lVar, Object obj, boolean z) {
        int i = C16859b.f68075a[lVar.f68114b.f68108b.ordinal()];
        if (i == 1) {
            mo80016f(lVar, obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.f68065g.mo80010a(lVar, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + lVar.f68114b.f68108b);
            } else if (z) {
                this.f68064f.mo80012a(lVar, obj);
            } else {
                mo80016f(lVar, obj);
            }
        } else if (z) {
            mo80016f(lVar, obj);
        } else {
            this.f68063e.mo80026a(lVar, obj);
        }
    }

    /* renamed from: n */
    private synchronized void m99899n(Object obj, boolean z, int i) {
        for (C16867j o : this.f68066h.mo80033a(obj.getClass())) {
            m99900o(obj, o, z, i);
        }
    }

    /* renamed from: o */
    private void m99900o(Object obj, C16867j jVar, boolean z, int i) {
        Object obj2;
        Class<?> cls = jVar.f68109c;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f68059a.get(cls);
        C16869l lVar = new C16869l(obj, jVar, i);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f68059a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(lVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                break;
            } else if (i2 == size || lVar.f68115c > ((C16869l) copyOnWriteArrayList.get(i2)).f68115c) {
                copyOnWriteArrayList.add(i2, lVar);
            } else {
                i2++;
            }
        }
        copyOnWriteArrayList.add(i2, lVar);
        List list = this.f68060b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f68060b.put(obj, list);
        }
        list.add(cls);
        if (z) {
            synchronized (this.f68061c) {
                obj2 = this.f68061c.get(cls);
            }
            if (obj2 != null) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    z2 = true;
                }
                m99898l(lVar, obj2, z2);
            }
        }
    }

    /* renamed from: q */
    private void m99901q(Object obj, Class<?> cls) {
        List list = this.f68059a.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C16869l lVar = (C16869l) list.get(i);
                if (lVar.f68113a == obj) {
                    lVar.f68116d = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ExecutorService mo80014c() {
        return this.f68067i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo80015e(C16864g gVar) {
        Object obj = gVar.f68098a;
        C16869l lVar = gVar.f68099b;
        C16864g.m99915b(gVar);
        if (lVar.f68116d) {
            mo80016f(lVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo80016f(C16869l lVar, Object obj) {
        try {
            lVar.f68114b.f68107a.invoke(lVar.f68113a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m99894d(lVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: g */
    public synchronized boolean mo80017g(Object obj) {
        return this.f68060b.containsKey(obj);
    }

    /* renamed from: i */
    public void mo80018i(Object obj) {
        C16860c cVar = this.f68062d.get();
        List<Object> list = cVar.f68076a;
        list.add(obj);
        if (!cVar.f68077b) {
            cVar.f68078c = Looper.getMainLooper() == Looper.myLooper();
            cVar.f68077b = true;
            if (!cVar.f68081f) {
                while (!list.isEmpty()) {
                    try {
                        m99896j(list.remove(0), cVar);
                    } finally {
                        cVar.f68077b = false;
                        cVar.f68078c = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    /* renamed from: m */
    public void mo80019m(Object obj) {
        m99899n(obj, false, 0);
    }

    /* renamed from: p */
    public synchronized void mo80020p(Object obj) {
        List<Class> list = this.f68060b.get(obj);
        if (list != null) {
            for (Class q : list) {
                m99901q(obj, q);
            }
            this.f68060b.remove(obj);
        } else {
            String str = f68056p;
            Log.w(str, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    C16857c(C16861d dVar) {
        this.f68062d = new C16858a();
        this.f68059a = new HashMap();
        this.f68060b = new HashMap();
        this.f68061c = new ConcurrentHashMap();
        this.f68063e = new C16862e(this, Looper.getMainLooper(), 10);
        this.f68064f = new C16856b(this);
        this.f68065g = new C16855a(this);
        this.f68066h = new C16868k(dVar.f68090h);
        this.f68069k = dVar.f68083a;
        this.f68070l = dVar.f68084b;
        this.f68071m = dVar.f68085c;
        this.f68072n = dVar.f68086d;
        this.f68068j = dVar.f68087e;
        this.f68073o = dVar.f68088f;
        this.f68067i = dVar.f68089g;
    }
}
