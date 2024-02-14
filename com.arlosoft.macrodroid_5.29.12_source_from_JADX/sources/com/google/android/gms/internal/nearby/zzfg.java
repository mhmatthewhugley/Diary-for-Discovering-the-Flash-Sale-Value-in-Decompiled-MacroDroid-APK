package com.google.android.gms.internal.nearby;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzfg {

    /* renamed from: d */
    private static final Map f44624d = new ArrayMap();

    /* renamed from: a */
    private final Map f44625a = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Set f44626b = new ArraySet();

    /* renamed from: c */
    private final Map f44627c = new ArrayMap();

    private zzfg() {
    }

    /* renamed from: d */
    public static synchronized zzfg m62444d(GoogleApi googleApi, @Nullable Api.ApiOptions apiOptions) {
        zzfg zzfg;
        synchronized (zzfg.class) {
            zzff zzff = new zzff(googleApi, (Api.ApiOptions) null);
            Map map = f44624d;
            if (!map.containsKey(zzff)) {
                map.put(zzff, new zzfg());
            }
            zzfg = (zzfg) map.get(zzff);
        }
        return zzfg;
    }

    /* renamed from: i */
    private final Object m62446i(String str) {
        if (!this.f44627c.containsKey(str)) {
            this.f44627c.put(str, new Object());
        }
        return this.f44627c.get(str);
    }

    /* renamed from: a */
    public final synchronized ListenerHolder.ListenerKey mo52688a(String str, String str2) {
        return ListenerHolders.m3812b(m62446i(str), "connection");
    }

    /* renamed from: b */
    public final synchronized ListenerHolder mo52689b(GoogleApi googleApi, Object obj, String str) {
        ListenerHolder A;
        A = googleApi.mo21221A(obj, str);
        ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) Preconditions.m4489l(A.mo21376b(), "Key must not be null");
        Set set = (Set) this.f44625a.get(str);
        if (set == null) {
            set = new ArraySet();
            this.f44625a.put(str, set);
        }
        set.add(listenerKey);
        return A;
    }

    /* renamed from: c */
    public final synchronized ListenerHolder mo52690c(GoogleApi googleApi, String str, String str2) {
        return mo52689b(googleApi, m62446i(str), "connection");
    }

    /* renamed from: e */
    public final synchronized Task mo52691e(GoogleApi googleApi, RegistrationMethods registrationMethods) {
        ListenerHolder.ListenerKey listenerKey;
        listenerKey = (ListenerHolder.ListenerKey) Preconditions.m4489l(registrationMethods.f3224a.mo21390b(), "Key must not be null");
        return googleApi.mo21231q(registrationMethods).mo23705f(new zzfe(this, googleApi, listenerKey, this.f44626b.add(listenerKey)));
    }

    /* renamed from: f */
    public final synchronized Task mo52692f(GoogleApi googleApi, String str) {
        ArraySet arraySet = new ArraySet();
        Set set = (Set) this.f44625a.get(str);
        if (set == null) {
            return Tasks.m66668g(arraySet);
        }
        Iterator it = new ArraySet(set).iterator();
        while (it.hasNext()) {
            ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) it.next();
            if (this.f44626b.contains(listenerKey)) {
                arraySet.add(mo52693g(googleApi, listenerKey));
            }
        }
        this.f44625a.remove(str);
        return Tasks.m66668g(arraySet);
    }

    /* renamed from: g */
    public final synchronized Task mo52693g(GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey) {
        String str;
        this.f44626b.remove(listenerKey);
        Iterator it = this.f44625a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            Set set = (Set) this.f44625a.get(str);
            if (set.contains(listenerKey)) {
                set.remove(listenerKey);
                break;
            }
        }
        if (str != null) {
            Iterator it2 = this.f44627c.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (ListenerHolders.m3812b(entry.getValue(), str).equals(listenerKey)) {
                    this.f44627c.remove(entry.getKey());
                    break;
                }
            }
        }
        return googleApi.mo21232r(listenerKey);
    }
}
