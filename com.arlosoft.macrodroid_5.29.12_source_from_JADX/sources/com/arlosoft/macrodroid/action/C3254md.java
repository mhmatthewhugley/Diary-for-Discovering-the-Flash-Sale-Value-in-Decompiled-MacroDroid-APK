package com.arlosoft.macrodroid.action;

import android.media.AudioManager;
import android.media.MediaPlayer;
import com.arlosoft.macrodroid.action.PlaySoundAction;

/* renamed from: com.arlosoft.macrodroid.action.md */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3254md implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ PlaySoundAction f8698a;

    /* renamed from: c */
    public final /* synthetic */ AudioManager f8699c;

    /* renamed from: d */
    public final /* synthetic */ PlaySoundAction.C2580b f8700d;

    /* renamed from: f */
    public final /* synthetic */ long f8701f;

    public /* synthetic */ C3254md(PlaySoundAction playSoundAction, AudioManager audioManager, PlaySoundAction.C2580b bVar, long j) {
        this.f8698a = playSoundAction;
        this.f8699c = audioManager;
        this.f8700d = bVar;
        this.f8701f = j;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f8698a.m11852E3(this.f8699c, this.f8700d, this.f8701f, mediaPlayer);
    }
}
