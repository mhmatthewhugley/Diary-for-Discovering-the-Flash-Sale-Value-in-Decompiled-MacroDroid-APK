package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePath<B extends BasePath<B>> implements Comparable<B> {

    /* renamed from: a */
    final List<String> f54436a;

    BasePath(List<String> list) {
        this.f54436a = list;
    }

    /* renamed from: b */
    public B mo62794b(B b) {
        ArrayList arrayList = new ArrayList(this.f54436a);
        arrayList.addAll(b.f54436a);
        return mo62800g(arrayList);
    }

    /* renamed from: d */
    public B mo62796d(String str) {
        ArrayList arrayList = new ArrayList(this.f54436a);
        arrayList.add(str);
        return mo62800g(arrayList);
    }

    /* renamed from: e */
    public abstract String mo62797e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasePath) && compareTo((BasePath) obj) == 0;
    }

    /* renamed from: f */
    public int compareTo(@NonNull B b) {
        int n = mo62807n();
        int n2 = b.mo62807n();
        int i = 0;
        while (i < n && i < n2) {
            int compareTo = mo62803j(i).compareTo(b.mo62803j(i));
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
        }
        return Util.m76522e(n, n2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract B mo62800g(List<String> list);

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f54436a.hashCode();
    }

    /* renamed from: i */
    public String mo62802i() {
        return this.f54436a.get(mo62807n() - 1);
    }

    /* renamed from: j */
    public String mo62803j(int i) {
        return this.f54436a.get(i);
    }

    /* renamed from: k */
    public boolean mo62804k() {
        return mo62807n() == 0;
    }

    /* renamed from: l */
    public boolean mo62805l(B b) {
        if (mo62807n() + 1 != b.mo62807n()) {
            return false;
        }
        for (int i = 0; i < mo62807n(); i++) {
            if (!mo62803j(i).equals(b.mo62803j(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo62806m(B b) {
        if (mo62807n() > b.mo62807n()) {
            return false;
        }
        for (int i = 0; i < mo62807n(); i++) {
            if (!mo62803j(i).equals(b.mo62803j(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public int mo62807n() {
        return this.f54436a.size();
    }

    /* renamed from: o */
    public B mo62808o(int i) {
        int n = mo62807n();
        Assert.m76443d(n >= i, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i), Integer.valueOf(n));
        return mo62800g(this.f54436a.subList(i, n));
    }

    /* renamed from: q */
    public B mo62809q() {
        return mo62800g(this.f54436a.subList(0, mo62807n() - 1));
    }

    public String toString() {
        return mo62797e();
    }
}
