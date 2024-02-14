package com.arlosoft.macrodroid.action;

import android.media.AudioManager;
import android.media.MediaPlayer;
import com.arlosoft.macrodroid.action.PlaySoundAction;

/* renamed from: com.arlosoft.macrodroid.action.od */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3310od implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ PlaySoundAction f8834a;

    /* renamed from: c */
    public final /* synthetic */ AudioManager f8835c;

    /* renamed from: d */
    public final /* synthetic */ PlaySoundAction.C2580b f8836d;

    /* renamed from: f */
    public final /* synthetic */ long f8837f;

    public /* synthetic */ C3310od(PlaySoundAction playSoundAction, AudioManager audioManager, PlaySoundAction.C2580b bVar, long j) {
        this.f8834a = playSoundAction;
        this.f8835c = audioManager;
        this.f8836d = bVar;
        this.f8837f = j;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f8834a.m11850C3(this.f8835c, this.f8836d, this.f8837f, mediaPlayer);
    }
}
