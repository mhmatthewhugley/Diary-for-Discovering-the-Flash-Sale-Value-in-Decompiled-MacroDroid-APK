package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@RequiresApi(19)
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzkp {

    /* renamed from: g */
    private static final WeakHashMap f44814g = new WeakHashMap();

    /* renamed from: a */
    private final Context f44815a;

    /* renamed from: b */
    private final WeakReference f44816b;

    /* renamed from: c */
    private final NfcAdapter f44817c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f44818d;

    /* renamed from: e */
    private boolean f44819e;

    /* renamed from: f */
    private boolean f44820f;

    /* renamed from: a */
    public static /* synthetic */ void m62666a(zzkp zzkp, Tag tag) {
        Intent intent = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag);
        zzkp.f44815a.sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m62669f() {
        NfcAdapter nfcAdapter;
        Activity activity;
        if (!this.f44818d || !this.f44819e) {
            if (this.f44820f) {
                Activity activity2 = (Activity) this.f44816b.get();
                if (activity2 != null) {
                    this.f44817c.disableReaderMode(activity2);
                }
                this.f44820f = false;
            }
        } else if (!this.f44820f && this.f44815a.getPackageManager().hasSystemFeature("android.hardware.nfc") && ContextCompat.checkSelfPermission(this.f44815a, "android.permission.NFC") == 0 && (nfcAdapter = this.f44817c) != null && nfcAdapter.isEnabled() && (activity = (Activity) this.f44816b.get()) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("presence", 100);
            this.f44817c.enableReaderMode(activity, new zzkn(this), 385, bundle);
            this.f44820f = true;
        }
    }

    /* renamed from: d */
    public final void mo52794d() {
        this.f44819e = true;
        m62669f();
    }

    /* renamed from: e */
    public final void mo52795e() {
        this.f44819e = false;
        m62669f();
    }
}
