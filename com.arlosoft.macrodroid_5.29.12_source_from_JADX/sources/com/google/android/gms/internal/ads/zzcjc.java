package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcjc implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f28619a;

    /* renamed from: c */
    private final zzcjb f28620c;

    /* renamed from: d */
    private boolean f28621d;

    /* renamed from: f */
    private boolean f28622f;

    /* renamed from: g */
    private boolean f28623g;

    /* renamed from: o */
    private float f28624o = 1.0f;

    public zzcjc(Context context, zzcjb zzcjb) {
        this.f28619a = (AudioManager) context.getSystemService("audio");
        this.f28620c = zzcjb;
    }

    /* renamed from: f */
    private final void m45471f() {
        boolean z = false;
        if (!this.f28622f || this.f28623g || this.f28624o <= 0.0f) {
            if (this.f28621d) {
                AudioManager audioManager = this.f28619a;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f28621d = z;
                }
                this.f28620c.mo43614n();
            }
        } else if (!this.f28621d) {
            AudioManager audioManager2 = this.f28619a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f28621d = z;
            }
            this.f28620c.mo43614n();
        }
    }

    /* renamed from: a */
    public final float mo43779a() {
        float f = this.f28623g ? 0.0f : this.f28624o;
        if (this.f28621d) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo43780b() {
        this.f28622f = true;
        m45471f();
    }

    /* renamed from: c */
    public final void mo43781c() {
        this.f28622f = false;
        m45471f();
    }

    /* renamed from: d */
    public final void mo43782d(boolean z) {
        this.f28623g = z;
        m45471f();
    }

    /* renamed from: e */
    public final void mo43783e(float f) {
        this.f28624o = f;
        m45471f();
    }

    public final void onAudioFocusChange(int i) {
        this.f28621d = i > 0;
        this.f28620c.mo43614n();
    }
}
