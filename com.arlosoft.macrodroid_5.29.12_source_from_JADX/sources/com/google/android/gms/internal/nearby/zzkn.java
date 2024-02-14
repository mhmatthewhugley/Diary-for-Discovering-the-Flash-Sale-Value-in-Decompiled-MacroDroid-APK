package com.google.android.gms.internal.nearby;

import android.nfc.NfcAdapter;
import android.nfc.Tag;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzkn implements NfcAdapter.ReaderCallback {

    /* renamed from: a */
    public final /* synthetic */ zzkp f44811a;

    public /* synthetic */ zzkn(zzkp zzkp) {
        this.f44811a = zzkp;
    }

    public final void onTagDiscovered(Tag tag) {
        zzkp.m62666a(this.f44811a, tag);
    }
}
