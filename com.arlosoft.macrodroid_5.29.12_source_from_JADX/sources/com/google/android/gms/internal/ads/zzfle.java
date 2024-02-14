package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfle extends ContentObserver {

    /* renamed from: a */
    private final Context f36042a;

    /* renamed from: b */
    private final AudioManager f36043b;

    /* renamed from: c */
    private final zzflc f36044c;

    /* renamed from: d */
    private float f36045d;

    /* renamed from: e */
    private final zzflm f36046e;

    public zzfle(Handler handler, Context context, zzflc zzflc, zzflm zzflm, byte[] bArr) {
        super(handler);
        this.f36042a = context;
        this.f36043b = (AudioManager) context.getSystemService("audio");
        this.f36044c = zzflc;
        this.f36046e = zzflm;
    }

    /* renamed from: c */
    private final float m50454c() {
        int streamVolume = this.f36043b.getStreamVolume(3);
        int streamMaxVolume = this.f36043b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: d */
    private final void m50455d() {
        this.f36046e.mo45923d(this.f36045d);
    }

    /* renamed from: a */
    public final void mo45889a() {
        this.f36045d = m50454c();
        m50455d();
        this.f36042a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo45890b() {
        this.f36042a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m50454c();
        if (c != this.f36045d) {
            this.f36045d = c;
            m50455d();
        }
    }
}
