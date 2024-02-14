package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;

public class QueryListener {

    /* renamed from: a */
    private final Query f5964a;

    /* renamed from: b */
    private final EventManager.ListenOptions f5965b;

    /* renamed from: c */
    private final EventListener<ViewSnapshot> f5966c;

    /* renamed from: d */
    private boolean f5967d;

    /* renamed from: e */
    private OnlineState f5968e;
    @Nullable

    /* renamed from: f */
    private ViewSnapshot f5969f;

    /* renamed from: e */
    private void m8166e(ViewSnapshot viewSnapshot) {
        Assert.m76443d(!this.f5967d, "Trying to raise initial event for second time", new Object[0]);
        ViewSnapshot c = ViewSnapshot.m8266c(viewSnapshot.mo23987h(), viewSnapshot.mo23983e(), viewSnapshot.mo23985f(), viewSnapshot.mo23990j(), viewSnapshot.mo23981b());
        this.f5967d = true;
        this.f5966c.mo23672a(c, (FirebaseFirestoreException) null);
    }

    /* renamed from: f */
    private boolean m8167f(ViewSnapshot viewSnapshot) {
        boolean z = true;
        if (!viewSnapshot.mo23982d().isEmpty()) {
            return true;
        }
        ViewSnapshot viewSnapshot2 = this.f5969f;
        if (viewSnapshot2 == null || viewSnapshot2.mo23989i() == viewSnapshot.mo23989i()) {
            z = false;
        }
        if (viewSnapshot.mo23980a() || z) {
            return this.f5965b.f5851b;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m8168g(ViewSnapshot viewSnapshot, OnlineState onlineState) {
        Assert.m76443d(!this.f5967d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!viewSnapshot.mo23990j()) {
            return true;
        }
        OnlineState onlineState2 = OnlineState.OFFLINE;
        boolean z = !onlineState.equals(onlineState2);
        if (this.f5965b.f5852c && z) {
            Assert.m76443d(viewSnapshot.mo23990j(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
            return false;
        } else if (!viewSnapshot.mo23983e().isEmpty() || onlineState.equals(onlineState2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public Query mo23937a() {
        return this.f5964a;
    }

    /* renamed from: b */
    public void mo23938b(FirebaseFirestoreException firebaseFirestoreException) {
        this.f5966c.mo23672a(null, firebaseFirestoreException);
    }

    /* renamed from: c */
    public boolean mo23939c(OnlineState onlineState) {
        this.f5968e = onlineState;
        ViewSnapshot viewSnapshot = this.f5969f;
        if (viewSnapshot == null || this.f5967d || !m8168g(viewSnapshot, onlineState)) {
            return false;
        }
        m8166e(this.f5969f);
        return true;
    }

    /* renamed from: d */
    public boolean mo23940d(ViewSnapshot viewSnapshot) {
        boolean z = false;
        Assert.m76443d(!viewSnapshot.mo23982d().isEmpty() || viewSnapshot.mo23980a(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.f5965b.f5850a) {
            ArrayList arrayList = new ArrayList();
            for (DocumentViewChange next : viewSnapshot.mo23982d()) {
                if (next.mo23845c() != DocumentViewChange.Type.METADATA) {
                    arrayList.add(next);
                }
            }
            viewSnapshot = new ViewSnapshot(viewSnapshot.mo23987h(), viewSnapshot.mo23983e(), viewSnapshot.mo23986g(), arrayList, viewSnapshot.mo23990j(), viewSnapshot.mo23985f(), viewSnapshot.mo23980a(), true);
        }
        if (!this.f5967d) {
            if (m8168g(viewSnapshot, this.f5968e)) {
                m8166e(viewSnapshot);
            }
            this.f5969f = viewSnapshot;
            return z;
        }
        if (m8167f(viewSnapshot)) {
            this.f5966c.mo23672a(viewSnapshot, (FirebaseFirestoreException) null);
        }
        this.f5969f = viewSnapshot;
        return z;
        z = true;
        this.f5969f = viewSnapshot;
        return z;
    }
}
