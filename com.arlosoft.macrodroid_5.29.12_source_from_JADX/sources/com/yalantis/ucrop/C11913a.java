package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yalantis.ucrop.a */
/* compiled from: UCrop */
public class C11913a {

    /* renamed from: a */
    private Intent f57986a = new Intent();

    /* renamed from: b */
    private Bundle f57987b;

    /* renamed from: com.yalantis.ucrop.a$a */
    /* compiled from: UCrop */
    public static class C11914a {

        /* renamed from: a */
        private final Bundle f57988a = new Bundle();

        @NonNull
        /* renamed from: a */
        public Bundle mo67211a() {
            return this.f57988a;
        }

        /* renamed from: b */
        public void mo67212b(boolean z) {
            this.f57988a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z);
        }

        /* renamed from: c */
        public void mo67213c(@NonNull Bitmap.CompressFormat compressFormat) {
            this.f57988a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        /* renamed from: d */
        public void mo67214d(@Nullable String str) {
            this.f57988a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        /* renamed from: e */
        public void mo67215e(float f, float f2) {
            this.f57988a.putFloat("com.yalantis.ucrop.AspectRatioX", f);
            this.f57988a.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        }
    }

    private C11913a(@NonNull Uri uri, @NonNull Uri uri2) {
        Bundle bundle = new Bundle();
        this.f57987b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f57987b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    @Nullable
    /* renamed from: b */
    public static Uri m82204b(@NonNull Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    /* renamed from: c */
    public static C11913a m82205c(@NonNull Uri uri, @NonNull Uri uri2) {
        return new C11913a(uri, uri2);
    }

    /* renamed from: a */
    public Intent mo67207a(@NonNull Context context) {
        this.f57986a.setClass(context, UCropActivity.class);
        this.f57986a.putExtras(this.f57987b);
        return this.f57986a;
    }

    /* renamed from: d */
    public C11913a mo67208d(float f, float f2) {
        this.f57987b.putFloat("com.yalantis.ucrop.AspectRatioX", f);
        this.f57987b.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        return this;
    }

    /* renamed from: e */
    public C11913a mo67209e(@IntRange(from = 10) int i, @IntRange(from = 10) int i2) {
        if (i < 10) {
            i = 10;
        }
        if (i2 < 10) {
            i2 = 10;
        }
        this.f57987b.putInt("com.yalantis.ucrop.MaxSizeX", i);
        this.f57987b.putInt("com.yalantis.ucrop.MaxSizeY", i2);
        return this;
    }

    /* renamed from: f */
    public C11913a mo67210f(@NonNull C11914a aVar) {
        this.f57987b.putAll(aVar.mo67211a());
        return this;
    }
}
