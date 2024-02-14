package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.Supplier;

public abstract class Persistence {

    /* renamed from: a */
    static final String f54298a = "Persistence";

    /* renamed from: b */
    public static boolean f54299b = false;

    Persistence() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract BundleCache mo62685a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract IndexManager mo62686b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract MutationQueue mo62687c(User user);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract ReferenceDelegate mo62688d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract RemoteDocumentCache mo62689e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract TargetCache mo62690f();

    /* renamed from: g */
    public abstract boolean mo62691g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract <T> T mo62692h(String str, Supplier<T> supplier);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo62693i(String str, Runnable runnable);

    /* renamed from: j */
    public abstract void mo62694j();

    /* renamed from: k */
    public abstract void mo62695k();
}
