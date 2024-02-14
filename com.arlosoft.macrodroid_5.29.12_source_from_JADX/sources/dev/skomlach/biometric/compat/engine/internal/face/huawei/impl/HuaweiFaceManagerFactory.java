package dev.skomlach.biometric.compat.engine.internal.face.huawei.impl;

import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManagerFactory;", "", "()V", "TAG", "", "mFaceImplV1", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManagerV1Impl;", "getHuaweiFaceManager", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: HuaweiFaceManagerFactory.kt */
public final class HuaweiFaceManagerFactory {
    public static final HuaweiFaceManagerFactory INSTANCE = new HuaweiFaceManagerFactory();
    private static final String TAG = "HuaweiFaceManagerFactory";
    private static HuaweiFaceManagerV1Impl mFaceImplV1;

    private HuaweiFaceManagerFactory() {
    }

    public final HuaweiFaceManager getHuaweiFaceManager() {
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "HuaweiManager getHuaweiFaceManager");
        if (mFaceImplV1 == null) {
            mFaceImplV1 = new HuaweiFaceManagerV1Impl();
        }
        return mFaceImplV1;
    }
}
