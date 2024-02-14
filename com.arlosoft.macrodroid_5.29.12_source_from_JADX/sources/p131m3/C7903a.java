package p131m3;

import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17541R$string;

/* renamed from: m3.a */
/* compiled from: MacroDroidMediaButton.kt */
public enum C7903a {
    PLAY(0, C17541R$string.media_button_play),
    PLAY_PAUSE(1, C17541R$string.action_control_media_play_pause),
    PAUSE(2, C17541R$string.media_button_pause),
    STOP(3, C17541R$string.action_control_media_stop),
    PREVIOUS(4, C17541R$string.media_button_previous),
    NEXT(5, C17541R$string.media_button_next),
    HEADSET_HOOK(6, C17541R$string.media_button_headset_hook);
    

    /* renamed from: id */
    private final int f18999id;
    private final int stringRes;

    private C7903a(int i, @StringRes int i2) {
        this.f18999id = i;
        this.stringRes = i2;
    }

    /* renamed from: d */
    public final int mo37794d() {
        return this.f18999id;
    }

    /* renamed from: e */
    public final int mo37795e() {
        return this.stringRes;
    }
}
