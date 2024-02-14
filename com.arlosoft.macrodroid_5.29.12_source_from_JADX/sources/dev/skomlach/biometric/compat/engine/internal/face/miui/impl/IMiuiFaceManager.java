package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u0000 92\u00020\u0001:\u0005:9;<=J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J6\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\bH&JH\u0010\u0018\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\bH&JP\u0010\u0018\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\bH&J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH&J\b\u0010\u001d\u001a\u00020\bH&J\b\u0010\u001e\u001a\u00020\u0004H&J\b\u0010\u001f\u001a\u00020\u0004H&J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H&J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H&J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&R\u001e\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00105R\u0014\u00107\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00105R\u0014\u00108\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00105¨\u0006>"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$LockoutResetCallback;", "lockoutResetCallback", "Lja/u;", "addLockoutResetCallback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "i", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$AuthenticationCallback;", "authenticationCallback", "Landroid/os/Handler;", "handler", "i2", "authenticate", "", "bArr", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$EnrollmentCallback;", "enrollmentCallback", "Landroid/view/Surface;", "surface", "Landroid/graphics/Rect;", "rect", "enroll", "Landroid/graphics/RectF;", "rectF", "rectF2", "extCmd", "hasEnrolledFaces", "preInitAuthen", "release", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "miuiface", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$RemovalCallback;", "removalCallback", "remove", "", "str", "rename", "resetTimeout", "", "getEnrolledFaces", "()Ljava/util/List;", "enrolledFaces", "getManagerVersion", "()I", "managerVersion", "getVendorInfo", "()Ljava/lang/String;", "vendorInfo", "", "isFaceFeatureSupport", "()Z", "isFaceUnlockInited", "isReleased", "isSupportScreenOnDelayed", "Companion", "AuthenticationCallback", "EnrollmentCallback", "LockoutResetCallback", "RemovalCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: IMiuiFaceManager.kt */
public interface IMiuiFaceManager {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int TEMPLATE_INVALIDATE = -1;
    public static final int TEMPLATE_NONE = 0;
    public static final int TEMPLATE_SERVICE_NOT_INIT = -2;
    public static final int TEMPLATE_VALIDATE = 1;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$AuthenticationCallback;", "", "", "errorCode", "", "errString", "Lja/u;", "onAuthenticationError", "helpCode", "helpString", "onAuthenticationHelp", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "face", "onAuthenticationSucceeded", "onAuthenticationFailed", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: IMiuiFaceManager.kt */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(Miuiface miuiface) {
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$Companion;", "", "()V", "TEMPLATE_INVALIDATE", "", "TEMPLATE_NONE", "TEMPLATE_SERVICE_NOT_INIT", "TEMPLATE_VALIDATE", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: IMiuiFaceManager.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int TEMPLATE_INVALIDATE = -1;
        public static final int TEMPLATE_NONE = 0;
        public static final int TEMPLATE_SERVICE_NOT_INIT = -2;
        public static final int TEMPLATE_VALIDATE = 1;

        private Companion() {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¨\u0006\u0010"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$EnrollmentCallback;", "", "", "errMsgId", "", "errString", "Lja/u;", "onEnrollmentError", "helpMsgId", "helpString", "onEnrollmentHelp", "remaining", "faceId", "onEnrollmentProgress", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: IMiuiFaceManager.kt */
    public static abstract class EnrollmentCallback {
        public final void onEnrollmentError(int i, CharSequence charSequence) {
        }

        public final void onEnrollmentHelp(int i, CharSequence charSequence) {
        }

        public final void onEnrollmentProgress(int i, int i2) {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$LockoutResetCallback;", "", "Lja/u;", "onLockoutReset", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: IMiuiFaceManager.kt */
    public static abstract class LockoutResetCallback {
        public final void onLockoutReset() {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000e"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$RemovalCallback;", "", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "face", "", "errMsgId", "", "errString", "Lja/u;", "onRemovalError", "remaining", "onRemovalSucceeded", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: IMiuiFaceManager.kt */
    public static abstract class RemovalCallback {
        public final void onRemovalError(Miuiface miuiface, int i, CharSequence charSequence) {
        }

        public final void onRemovalSucceeded(Miuiface miuiface, int i) {
        }
    }

    void addLockoutResetCallback(LockoutResetCallback lockoutResetCallback);

    void authenticate(CancellationSignal cancellationSignal, int i, AuthenticationCallback authenticationCallback, Handler handler, int i2);

    void enroll(byte[] bArr, CancellationSignal cancellationSignal, int i, EnrollmentCallback enrollmentCallback, Surface surface, Rect rect, int i2);

    void enroll(byte[] bArr, CancellationSignal cancellationSignal, int i, EnrollmentCallback enrollmentCallback, Surface surface, RectF rectF, RectF rectF2, int i2);

    int extCmd(int i, int i2);

    List<Miuiface> getEnrolledFaces();

    int getManagerVersion();

    String getVendorInfo();

    int hasEnrolledFaces();

    boolean isFaceFeatureSupport();

    boolean isFaceUnlockInited();

    boolean isReleased();

    boolean isSupportScreenOnDelayed();

    void preInitAuthen();

    void release();

    void remove(Miuiface miuiface, RemovalCallback removalCallback);

    void rename(int i, String str);

    void resetTimeout(byte[] bArr);
}
