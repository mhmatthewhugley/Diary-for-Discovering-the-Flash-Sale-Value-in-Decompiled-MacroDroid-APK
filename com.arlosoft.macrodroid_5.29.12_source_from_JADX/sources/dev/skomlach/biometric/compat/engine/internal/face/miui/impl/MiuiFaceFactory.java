package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceFactory;", "", "()V", "TAG", "", "TYPE_2D", "", "TYPE_3D", "TYPE_DEFAULT", "sCurrentAuthType", "getSCurrentAuthType", "()I", "setSCurrentAuthType", "(I)V", "getCurrentAuthType", "getFaceManager", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "authType", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: MiuiFaceFactory.kt */
public final class MiuiFaceFactory {
    public static final MiuiFaceFactory INSTANCE = new MiuiFaceFactory();
    public static final String TAG = "MiuiFaceFactory";
    public static final int TYPE_2D = 1;
    public static final int TYPE_3D = 2;
    public static final int TYPE_DEFAULT = 0;
    private static int sCurrentAuthType;

    private MiuiFaceFactory() {
    }

    public final int getCurrentAuthType() {
        int i = 1;
        if (C13706o.m87924a("ursa", Build.DEVICE)) {
            IMiuiFaceManager instance = MiuiFaceManagerImpl.Companion.getInstance();
            boolean z = false;
            if (instance != null && instance.hasEnrolledFaces() == 0) {
                z = true;
            }
            if (z) {
                i = 2;
            }
        }
        sCurrentAuthType = i;
        return i;
    }

    public final IMiuiFaceManager getFaceManager(int i) {
        if (i == 0) {
            i = getCurrentAuthType();
        }
        sCurrentAuthType = i;
        if (i == 2) {
            return Miui3DFaceManagerImpl.Companion.getInstance();
        }
        return MiuiFaceManagerImpl.Companion.getInstance();
    }

    public final int getSCurrentAuthType() {
        return sCurrentAuthType;
    }

    public final void setSCurrentAuthType(int i) {
        sCurrentAuthType = i;
    }
}
