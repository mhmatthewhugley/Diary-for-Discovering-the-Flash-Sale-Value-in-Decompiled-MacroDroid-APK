package p431x8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p245de.greenrobot.event.EventBusException;

/* renamed from: x8.k */
/* compiled from: SubscriberMethodFinder */
class C16868k {

    /* renamed from: b */
    private static final Map<String, List<C16867j>> f68111b = new HashMap();

    /* renamed from: a */
    private final Map<Class<?>, Class<?>> f68112a = new ConcurrentHashMap();

    C16868k(List<Class<?>> list) {
        if (list != null) {
            for (Class next : list) {
                this.f68112a.put(next, next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C16867j> mo80033a(Class<?> cls) {
        List<C16867j> list;
        C16870m mVar;
        String name = cls.getName();
        Map<String, List<C16867j>> map = f68111b;
        synchronized (map) {
            list = map.get(name);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            String name2 = cls2.getName();
            if (name2.startsWith("java.") || name2.startsWith("javax.") || name2.startsWith("android.")) {
                break;
            }
            for (Method method : cls2.getDeclaredMethods()) {
                String name3 = method.getName();
                if (name3.startsWith("onEvent")) {
                    int modifiers = method.getModifiers();
                    if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                        Class[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1) {
                            String substring = name3.substring(7);
                            if (substring.length() == 0) {
                                mVar = C16870m.PostThread;
                            } else if (substring.equals("MainThread")) {
                                mVar = C16870m.MainThread;
                            } else if (substring.equals("BackgroundThread")) {
                                mVar = C16870m.BackgroundThread;
                            } else if (substring.equals("Async")) {
                                mVar = C16870m.Async;
                            } else if (!this.f68112a.containsKey(cls2)) {
                                throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                            }
                            Class cls3 = parameterTypes[0];
                            sb.setLength(0);
                            sb.append(name3);
                            sb.append('>');
                            sb.append(cls3.getName());
                            if (hashSet.add(sb.toString())) {
                                arrayList.add(new C16867j(method, mVar, cls3));
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f68112a.containsKey(cls2)) {
                        String str = C16857c.f68056p;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Skipping method (not public, static or abstract): ");
                        sb2.append(cls2);
                        sb2.append(".");
                        sb2.append(name3);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Map<String, List<C16867j>> map2 = f68111b;
            synchronized (map2) {
                map2.put(name, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no public methods called " + "onEvent");
    }
}
