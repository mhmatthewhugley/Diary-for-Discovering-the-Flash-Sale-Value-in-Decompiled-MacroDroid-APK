package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DatabaseId;

public final class DatabaseInfo {

    /* renamed from: a */
    private final DatabaseId f5834a;

    /* renamed from: b */
    private final String f5835b;

    /* renamed from: c */
    private final String f5836c;

    /* renamed from: d */
    private final boolean f5837d;

    /* renamed from: a */
    public DatabaseId mo23839a() {
        return this.f5834a;
    }

    /* renamed from: b */
    public String mo23840b() {
        return this.f5836c;
    }

    /* renamed from: c */
    public String mo23841c() {
        return this.f5835b;
    }

    /* renamed from: d */
    public boolean mo23842d() {
        return this.f5837d;
    }

    public String toString() {
        return "DatabaseInfo(databaseId:" + this.f5834a + " host:" + this.f5836c + ")";
    }
}
