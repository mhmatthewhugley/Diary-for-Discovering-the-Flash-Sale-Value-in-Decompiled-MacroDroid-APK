package dev.skomlach.biometric.compat.impl.dialogs;

import dev.skomlach.biometric.compat.BiometricType;
import java.util.Comparator;

/* renamed from: dev.skomlach.biometric.compat.impl.dialogs.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12058i implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C12058i f58281a = new C12058i();

    private /* synthetic */ C12058i() {
    }

    public final int compare(Object obj, Object obj2) {
        return BiometricPromptCompatDialogImpl.m101336_get_primaryBiometricType_$lambda4((BiometricType) obj, (BiometricType) obj2);
    }
}
