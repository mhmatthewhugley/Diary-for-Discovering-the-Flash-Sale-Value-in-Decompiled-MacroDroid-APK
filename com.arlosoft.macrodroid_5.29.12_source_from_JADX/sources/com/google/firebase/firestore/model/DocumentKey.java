package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.util.Assert;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class DocumentKey implements Comparable<DocumentKey> {

    /* renamed from: c */
    private static final Comparator<DocumentKey> f54442c;

    /* renamed from: d */
    private static final ImmutableSortedSet<DocumentKey> f54443d;

    /* renamed from: a */
    private final ResourcePath f54444a;

    static {
        Comparator<DocumentKey> a = DocumentKey$$Lambda$1.m75855a();
        f54442c = a;
        f54443d = new ImmutableSortedSet<>(Collections.emptyList(), a);
    }

    private DocumentKey(ResourcePath resourcePath) {
        Assert.m76443d(m75851m(resourcePath), "Not a document key path: %s", resourcePath);
        this.f54444a = resourcePath;
    }

    /* renamed from: b */
    public static Comparator<DocumentKey> m75845b() {
        return f54442c;
    }

    /* renamed from: e */
    public static DocumentKey m75846e() {
        return m75850j(Collections.emptyList());
    }

    /* renamed from: f */
    public static ImmutableSortedSet<DocumentKey> m75847f() {
        return f54443d;
    }

    /* renamed from: g */
    public static DocumentKey m75848g(String str) {
        ResourcePath t = ResourcePath.m75903t(str);
        Assert.m76443d(t.mo62807n() >= 4 && t.mo62803j(0).equals("projects") && t.mo62803j(2).equals("databases") && t.mo62803j(4).equals("documents"), "Tried to parse an invalid key: %s", t);
        return m75849i((ResourcePath) t.mo62808o(5));
    }

    /* renamed from: i */
    public static DocumentKey m75849i(ResourcePath resourcePath) {
        return new DocumentKey(resourcePath);
    }

    /* renamed from: j */
    public static DocumentKey m75850j(List<String> list) {
        return new DocumentKey(ResourcePath.m75902s(list));
    }

    /* renamed from: m */
    public static boolean m75851m(ResourcePath resourcePath) {
        return resourcePath.mo62807n() % 2 == 0;
    }

    /* renamed from: d */
    public int compareTo(@NonNull DocumentKey documentKey) {
        return this.f54444a.compareTo(documentKey.f54444a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DocumentKey.class != obj.getClass()) {
            return false;
        }
        return this.f54444a.equals(((DocumentKey) obj).f54444a);
    }

    public int hashCode() {
        return this.f54444a.hashCode();
    }

    /* renamed from: k */
    public ResourcePath mo62832k() {
        return this.f54444a;
    }

    /* renamed from: l */
    public boolean mo62833l(String str) {
        if (this.f54444a.mo62807n() >= 2) {
            ResourcePath resourcePath = this.f54444a;
            if (resourcePath.f54436a.get(resourcePath.mo62807n() - 2).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f54444a.toString();
    }
}
