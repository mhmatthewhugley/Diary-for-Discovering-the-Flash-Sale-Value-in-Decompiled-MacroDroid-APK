package com.arlosoft.macrodroid.action;

import android.media.MediaPlayer;

/* renamed from: com.arlosoft.macrodroid.action.pd */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3340pd implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ PlaySoundAction f8914a;

    public /* synthetic */ C3340pd(PlaySoundAction playSoundAction) {
        this.f8914a = playSoundAction;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return this.f8914a.m11869z3(mediaPlayer, i, i2);
    }
}
