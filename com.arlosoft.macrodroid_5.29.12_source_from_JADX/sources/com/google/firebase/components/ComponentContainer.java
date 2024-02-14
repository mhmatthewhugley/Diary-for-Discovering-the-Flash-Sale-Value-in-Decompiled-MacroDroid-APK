package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

public interface ComponentContainer {
    /* renamed from: a */
    <T> T mo22868a(Class<T> cls);

    /* renamed from: b */
    <T> Provider<Set<T>> mo22886b(Class<T> cls);

    /* renamed from: c */
    <T> Set<T> mo22869c(Class<T> cls);

    /* renamed from: d */
    <T> Provider<T> mo22887d(Class<T> cls);

    /* renamed from: e */
    <T> Deferred<T> mo22888e(Class<T> cls);
}
