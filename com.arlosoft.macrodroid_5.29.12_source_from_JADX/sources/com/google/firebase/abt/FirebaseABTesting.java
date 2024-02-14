package com.google.firebase.abt;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirebaseABTesting {

    /* renamed from: a */
    private final Provider<AnalyticsConnector> f53770a;

    /* renamed from: b */
    private final String f53771b;
    @Nullable

    /* renamed from: c */
    private Integer f53772c = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.f53770a = provider;
        this.f53771b = str;
    }

    /* renamed from: a */
    private void m74437a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        this.f53770a.get().mo61992a(conditionalUserProperty);
    }

    /* renamed from: b */
    private void m74438b(List<AbtExperimentInfo> list) {
        ArrayDeque arrayDeque = new ArrayDeque(m74440d());
        int g = m74443g();
        for (AbtExperimentInfo next : list) {
            while (arrayDeque.size() >= g) {
                m74444i(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).f53785b);
            }
            AnalyticsConnector.ConditionalUserProperty d = next.mo61984d(this.f53771b);
            m74437a(d);
            arrayDeque.offer(d);
        }
    }

    /* renamed from: c */
    private static List<AbtExperimentInfo> m74439c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> a : list) {
            arrayList.add(AbtExperimentInfo.m74432a(a));
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: d */
    private List<AnalyticsConnector.ConditionalUserProperty> m74440d() {
        return this.f53770a.get().mo61998f(this.f53771b, "");
    }

    /* renamed from: e */
    private ArrayList<AbtExperimentInfo> m74441e(List<AbtExperimentInfo> list, Set<String> set) {
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<>();
        for (AbtExperimentInfo next : list) {
            if (!set.contains(next.mo61982b())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private ArrayList<AnalyticsConnector.ConditionalUserProperty> m74442f(List<AnalyticsConnector.ConditionalUserProperty> list, Set<String> set) {
        ArrayList<AnalyticsConnector.ConditionalUserProperty> arrayList = new ArrayList<>();
        for (AnalyticsConnector.ConditionalUserProperty next : list) {
            if (!set.contains(next.f53785b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: g */
    private int m74443g() {
        if (this.f53772c == null) {
            this.f53772c = Integer.valueOf(this.f53770a.get().mo61997e(this.f53771b));
        }
        return this.f53772c.intValue();
    }

    /* renamed from: i */
    private void m74444i(String str) {
        this.f53770a.get().clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    /* renamed from: j */
    private void m74445j(Collection<AnalyticsConnector.ConditionalUserProperty> collection) {
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : collection) {
            m74444i(conditionalUserProperty.f53785b);
        }
    }

    /* renamed from: l */
    private void m74446l(List<AbtExperimentInfo> list) throws AbtException {
        if (list.isEmpty()) {
            mo61985h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (AbtExperimentInfo b : list) {
            hashSet.add(b.mo61982b());
        }
        List<AnalyticsConnector.ConditionalUserProperty> d = m74440d();
        HashSet hashSet2 = new HashSet();
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : d) {
            hashSet2.add(conditionalUserProperty.f53785b);
        }
        m74445j(m74442f(d, hashSet));
        m74438b(m74441e(list, hashSet2));
    }

    /* renamed from: m */
    private void m74447m() throws AbtException {
        if (this.f53770a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @WorkerThread
    /* renamed from: h */
    public void mo61985h() throws AbtException {
        m74447m();
        m74445j(m74440d());
    }

    @WorkerThread
    /* renamed from: k */
    public void mo61986k(List<Map<String, String>> list) throws AbtException {
        m74447m();
        if (list != null) {
            m74446l(m74439c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
