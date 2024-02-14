package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class RequestConfiguration {
    @NonNull

    /* renamed from: e */
    public static final List f1702e = Arrays.asList(new String[]{"MA", ExifInterface.GPS_DIRECTION_TRUE, "PG", "G"});

    /* renamed from: a */
    private final int f1703a;

    /* renamed from: b */
    private final int f1704b;

    /* renamed from: c */
    private final String f1705c;

    /* renamed from: d */
    private final List f1706d;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static class Builder {

        /* renamed from: a */
        private int f1707a = -1;

        /* renamed from: b */
        private int f1708b = -1;

        /* renamed from: c */
        private String f1709c = null;

        /* renamed from: d */
        private final List f1710d = new ArrayList();

        @NonNull
        /* renamed from: a */
        public RequestConfiguration mo19741a() {
            return new RequestConfiguration(this.f1707a, this.f1708b, this.f1709c, this.f1710d, (zzh) null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, zzh zzh) {
        this.f1703a = i;
        this.f1704b = i2;
        this.f1705c = str;
        this.f1706d = list;
    }

    @NonNull
    /* renamed from: a */
    public String mo19737a() {
        String str = this.f1705c;
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public int mo19738b() {
        return this.f1703a;
    }

    /* renamed from: c */
    public int mo19739c() {
        return this.f1704b;
    }

    @NonNull
    /* renamed from: d */
    public List<String> mo19740d() {
        return new ArrayList(this.f1706d);
    }
}
