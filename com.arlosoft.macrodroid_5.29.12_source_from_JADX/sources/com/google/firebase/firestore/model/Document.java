package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import com.google.firestore.p228v1.Value;
import java.util.Comparator;

public interface Document {

    /* renamed from: t */
    public static final Comparator<Document> f54439t = Document$$Lambda$1.m75841a();

    /* renamed from: a */
    boolean mo62818a();

    /* renamed from: b */
    boolean mo62819b();

    /* renamed from: c */
    boolean mo62820c();

    /* renamed from: d */
    boolean mo62821d();

    /* renamed from: e */
    boolean mo62822e();

    @Nullable
    /* renamed from: f */
    Value mo62823f(FieldPath fieldPath);

    ObjectValue getData();

    DocumentKey getKey();

    SnapshotVersion getVersion();
}
