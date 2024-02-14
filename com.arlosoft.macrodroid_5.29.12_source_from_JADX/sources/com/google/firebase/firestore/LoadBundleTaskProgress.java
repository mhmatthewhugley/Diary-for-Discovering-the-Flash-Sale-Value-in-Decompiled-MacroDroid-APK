package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.firestore.bundle.BundleMetadata;

public final class LoadBundleTaskProgress {

    /* renamed from: g */
    static final LoadBundleTaskProgress f5716g = new LoadBundleTaskProgress(0, 0, 0, 0, (Exception) null, TaskState.SUCCESS);

    /* renamed from: a */
    private final int f5717a;

    /* renamed from: b */
    private final int f5718b;

    /* renamed from: c */
    private final long f5719c;

    /* renamed from: d */
    private final long f5720d;
    @NonNull

    /* renamed from: e */
    private final TaskState f5721e;
    @Nullable

    /* renamed from: f */
    private final Exception f5722f;

    public enum TaskState {
        ERROR,
        RUNNING,
        SUCCESS
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LoadBundleTaskProgress(int i, int i2, long j, long j2, @Nullable Exception exc, @NonNull TaskState taskState) {
        this.f5717a = i;
        this.f5718b = i2;
        this.f5719c = j;
        this.f5720d = j2;
        this.f5721e = taskState;
        this.f5722f = exc;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static LoadBundleTaskProgress m7904a(@NonNull BundleMetadata bundleMetadata) {
        return new LoadBundleTaskProgress(0, bundleMetadata.mo23774e(), 0, bundleMetadata.mo23773d(), (Exception) null, TaskState.RUNNING);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public static LoadBundleTaskProgress m7905b(@NonNull BundleMetadata bundleMetadata) {
        return new LoadBundleTaskProgress(bundleMetadata.mo23774e(), bundleMetadata.mo23774e(), bundleMetadata.mo23773d(), bundleMetadata.mo23773d(), (Exception) null, TaskState.SUCCESS);
    }

    /* renamed from: c */
    public long mo23729c() {
        return this.f5719c;
    }

    /* renamed from: d */
    public int mo23730d() {
        return this.f5717a;
    }

    @NonNull
    /* renamed from: e */
    public TaskState mo23731e() {
        return this.f5721e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LoadBundleTaskProgress.class != obj.getClass()) {
            return false;
        }
        LoadBundleTaskProgress loadBundleTaskProgress = (LoadBundleTaskProgress) obj;
        if (this.f5717a != loadBundleTaskProgress.f5717a || this.f5718b != loadBundleTaskProgress.f5718b || this.f5719c != loadBundleTaskProgress.f5719c || this.f5720d != loadBundleTaskProgress.f5720d || this.f5721e != loadBundleTaskProgress.f5721e) {
            return false;
        }
        Exception exc = this.f5722f;
        Exception exc2 = loadBundleTaskProgress.f5722f;
        if (exc != null) {
            return exc.equals(exc2);
        }
        if (exc2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo23733f() {
        return this.f5720d;
    }

    /* renamed from: g */
    public int mo23734g() {
        return this.f5718b;
    }

    public int hashCode() {
        long j = this.f5719c;
        long j2 = this.f5720d;
        int hashCode = ((((((((this.f5717a * 31) + this.f5718b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f5721e.hashCode()) * 31;
        Exception exc = this.f5722f;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }
}
