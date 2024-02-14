package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

public class AbtComponent {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, FirebaseABTesting> f53773a = new HashMap();

    /* renamed from: b */
    private final Context f53774b;

    /* renamed from: c */
    private final Provider<AnalyticsConnector> f53775c;

    @VisibleForTesting(otherwise = 3)
    protected AbtComponent(Context context, Provider<AnalyticsConnector> provider) {
        this.f53774b = context;
        this.f53775c = provider;
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: a */
    public FirebaseABTesting mo61987a(String str) {
        return new FirebaseABTesting(this.f53774b, this.f53775c, str);
    }

    /* renamed from: b */
    public synchronized FirebaseABTesting mo61988b(String str) {
        if (!this.f53773a.containsKey(str)) {
            this.f53773a.put(str, mo61987a(str));
        }
        return this.f53773a.get(str);
    }
}
