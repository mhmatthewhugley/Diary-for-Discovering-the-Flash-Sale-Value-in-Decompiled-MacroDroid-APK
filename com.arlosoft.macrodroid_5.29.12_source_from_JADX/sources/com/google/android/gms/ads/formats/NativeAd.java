package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class NativeAd {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class AdChoicesInfo {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class Image {
        @NonNull
        /* renamed from: a */
        public abstract Drawable mo19786a();

        /* renamed from: b */
        public abstract double mo19787b();

        @NonNull
        /* renamed from: c */
        public abstract Uri mo19788c();

        /* renamed from: d */
        public int mo19789d() {
            return -1;
        }

        /* renamed from: e */
        public int mo19790e() {
            return -1;
        }
    }
}
