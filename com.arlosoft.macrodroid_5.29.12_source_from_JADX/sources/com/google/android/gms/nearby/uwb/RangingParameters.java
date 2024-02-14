package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class RangingParameters {
    @UwbConfigId

    /* renamed from: a */
    private final int f47831a;

    /* renamed from: b */
    private final int f47832b;
    @Nullable

    /* renamed from: c */
    private final byte[] f47833c;
    @Nullable

    /* renamed from: d */
    private final UwbComplexChannel f47834d;

    /* renamed from: e */
    private final List f47835e;
    @RangingUpdateRate

    /* renamed from: f */
    private final int f47836f;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {
        @UwbConfigId

        /* renamed from: a */
        private int f47837a = 0;

        /* renamed from: b */
        private int f47838b = 0;

        /* renamed from: c */
        private final List f47839c = new ArrayList();
        @RangingUpdateRate

        /* renamed from: d */
        int f47840d = 3;
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public @interface RangingUpdateRate {
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public @interface UwbConfigId {
    }

    @Nullable
    /* renamed from: a */
    public UwbComplexChannel mo56036a() {
        return this.f47834d;
    }

    @NonNull
    /* renamed from: b */
    public List<UwbDevice> mo56037b() {
        return this.f47835e;
    }

    @RangingUpdateRate
    /* renamed from: c */
    public int mo56038c() {
        return this.f47836f;
    }

    /* renamed from: d */
    public int mo56039d() {
        return this.f47832b;
    }

    @Nullable
    /* renamed from: e */
    public byte[] mo56040e() {
        return this.f47833c;
    }

    @UwbConfigId
    /* renamed from: f */
    public int mo56041f() {
        return this.f47831a;
    }
}
