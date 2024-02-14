package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import dev.skomlach.common.contextprovider.C12104a;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/Vibro;", "", "", "canVibrate", "Lja/u;", "start", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Landroid/os/Vibrator;", "v", "Landroid/os/Vibrator;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Vibro.kt */
public final class Vibro {
    public static final Vibro INSTANCE = new Vibro();
    private static final Context appContext;
    private static AudioManager audioManager;

    /* renamed from: v */
    private static Vibrator f58328v;

    static {
        Context g = C12104a.f58372a.mo68283g();
        appContext = g;
        f58328v = (Vibrator) g.getSystemService("vibrator");
        audioManager = (AudioManager) g.getSystemService("audio");
    }

    private Vibro() {
    }

    private final boolean canVibrate() {
        Vibrator vibrator = f58328v;
        boolean z = false;
        if (!(vibrator != null && vibrator.hasVibrator())) {
            return false;
        }
        AudioManager audioManager2 = audioManager;
        if (audioManager2 != null && audioManager2.getRingerMode() == 0) {
            z = true;
        }
        return !z;
    }

    public final void start() {
        if (!canVibrate()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Vibrator vibrator = f58328v;
            if (vibrator != null) {
                vibrator.vibrate(75);
                return;
            }
            return;
        }
        try {
            Vibrator vibrator2 = f58328v;
            if (vibrator2 != null) {
                vibrator2.vibrate(VibrationEffect.createOneShot(75, -1));
            }
        } catch (Throwable unused) {
            Vibrator vibrator3 = f58328v;
            if (vibrator3 != null) {
                vibrator3.vibrate(75);
            }
        }
    }
}
