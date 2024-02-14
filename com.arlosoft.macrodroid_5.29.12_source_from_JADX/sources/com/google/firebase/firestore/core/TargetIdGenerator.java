package com.google.firebase.firestore.core;

import com.google.firebase.firestore.util.Assert;

public class TargetIdGenerator {

    /* renamed from: a */
    private int f5999a;

    /* renamed from: b */
    private int f6000b;

    TargetIdGenerator(int i, int i2) {
        Assert.m76443d((i & 1) == i, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i), 1);
        this.f6000b = i;
        m8224d(i2);
    }

    /* renamed from: a */
    public static TargetIdGenerator m8222a() {
        return new TargetIdGenerator(1, 1);
    }

    /* renamed from: b */
    public static TargetIdGenerator m8223b(int i) {
        TargetIdGenerator targetIdGenerator = new TargetIdGenerator(0, i);
        targetIdGenerator.mo23965c();
        return targetIdGenerator;
    }

    /* renamed from: d */
    private void m8224d(int i) {
        Assert.m76443d((i & 1) == this.f6000b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f5999a = i;
    }

    /* renamed from: c */
    public int mo23965c() {
        int i = this.f5999a;
        this.f5999a = i + 2;
        return i;
    }
}
