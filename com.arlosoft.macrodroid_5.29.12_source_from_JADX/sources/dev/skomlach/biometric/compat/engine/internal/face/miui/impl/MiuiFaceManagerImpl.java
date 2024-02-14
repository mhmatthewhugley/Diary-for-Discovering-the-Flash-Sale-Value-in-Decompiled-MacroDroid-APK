package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Binder;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.IMiuiFaceManager;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.ContentResolverHelper;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.FeatureParser;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.MiuiBuild;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.SettingsSecure;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.SettingsSystem;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 \u00012\u00020\u0001:\n\u0001\u0001\u0001\u0001\u0001B\t¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J*\u0010\f\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002JL\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\"\u0010\u0014\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002Jb\u0010\u001c\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J<\u0010\u001f\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J*\u0010!\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\tH\u0002J,\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J \u0010'\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010)\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001a\u0010+\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002J\u001c\u0010,\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J<\u0010/\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u000100H\u0002J\u001a\u00105\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010#2\u0006\u00104\u001a\u00020\u000fH\u0002J \u00109\u001a\u00020\u00022\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000fH\u0002J\u0018\u0010:\u001a\u00020\u00022\u0006\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\u000fH\u0002J\u0018\u0010;\u001a\u00020\u00022\u0006\u00103\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010<\u001a\u00020\u0002H\u0002J\b\u0010=\u001a\u00020\u0002H\u0002J \u0010?\u001a\u00020\u00022\u0006\u00106\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000fH\u0002J\u0010\u0010A\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000fH\u0002J6\u0010E\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010D2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016JH\u0010I\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010C\u001a\u00020B2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010H2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016JP\u0010I\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010C\u001a\u00020B2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010J\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010K\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000fH\u0016J\u0018\u0010M\u001a\u00020\u00022\u0006\u00103\u001a\u00020#2\u0006\u0010*\u001a\u00020LH\u0016J\u0018\u0010N\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\tH\u0016J\u0012\u0010P\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010Q\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0015H\u0016J\b\u0010R\u001a\u00020\u000fH\u0016J\b\u0010S\u001a\u00020\u0002H\u0016J\b\u0010T\u001a\u00020\u0002H\u0016R\u0014\u0010V\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u000f8\u0002XD¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u0002008\u0002@\u0002X.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010i\u001a\u00020e2\u0006\u0010h\u001a\u00020e8\u0016@RX\u000e¢\u0006\f\n\u0004\bi\u0010g\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bk\u0010\\R\u0016\u0010l\u001a\u00020e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010gR\u0016\u0010m\u001a\u00020e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010gR\u0018\u0010n\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010\\R\u0014\u0010r\u001a\u00020q8\u0002X\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020e8VX\u0004¢\u0006\u0006\u001a\u0004\bx\u0010jR\u0014\u0010y\u001a\u00020e8VX\u0004¢\u0006\u0006\u001a\u0004\by\u0010jR\u0014\u0010|\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0016\u0010\u001a\u0004\u0018\u00010\t8VX\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R!\u0010\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020e8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010j¨\u0006\u0001"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "Lja/u;", "initService", "cancelAuthentication", "cancelEnrollment", "Landroid/os/IBinder;", "service", "token", "", "packName", "receiver", "binderCallPpreInitAuthen", "", "sessionId", "", "userId", "flags", "timeout", "binderCallAuthenticate", "binderCallCancelAuthention", "", "cryptoToken", "groupId", "Landroid/view/Surface;", "surface", "Landroid/graphics/RectF;", "detectArea", "binderCallEnroll", "binderCallCancelEnrollment", "faceId", "binderCallRemove", "name", "binderCallRename", "", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "binderCallGetEnrolledFaces", "binderCallPreEnroll", "binderCallPostEnroll", "binderCallHasEnrolledFaces", "binderCallAuthenticatorId", "binderCallRestTimeout", "callback", "binderCallAddLoackoutResetCallback", "binderCallGetVendorInfo", "cmd", "param", "binderCallExtCmd", "Landroid/os/Handler;", "handler", "useHandler", "face", "remaining", "sendRemovedResult", "deviceId", "errMsgId", "vendorCode", "sendErrorResult", "sendEnrollResult", "sendAuthenticatedSucceeded", "sendAuthenticatedFailed", "sendLockoutReset", "clientInfo", "sendAcquiredResult", "msgId", "getMessageInfo", "Landroid/os/CancellationSignal;", "cancel", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$AuthenticationCallback;", "authenticate", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$EnrollmentCallback;", "enrollCallback", "Landroid/graphics/Rect;", "enroll", "enrollArea", "extCmd", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$RemovalCallback;", "remove", "rename", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$LockoutResetCallback;", "addLockoutResetCallback", "resetTimeout", "hasEnrolledFaces", "preInitAuthen", "release", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "mBinderLock", "Ljava/lang/Object;", "mToken", "Landroid/os/IBinder;", "mAuthenticationCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$AuthenticationCallback;", "mEnrollmentCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$EnrollmentCallback;", "mFaceUnlockModel", "I", "mHandler", "Landroid/os/Handler;", "", "mHasFaceData", "Z", "<set-?>", "isFaceUnlockInited", "()Z", "mServiceReceiver", "mIsSuperPower", "mIsValid", "mLockoutResetCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$LockoutResetCallback;", "mMiuiFaceService", "Landroid/os/IBinder$DeathRecipient;", "mBinderDied", "Landroid/os/IBinder$DeathRecipient;", "mRemovalCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$RemovalCallback;", "mRemovalMiuiface", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "isFaceFeatureSupport", "isSupportScreenOnDelayed", "getManagerVersion", "()I", "managerVersion", "getVendorInfo", "()Ljava/lang/String;", "vendorInfo", "getEnrolledFaces", "()Ljava/util/List;", "enrolledFaces", "isReleased", "<init>", "()V", "Companion", "ClientHandler", "FaceObserver", "OnAuthenticationCancelListener", "OnEnrollCancelListener", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: MiuiFaceManagerImpl.kt */
public final class MiuiFaceManagerImpl implements IMiuiFaceManager {
    private static final int CODE_ADD_LOCKOUT_RESET_CALLBACK = 16;
    private static final int CODE_AUTHENTICATE = 3;
    private static final int CODE_CANCEL_AUTHENTICATE = 4;
    private static final int CODE_CANCEL_ENROLL = 6;
    private static final int CODE_ENROLL = 5;
    private static final int CODE_EXT_CMD = 101;
    private static final int CODE_GET_AUTHENTICATOR_ID = 14;
    private static final int CODE_GET_ENROLLED_FACE_LIST = 9;
    private static final int CODE_GET_VENDOR_INFO = 17;
    private static final int CODE_HAS_ENROLLED_FACES = 12;
    private static final int CODE_POST_ENROLL = 11;
    private static final int CODE_PRE_ENROLL = 10;
    private static final int CODE_PRE_INIT_AUTHEN = 2;
    private static final int CODE_REMOVE = 7;
    private static final int CODE_RENAME = 8;
    private static final int CODE_RESET_TIMEOUT = 15;
    public static final Companion Companion = new Companion((C13695i) null);
    private static final boolean DEBUG = true;
    public static final int ERROR_BINDER_CALL = 2100;
    public static final int ERROR_CANCELED = 2000;
    public static final int ERROR_SERVICE_IS_BUSY = 2001;
    public static final int ERROR_SERVICE_IS_IDLE = 2002;
    public static final int ERROR_TIME_OUT = 2003;
    private static final int FACEUNLOCK_CURRENT_USE_INVALID_MODEL = 2;
    private static final int FACEUNLOCK_CURRENT_USE_RGB_MODEL = 1;
    private static final int FACEUNLOCK_CURRENT_USE_STRUCTURE_MODEL = 0;
    private static final String FACEUNLOCK_SUPPORT_SUPERPOWER = "faceunlock_support_superpower";
    private static final String FACE_UNLOCK_3D_HAS_FEATURE = "face_unlock_has_feature_sl";
    private static final String FACE_UNLOCK_HAS_FEATURE = "face_unlock_has_feature";
    private static final String FACE_UNLOCK_HAS_FEATURE_URI = "content://settings/secure/face_unlock_has_feature";
    private static final String FACE_UNLOCK_MODEL = "face_unlock_model";
    private static final String FACE_UNLOCK_VALID_FEATURE = "face_unlock_valid_feature";
    private static final String FACE_UNLOCK_VALID_FEATURE_URI = "content://settings/secure/face_unlock_valid_feature";
    /* access modifiers changed from: private */
    public static AtomicReference<IMiuiFaceManager> INSTANCE = new AtomicReference<>((Object) null);
    public static final int MG_ATTR_BLUR = 20;
    public static final int MG_ATTR_EYE_CLOSE = 22;
    public static final int MG_ATTR_EYE_OCCLUSION = 21;
    public static final int MG_ATTR_MOUTH_OCCLUSION = 23;
    public static final int MG_OPEN_CAMERA_FAIL = 1000;
    public static final int MG_OPEN_CAMERA_SUCCESS = 1001;
    public static final int MG_UNLOCK_BAD_LIGHT = 26;
    public static final int MG_UNLOCK_COMPARE_FAILURE = 12;
    public static final int MG_UNLOCK_DARKLIGHT = 30;
    public static final int MG_UNLOCK_FACE_BAD_QUALITY = 4;
    public static final int MG_UNLOCK_FACE_BLUR = 28;
    public static final int MG_UNLOCK_FACE_DOWN = 18;
    public static final int MG_UNLOCK_FACE_MULTI = 27;
    public static final int MG_UNLOCK_FACE_NOT_COMPLETE = 29;
    public static final int MG_UNLOCK_FACE_NOT_FOUND = 5;
    public static final int MG_UNLOCK_FACE_NOT_ROI = 33;
    public static final int MG_UNLOCK_FACE_OFFSET_BOTTOM = 11;
    public static final int MG_UNLOCK_FACE_OFFSET_LEFT = 8;
    public static final int MG_UNLOCK_FACE_OFFSET_RIGHT = 10;
    public static final int MG_UNLOCK_FACE_OFFSET_TOP = 9;
    public static final int MG_UNLOCK_FACE_RISE = 16;
    public static final int MG_UNLOCK_FACE_ROTATED_LEFT = 15;
    public static final int MG_UNLOCK_FACE_ROTATED_RIGHT = 17;
    public static final int MG_UNLOCK_FACE_SCALE_TOO_LARGE = 7;
    public static final int MG_UNLOCK_FACE_SCALE_TOO_SMALL = 6;
    public static final int MG_UNLOCK_FAILURE = 3;
    public static final int MG_UNLOCK_FEATURE_MISS = 24;
    public static final int MG_UNLOCK_FEATURE_VERSION_ERROR = 25;
    public static final int MG_UNLOCK_HALF_SHADOW = 32;
    public static final int MG_UNLOCK_HIGHLIGHT = 31;
    public static final int MG_UNLOCK_INVALID_ARGUMENT = 1;
    public static final int MG_UNLOCK_INVALID_HANDLE = 2;
    public static final int MG_UNLOCK_KEEP = 19;
    public static final int MG_UNLOCK_LIVENESS_FAILURE = 14;
    public static final int MG_UNLOCK_LIVENESS_WARNING = 13;
    public static final int MG_UNLOCK_OK = 0;
    private static final String POWERMODE_SUPERSAVE_OPEN = "power_supersave_mode_open";
    private static final String POWERMODE_SUPERSAVE_OPEN_URI = "content://settings/secure/power_supersave_mode_open";
    private static final String RECEIVER_DESCRIPTOR = "receiver.FaceService";
    private static final int RECEIVER_ON_AUTHENTICATION_FAILED = 204;
    private static final int RECEIVER_ON_AUTHENTICATION_SUCCEEDED = 203;
    private static final int RECEIVER_ON_ENROLL_RESULT = 201;
    private static final int RECEIVER_ON_ERROR = 205;
    private static final int RECEIVER_ON_EXT_CMD = 301;
    private static final int RECEIVER_ON_LOCKOUT_RESET = 261;
    private static final int RECEIVER_ON_ON_ACQUIRED = 202;
    private static final int RECEIVER_ON_PRE_INIT = 207;
    private static final int RECEIVER_ON_REMOVED = 206;
    private static String SERVICE_DESCRIPTOR = "miui.face.FaceService";
    private static String SERVICE_NAME = "miui.face.FaceService";
    private static final String TAG = "FaceManagerImpl";
    private static final int VERSION_1 = 1;
    /* access modifiers changed from: private */
    public static final ReentrantLock lock = new ReentrantLock();
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public boolean isFaceUnlockInited;
    private IMiuiFaceManager.AuthenticationCallback mAuthenticationCallback;
    private final IBinder.DeathRecipient mBinderDied = new C12037a(this);
    private final Object mBinderLock = new Object();
    private IMiuiFaceManager.EnrollmentCallback mEnrollmentCallback;
    private final int mFaceUnlockModel;
    /* access modifiers changed from: private */
    public Handler mHandler;
    /* access modifiers changed from: private */
    public boolean mHasFaceData;
    /* access modifiers changed from: private */
    public boolean mIsSuperPower;
    /* access modifiers changed from: private */
    public boolean mIsValid;
    private IMiuiFaceManager.LockoutResetCallback mLockoutResetCallback;
    private IBinder mMiuiFaceService;
    private IMiuiFaceManager.RemovalCallback mRemovalCallback;
    private Miuiface mRemovalMiuiface;
    private final IBinder mServiceReceiver = new MiuiFaceManagerImpl$mServiceReceiver$1(this);
    private final IBinder mToken = new Binder();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl$ClientHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "Lja/u;", "handleMessage", "Landroid/content/Context;", "context", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl;Landroid/content/Context;)V", "Landroid/os/Looper;", "looper", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl;Landroid/os/Looper;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: MiuiFaceManagerImpl.kt */
    private final class ClientHandler extends Handler {
        final /* synthetic */ MiuiFaceManagerImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientHandler(MiuiFaceManagerImpl miuiFaceManagerImpl, Context context) {
            super(context.getMainLooper());
            C13706o.m87929f(context, "context");
            this.this$0 = miuiFaceManagerImpl;
        }

        public void handleMessage(Message message) {
            C13706o.m87929f(message, NotificationCompat.CATEGORY_MESSAGE);
            BiometricLoggerImpl.INSTANCE.mo68217d(MiuiFaceManagerImpl.TAG, " handleMessage  callback what:" + message.what);
            int i = message.what;
            if (i == MiuiFaceManagerImpl.RECEIVER_ON_LOCKOUT_RESET) {
                this.this$0.sendLockoutReset();
            } else if (i != 301) {
                switch (i) {
                    case 201:
                        MiuiFaceManagerImpl miuiFaceManagerImpl = this.this$0;
                        Object obj = message.obj;
                        C13706o.m87927d(obj, "null cannot be cast to non-null type dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miuiface");
                        miuiFaceManagerImpl.sendEnrollResult((Miuiface) obj, message.arg1);
                        return;
                    case 202:
                        MiuiFaceManagerImpl miuiFaceManagerImpl2 = this.this$0;
                        Object obj2 = message.obj;
                        C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.Long");
                        miuiFaceManagerImpl2.sendAcquiredResult(((Long) obj2).longValue(), message.arg1, message.arg2);
                        return;
                    case 203:
                        MiuiFaceManagerImpl miuiFaceManagerImpl3 = this.this$0;
                        Object obj3 = message.obj;
                        C13706o.m87927d(obj3, "null cannot be cast to non-null type dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miuiface");
                        miuiFaceManagerImpl3.sendAuthenticatedSucceeded((Miuiface) obj3, message.arg1);
                        return;
                    case 204:
                        this.this$0.sendAuthenticatedFailed();
                        return;
                    case 205:
                        MiuiFaceManagerImpl miuiFaceManagerImpl4 = this.this$0;
                        Object obj4 = message.obj;
                        C13706o.m87927d(obj4, "null cannot be cast to non-null type kotlin.Long");
                        miuiFaceManagerImpl4.sendErrorResult(((Long) obj4).longValue(), message.arg1, message.arg2);
                        return;
                    case 206:
                        MiuiFaceManagerImpl miuiFaceManagerImpl5 = this.this$0;
                        Object obj5 = message.obj;
                        C13706o.m87927d(obj5, "null cannot be cast to non-null type dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miuiface");
                        miuiFaceManagerImpl5.sendRemovedResult((Miuiface) obj5, message.arg1);
                        return;
                    default:
                        return;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientHandler(MiuiFaceManagerImpl miuiFaceManagerImpl, Looper looper) {
            super(looper);
            C13706o.m87929f(looper, "looper");
            this.this$0 = miuiFaceManagerImpl;
        }
    }

    @Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010_\u001a\u0004\u0018\u00010(R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u001fXT¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020^X\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl$Companion;", "", "()V", "CODE_ADD_LOCKOUT_RESET_CALLBACK", "", "CODE_AUTHENTICATE", "CODE_CANCEL_AUTHENTICATE", "CODE_CANCEL_ENROLL", "CODE_ENROLL", "CODE_EXT_CMD", "CODE_GET_AUTHENTICATOR_ID", "CODE_GET_ENROLLED_FACE_LIST", "CODE_GET_VENDOR_INFO", "CODE_HAS_ENROLLED_FACES", "CODE_POST_ENROLL", "CODE_PRE_ENROLL", "CODE_PRE_INIT_AUTHEN", "CODE_REMOVE", "CODE_RENAME", "CODE_RESET_TIMEOUT", "DEBUG", "", "ERROR_BINDER_CALL", "ERROR_CANCELED", "ERROR_SERVICE_IS_BUSY", "ERROR_SERVICE_IS_IDLE", "ERROR_TIME_OUT", "FACEUNLOCK_CURRENT_USE_INVALID_MODEL", "FACEUNLOCK_CURRENT_USE_RGB_MODEL", "FACEUNLOCK_CURRENT_USE_STRUCTURE_MODEL", "FACEUNLOCK_SUPPORT_SUPERPOWER", "", "FACE_UNLOCK_3D_HAS_FEATURE", "FACE_UNLOCK_HAS_FEATURE", "FACE_UNLOCK_HAS_FEATURE_URI", "FACE_UNLOCK_MODEL", "FACE_UNLOCK_VALID_FEATURE", "FACE_UNLOCK_VALID_FEATURE_URI", "INSTANCE", "Ljava/util/concurrent/atomic/AtomicReference;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "MG_ATTR_BLUR", "MG_ATTR_EYE_CLOSE", "MG_ATTR_EYE_OCCLUSION", "MG_ATTR_MOUTH_OCCLUSION", "MG_OPEN_CAMERA_FAIL", "MG_OPEN_CAMERA_SUCCESS", "MG_UNLOCK_BAD_LIGHT", "MG_UNLOCK_COMPARE_FAILURE", "MG_UNLOCK_DARKLIGHT", "MG_UNLOCK_FACE_BAD_QUALITY", "MG_UNLOCK_FACE_BLUR", "MG_UNLOCK_FACE_DOWN", "MG_UNLOCK_FACE_MULTI", "MG_UNLOCK_FACE_NOT_COMPLETE", "MG_UNLOCK_FACE_NOT_FOUND", "MG_UNLOCK_FACE_NOT_ROI", "MG_UNLOCK_FACE_OFFSET_BOTTOM", "MG_UNLOCK_FACE_OFFSET_LEFT", "MG_UNLOCK_FACE_OFFSET_RIGHT", "MG_UNLOCK_FACE_OFFSET_TOP", "MG_UNLOCK_FACE_RISE", "MG_UNLOCK_FACE_ROTATED_LEFT", "MG_UNLOCK_FACE_ROTATED_RIGHT", "MG_UNLOCK_FACE_SCALE_TOO_LARGE", "MG_UNLOCK_FACE_SCALE_TOO_SMALL", "MG_UNLOCK_FAILURE", "MG_UNLOCK_FEATURE_MISS", "MG_UNLOCK_FEATURE_VERSION_ERROR", "MG_UNLOCK_HALF_SHADOW", "MG_UNLOCK_HIGHLIGHT", "MG_UNLOCK_INVALID_ARGUMENT", "MG_UNLOCK_INVALID_HANDLE", "MG_UNLOCK_KEEP", "MG_UNLOCK_LIVENESS_FAILURE", "MG_UNLOCK_LIVENESS_WARNING", "MG_UNLOCK_OK", "POWERMODE_SUPERSAVE_OPEN", "POWERMODE_SUPERSAVE_OPEN_URI", "RECEIVER_DESCRIPTOR", "RECEIVER_ON_AUTHENTICATION_FAILED", "RECEIVER_ON_AUTHENTICATION_SUCCEEDED", "RECEIVER_ON_ENROLL_RESULT", "RECEIVER_ON_ERROR", "RECEIVER_ON_EXT_CMD", "RECEIVER_ON_LOCKOUT_RESET", "RECEIVER_ON_ON_ACQUIRED", "RECEIVER_ON_PRE_INIT", "RECEIVER_ON_REMOVED", "SERVICE_DESCRIPTOR", "SERVICE_NAME", "TAG", "VERSION_1", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: MiuiFaceManagerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final IMiuiFaceManager getInstance() {
            if (MiuiFaceManagerImpl.INSTANCE.get() != null) {
                IMiuiFaceManager iMiuiFaceManager = (IMiuiFaceManager) MiuiFaceManagerImpl.INSTANCE.get();
                boolean z = true;
                if (iMiuiFaceManager == null || !iMiuiFaceManager.isReleased()) {
                    z = false;
                }
                if (z) {
                    MiuiFaceManagerImpl.INSTANCE.set((Object) null);
                }
            }
            if (MiuiFaceManagerImpl.INSTANCE.get() == null) {
                try {
                    ReentrantLock access$getLock$cp = MiuiFaceManagerImpl.lock;
                    C13329n.C13330a aVar = C13329n.f61327a;
                    access$getLock$cp.lock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th) {
                    ReentrantLock access$getLock$cp2 = MiuiFaceManagerImpl.lock;
                    try {
                        C13329n.C13330a aVar2 = C13329n.f61327a;
                        access$getLock$cp2.unlock();
                        C13329n.m85676a(C13339u.f61331a);
                    } catch (Throwable th2) {
                        C13329n.C13330a aVar3 = C13329n.f61327a;
                        C13329n.m85676a(C13332o.m85684a(th2));
                    }
                    throw th;
                }
                if (MiuiFaceManagerImpl.INSTANCE.get() == null) {
                    MiuiFaceManagerImpl.INSTANCE.set(new MiuiFaceManagerImpl());
                }
                ReentrantLock access$getLock$cp3 = MiuiFaceManagerImpl.lock;
                try {
                    C13329n.C13330a aVar4 = C13329n.f61327a;
                    access$getLock$cp3.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th3) {
                    C13329n.C13330a aVar5 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th3));
                }
            }
            return (IMiuiFaceManager) MiuiFaceManagerImpl.INSTANCE.get();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl$FaceObserver;", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "Lja/u;", "onChange", "Landroid/os/Handler;", "handler", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl;Landroid/os/Handler;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: MiuiFaceManagerImpl.kt */
    private final class FaceObserver extends ContentObserver {
        public FaceObserver(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z, Uri uri) {
            String str;
            super.onChange(z, uri);
            String str2 = null;
            if (uri != null) {
                try {
                    str = uri.getLastPathSegment();
                } catch (Throwable th) {
                    BiometricLoggerImpl.INSTANCE.mo68218e(th);
                    return;
                }
            } else {
                str = null;
            }
            boolean z2 = true;
            if (C13706o.m87924a(MiuiFaceManagerImpl.POWERMODE_SUPERSAVE_OPEN, str)) {
                MiuiFaceManagerImpl miuiFaceManagerImpl = MiuiFaceManagerImpl.this;
                if (SettingsSystem.INSTANCE.getIntForUser(miuiFaceManagerImpl.context.getContentResolver(), MiuiFaceManagerImpl.POWERMODE_SUPERSAVE_OPEN, 0, 0) == 0) {
                    z2 = false;
                }
                miuiFaceManagerImpl.mIsSuperPower = z2;
                return;
            }
            if (C13706o.m87924a(MiuiFaceManagerImpl.FACE_UNLOCK_VALID_FEATURE, uri != null ? uri.getLastPathSegment() : null)) {
                MiuiFaceManagerImpl miuiFaceManagerImpl2 = MiuiFaceManagerImpl.this;
                if (SettingsSecure.INSTANCE.getIntForUser(miuiFaceManagerImpl2.context.getContentResolver(), MiuiFaceManagerImpl.FACE_UNLOCK_VALID_FEATURE, 1, 0) == 0) {
                    z2 = false;
                }
                miuiFaceManagerImpl2.mIsValid = z2;
                return;
            }
            if (uri != null) {
                str2 = uri.getLastPathSegment();
            }
            if (C13706o.m87924a(MiuiFaceManagerImpl.FACE_UNLOCK_HAS_FEATURE, str2)) {
                MiuiFaceManagerImpl miuiFaceManagerImpl3 = MiuiFaceManagerImpl.this;
                if (SettingsSecure.INSTANCE.getIntForUser(miuiFaceManagerImpl3.context.getContentResolver(), MiuiFaceManagerImpl.FACE_UNLOCK_HAS_FEATURE, 0, 0) == 0) {
                    z2 = false;
                }
                miuiFaceManagerImpl3.mHasFaceData = z2;
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl$OnAuthenticationCancelListener;", "Landroid/os/CancellationSignal$OnCancelListener;", "Lja/u;", "onCancel", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: MiuiFaceManagerImpl.kt */
    private final class OnAuthenticationCancelListener implements CancellationSignal.OnCancelListener {
        public OnAuthenticationCancelListener() {
        }

        public void onCancel() {
            MiuiFaceManagerImpl.this.cancelAuthentication();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl$OnEnrollCancelListener;", "Landroid/os/CancellationSignal$OnCancelListener;", "Lja/u;", "onCancel", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: MiuiFaceManagerImpl.kt */
    private final class OnEnrollCancelListener implements CancellationSignal.OnCancelListener {
        public OnEnrollCancelListener() {
        }

        public void onCancel() {
            MiuiFaceManagerImpl.this.cancelEnrollment();
        }
    }

    public MiuiFaceManagerImpl() {
        Context g = C12104a.f58372a.mo68283g();
        this.context = g;
        this.mHandler = new ClientHandler(this, g);
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                C13706o.m87945v("mHandler");
                handler = null;
            }
            FaceObserver faceObserver = new FaceObserver(handler);
            ContentResolverHelper contentResolverHelper = ContentResolverHelper.INSTANCE;
            ContentResolver contentResolver = g.getContentResolver();
            C13706o.m87928e(contentResolver, "context.contentResolver");
            Uri uriFor = Settings.Secure.getUriFor(FACE_UNLOCK_HAS_FEATURE);
            C13706o.m87928e(uriFor, "getUriFor(FACE_UNLOCK_HAS_FEATURE)");
            contentResolverHelper.registerContentObserver(contentResolver, uriFor, false, faceObserver, 0);
            faceObserver.onChange(false, Uri.parse(FACE_UNLOCK_HAS_FEATURE_URI));
            ContentResolver contentResolver2 = g.getContentResolver();
            C13706o.m87928e(contentResolver2, "context.contentResolver");
            Uri uriFor2 = Settings.Secure.getUriFor(FACE_UNLOCK_VALID_FEATURE);
            C13706o.m87928e(uriFor2, "getUriFor(FACE_UNLOCK_VALID_FEATURE)");
            contentResolverHelper.registerContentObserver(contentResolver2, uriFor2, false, faceObserver, 0);
            faceObserver.onChange(false, Uri.parse(FACE_UNLOCK_VALID_FEATURE_URI));
            ContentResolver contentResolver3 = g.getContentResolver();
            C13706o.m87928e(contentResolver3, "context.contentResolver");
            Uri uriFor3 = Settings.System.getUriFor(POWERMODE_SUPERSAVE_OPEN);
            C13706o.m87928e(uriFor3, "getUriFor(POWERMODE_SUPERSAVE_OPEN)");
            contentResolverHelper.registerContentObserver(contentResolver3, uriFor3, false, faceObserver, 0);
            faceObserver.onChange(false, Uri.parse(POWERMODE_SUPERSAVE_OPEN_URI));
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private final void binderCallAddLoackoutResetCallback(IBinder iBinder, IBinder iBinder2) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        if (iBinder != null) {
            iBinder.transact(16, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final int binderCallAuthenticate(IBinder iBinder, IBinder iBinder2, long j, int i, IBinder iBinder3, int i2, String str, int i3) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        obtain.writeLong(j);
        obtain.writeInt(i);
        if (iBinder3 == null) {
            iBinder3 = null;
        }
        obtain.writeStrongBinder(iBinder3);
        obtain.writeInt(i2);
        obtain.writeString(str);
        obtain.writeInt(i3);
        if (iBinder != null) {
            iBinder.transact(3, obtain, obtain2, 0);
        }
        obtain2.readException();
        int readInt = obtain2.readInt();
        obtain.recycle();
        obtain2.recycle();
        return readInt;
    }

    private final long binderCallAuthenticatorId(IBinder iBinder, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeString(str);
        iBinder.transact(14, obtain, obtain2, 0);
        obtain2.readException();
        long readLong = obtain2.readLong();
        obtain.recycle();
        obtain2.recycle();
        return readLong;
    }

    private final void binderCallCancelAuthention(IBinder iBinder, IBinder iBinder2, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        obtain.writeString(str);
        if (iBinder != null) {
            iBinder.transact(4, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final void binderCallCancelEnrollment(IBinder iBinder, IBinder iBinder2) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        if (iBinder != null) {
            iBinder.transact(6, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final void binderCallEnroll(IBinder iBinder, IBinder iBinder2, byte[] bArr, int i, IBinder iBinder3, int i2, String str, Surface surface, RectF rectF, int i3) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        obtain.writeByteArray(bArr);
        obtain.writeInt(i);
        if (iBinder3 == null) {
            iBinder3 = null;
        }
        obtain.writeStrongBinder(iBinder3);
        obtain.writeInt(i2);
        obtain.writeString(str);
        if (surface != null) {
            obtain.writeInt(1);
            surface.writeToParcel(obtain, 0);
        } else {
            obtain.writeInt(0);
        }
        if (rectF != null) {
            obtain.writeInt(1);
            rectF.writeToParcel(obtain, 0);
        } else {
            obtain.writeInt(0);
        }
        obtain.writeInt(i3);
        if (iBinder != null) {
            iBinder.transact(5, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final int binderCallExtCmd(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, int i, int i2, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        if (iBinder3 == null) {
            iBinder3 = null;
        }
        obtain.writeStrongBinder(iBinder3);
        obtain.writeInt(i);
        obtain.writeInt(i2);
        obtain.writeString(str);
        if (iBinder != null) {
            iBinder.transact(101, obtain, obtain2, 0);
        }
        obtain2.readException();
        int readInt = obtain2.readInt();
        obtain.recycle();
        obtain2.recycle();
        return readInt;
    }

    private final List<Miuiface> binderCallGetEnrolledFaces(IBinder iBinder, int i, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeInt(i);
        obtain.writeString(str);
        if (iBinder != null) {
            iBinder.transact(9, obtain, obtain2, 0);
        }
        obtain2.readException();
        ArrayList arrayList = new ArrayList(obtain2.createTypedArrayList(Miuiface.CREATOR));
        obtain.recycle();
        obtain2.recycle();
        return arrayList;
    }

    private final String binderCallGetVendorInfo(IBinder iBinder, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeString(str);
        if (iBinder != null) {
            iBinder.transact(17, obtain, obtain2, 0);
        }
        obtain2.readException();
        String readString = obtain2.readString();
        obtain.recycle();
        obtain2.recycle();
        return readString;
    }

    private final int binderCallHasEnrolledFaces(IBinder iBinder, int i, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeInt(i);
        obtain.writeString(str);
        iBinder.transact(12, obtain, obtain2, 0);
        obtain2.readException();
        int readInt = obtain2.readInt();
        obtain.recycle();
        obtain2.recycle();
        return readInt;
    }

    private final void binderCallPostEnroll(IBinder iBinder, IBinder iBinder2) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        iBinder.transact(11, obtain, obtain2, 0);
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final void binderCallPpreInitAuthen(IBinder iBinder, IBinder iBinder2, String str, IBinder iBinder3) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        obtain.writeString(str);
        obtain.writeStrongBinder(iBinder3);
        if (iBinder != null) {
            iBinder.transact(2, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final void binderCallPreEnroll(IBinder iBinder, IBinder iBinder2) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        iBinder.transact(10, obtain, obtain2, 0);
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final void binderCallRemove(IBinder iBinder, IBinder iBinder2, int i, int i2, int i3, IBinder iBinder3) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeStrongBinder(iBinder2);
        obtain.writeInt(i);
        obtain.writeInt(i2);
        obtain.writeInt(i3);
        if (iBinder3 == null) {
            iBinder3 = null;
        }
        obtain.writeStrongBinder(iBinder3);
        if (iBinder != null) {
            iBinder.transact(7, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final void binderCallRename(IBinder iBinder, int i, int i2, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeInt(i);
        obtain.writeInt(i2);
        obtain.writeString(str);
        if (iBinder != null) {
            iBinder.transact(8, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    private final void binderCallRestTimeout(IBinder iBinder, byte[] bArr) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        C13706o.m87928e(obtain2, "obtain()");
        obtain.writeInterfaceToken(SERVICE_DESCRIPTOR);
        obtain.writeByteArray(bArr);
        if (iBinder != null) {
            iBinder.transact(15, obtain, obtain2, 0);
        }
        obtain2.readException();
        obtain.recycle();
        obtain2.recycle();
    }

    /* access modifiers changed from: private */
    public final void cancelAuthentication() {
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "cancelAuthentication ");
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                IBinder iBinder2 = this.mToken;
                String packageName = this.context.getPackageName();
                C13706o.m87928e(packageName, "context.packageName");
                binderCallCancelAuthention(iBinder, iBinder2, packageName);
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68218e((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public final void cancelEnrollment() {
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "cancelEnrollment ");
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                binderCallCancelEnrollment(iBinder, this.mToken);
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68218e((Throwable) e);
        }
    }

    private final String getMessageInfo(int i) {
        if (i == 1000) {
            return "Failed to open camera";
        }
        if (i == 1001) {
            return "Camera opened successfully";
        }
        if (i == 2000) {
            return "Cancel success";
        }
        if (i == 2100) {
            return "binder Call exception";
        }
        switch (i) {
            case 1:
                return "Invalid parameter";
            case 2:
                return "Handler Incorrect";
            case 3:
                return "Unlock failure (internal error)";
            case 4:
                return "Incoming data quality is not good";
            case 5:
                return "No face detected";
            case 6:
                return "Face is too small";
            case 7:
                return "Face too big";
            case 8:
                return "Face left";
            case 9:
                return "Face up";
            case 10:
                return "Face right";
            case 11:
                return "Face down";
            case 12:
                return "Comparison failed";
            case 13:
                return "Live attack warning";
            case 14:
                return "Vitality test failed";
            case 15:
                return "Turn left";
            case 16:
                return "Look up";
            case 17:
                return "Turn right";
            case 18:
                return "Look down";
            case 19:
                return "Continue to call incoming data";
            case 20:
                return "Picture is blurred";
            case 21:
                return "Eye occlusion";
            case 22:
                return "Eyes closed";
            case 23:
                return "Mouth occlusion";
            case 24:
                return "Handling Feature read exception";
            case 25:
                return "Feature version error";
            case 26:
                return "Bad light";
            case 27:
                return "Multiple faces";
            case 28:
                return "Blurred face";
            case 29:
                return "Incomplete face";
            case 30:
                return "The light is too dark";
            case 31:
                return "The light is too bright";
            case 32:
                return "Yin Yang face";
            default:
                BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "default msgId: " + i);
                return "define by client";
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[Catch:{ all -> 0x000d, all -> 0x0064 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void initService() throws android.os.RemoteException {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = lock     // Catch:{ all -> 0x0064 }
            ja.n$a r1 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x000d }
            r0.lock()     // Catch:{ all -> 0x000d }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x000d }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x000d }
            goto L_0x0017
        L_0x000d:
            r0 = move-exception
            ja.n$a r1 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)     // Catch:{ all -> 0x0064 }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x0064 }
        L_0x0017:
            android.os.IBinder r0 = r6.mMiuiFaceService     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x004c
            r0 = 0
            java.lang.String r1 = "android.os.ServiceManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "getService"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0043 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ Exception -> 0x0043 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x0043 }
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0043 }
            java.lang.String r4 = SERVICE_NAME     // Catch:{ Exception -> 0x0043 }
            r3[r0] = r4     // Catch:{ Exception -> 0x0043 }
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "null cannot be cast to non-null type android.os.IBinder"
            kotlin.jvm.internal.C13706o.m87927d(r1, r2)     // Catch:{ Exception -> 0x0043 }
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ Exception -> 0x0043 }
            r6.mMiuiFaceService = r1     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            android.os.IBinder r1 = r6.mMiuiFaceService     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x004c
            android.os.IBinder$DeathRecipient r2 = r6.mBinderDied     // Catch:{ all -> 0x0064 }
            r1.linkToDeath(r2, r0)     // Catch:{ all -> 0x0064 }
        L_0x004c:
            java.util.concurrent.locks.ReentrantLock r0 = lock
            ja.n$a r1 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x0059 }
            r0.unlock()     // Catch:{ all -> 0x0059 }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0059 }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x0059 }
            goto L_0x0063
        L_0x0059:
            r0 = move-exception
            ja.n$a r1 = p297ja.C13329n.f61327a
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)
            p297ja.C13329n.m85676a(r0)
        L_0x0063:
            return
        L_0x0064:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = lock
            ja.n$a r2 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x0072 }
            r1.unlock()     // Catch:{ all -> 0x0072 }
            ja.u r1 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0072 }
            p297ja.C13329n.m85676a(r1)     // Catch:{ all -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r1 = move-exception
            ja.n$a r2 = p297ja.C13329n.f61327a
            java.lang.Object r1 = p297ja.C13332o.m85684a(r1)
            p297ja.C13329n.m85676a(r1)
        L_0x007c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceManagerImpl.initService():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: mBinderDied$lambda-2  reason: not valid java name */
    public static final void m101305mBinderDied$lambda2(MiuiFaceManagerImpl miuiFaceManagerImpl) {
        C13706o.m87929f(miuiFaceManagerImpl, "this$0");
        try {
            ReentrantLock reentrantLock = lock;
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            ReentrantLock reentrantLock2 = lock;
            try {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
            throw th;
        }
        BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "mMiuiFaceService Service Died.");
        miuiFaceManagerImpl.mMiuiFaceService = null;
        ReentrantLock reentrantLock3 = lock;
        try {
            C13329n.C13330a aVar4 = C13329n.f61327a;
            reentrantLock3.unlock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th3) {
            C13329n.C13330a aVar5 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th3));
        }
    }

    /* access modifiers changed from: private */
    public final void sendAcquiredResult(long j, int i, int i2) {
        String acquiredString = MiuiCodeToString.INSTANCE.getAcquiredString(i, i2);
        IMiuiFaceManager.EnrollmentCallback enrollmentCallback = this.mEnrollmentCallback;
        if (enrollmentCallback != null) {
            enrollmentCallback.onEnrollmentHelp(i, acquiredString);
            return;
        }
        IMiuiFaceManager.AuthenticationCallback authenticationCallback = this.mAuthenticationCallback;
        if (authenticationCallback != null) {
            authenticationCallback.onAuthenticationHelp(i, acquiredString);
        }
    }

    /* access modifiers changed from: private */
    public final void sendAuthenticatedFailed() {
        IMiuiFaceManager.AuthenticationCallback authenticationCallback = this.mAuthenticationCallback;
        if (authenticationCallback != null) {
            authenticationCallback.onAuthenticationFailed();
        }
    }

    /* access modifiers changed from: private */
    public final void sendAuthenticatedSucceeded(Miuiface miuiface, int i) {
        IMiuiFaceManager.AuthenticationCallback authenticationCallback = this.mAuthenticationCallback;
        if (authenticationCallback != null) {
            authenticationCallback.onAuthenticationSucceeded(miuiface);
        }
    }

    /* access modifiers changed from: private */
    public final void sendEnrollResult(Miuiface miuiface, int i) {
        IMiuiFaceManager.EnrollmentCallback enrollmentCallback = this.mEnrollmentCallback;
        if (enrollmentCallback != null) {
            enrollmentCallback.onEnrollmentProgress(i, miuiface.getMiuifaceId());
        }
    }

    /* access modifiers changed from: private */
    public final void sendErrorResult(long j, int i, int i2) {
        String errorString = MiuiCodeToString.INSTANCE.getErrorString(i, i2);
        IMiuiFaceManager.EnrollmentCallback enrollmentCallback = this.mEnrollmentCallback;
        if (enrollmentCallback != null) {
            enrollmentCallback.onEnrollmentError(i, errorString);
            return;
        }
        IMiuiFaceManager.AuthenticationCallback authenticationCallback = this.mAuthenticationCallback;
        if (authenticationCallback != null) {
            authenticationCallback.onAuthenticationError(i, errorString);
            return;
        }
        IMiuiFaceManager.RemovalCallback removalCallback = this.mRemovalCallback;
        if (removalCallback != null) {
            removalCallback.onRemovalError(this.mRemovalMiuiface, i, errorString);
        }
    }

    /* access modifiers changed from: private */
    public final void sendLockoutReset() {
        IMiuiFaceManager.LockoutResetCallback lockoutResetCallback = this.mLockoutResetCallback;
        if (lockoutResetCallback != null) {
            lockoutResetCallback.onLockoutReset();
        }
    }

    /* access modifiers changed from: private */
    public final void sendRemovedResult(Miuiface miuiface, int i) {
        if (this.mRemovalCallback == null) {
            return;
        }
        if (miuiface == null || this.mRemovalMiuiface == null) {
            BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "Received MSG_REMOVED, but face or mRemovalMiuiface is null, ");
            return;
        }
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(TAG, "sendRemovedResult faceId:" + miuiface.getMiuifaceId() + "  remaining:" + i);
        int miuifaceId = miuiface.getMiuifaceId();
        Miuiface miuiface2 = this.mRemovalMiuiface;
        Integer valueOf = miuiface2 != null ? Integer.valueOf(miuiface2.getMiuifaceId()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || miuifaceId == 0 || (valueOf != null && miuifaceId == valueOf.intValue())) {
            IMiuiFaceManager.RemovalCallback removalCallback = this.mRemovalCallback;
            if (removalCallback != null) {
                removalCallback.onRemovalSucceeded(miuiface, i);
                return;
            }
            return;
        }
        biometricLoggerImpl.mo68217d(TAG, "Face id didn't match: " + miuifaceId + " != " + valueOf);
    }

    private final void useHandler(Handler handler) {
        if (handler != null) {
            Looper looper = handler.getLooper();
            C13706o.m87928e(looper, "handler.looper");
            this.mHandler = new ClientHandler(this, looper);
            return;
        }
        Handler handler2 = this.mHandler;
        if (handler2 == null) {
            C13706o.m87945v("mHandler");
            handler2 = null;
        }
        if (!C13706o.m87924a(handler2.getLooper(), this.context.getMainLooper())) {
            Looper mainLooper = this.context.getMainLooper();
            C13706o.m87928e(mainLooper, "context.mainLooper");
            this.mHandler = new ClientHandler(this, mainLooper);
        }
    }

    public void addLockoutResetCallback(IMiuiFaceManager.LockoutResetCallback lockoutResetCallback) {
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "addLockoutResetCallback  callback:" + lockoutResetCallback);
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                this.mLockoutResetCallback = lockoutResetCallback;
                binderCallAddLoackoutResetCallback(iBinder, this.mServiceReceiver);
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
    }

    public void authenticate(CancellationSignal cancellationSignal, int i, IMiuiFaceManager.AuthenticationCallback authenticationCallback, Handler handler, int i2) {
        int i3;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        IMiuiFaceManager.AuthenticationCallback authenticationCallback2 = authenticationCallback;
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(TAG, "authenticate mServiceReceiver:" + this.mServiceReceiver);
        if (authenticationCallback2 != null) {
            if (cancellationSignal2 != null) {
                if (cancellationSignal.isCanceled()) {
                    biometricLoggerImpl.mo68217d(TAG, "authentication already canceled");
                    return;
                }
                cancellationSignal2.setOnCancelListener(new OnAuthenticationCancelListener());
            }
            useHandler(handler);
            this.mAuthenticationCallback = authenticationCallback2;
            this.mEnrollmentCallback = null;
            try {
                initService();
                IBinder iBinder = this.mMiuiFaceService;
                if (iBinder != null) {
                    IBinder iBinder2 = this.mToken;
                    IBinder iBinder3 = this.mServiceReceiver;
                    String packageName = this.context.getPackageName();
                    C13706o.m87928e(packageName, "context.packageName");
                    binderCallAuthenticate(iBinder, iBinder2, -1, -1, iBinder3, i, packageName, i2);
                    return;
                }
                biometricLoggerImpl.mo68217d(TAG, "mMiuiFaceService is null");
                i3 = ERROR_BINDER_CALL;
                try {
                    authenticationCallback2.onAuthenticationError(ERROR_BINDER_CALL, getMessageInfo(ERROR_BINDER_CALL));
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                i3 = ERROR_BINDER_CALL;
                BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "Remote exception while authenticating: ", e);
                authenticationCallback2.onAuthenticationError(i3, getMessageInfo(i3));
            }
        } else {
            throw new IllegalArgumentException("Must supply an authentication callback");
        }
    }

    public void enroll(byte[] bArr, CancellationSignal cancellationSignal, int i, IMiuiFaceManager.EnrollmentCallback enrollmentCallback, Surface surface, Rect rect, int i2) {
        C13706o.m87929f(cancellationSignal, "cancel");
        enroll(bArr, cancellationSignal, i, enrollmentCallback, surface, (RectF) null, new RectF(rect), i2);
    }

    public int extCmd(int i, int i2) {
        int i3;
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                IBinder iBinder2 = this.mToken;
                IBinder iBinder3 = this.mServiceReceiver;
                String packageName = this.context.getPackageName();
                C13706o.m87928e(packageName, "context.packageName");
                i3 = binderCallExtCmd(iBinder, iBinder2, iBinder3, i, i2, packageName);
                BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "extCmd  cmd:" + i + " param:" + i2 + " res:" + i3);
                return i3;
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
        i3 = -1;
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "extCmd  cmd:" + i + " param:" + i2 + " res:" + i3);
        return i3;
    }

    public List<Miuiface> getEnrolledFaces() {
        String str;
        List<Miuiface> arrayList = new ArrayList<>();
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                String packageName = this.context.getPackageName();
                C13706o.m87928e(packageName, "context.packageName");
                arrayList = binderCallGetEnrolledFaces(iBinder, 0, packageName);
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getEnrolledFaces   res:");
        if (arrayList == null || arrayList.size() == 0) {
            str = " is null";
        } else {
            str = " " + arrayList.size();
            C13706o.m87928e(str, "stringBuilder.toString()");
        }
        sb.append(str);
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, sb.toString());
        return arrayList;
    }

    public int getManagerVersion() {
        return 1;
    }

    public String getVendorInfo() {
        String str;
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                String packageName = this.context.getPackageName();
                C13706o.m87928e(packageName, "context.packageName");
                str = binderCallGetVendorInfo(iBinder, packageName);
                BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "getVendorInfo, res:" + str);
                return str;
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
        str = "";
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "getVendorInfo, res:" + str);
        return str;
    }

    public int hasEnrolledFaces() {
        try {
            boolean z = this.mHasFaceData;
            if (!z || !this.mIsValid) {
                return z ? -1 : 0;
            }
            return 1;
        } catch (Exception e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
            return -2;
        }
    }

    public boolean isFaceFeatureSupport() {
        String[] strArr;
        if (this.mIsSuperPower) {
            BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "enter super power mode, isFaceFeatureSupport:false");
            return false;
        }
        MiuiBuild miuiBuild = MiuiBuild.INSTANCE;
        if (miuiBuild.getIS_INTERNATIONAL_BUILD()) {
            strArr = FeatureParser.INSTANCE.getStringArray("support_face_unlock_region_global");
        } else {
            strArr = FeatureParser.INSTANCE.getStringArray("support_face_unlock_region_dom");
        }
        boolean z = strArr != null && (C13566b0.m87414O(C13614t.m87751m(Arrays.copyOf(strArr, strArr.length)), miuiBuild.getRegion()) || C13614t.m87751m(Arrays.copyOf(strArr, strArr.length)).contains("ALL"));
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "inernational:" + miuiBuild.getIS_INTERNATIONAL_BUILD() + " supportR:" + Arrays.toString(strArr) + " nowR:" + miuiBuild.getRegion());
        return z;
    }

    public boolean isFaceUnlockInited() {
        return this.isFaceUnlockInited;
    }

    public boolean isReleased() {
        return false;
    }

    public boolean isSupportScreenOnDelayed() {
        boolean z = FeatureParser.INSTANCE.getBoolean("support_screen_on_delayed", false);
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "isSupportScreenOnDelayed:" + z);
        return z;
    }

    public void preInitAuthen() {
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                this.isFaceUnlockInited = false;
                IBinder iBinder2 = this.mToken;
                String packageName = this.context.getPackageName();
                C13706o.m87928e(packageName, "context.packageName");
                binderCallPpreInitAuthen(iBinder, iBinder2, packageName, this.mServiceReceiver);
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
    }

    public void release() {
    }

    public void remove(Miuiface miuiface, IMiuiFaceManager.RemovalCallback removalCallback) {
        C13706o.m87929f(miuiface, "face");
        C13706o.m87929f(removalCallback, "callback");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(TAG, "remove  faceId:" + miuiface.getMiuifaceId() + "  callback:" + removalCallback);
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                this.mRemovalMiuiface = miuiface;
                this.mRemovalCallback = removalCallback;
                this.mEnrollmentCallback = null;
                this.mAuthenticationCallback = null;
                binderCallRemove(iBinder, this.mToken, miuiface.getMiuifaceId(), miuiface.getGroupId(), 0, this.mServiceReceiver);
                return;
            }
            biometricLoggerImpl.mo68217d(TAG, "mMiuiFaceService is null");
            removalCallback.onRemovalError(miuiface, ERROR_BINDER_CALL, getMessageInfo(ERROR_BINDER_CALL));
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
    }

    public void rename(int i, String str) {
        C13706o.m87929f(str, "name");
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "rename  faceId:" + i + " name:" + str);
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                binderCallRename(iBinder, i, 0, str);
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
    }

    public void resetTimeout(byte[] bArr) {
        C13706o.m87929f(bArr, "token");
        BiometricLoggerImpl.INSTANCE.mo68217d(TAG, "resetTimeout");
        try {
            initService();
            IBinder iBinder = this.mMiuiFaceService;
            if (iBinder != null) {
                binderCallRestTimeout(iBinder, bArr);
            }
        } catch (RemoteException e) {
            BiometricLoggerImpl.INSTANCE.mo68220e(TAG, "transact fail. " + e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceManagerImpl} */
    /* JADX WARNING: type inference failed for: r1v4, types: [dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceManagerImpl$OnEnrollCancelListener, android.os.CancellationSignal$OnCancelListener] */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enroll(byte[] r19, android.os.CancellationSignal r20, int r21, dev.skomlach.biometric.compat.engine.internal.face.miui.impl.IMiuiFaceManager.EnrollmentCallback r22, android.view.Surface r23, android.graphics.RectF r24, android.graphics.RectF r25, int r26) {
        /*
            r18 = this;
            r12 = r18
            r0 = r20
            r13 = r22
            java.lang.String r14 = "exception in enroll: "
            java.lang.String r1 = "cancel"
            kotlin.jvm.internal.C13706o.m87929f(r0, r1)
            java.lang.String r1 = "enrollArea"
            r10 = r25
            kotlin.jvm.internal.C13706o.m87929f(r10, r1)
            if (r13 == 0) goto L_0x00c6
            boolean r1 = r20.isCanceled()
            r15 = 1
            java.lang.String r16 = "FaceManagerImpl"
            r17 = 0
            r11 = 2
            if (r1 == 0) goto L_0x0030
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r17] = r16
            java.lang.String r2 = "enrollment already canceled"
            r1[r15] = r2
            r0.mo68217d(r1)
            return
        L_0x0030:
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceManagerImpl$OnEnrollCancelListener r1 = new dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceManagerImpl$OnEnrollCancelListener
            r1.<init>()
            r0.setOnCancelListener(r1)
            r9 = 3
            r8 = 2100(0x834, float:2.943E-42)
            r18.initService()     // Catch:{ RemoteException -> 0x00ab }
            android.os.IBinder r2 = r12.mMiuiFaceService     // Catch:{ RemoteException -> 0x00ab }
            if (r2 == 0) goto L_0x008f
            r12.mEnrollmentCallback = r13     // Catch:{ RemoteException -> 0x00ab }
            android.os.IBinder r3 = r12.mToken     // Catch:{ RemoteException -> 0x006b }
            r5 = 0
            android.os.IBinder r6 = r12.mServiceReceiver     // Catch:{ RemoteException -> 0x006b }
            android.content.Context r0 = r12.context     // Catch:{ RemoteException -> 0x006b }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ RemoteException -> 0x006b }
            java.lang.String r1 = "context.packageName"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)     // Catch:{ RemoteException -> 0x006b }
            r1 = r18
            r4 = r19
            r7 = r21
            r8 = r0
            r15 = 3
            r9 = r23
            r10 = r25
            r11 = r26
            r1.binderCallEnroll(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ RemoteException -> 0x0069 }
            r1 = 2100(0x834, float:2.943E-42)
            r3 = 2
            goto L_0x0093
        L_0x0069:
            r0 = move-exception
            goto L_0x006d
        L_0x006b:
            r0 = move-exception
            r15 = 3
        L_0x006d:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ RemoteException -> 0x008a }
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ RemoteException -> 0x008a }
            r2[r17] = r16     // Catch:{ RemoteException -> 0x008a }
            r3 = 1
            r2[r3] = r14     // Catch:{ RemoteException -> 0x008a }
            r3 = 2
            r2[r3] = r0     // Catch:{ RemoteException -> 0x0086 }
            r1.mo68220e((java.lang.Object[]) r2)     // Catch:{ RemoteException -> 0x0086 }
            r1 = 2100(0x834, float:2.943E-42)
            java.lang.String r0 = r12.getMessageInfo(r1)     // Catch:{ RemoteException -> 0x00a9 }
            r13.onEnrollmentError(r1, r0)     // Catch:{ RemoteException -> 0x00a9 }
            return
        L_0x0086:
            r0 = move-exception
            r1 = 2100(0x834, float:2.943E-42)
            goto L_0x00b0
        L_0x008a:
            r0 = move-exception
            r1 = 2100(0x834, float:2.943E-42)
            r3 = 2
            goto L_0x00b0
        L_0x008f:
            r1 = 2100(0x834, float:2.943E-42)
            r3 = 2
            r15 = 3
        L_0x0093:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ RemoteException -> 0x00a9 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ RemoteException -> 0x00a9 }
            r2[r17] = r16     // Catch:{ RemoteException -> 0x00a9 }
            java.lang.String r4 = "mMiuiFaceService is null"
            r5 = 1
            r2[r5] = r4     // Catch:{ RemoteException -> 0x00a9 }
            r0.mo68217d(r2)     // Catch:{ RemoteException -> 0x00a9 }
            java.lang.String r0 = r12.getMessageInfo(r1)     // Catch:{ RemoteException -> 0x00a9 }
            r13.onEnrollmentError(r1, r0)     // Catch:{ RemoteException -> 0x00a9 }
            return
        L_0x00a9:
            r0 = move-exception
            goto L_0x00b0
        L_0x00ab:
            r0 = move-exception
            r1 = 2100(0x834, float:2.943E-42)
            r3 = 2
            r15 = 3
        L_0x00b0:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r2 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r17] = r16
            r5 = 1
            r4[r5] = r14
            r4[r3] = r0
            r2.mo68220e((java.lang.Object[]) r4)
            java.lang.String r0 = r12.getMessageInfo(r1)
            r13.onEnrollmentError(r1, r0)
            return
        L_0x00c6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must supply an enrollment callback"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceManagerImpl.enroll(byte[], android.os.CancellationSignal, int, dev.skomlach.biometric.compat.engine.internal.face.miui.impl.IMiuiFaceManager$EnrollmentCallback, android.view.Surface, android.graphics.RectF, android.graphics.RectF, int):void");
    }
}
