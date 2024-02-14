package com.arlosoft.macrodroid.action;

import android.media.AudioManager;
import android.media.MediaPlayer;
import com.arlosoft.macrodroid.action.PlaySoundAction;

/* renamed from: com.arlosoft.macrodroid.action.nd */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3282nd implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ PlaySoundAction f8776a;

    /* renamed from: c */
    public final /* synthetic */ AudioManager f8777c;

    /* renamed from: d */
    public final /* synthetic */ PlaySoundAction.C2580b f8778d;

    /* renamed from: f */
    public final /* synthetic */ long f8779f;

    public /* synthetic */ C3282nd(PlaySoundAction playSoundAction, AudioManager audioManager, PlaySoundAction.C2580b bVar, long j) {
        this.f8776a = playSoundAction;
        this.f8777c = audioManager;
        this.f8778d = bVar;
        this.f8779f = j;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f8776a.m11851D3(this.f8777c, this.f8778d, this.f8779f, mediaPlayer);
    }
}
