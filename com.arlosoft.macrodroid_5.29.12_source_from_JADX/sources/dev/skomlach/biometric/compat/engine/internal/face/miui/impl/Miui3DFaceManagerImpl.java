package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.BiometricClient;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.IMiuiFaceManager;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.ContentResolverHelper;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.MiuiBuild;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.SettingsSecure;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.SettingsSystem;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 ¥\u00012\u00020\u00012\u00020\u0002:\u0012¦\u0001¥\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001­\u0001B\t¢\u0006\u0006\b£\u0001\u0010¤\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J@\u0010\r\u001a\u00020\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0012\u0010\u001e\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0002J\u0018\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0002J\u0012\u0010(\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010&H\u0002J\b\u0010)\u001a\u00020\u0003H\u0016J\b\u0010*\u001a\u00020\u0003H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0003H\u0016J(\u00101\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0012H\u0016J \u00103\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0012H\u0016J\u0018\u00109\u001a\u00020\u00032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016J\u0018\u0010<\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0017H\u0016J\b\u0010=\u001a\u00020\u0003H\u0016J6\u0010C\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010@\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u00010A2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010B\u001a\u00020\u0012H\u0016JH\u0010L\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010B\u001a\u00020\u0012H\u0016JP\u0010L\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010K\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020M2\u0006\u0010B\u001a\u00020\u0012H\u0016J\u0018\u0010Q\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u0012H\u0016J\u0012\u0010S\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010RH\u0016J\u0010\u0010U\u001a\u00020\u00032\u0006\u0010T\u001a\u00020DH\u0016R\u0014\u0010V\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X.¢\u0006\u0006\n\u0004\ba\u0010`R\u001c\u0010c\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010ZR\u0018\u0010f\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020k8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010WR\u0016\u0010o\u001a\u00020k8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010WR \u0010x\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010w\u0018\u00010v8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010dR\u0016\u0010y\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020k8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010mR\u0016\u0010|\u001a\u00020k8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b|\u0010mR$\u0010~\u001a\u00020k2\u0006\u0010}\u001a\u00020k8\u0016@RX\u000e¢\u0006\f\n\u0004\b~\u0010m\u001a\u0004\b~\u0010R\u001b\u0010\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010WR\"\u0010\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010v8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010dR\u0018\u0010\u0001\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010WR\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010v8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010dR\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020k8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010R\u0016\u0010\u0001\u001a\u00020k8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010R\u0016\u0010\u0001\u001a\u00020k8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010R\u0017\u0010\u0001\u001a\u00020\u00128VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u0004\u0018\u00010\u00178VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0014\u0010\u0001\u001a\u00020\u00128G¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R!\u0010¢\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010b8VX\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006®\u0001"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ServiceCallback;", "Lja/u;", "preloadBoostFramework", "Landroid/os/Bundle;", "bundle", "handlerDatabase", "Ljava/util/ArrayList;", "Landroid/os/Parcelable;", "Lkotlin/collections/ArrayList;", "listGroup", "list", "initClientDB", "prepareDatabase", "resetDatabase", "commitDatabase", "handlerFace", "", "id", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$TemplateItem;", "findTemplate", "msgId", "", "getMessageInfo", "tryConnectService", "cancelAuthentication", "cancelEnrollment", "", "detect_zone", "adjustDetectZone", "", "x", "IrToRgbRadio", "offset", "IrToRgbMove", "zoom", "IrToRgbScale", "Landroid/os/Handler;", "handler", "useHandler", "onBiometricServiceConnected", "onBiometricServiceDisconnected", "onBiometricEventClassLoader", "release", "module_id", "event", "arg1", "arg2", "onBiometricEventCallback", "key", "onBiometricBundleCallback", "hasEnrolledFaces", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "face", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$RemovalCallback;", "callback", "remove", "faceId", "name", "rename", "preInitAuthen", "Landroid/os/CancellationSignal;", "cancel", "flags", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$AuthenticationCallback;", "timeout", "authenticate", "", "cryptoToken", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$EnrollmentCallback;", "enrollCallback", "Landroid/view/Surface;", "surface", "Landroid/graphics/Rect;", "detectArea", "enroll", "Landroid/graphics/RectF;", "enrollArea", "cmd", "param", "extCmd", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$LockoutResetCallback;", "addLockoutResetCallback", "token", "resetTimeout", "hasEnrollFace", "I", "", "mBinderLock", "Ljava/lang/Object;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$EnrollParam;", "mEnrollParam", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$EnrollParam;", "Landroid/database/ContentObserver;", "mSuperPowerOpenObserver", "Landroid/database/ContentObserver;", "mHasFaceDataObserver", "", "mMiuifaceList", "Ljava/util/List;", "boostFramework", "mAuthenticationCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$AuthenticationCallback;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient;", "mBiometricClient", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient;", "", "mDatabaseChanged", "Z", "mDatabaseStatus", "mDisonnected", "mEnrollmentCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$EnrollmentCallback;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$FaceInfo;", "mFaceInfo", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$FaceInfo;", "mGroupIdMax", "", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$GroupItem;", "mGroupItemList", "mHandler", "Landroid/os/Handler;", "mHasFaceData", "mIsSuperPower", "<set-?>", "isReleased", "()Z", "mRemovalCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager$RemovalCallback;", "mRemovalMiuiface", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miuiface;", "mTemplateIdMax", "mTemplateItemList", "mcancelStatus", "Landroid/database/sqlite/SQLiteDatabase;", "myDB", "Landroid/database/sqlite/SQLiteDatabase;", "myTemplateItemList", "Ljava/lang/reflect/Method;", "sAcquireFunc", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "sPerfClass", "Ljava/lang/Class;", "sReleaseFunc", "Landroid/content/Context;", "context", "Landroid/content/Context;", "isFaceFeatureSupport", "isSupportScreenOnDelayed", "isFaceUnlockInited", "getManagerVersion", "()I", "managerVersion", "getVendorInfo", "()Ljava/lang/String;", "vendorInfo", "getTemplatepath", "templatepath", "getEnrolledFaces", "()Ljava/util/List;", "enrolledFaces", "<init>", "()V", "Companion", "ClientHandler", "EnrollParam", "FRect", "FaceInfo", "GroupItem", "OnAuthenticationCancelListener", "OnEnrollCancelListener", "TemplateItem", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Miui3DFaceManagerImpl.kt */
public final class Miui3DFaceManagerImpl implements IMiuiFaceManager, BiometricClient.ServiceCallback {
    private static final int CANCEL_STATUS_DONE = 1;
    private static final int CANCEL_STATUS_NONE = 0;
    public static final int COMMAND_ENROLL_RESUME_ENROLL_LOGIC = 0;
    public static final Companion Companion = new Companion((C13695i) null);
    private static final int DB_STATUS_NONE = 0;
    private static final int DB_STATUS_PREPARED = 2;
    private static final int DB_STATUS_PREPARING = 1;
    private static final boolean DEBUG = true;
    private static final String FACEUNLOCK_SUPPORT_SUPERPOWER = "faceunlock_support_superpower";
    private static final String FACE_UNLOCK_HAS_FEATURE = "face_unlock_has_feature_sl";
    private static final String FACE_UNLOCK_HAS_FEATURE_URI = "content://settings/secure/face_unlock_has_feature_sl";
    /* access modifiers changed from: private */
    public static AtomicReference<IMiuiFaceManager> INSTANCE = new AtomicReference<>((Object) null);
    private static final String LOG_TAG = "3DFaceManagerImpl";
    public static final int MSG_AUTHENTICATION_HELP_ALL_BLOCKED = 28;
    public static final int MSG_AUTHENTICATION_HELP_BAD_AMBIENT_LIGHT = 32;
    public static final int MSG_AUTHENTICATION_HELP_BOTH_EYE_BLOCKED = 25;
    public static final int MSG_AUTHENTICATION_HELP_BOTH_EYE_CLOSE = 31;
    public static final int MSG_AUTHENTICATION_HELP_FACE_AUTH_FAILD = 70;
    public static final int MSG_AUTHENTICATION_HELP_FACE_DETECT_FAIL = 20;
    public static final int MSG_AUTHENTICATION_HELP_FACE_DETECT_OK = 10;
    public static final int MSG_AUTHENTICATION_HELP_FACE_TOO_NEER = 33;
    public static final int MSG_AUTHENTICATION_HELP_LEFTEYE_MOUSE_BLOCKED = 26;
    public static final int MSG_AUTHENTICATION_HELP_LEFT_EYE_BLOCKED = 22;
    public static final int MSG_AUTHENTICATION_HELP_LEFT_EYE_CLOSE = 29;
    public static final int MSG_AUTHENTICATION_HELP_LIVING_BODY_DETECTION_FAILED = 63;
    public static final int MSG_AUTHENTICATION_HELP_MOUSE_BLOCKED = 24;
    public static final int MSG_AUTHENTICATION_HELP_RIGHTEYE_MOUSE_BLOCKED = 27;
    public static final int MSG_AUTHENTICATION_HELP_RIGHT_EYE_BLOCKED = 23;
    public static final int MSG_AUTHENTICATION_HELP_RIGHT_EYE_CLOSE = 30;
    public static final int MSG_AUTHENTICATION_STOP = 34;
    public static final int MSG_ENROLL_ENROLL_TIMEOUT = 66;
    public static final int MSG_ENROLL_ERROR_CREATE_FOLDER_FAILED = 52;
    public static final int MSG_ENROLL_ERROR_DISABLE_FAIL = 57;
    public static final int MSG_ENROLL_ERROR_ENABLE_FAIL = 50;
    public static final int MSG_ENROLL_ERROR_FACE_LOST = 62;
    public static final int MSG_ENROLL_ERROR_FLOOD_ITO_ERR = 41;
    public static final int MSG_ENROLL_ERROR_IR_CAM_CLOSED = 6;
    public static final int MSG_ENROLL_ERROR_LASER_ITO_ERR = 40;
    public static final int MSG_ENROLL_ERROR_LIVING_BODY_DETECTION_FAILED = 63;
    public static final int MSG_ENROLL_ERROR_NOT_SAME_PERSON = 58;
    public static final int MSG_ENROLL_ERROR_PREVIEW_CAM_ERROR = 5;
    public static final int MSG_ENROLL_ERROR_RTMV_IC_ERR = 53;
    public static final int MSG_ENROLL_ERROR_SAVE_TEMPLATE_FAILED = 51;
    public static final int MSG_ENROLL_ERROR_SDK_ERROR = 59;
    public static final int MSG_ENROLL_ERROR_SYSTEM_EXCEPTION = 54;
    public static final int MSG_ENROLL_ERROR_TEMLATE_FILE_NOT_EXIST = 56;
    public static final int MSG_ENROLL_ERROR_TOF_BE_COVERED = 64;
    public static final int MSG_ENROLL_ERROR_TOF_NOT_MOUNT = 65;
    public static final int MSG_ENROLL_ERROR_UNLOCK_FAIL = 55;
    public static final int MSG_ENROLL_FACE_IR_FOUND = 2;
    public static final int MSG_ENROLL_FACE_IR_NOT_FOUND = 4;
    public static final int MSG_ENROLL_FACE_RGB_FOUND = 1;
    public static final int MSG_ENROLL_FACE_RGB_NOT_FOUND = 3;
    public static final int MSG_ENROLL_HELP_ALL_BLOCKED = 28;
    public static final int MSG_ENROLL_HELP_BAD_AMBIENT_LIGHT = 32;
    public static final int MSG_ENROLL_HELP_BOTH_EYE_BLOCKED = 25;
    public static final int MSG_ENROLL_HELP_BOTH_EYE_CLOSE = 31;
    public static final int MSG_ENROLL_HELP_DIRECTION_DOWN = 13;
    public static final int MSG_ENROLL_HELP_DIRECTION_LEFT = 14;
    public static final int MSG_ENROLL_HELP_DIRECTION_RIGHT = 15;
    public static final int MSG_ENROLL_HELP_DIRECTION_UP = 12;
    public static final int MSG_ENROLL_HELP_FACE_DETECT_FAIL_NOT_IN_ROI = 21;
    public static final int MSG_ENROLL_HELP_FACE_DETECT_OK = 10;
    public static final int MSG_ENROLL_HELP_FACE_TOO_NEER = 33;
    public static final int MSG_ENROLL_HELP_IR_CAM_OPEND = 2;
    public static final int MSG_ENROLL_HELP_LEFTEYE_MOUSE_BLOCKED = 26;
    public static final int MSG_ENROLL_HELP_LEFT_EYE_BLOCKED = 22;
    public static final int MSG_ENROLL_HELP_LEFT_EYE_CLOSE = 29;
    public static final int MSG_ENROLL_HELP_MOUSE_BLOCKED = 24;
    public static final int MSG_ENROLL_HELP_PREVIEW_CAM_OPEND = 1;
    public static final int MSG_ENROLL_HELP_RIGHTEYE_MOUSE_BLOCKED = 27;
    public static final int MSG_ENROLL_HELP_RIGHT_EYE_BLOCKED = 23;
    public static final int MSG_ENROLL_HELP_RIGHT_EYE_CLOSE = 30;
    public static final int MSG_ENROLL_PROGRESS_SUCCESS = 0;
    private static final String POWERMODE_SUPERSAVE_OPEN = "power_supersave_mode_open";
    private static final String POWERMODE_SUPERSAVE_OPEN_URI = "content://settings/secure/power_supersave_mode_open";
    private static final int RECEIVER_ON_AUTHENTICATION_TIMEOUT = 1;
    private static final int RECEIVER_ON_ENROLL_TIMEOUT = 0;
    public static final String TABLE_TEMPLATE_COLUMN_DATA = "data";
    public static final String TABLE_TEMPLATE_COLUMN_GROUP_ID = "group_id";
    public static final String TABLE_TEMPLATE_COLUMN_ID = "_id";
    public static final String TABLE_TEMPLATE_COLUMN_NAME = "template_name";
    public static final String TABLE_TEMPLATE_COLUMN_VALID = "valid";
    public static final String TABLE_TEMPLATE_NAME = "_template";
    private static final String TEMPLATE_PATH = "/data/user/0/com.xiaomi.biometric/files/";
    private static final int VERSION_1 = 1;
    private static final int height = 4;
    /* access modifiers changed from: private */
    public static final ReentrantLock lock = new ReentrantLock();
    private static final int width = 3;
    private Object boostFramework;
    /* access modifiers changed from: private */
    public final Context context;
    private final int hasEnrollFace;
    private boolean isReleased;
    /* access modifiers changed from: private */
    public IMiuiFaceManager.AuthenticationCallback mAuthenticationCallback;
    private final Object mBinderLock = new Object();
    private BiometricClient mBiometricClient;
    private boolean mDatabaseChanged;
    private int mDatabaseStatus;
    private boolean mDisonnected;
    private final EnrollParam mEnrollParam = new EnrollParam();
    /* access modifiers changed from: private */
    public IMiuiFaceManager.EnrollmentCallback mEnrollmentCallback;
    private FaceInfo mFaceInfo;
    private int mGroupIdMax;
    private List<GroupItem> mGroupItemList;
    private Handler mHandler;
    /* access modifiers changed from: private */
    public boolean mHasFaceData;
    private ContentObserver mHasFaceDataObserver;
    /* access modifiers changed from: private */
    public boolean mIsSuperPower;
    private final List<Miuiface> mMiuifaceList;
    private IMiuiFaceManager.RemovalCallback mRemovalCallback;
    private Miuiface mRemovalMiuiface;
    private ContentObserver mSuperPowerOpenObserver;
    private int mTemplateIdMax;
    private List<TemplateItem> mTemplateItemList;
    /* access modifiers changed from: private */
    public int mcancelStatus;
    private SQLiteDatabase myDB;
    private List<TemplateItem> myTemplateItemList;
    private Method sAcquireFunc;
    private Class<?> sPerfClass;
    private Method sReleaseFunc;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$ClientHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "Lja/u;", "handleMessage", "Landroid/content/Context;", "context", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl;Landroid/content/Context;)V", "Landroid/os/Looper;", "looper", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl;Landroid/os/Looper;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: Miui3DFaceManagerImpl.kt */
    private final class ClientHandler extends Handler {
        final /* synthetic */ Miui3DFaceManagerImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientHandler(Miui3DFaceManagerImpl miui3DFaceManagerImpl, Context context) {
            super(context.getMainLooper());
            C13706o.m87929f(context, "context");
            this.this$0 = miui3DFaceManagerImpl;
        }

        public void handleMessage(Message message) {
            C13706o.m87929f(message, NotificationCompat.CATEGORY_MESSAGE);
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d(Miui3DFaceManagerImpl.LOG_TAG, " handleMessage  callback what:" + message.what);
            int i = message.what;
            if (i != 0) {
                if (i == 1 && this.this$0.mAuthenticationCallback != null) {
                    biometricLoggerImpl.mo68217d(Miui3DFaceManagerImpl.LOG_TAG, "xiaomi ---> RECEIVER_ON_AUTHENTICATION_TIMEOUT");
                    IMiuiFaceManager.AuthenticationCallback access$getMAuthenticationCallback$p = this.this$0.mAuthenticationCallback;
                    if (access$getMAuthenticationCallback$p != null) {
                        access$getMAuthenticationCallback$p.onAuthenticationFailed();
                    }
                    this.this$0.cancelAuthentication();
                }
            } else if (this.this$0.mEnrollmentCallback != null) {
                IMiuiFaceManager.EnrollmentCallback access$getMEnrollmentCallback$p = this.this$0.mEnrollmentCallback;
                if (access$getMEnrollmentCallback$p != null) {
                    access$getMEnrollmentCallback$p.onEnrollmentError(66, (CharSequence) null);
                }
                biometricLoggerImpl.mo68217d(Miui3DFaceManagerImpl.LOG_TAG, "RECEIVER_ON_ENROLL_TIMEOUT");
                this.this$0.cancelEnrollment();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientHandler(Miui3DFaceManagerImpl miui3DFaceManagerImpl, Looper looper) {
            super(looper);
            C13706o.m87929f(looper, "looper");
            this.this$0 = miui3DFaceManagerImpl;
        }
    }

    @Metadata(mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010a\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020_X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$Companion;", "", "()V", "CANCEL_STATUS_DONE", "", "CANCEL_STATUS_NONE", "COMMAND_ENROLL_RESUME_ENROLL_LOGIC", "DB_STATUS_NONE", "DB_STATUS_PREPARED", "DB_STATUS_PREPARING", "DEBUG", "", "FACEUNLOCK_SUPPORT_SUPERPOWER", "", "FACE_UNLOCK_HAS_FEATURE", "FACE_UNLOCK_HAS_FEATURE_URI", "INSTANCE", "Ljava/util/concurrent/atomic/AtomicReference;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/IMiuiFaceManager;", "LOG_TAG", "MSG_AUTHENTICATION_HELP_ALL_BLOCKED", "MSG_AUTHENTICATION_HELP_BAD_AMBIENT_LIGHT", "MSG_AUTHENTICATION_HELP_BOTH_EYE_BLOCKED", "MSG_AUTHENTICATION_HELP_BOTH_EYE_CLOSE", "MSG_AUTHENTICATION_HELP_FACE_AUTH_FAILD", "MSG_AUTHENTICATION_HELP_FACE_DETECT_FAIL", "MSG_AUTHENTICATION_HELP_FACE_DETECT_OK", "MSG_AUTHENTICATION_HELP_FACE_TOO_NEER", "MSG_AUTHENTICATION_HELP_LEFTEYE_MOUSE_BLOCKED", "MSG_AUTHENTICATION_HELP_LEFT_EYE_BLOCKED", "MSG_AUTHENTICATION_HELP_LEFT_EYE_CLOSE", "MSG_AUTHENTICATION_HELP_LIVING_BODY_DETECTION_FAILED", "MSG_AUTHENTICATION_HELP_MOUSE_BLOCKED", "MSG_AUTHENTICATION_HELP_RIGHTEYE_MOUSE_BLOCKED", "MSG_AUTHENTICATION_HELP_RIGHT_EYE_BLOCKED", "MSG_AUTHENTICATION_HELP_RIGHT_EYE_CLOSE", "MSG_AUTHENTICATION_STOP", "MSG_ENROLL_ENROLL_TIMEOUT", "MSG_ENROLL_ERROR_CREATE_FOLDER_FAILED", "MSG_ENROLL_ERROR_DISABLE_FAIL", "MSG_ENROLL_ERROR_ENABLE_FAIL", "MSG_ENROLL_ERROR_FACE_LOST", "MSG_ENROLL_ERROR_FLOOD_ITO_ERR", "MSG_ENROLL_ERROR_IR_CAM_CLOSED", "MSG_ENROLL_ERROR_LASER_ITO_ERR", "MSG_ENROLL_ERROR_LIVING_BODY_DETECTION_FAILED", "MSG_ENROLL_ERROR_NOT_SAME_PERSON", "MSG_ENROLL_ERROR_PREVIEW_CAM_ERROR", "MSG_ENROLL_ERROR_RTMV_IC_ERR", "MSG_ENROLL_ERROR_SAVE_TEMPLATE_FAILED", "MSG_ENROLL_ERROR_SDK_ERROR", "MSG_ENROLL_ERROR_SYSTEM_EXCEPTION", "MSG_ENROLL_ERROR_TEMLATE_FILE_NOT_EXIST", "MSG_ENROLL_ERROR_TOF_BE_COVERED", "MSG_ENROLL_ERROR_TOF_NOT_MOUNT", "MSG_ENROLL_ERROR_UNLOCK_FAIL", "MSG_ENROLL_FACE_IR_FOUND", "MSG_ENROLL_FACE_IR_NOT_FOUND", "MSG_ENROLL_FACE_RGB_FOUND", "MSG_ENROLL_FACE_RGB_NOT_FOUND", "MSG_ENROLL_HELP_ALL_BLOCKED", "MSG_ENROLL_HELP_BAD_AMBIENT_LIGHT", "MSG_ENROLL_HELP_BOTH_EYE_BLOCKED", "MSG_ENROLL_HELP_BOTH_EYE_CLOSE", "MSG_ENROLL_HELP_DIRECTION_DOWN", "MSG_ENROLL_HELP_DIRECTION_LEFT", "MSG_ENROLL_HELP_DIRECTION_RIGHT", "MSG_ENROLL_HELP_DIRECTION_UP", "MSG_ENROLL_HELP_FACE_DETECT_FAIL_NOT_IN_ROI", "MSG_ENROLL_HELP_FACE_DETECT_OK", "MSG_ENROLL_HELP_FACE_TOO_NEER", "MSG_ENROLL_HELP_IR_CAM_OPEND", "MSG_ENROLL_HELP_LEFTEYE_MOUSE_BLOCKED", "MSG_ENROLL_HELP_LEFT_EYE_BLOCKED", "MSG_ENROLL_HELP_LEFT_EYE_CLOSE", "MSG_ENROLL_HELP_MOUSE_BLOCKED", "MSG_ENROLL_HELP_PREVIEW_CAM_OPEND", "MSG_ENROLL_HELP_RIGHTEYE_MOUSE_BLOCKED", "MSG_ENROLL_HELP_RIGHT_EYE_BLOCKED", "MSG_ENROLL_HELP_RIGHT_EYE_CLOSE", "MSG_ENROLL_PROGRESS_SUCCESS", "POWERMODE_SUPERSAVE_OPEN", "POWERMODE_SUPERSAVE_OPEN_URI", "RECEIVER_ON_AUTHENTICATION_TIMEOUT", "RECEIVER_ON_ENROLL_TIMEOUT", "TABLE_TEMPLATE_COLUMN_DATA", "TABLE_TEMPLATE_COLUMN_GROUP_ID", "TABLE_TEMPLATE_COLUMN_ID", "TABLE_TEMPLATE_COLUMN_NAME", "TABLE_TEMPLATE_COLUMN_VALID", "TABLE_TEMPLATE_NAME", "TEMPLATE_PATH", "VERSION_1", "height", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "width", "getInstance", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Miui3DFaceManagerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final IMiuiFaceManager getInstance() {
            if (Miui3DFaceManagerImpl.INSTANCE.get() != null) {
                IMiuiFaceManager iMiuiFaceManager = (IMiuiFaceManager) Miui3DFaceManagerImpl.INSTANCE.get();
                boolean z = true;
                if (iMiuiFaceManager == null || !iMiuiFaceManager.isReleased()) {
                    z = false;
                }
                if (z) {
                    Miui3DFaceManagerImpl.INSTANCE.set((Object) null);
                }
            }
            if (Miui3DFaceManagerImpl.INSTANCE.get() == null) {
                try {
                    ReentrantLock access$getLock$cp = Miui3DFaceManagerImpl.lock;
                    C13329n.C13330a aVar = C13329n.f61327a;
                    access$getLock$cp.lock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th) {
                    ReentrantLock access$getLock$cp2 = Miui3DFaceManagerImpl.lock;
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
                if (Miui3DFaceManagerImpl.INSTANCE.get() == null) {
                    Miui3DFaceManagerImpl.INSTANCE.set(new Miui3DFaceManagerImpl());
                }
                ReentrantLock access$getLock$cp3 = Miui3DFaceManagerImpl.lock;
                try {
                    C13329n.C13330a aVar4 = C13329n.f61327a;
                    access$getLock$cp3.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th3) {
                    C13329n.C13330a aVar5 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th3));
                }
            }
            return (IMiuiFaceManager) Miui3DFaceManagerImpl.INSTANCE.get();
        }
    }

    @Metadata(mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006!"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$EnrollParam;", "", "()V", "DepthmpaType", "", "getDepthmpaType", "()I", "setDepthmpaType", "(I)V", "enableDepthmap", "", "getEnableDepthmap", "()Z", "setEnableDepthmap", "(Z)V", "enableDistanceDetect", "getEnableDistanceDetect", "setEnableDistanceDetect", "enableIrFaceDetect", "getEnableIrFaceDetect", "setEnableIrFaceDetect", "enrollWaitUi", "getEnrollWaitUi", "setEnrollWaitUi", "rectDetectZones", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$FRect;", "getRectDetectZones", "()Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$FRect;", "setRectDetectZones", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$FRect;)V", "rectEnrollZones", "getRectEnrollZones", "setRectEnrollZones", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Miui3DFaceManagerImpl.kt */
    public static final class EnrollParam {
        private int DepthmpaType;
        private boolean enableDepthmap;
        private boolean enableDistanceDetect;
        private boolean enableIrFaceDetect;
        private boolean enrollWaitUi;
        private FRect rectDetectZones;
        private FRect rectEnrollZones;

        public final int getDepthmpaType() {
            return this.DepthmpaType;
        }

        public final boolean getEnableDepthmap() {
            return this.enableDepthmap;
        }

        public final boolean getEnableDistanceDetect() {
            return this.enableDistanceDetect;
        }

        public final boolean getEnableIrFaceDetect() {
            return this.enableIrFaceDetect;
        }

        public final boolean getEnrollWaitUi() {
            return this.enrollWaitUi;
        }

        public final FRect getRectDetectZones() {
            return this.rectDetectZones;
        }

        public final FRect getRectEnrollZones() {
            return this.rectEnrollZones;
        }

        public final void setDepthmpaType(int i) {
            this.DepthmpaType = i;
        }

        public final void setEnableDepthmap(boolean z) {
            this.enableDepthmap = z;
        }

        public final void setEnableDistanceDetect(boolean z) {
            this.enableDistanceDetect = z;
        }

        public final void setEnableIrFaceDetect(boolean z) {
            this.enableIrFaceDetect = z;
        }

        public final void setEnrollWaitUi(boolean z) {
            this.enrollWaitUi = z;
        }

        public final void setRectDetectZones(FRect fRect) {
            this.rectDetectZones = fRect;
        }

        public final void setRectEnrollZones(FRect fRect) {
            this.rectEnrollZones = fRect;
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$FRect;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom", "()F", "setBottom", "(F)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Miui3DFaceManagerImpl.kt */
    public static final class FRect {
        private float bottom;
        private float left;
        private float right;
        private float top;

        public FRect(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        public final float getBottom() {
            return this.bottom;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getRight() {
            return this.right;
        }

        public final float getTop() {
            return this.top;
        }

        public final void setBottom(float f) {
            this.bottom = f;
        }

        public final void setLeft(float f) {
            this.left = f;
        }

        public final void setRight(float f) {
            this.right = f;
        }

        public final void setTop(float f) {
            this.top = f;
        }
    }

    @Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006 "}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$FaceInfo;", "", "()V", "bounds", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "setBounds", "(Landroid/graphics/Rect;)V", "eye_dist", "", "getEye_dist", "()F", "setEye_dist", "(F)V", "pitch", "getPitch", "setPitch", "points_array", "", "Landroid/graphics/Point;", "getPoints_array", "()[Landroid/graphics/Point;", "setPoints_array", "([Landroid/graphics/Point;)V", "[Landroid/graphics/Point;", "roll", "getRoll", "setRoll", "yaw", "getYaw", "setYaw", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Miui3DFaceManagerImpl.kt */
    public static final class FaceInfo {
        private Rect bounds;
        private float eye_dist;
        private float pitch;
        private Point[] points_array = new Point[0];
        private float roll;
        private float yaw;

        public final Rect getBounds() {
            return this.bounds;
        }

        public final float getEye_dist() {
            return this.eye_dist;
        }

        public final float getPitch() {
            return this.pitch;
        }

        public final Point[] getPoints_array() {
            return this.points_array;
        }

        public final float getRoll() {
            return this.roll;
        }

        public final float getYaw() {
            return this.yaw;
        }

        public final void setBounds(Rect rect) {
            this.bounds = rect;
        }

        public final void setEye_dist(float f) {
            this.eye_dist = f;
        }

        public final void setPitch(float f) {
            this.pitch = f;
        }

        public final void setPoints_array(Point[] pointArr) {
            C13706o.m87929f(pointArr, "<set-?>");
            this.points_array = pointArr;
        }

        public final void setRoll(float f) {
            this.roll = f;
        }

        public final void setYaw(float f) {
            this.yaw = f;
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$GroupItem;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Miui3DFaceManagerImpl.kt */
    public static final class GroupItem {

        /* renamed from: id */
        private int f58248id;
        private String name;

        public final int getId() {
            return this.f58248id;
        }

        public final String getName() {
            return this.name;
        }

        public final void setId(int i) {
            this.f58248id = i;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$OnAuthenticationCancelListener;", "Landroid/os/CancellationSignal$OnCancelListener;", "Lja/u;", "onCancel", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: Miui3DFaceManagerImpl.kt */
    private final class OnAuthenticationCancelListener implements CancellationSignal.OnCancelListener {
        public OnAuthenticationCancelListener() {
        }

        public void onCancel() {
            Miui3DFaceManagerImpl.this.mcancelStatus = 1;
            Miui3DFaceManagerImpl.this.cancelAuthentication();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$OnEnrollCancelListener;", "Landroid/os/CancellationSignal$OnCancelListener;", "Lja/u;", "onCancel", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: Miui3DFaceManagerImpl.kt */
    private final class OnEnrollCancelListener implements CancellationSignal.OnCancelListener {
        public OnEnrollCancelListener() {
        }

        public void onCancel() {
            Miui3DFaceManagerImpl.this.cancelEnrollment();
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/Miui3DFaceManagerImpl$TemplateItem;", "", "()V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "group_id", "", "getGroup_id", "()I", "setGroup_id", "(I)V", "id", "getId", "setId", "name", "getName", "setName", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Miui3DFaceManagerImpl.kt */
    public static final class TemplateItem {
        private String data;
        private int group_id;

        /* renamed from: id */
        private int f58249id;
        private String name;

        public final String getData() {
            return this.data;
        }

        public final int getGroup_id() {
            return this.group_id;
        }

        public final int getId() {
            return this.f58249id;
        }

        public final String getName() {
            return this.name;
        }

        public final void setData(String str) {
            this.data = str;
        }

        public final void setGroup_id(int i) {
            this.group_id = i;
        }

        public final void setId(int i) {
            this.f58249id = i;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    public Miui3DFaceManagerImpl() {
        ContentObserver contentObserver;
        ContentObserver contentObserver2;
        Context g = C12104a.f58372a.mo68283g();
        this.context = g;
        this.mDisonnected = true;
        this.isReleased = false;
        ContentObserver contentObserver3 = null;
        this.mRemovalCallback = null;
        this.mAuthenticationCallback = null;
        this.mEnrollmentCallback = null;
        ClientHandler clientHandler = new ClientHandler(this, g);
        this.mHandler = clientHandler;
        this.mSuperPowerOpenObserver = new ContentObserver(this, clientHandler) {
            final /* synthetic */ Miui3DFaceManagerImpl this$0;

            {
                this.this$0 = r1;
            }

            public void onChange(boolean z) {
                super.onChange(z);
                Miui3DFaceManagerImpl miui3DFaceManagerImpl = this.this$0;
                boolean z2 = false;
                if (SettingsSystem.INSTANCE.getIntForUser(miui3DFaceManagerImpl.context.getContentResolver(), Miui3DFaceManagerImpl.POWERMODE_SUPERSAVE_OPEN, 0, 0) != 0) {
                    z2 = true;
                }
                miui3DFaceManagerImpl.mIsSuperPower = z2;
            }
        };
        this.mHasFaceDataObserver = new ContentObserver(this, this.mHandler) {
            final /* synthetic */ Miui3DFaceManagerImpl this$0;

            {
                this.this$0 = r1;
            }

            public void onChange(boolean z) {
                super.onChange(z);
                Miui3DFaceManagerImpl miui3DFaceManagerImpl = this.this$0;
                boolean z2 = false;
                if (SettingsSecure.INSTANCE.getIntForUser(miui3DFaceManagerImpl.context.getContentResolver(), Miui3DFaceManagerImpl.FACE_UNLOCK_HAS_FEATURE, 0, 0) != 0) {
                    z2 = true;
                }
                miui3DFaceManagerImpl.mHasFaceData = z2;
            }
        };
        try {
            ContentResolverHelper contentResolverHelper = ContentResolverHelper.INSTANCE;
            ContentResolver contentResolver = g.getContentResolver();
            C13706o.m87928e(contentResolver, "context.contentResolver");
            Uri uriFor = Settings.Secure.getUriFor(FACE_UNLOCK_HAS_FEATURE);
            C13706o.m87928e(uriFor, "getUriFor(FACE_UNLOCK_HAS_FEATURE)");
            ContentObserver contentObserver4 = this.mHasFaceDataObserver;
            if (contentObserver4 == null) {
                C13706o.m87945v("mHasFaceDataObserver");
                contentObserver = null;
            } else {
                contentObserver = contentObserver4;
            }
            contentResolverHelper.registerContentObserver(contentResolver, uriFor, false, contentObserver, 0);
            ContentObserver contentObserver5 = this.mHasFaceDataObserver;
            if (contentObserver5 == null) {
                C13706o.m87945v("mHasFaceDataObserver");
                contentObserver5 = null;
            }
            contentObserver5.onChange(false);
            ContentResolver contentResolver2 = g.getContentResolver();
            C13706o.m87928e(contentResolver2, "context.contentResolver");
            Uri uriFor2 = Settings.System.getUriFor(POWERMODE_SUPERSAVE_OPEN);
            C13706o.m87928e(uriFor2, "getUriFor(POWERMODE_SUPERSAVE_OPEN)");
            ContentObserver contentObserver6 = this.mSuperPowerOpenObserver;
            if (contentObserver6 == null) {
                C13706o.m87945v("mSuperPowerOpenObserver");
                contentObserver2 = null;
            } else {
                contentObserver2 = contentObserver6;
            }
            contentResolverHelper.registerContentObserver(contentResolver2, uriFor2, false, contentObserver2, 0);
            ContentObserver contentObserver7 = this.mSuperPowerOpenObserver;
            if (contentObserver7 == null) {
                C13706o.m87945v("mSuperPowerOpenObserver");
            } else {
                contentObserver3 = contentObserver7;
            }
            contentObserver3.onChange(false);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
        BiometricClient biometricClient = new BiometricClient();
        this.mBiometricClient = biometricClient;
        biometricClient.startService(this);
        preloadBoostFramework();
    }

    private final float IrToRgbMove(float f, float f2) {
        return f + f2;
    }

    private final float IrToRgbRadio(float f) {
        return ((f * 12.0f) - 1.0f) / 10.0f;
    }

    private final float IrToRgbScale(float f, float f2) {
        return f > 0.5f ? f * f2 : 0.5f - ((0.5f - f) * f2);
    }

    private final void adjustDetectZone(float[] fArr) {
        if (fArr != null && fArr.length >= 4) {
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                float f = fArr[i];
                if (i % 2 == 1) {
                    if (i < 4) {
                        fArr[i] = IrToRgbScale(fArr[i], 1.18f);
                    } else {
                        fArr[i] = IrToRgbScale(fArr[i], 1.06f);
                    }
                    fArr[i] = IrToRgbMove(fArr[i], -0.067f);
                    fArr[i] = IrToRgbRadio(fArr[i]);
                } else {
                    if (i < 4) {
                        fArr[i] = IrToRgbScale(fArr[i], 1.16f);
                    } else {
                        fArr[i] = IrToRgbScale(fArr[i], 1.05f);
                    }
                    fArr[i] = IrToRgbMove(fArr[i], -0.044f);
                }
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "adjustDetectZone " + i + ": " + f + " to " + fArr[i]);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void cancelAuthentication() {
        if (isReleased()) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "stopVerify ctx:" + this.context + " ignore!");
            return;
        }
        if (this.mcancelStatus != 0) {
            IMiuiFaceManager.AuthenticationCallback authenticationCallback = this.mAuthenticationCallback;
            if (authenticationCallback != null) {
                authenticationCallback.onAuthenticationError(34, getMessageInfo(34));
            }
            this.mcancelStatus = 0;
        }
        try {
            Method method = this.sReleaseFunc;
            if (!(method == null || method == null)) {
                method.invoke(this.boostFramework, new Object[0]);
            }
        } catch (IllegalAccessException e) {
            BiometricLoggerImpl.INSTANCE.mo68218e((Throwable) e);
        } catch (InvocationTargetException e2) {
            BiometricLoggerImpl.INSTANCE.mo68218e((Throwable) e2);
        }
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "cancelAuthentication ctx:" + this.context);
        this.mAuthenticationCallback = null;
        BiometricClient biometricClient = this.mBiometricClient;
        if (biometricClient != null) {
            BiometricClient.sendCommand$default(biometricClient, 6, 0, 2, (Object) null);
        }
        this.mHandler.removeMessages(1);
    }

    /* access modifiers changed from: private */
    public final void cancelEnrollment() {
        if (isReleased()) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "stopEnroll ignore!");
            return;
        }
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "stopEnroll");
        BiometricClient biometricClient = this.mBiometricClient;
        if (biometricClient != null) {
            BiometricClient.sendCommand$default(biometricClient, 8, 0, 2, (Object) null);
        }
        BiometricClient biometricClient2 = this.mBiometricClient;
        if (biometricClient2 != null) {
            BiometricClient.sendCommand$default(biometricClient2, 4, 0, 2, (Object) null);
        }
        this.mHandler.removeMessages(0);
    }

    private final void commitDatabase() {
        if (isReleased()) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "commitDatabase ignore!");
        } else if (this.mDatabaseChanged) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "commitDatabase");
            Bundle bundle = new Bundle();
            bundle.setClassLoader(BiometricConnect.class.getClassLoader());
            ArrayList arrayList = new ArrayList();
            List<GroupItem> list = this.mGroupItemList;
            if (list != null) {
                for (GroupItem next : list) {
                    if (next != null) {
                        arrayList.add(BiometricConnect.INSTANCE.getDBGroup(next.getId(), next.getName()));
                    }
                }
            }
            bundle.putParcelableArrayList("group", arrayList);
            ArrayList arrayList2 = new ArrayList();
            List<TemplateItem> list2 = this.mTemplateItemList;
            if (list2 != null) {
                for (TemplateItem next2 : list2) {
                    if (next2 != null) {
                        arrayList2.add(BiometricConnect.INSTANCE.getDBTemplate(next2.getId(), next2.getName(), next2.getData(), next2.getGroup_id()));
                    }
                }
            }
            bundle.putParcelableArrayList(BiometricConnect.INSTANCE.getMSG_CB_BUNDLE_DB_TEMPLATE(), arrayList2);
            BiometricClient biometricClient = this.mBiometricClient;
            if (biometricClient != null) {
                biometricClient.sendBundle(4, bundle);
            }
        }
    }

    private final TemplateItem findTemplate(int i) {
        List<TemplateItem> list = this.mTemplateItemList;
        if (list == null) {
            return null;
        }
        for (TemplateItem next : list) {
            boolean z = false;
            if (next != null && next.getId() == i) {
                z = true;
                continue;
            }
            if (z) {
                return next;
            }
        }
        return null;
    }

    private final String getMessageInfo(int i) {
        if (i == 34) {
            return "Be cancel";
        }
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "default msgId: " + i);
        return "define by 3dclient";
    }

    private final void handlerDatabase(Bundle bundle) {
        if (this.mDatabaseStatus != 1) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "handlerDatabase mDatabaseStatus ignore");
            return;
        }
        BiometricConnect biometricConnect = BiometricConnect.INSTANCE;
        if (biometricConnect.getDEBUG_LOG()) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "handlerDatabase ");
        }
        this.mTemplateIdMax = bundle.getInt(biometricConnect.getMSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX());
        this.mGroupIdMax = bundle.getInt(biometricConnect.getMSG_CB_BUNDLE_DB_GROUP_ID_MAX());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("group");
        Integer num = null;
        if (biometricConnect.getDEBUG_LOG()) {
            StringBuilder sb = new StringBuilder();
            sb.append("handlerDatabase listGroup:");
            sb.append(parcelableArrayList != null ? Integer.valueOf(parcelableArrayList.size()) : null);
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, sb.toString());
        }
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(biometricConnect.getMSG_CB_BUNDLE_DB_TEMPLATE());
        if (biometricConnect.getDEBUG_LOG()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("handlerDatabase list:");
            if (parcelableArrayList2 != null) {
                num = Integer.valueOf(parcelableArrayList2.size());
            }
            sb2.append(num);
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, sb2.toString());
        }
        initClientDB(parcelableArrayList, parcelableArrayList2);
    }

    private final void handlerFace(Bundle bundle) {
        IMiuiFaceManager.EnrollmentCallback enrollmentCallback;
        if (this.mEnrollmentCallback != null) {
            BiometricConnect biometricConnect = BiometricConnect.INSTANCE;
            if (biometricConnect.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "handlerFace ");
            }
            boolean z = bundle.getBoolean(biometricConnect.getMSG_CB_BUNDLE_FACE_IS_IR());
            if (bundle.getBoolean(biometricConnect.getMSG_CB_BUNDLE_FACE_HAS_FACE())) {
                if (this.mFaceInfo == null) {
                    this.mFaceInfo = new FaceInfo();
                }
                Parcelable parcelable = bundle.getParcelable(biometricConnect.getMSG_CB_BUNDLE_FACE_RECT_BOUND());
                if (parcelable instanceof Rect) {
                    FaceInfo faceInfo = this.mFaceInfo;
                    if (faceInfo != null) {
                        faceInfo.setBounds((Rect) parcelable);
                    }
                    if (biometricConnect.getDEBUG_LOG()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("handlerFace detect face:");
                        FaceInfo faceInfo2 = this.mFaceInfo;
                        sb.append(String.valueOf(faceInfo2 != null ? faceInfo2.getBounds() : null));
                        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, sb.toString());
                    }
                }
                FaceInfo faceInfo3 = this.mFaceInfo;
                if (faceInfo3 != null) {
                    faceInfo3.setYaw(bundle.getFloat(biometricConnect.getMSG_CB_BUNDLE_FACE_FLOAT_YAW()));
                }
                FaceInfo faceInfo4 = this.mFaceInfo;
                if (faceInfo4 != null) {
                    faceInfo4.setPitch(bundle.getFloat("pitch"));
                }
                FaceInfo faceInfo5 = this.mFaceInfo;
                if (faceInfo5 != null) {
                    faceInfo5.setRoll(bundle.getFloat(biometricConnect.getMSG_CB_BUNDLE_FACE_FLOAT_ROLL()));
                }
                FaceInfo faceInfo6 = this.mFaceInfo;
                if (faceInfo6 != null) {
                    faceInfo6.setEye_dist(bundle.getFloat(biometricConnect.getMSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST()));
                }
                try {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(biometricConnect.getMSG_CB_BUNDLE_FACE_POINTS_ARRAY());
                    FaceInfo faceInfo7 = this.mFaceInfo;
                    if (faceInfo7 != null) {
                        C13706o.m87927d(parcelableArray, "null cannot be cast to non-null type kotlin.Array<android.graphics.Point?>");
                        faceInfo7.setPoints_array((Point[]) parcelableArray);
                    }
                } catch (Exception unused) {
                }
                if (!z && (enrollmentCallback = this.mEnrollmentCallback) != null) {
                    enrollmentCallback.onEnrollmentHelp(1, (CharSequence) null);
                } else if (z && this.mEnrollmentCallback != null) {
                    this.mEnrollParam.getEnableDistanceDetect();
                    IMiuiFaceManager.EnrollmentCallback enrollmentCallback2 = this.mEnrollmentCallback;
                    if (enrollmentCallback2 != null) {
                        enrollmentCallback2.onEnrollmentHelp(2, (CharSequence) null);
                    }
                }
            } else {
                IMiuiFaceManager.EnrollmentCallback enrollmentCallback3 = this.mEnrollmentCallback;
                if (enrollmentCallback3 != null) {
                    enrollmentCallback3.onEnrollmentHelp(z ? 4 : 3, (CharSequence) null);
                }
            }
        }
    }

    private final void initClientDB(ArrayList<Parcelable> arrayList, ArrayList<Parcelable> arrayList2) {
        if (this.mDatabaseStatus != 2 || this.mDatabaseChanged) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "initClientDB begin");
            this.mTemplateItemList = new ArrayList();
            Iterator<Parcelable> it = arrayList2 != null ? arrayList2.iterator() : null;
            if (it == null) {
                it = C13614t.m87748j().iterator();
            }
            Class<?> cls = null;
            while (it.hasNext()) {
                Parcelable next = it.next();
                if (cls == null) {
                    if (next != null) {
                        try {
                            cls = next.getClass();
                        } catch (Throwable th) {
                            BiometricLoggerImpl.INSTANCE.mo68218e(th);
                        }
                    } else {
                        cls = null;
                    }
                }
                if (cls != null) {
                    TemplateItem templateItem = new TemplateItem();
                    templateItem.setId(cls.getField("mId").getInt(next));
                    Object obj = cls.getField("mName").get(next);
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.String");
                    templateItem.setName((String) obj);
                    templateItem.setGroup_id(cls.getField("mGroupId").getInt(next));
                    Object obj2 = cls.getField("mData").get(next);
                    C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.String");
                    templateItem.setData((String) obj2);
                    List<TemplateItem> list = this.mTemplateItemList;
                    if (list != null) {
                        list.add(templateItem);
                    }
                }
            }
            this.mGroupItemList = new ArrayList();
            Iterator<Parcelable> it2 = arrayList != null ? arrayList.iterator() : null;
            if (it2 == null) {
                it2 = C13614t.m87748j().iterator();
            }
            Class<?> cls2 = null;
            while (it2.hasNext()) {
                Parcelable next2 = it2.next();
                if (cls2 == null) {
                    if (next2 != null) {
                        try {
                            cls2 = next2.getClass();
                        } catch (Throwable th2) {
                            BiometricLoggerImpl.INSTANCE.mo68218e(th2);
                        }
                    } else {
                        cls2 = null;
                    }
                }
                if (cls2 != null) {
                    GroupItem groupItem = new GroupItem();
                    groupItem.setId(cls2.getField("mId").getInt(next2));
                    Object obj3 = cls2.getField("mName").get(next2);
                    C13706o.m87927d(obj3, "null cannot be cast to non-null type kotlin.String");
                    groupItem.setName((String) obj3);
                    List<GroupItem> list2 = this.mGroupItemList;
                    if (list2 != null) {
                        list2.add(groupItem);
                    }
                }
            }
            this.mDatabaseStatus = 2;
            this.mDatabaseChanged = false;
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "initClientDB ok");
        }
    }

    private final void preloadBoostFramework() {
        try {
            Class<?> cls = Class.forName("android.util.BoostFramework");
            this.sPerfClass = cls;
            Constructor<?> constructor = cls.getConstructor(new Class[0]);
            Method method = null;
            this.boostFramework = constructor != null ? constructor.newInstance(new Object[0]) : null;
            Class<?> cls2 = this.sPerfClass;
            this.sAcquireFunc = cls2 != null ? cls2.getMethod("perfLockAcquire", new Class[]{Integer.TYPE, int[].class}) : null;
            Class<?> cls3 = this.sPerfClass;
            if (cls3 != null) {
                method = cls3.getMethod("perfLockRelease", new Class[0]);
            }
            this.sReleaseFunc = method;
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "preload BoostFramework succeed.");
        } catch (Exception unused) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "preload class android.util.BoostFramework failed");
        }
    }

    private final void prepareDatabase() {
        if (this.mDatabaseStatus != 0) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "prepareDatabase ignore!");
            return;
        }
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "prepareDatabase");
        this.mDatabaseStatus = 1;
        BiometricClient biometricClient = this.mBiometricClient;
        if (biometricClient != null) {
            BiometricClient.sendCommand$default(biometricClient, 9, 0, 2, (Object) null);
        }
    }

    private final void resetDatabase() {
        if (this.mDatabaseStatus != 2) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "resetDatabase ignore!");
            return;
        }
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "resetDatabase");
        this.mDatabaseStatus = 1;
        BiometricClient biometricClient = this.mBiometricClient;
        if (biometricClient != null) {
            BiometricClient.sendCommand$default(biometricClient, 10, 0, 2, (Object) null);
        }
    }

    private final void tryConnectService() {
        if (this.mDisonnected) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "mDisonnected is true ");
            this.mDatabaseStatus = 0;
            BiometricClient biometricClient = this.mBiometricClient;
            if (biometricClient != null) {
                biometricClient.startService(this);
            }
        }
    }

    private final void useHandler(Handler handler) {
        if (handler != null) {
            Looper looper = handler.getLooper();
            C13706o.m87928e(looper, "handler.looper");
            this.mHandler = new ClientHandler(this, looper);
        } else if (!C13706o.m87924a(this.mHandler.getLooper(), this.context.getMainLooper())) {
            Looper mainLooper = this.context.getMainLooper();
            C13706o.m87928e(mainLooper, "context.mainLooper");
            this.mHandler = new ClientHandler(this, mainLooper);
        }
    }

    public void addLockoutResetCallback(IMiuiFaceManager.LockoutResetCallback lockoutResetCallback) {
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "addLockoutResetCallback  callback:" + lockoutResetCallback);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void authenticate(android.os.CancellationSignal r9, int r10, dev.skomlach.biometric.compat.engine.internal.face.miui.impl.IMiuiFaceManager.AuthenticationCallback r11, android.os.Handler r12, int r13) {
        /*
            r8 = this;
            boolean r10 = r8.isReleased()
            java.lang.String r0 = "3DFaceManagerImpl"
            r1 = 0
            r2 = 2
            r3 = 1
            java.lang.String r4 = " ignore!"
            java.lang.String r5 = "start authenticate ctx:"
            if (r10 == 0) goto L_0x0030
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            android.content.Context r10 = r8.context
            r9.append(r10)
            r9.append(r4)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r10 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r1] = r0
            java.lang.String r9 = r9.toString()
            r11[r3] = r9
            r10.mo68220e((java.lang.Object[]) r11)
            goto L_0x00eb
        L_0x0030:
            int r10 = r8.hasEnrolledFaces()
            if (r10 != 0) goto L_0x0059
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "has no enrolled face ctx:"
            r9.append(r10)
            android.content.Context r10 = r8.context
            r9.append(r10)
            r9.append(r4)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r10 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r1] = r0
            java.lang.String r9 = r9.toString()
            r11[r3] = r9
            r10.mo68220e((java.lang.Object[]) r11)
            goto L_0x00eb
        L_0x0059:
            if (r11 == 0) goto L_0x00ec
            if (r9 == 0) goto L_0x0079
            boolean r10 = r9.isCanceled()
            if (r10 == 0) goto L_0x0071
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r9 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r0
            java.lang.String r11 = "authentication already canceled"
            r10[r3] = r11
            r9.mo68217d(r10)
            return
        L_0x0071:
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl$OnAuthenticationCancelListener r10 = new dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl$OnAuthenticationCancelListener
            r10.<init>()
            r9.setOnCancelListener(r10)
        L_0x0079:
            java.lang.reflect.Method r9 = r8.sAcquireFunc     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            if (r9 == 0) goto L_0x00b4
            java.lang.Object r10 = r8.boostFramework     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r6 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r4[r1] = r6     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r6 = 4
            int[] r6 = new int[r6]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r7 = 1082130432(0x40800000, float:4.0)
            r6[r1] = r7     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r7 = 4095(0xfff, float:5.738E-42)
            r6[r3] = r7     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r7 = 1086324736(0x40c00000, float:6.0)
            r6[r2] = r7     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r7 = 3
            r6[r7] = r3     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r4[r3] = r6     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            if (r9 == 0) goto L_0x00b4
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            r9.invoke(r10, r4)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00a7 }
            goto L_0x00b4
        L_0x00a7:
            r9 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r10 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r10.mo68218e((java.lang.Throwable) r9)
            goto L_0x00b4
        L_0x00ae:
            r9 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r10 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r10.mo68218e((java.lang.Throwable) r9)
        L_0x00b4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            android.content.Context r10 = r8.context
            r9.append(r10)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r10 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r0
            java.lang.String r9 = r9.toString()
            r4[r3] = r9
            r10.mo68217d(r4)
            r8.useHandler(r12)
            r8.mAuthenticationCallback = r11
            r8.tryConnectService()
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.BiometricClient r9 = r8.mBiometricClient
            if (r9 == 0) goto L_0x00e1
            r10 = 5
            r11 = 0
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.BiometricClient.sendCommand$default(r9, r10, r1, r2, r11)
        L_0x00e1:
            android.os.Handler r9 = r8.mHandler
            android.os.Message r10 = r9.obtainMessage(r3)
            long r11 = (long) r13
            r9.sendMessageDelayed(r10, r11)
        L_0x00eb:
            return
        L_0x00ec:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Must supply an authentication callback"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl.authenticate(android.os.CancellationSignal, int, dev.skomlach.biometric.compat.engine.internal.face.miui.impl.IMiuiFaceManager$AuthenticationCallback, android.os.Handler, int):void");
    }

    public void enroll(byte[] bArr, CancellationSignal cancellationSignal, int i, IMiuiFaceManager.EnrollmentCallback enrollmentCallback, Surface surface, Rect rect, int i2) {
        C13706o.m87929f(cancellationSignal, "cancel");
    }

    public void enroll(byte[] bArr, CancellationSignal cancellationSignal, int i, IMiuiFaceManager.EnrollmentCallback enrollmentCallback, Surface surface, RectF rectF, RectF rectF2, int i2) {
        CancellationSignal cancellationSignal2 = cancellationSignal;
        Surface surface2 = surface;
        RectF rectF3 = rectF;
        RectF rectF4 = rectF2;
        C13706o.m87929f(cancellationSignal2, "cancel");
        C13706o.m87929f(rectF4, "enrollArea");
        if (isReleased()) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "enroll ignore!");
        }
        int i3 = i2 == 0 ? 180000 : i2;
        if (surface2 == null || i3 < 2000) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "enroll error!");
        }
        BiometricConnect biometricConnect = BiometricConnect.INSTANCE;
        if (biometricConnect.getDEBUG_LOG()) {
            StringBuilder sb = new StringBuilder();
            sb.append("xiaomi detectArea data:[");
            sb.append(rectF3);
            sb.append(",");
            sb.append(rectF3 != null ? Float.valueOf(rectF3.left) : null);
            sb.append(",");
            sb.append(rectF3 != null ? Float.valueOf(rectF3.right) : null);
            sb.append(",");
            sb.append(rectF3 != null ? Float.valueOf(rectF3.top) : null);
            sb.append(",");
            sb.append(rectF3 != null ? Float.valueOf(rectF3.bottom) : null);
            sb.append("]");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68220e(LOG_TAG, sb.toString());
            biometricLoggerImpl.mo68220e(LOG_TAG, "xiaomi enrollArea data:[" + rectF4 + "," + rectF4.left + "," + rectF4.right + "," + rectF4.top + "," + rectF4.bottom + "]");
        }
        if (cancellationSignal.isCanceled()) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "enrollment already canceled");
            return;
        }
        cancellationSignal2.setOnCancelListener(new OnEnrollCancelListener());
        Bundle bundle = new Bundle();
        this.mEnrollmentCallback = enrollmentCallback;
        bundle.putParcelable("surface", surface2);
        bundle.putInt("width", 3);
        bundle.putInt("height", 4);
        tryConnectService();
        BiometricClient biometricClient = this.mBiometricClient;
        if (biometricClient != null) {
            biometricClient.sendBundle(1, bundle);
        }
        BiometricClient biometricClient2 = this.mBiometricClient;
        if (biometricClient2 != null) {
            biometricClient2.sendCommand(3, 0);
        }
        if (rectF3 != null) {
            this.mEnrollParam.setRectDetectZones(new FRect(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom));
        }
        this.mEnrollParam.setRectEnrollZones(new FRect(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom));
        EnrollParam enrollParam = this.mEnrollParam;
        enrollParam.setEnableDistanceDetect(false);
        enrollParam.setEnableIrFaceDetect(true);
        enrollParam.setEnableDepthmap(false);
        enrollParam.setEnrollWaitUi(true);
        float[] fArr = new float[0];
        FRect rectDetectZones = enrollParam.getRectDetectZones();
        if (rectDetectZones != null) {
            fArr = new float[]{rectDetectZones.getTop(), 1.0f - rectDetectZones.getRight(), rectDetectZones.getBottom(), 1.0f - rectDetectZones.getLeft(), rectDetectZones.getTop(), 1.0f - rectDetectZones.getRight(), rectDetectZones.getBottom(), 1.0f - rectDetectZones.getLeft()};
        }
        adjustDetectZone(fArr);
        if (biometricConnect.getDEBUG_LOG()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("startEnroll rectDetectZones:[");
            FRect rectDetectZones2 = this.mEnrollParam.getRectDetectZones();
            sb2.append(rectDetectZones2 != null ? Float.valueOf(rectDetectZones2.getLeft()) : null);
            sb2.append(",");
            FRect rectDetectZones3 = this.mEnrollParam.getRectDetectZones();
            sb2.append(rectDetectZones3 != null ? Float.valueOf(rectDetectZones3.getTop()) : null);
            sb2.append(",");
            FRect rectDetectZones4 = this.mEnrollParam.getRectDetectZones();
            sb2.append(rectDetectZones4 != null ? Float.valueOf(rectDetectZones4.getRight()) : null);
            sb2.append(",");
            FRect rectDetectZones5 = this.mEnrollParam.getRectDetectZones();
            sb2.append(rectDetectZones5 != null ? Float.valueOf(rectDetectZones5.getBottom()) : null);
            sb2.append("] adjustDetectZone -> [");
            sb2.append(fArr[0]);
            sb2.append(",");
            sb2.append(fArr[1]);
            sb2.append(",");
            sb2.append(fArr[2]);
            sb2.append(",");
            sb2.append(fArr[3]);
            sb2.append("]");
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl2.mo68217d(LOG_TAG, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("startEnroll rectEnrollZones:[");
            FRect rectEnrollZones = this.mEnrollParam.getRectEnrollZones();
            sb3.append(rectEnrollZones != null ? Float.valueOf(rectEnrollZones.getLeft()) : null);
            sb3.append(",");
            FRect rectEnrollZones2 = this.mEnrollParam.getRectEnrollZones();
            sb3.append(rectEnrollZones2 != null ? Float.valueOf(rectEnrollZones2.getTop()) : null);
            sb3.append(",");
            FRect rectEnrollZones3 = this.mEnrollParam.getRectEnrollZones();
            sb3.append(rectEnrollZones3 != null ? Float.valueOf(rectEnrollZones3.getRight()) : null);
            sb3.append(",");
            FRect rectEnrollZones4 = this.mEnrollParam.getRectEnrollZones();
            sb3.append(rectEnrollZones4 != null ? Float.valueOf(rectEnrollZones4.getBottom()) : null);
            sb3.append("] adjustDetectZone -> [");
            sb3.append(fArr[4]);
            sb3.append(",");
            sb3.append(fArr[5]);
            sb3.append(",");
            sb3.append(fArr[6]);
            sb3.append(",");
            sb3.append(fArr[7]);
            sb3.append("]");
            biometricLoggerImpl2.mo68217d(LOG_TAG, sb3.toString());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putFloatArray(biometricConnect.getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE(), fArr);
        bundle2.putBoolean(biometricConnect.getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE(), this.mEnrollParam.getEnableIrFaceDetect());
        bundle2.putBoolean(biometricConnect.getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE(), this.mEnrollParam.getEnableDistanceDetect());
        bundle2.putBoolean(biometricConnect.getMSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI(), this.mEnrollParam.getEnrollWaitUi());
        boolean enableDepthmap = this.mEnrollParam.getEnableDepthmap();
        String msg_cb_bundle_enroll_param_detect_depthmap = biometricConnect.getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP();
        if (enableDepthmap) {
            bundle2.putInt(msg_cb_bundle_enroll_param_detect_depthmap, this.mEnrollParam.getDepthmpaType());
        } else {
            bundle2.putInt(msg_cb_bundle_enroll_param_detect_depthmap, 0);
        }
        BiometricClient biometricClient3 = this.mBiometricClient;
        if (biometricClient3 != null) {
            biometricClient3.sendBundle(6, bundle2);
        }
        BiometricClient biometricClient4 = this.mBiometricClient;
        if (biometricClient4 != null) {
            BiometricClient.sendCommand$default(biometricClient4, 7, 0, 2, (Object) null);
        }
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(0), (long) i3);
    }

    public int extCmd(int i, int i2) {
        if (i != 0) {
            return -1;
        }
        BiometricClient biometricClient = this.mBiometricClient;
        if (biometricClient == null) {
            return 0;
        }
        biometricClient.sendCommand(14, i2);
        return 0;
    }

    public List<Miuiface> getEnrolledFaces() {
        ArrayList arrayList = new ArrayList();
        BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, " xiaomi getEnrolledFaces!");
        List<TemplateItem> list = this.mTemplateItemList;
        if (list != null) {
            for (TemplateItem next : list) {
                if (next != null) {
                    arrayList.add(new Miuiface(next.getName(), next.getGroup_id(), next.getId(), 0));
                }
            }
        }
        return arrayList;
    }

    public int getManagerVersion() {
        return 1;
    }

    public final int getTemplatepath() {
        File file = new File(TEMPLATE_PATH, "biometric.db");
        if (file.exists()) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d(LOG_TAG, "getTemplatepath");
            Cursor cursor = null;
            this.myDB = SQLiteDatabase.openDatabase(file.getPath(), (SQLiteDatabase.CursorFactory) null, 0);
            this.myTemplateItemList = new ArrayList();
            biometricLoggerImpl.mo68217d(LOG_TAG, "selectTemplate");
            SQLiteDatabase sQLiteDatabase = this.myDB;
            if (sQLiteDatabase != null) {
                cursor = sQLiteDatabase.rawQuery("select _id,data,template_name,group_id from _template where valid=1", (String[]) null);
            }
            if (cursor != null && cursor.moveToFirst()) {
                biometricLoggerImpl.mo68220e(LOG_TAG, "xiaomi -->4.3 test");
                TemplateItem templateItem = new TemplateItem();
                templateItem.setId(cursor.getInt(cursor.getColumnIndex(TABLE_TEMPLATE_COLUMN_ID)));
                templateItem.setName(cursor.getString(cursor.getColumnIndex(TABLE_TEMPLATE_COLUMN_NAME)));
                templateItem.setGroup_id(cursor.getInt(cursor.getColumnIndex(TABLE_TEMPLATE_COLUMN_GROUP_ID)));
                templateItem.setData(cursor.getString(cursor.getColumnIndex(TABLE_TEMPLATE_COLUMN_DATA)));
                List<TemplateItem> list = this.myTemplateItemList;
                if (list != null) {
                    list.add(templateItem);
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            List<TemplateItem> list2 = this.myTemplateItemList;
            if (list2 != null) {
                return list2.size();
            }
            return 0;
        }
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "getTemplatepath faild");
        return 0;
    }

    public String getVendorInfo() {
        return "3D Structure Light";
    }

    public int hasEnrolledFaces() {
        tryConnectService();
        return this.mHasFaceData ? 1 : 0;
    }

    public boolean isFaceFeatureSupport() {
        if (this.mIsSuperPower) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "enter super power mode, isFaceFeatureSupport:false");
            return false;
        }
        MiuiBuild miuiBuild = MiuiBuild.INSTANCE;
        if (miuiBuild.getIS_INTERNATIONAL_BUILD()) {
            return false;
        }
        return C13706o.m87924a("ursa", miuiBuild.getDEVICE());
    }

    public boolean isFaceUnlockInited() {
        return false;
    }

    public boolean isReleased() {
        return this.isReleased;
    }

    public boolean isSupportScreenOnDelayed() {
        return false;
    }

    public void onBiometricBundleCallback(int i, int i2, Bundle bundle) {
        C13706o.m87929f(bundle, "bundle");
        if (i != 1) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "onBiometricBundleCallback ignore module_id:" + i + ", key:" + i2);
        } else if (this.mDisonnected) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "onBiometricBundleCallback mDisonnected:" + this.mDisonnected + " ignore key:" + i2);
        } else {
            if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricBundleCallback key:" + i2);
            }
            if (i2 == 2) {
                handlerFace(bundle);
            } else if (i2 == 3) {
                handlerDatabase(bundle);
            }
        }
    }

    public void onBiometricEventCallback(int i, int i2, int i3, int i4) {
        int i5 = 0;
        if (i != 1) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "onBiometricEventCallback ignore - module_id:+" + i + " event: " + i2 + ", arg1:" + i3 + ", arg2:" + i4);
        } else if (this.mDisonnected) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "onBiometricEventCallback mDisonnected:" + this.mDisonnected + " ignore event: " + i2 + ", arg1:" + i3 + ", arg2:" + i4);
        } else {
            BiometricConnect biometricConnect = BiometricConnect.INSTANCE;
            if (biometricConnect.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricEventCallback - event: " + i2 + ", arg1:" + i3 + ", arg2:" + i4);
            }
            if (i2 == 0) {
                IMiuiFaceManager.EnrollmentCallback enrollmentCallback = this.mEnrollmentCallback;
                if (enrollmentCallback != null) {
                    enrollmentCallback.onEnrollmentHelp(1, (CharSequence) null);
                }
            } else if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    if (i2 != 4) {
                        switch (i2) {
                            case 20:
                                IMiuiFaceManager.EnrollmentCallback enrollmentCallback2 = this.mEnrollmentCallback;
                                if (enrollmentCallback2 != null) {
                                    enrollmentCallback2.onEnrollmentHelp(2, (CharSequence) null);
                                    break;
                                }
                                break;
                            case 21:
                                if (biometricConnect.getDEBUG_LOG()) {
                                    BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricEventCallback  MSG_CB_EVENT_IR_CAM_PREVIEW_SIZE arg1:" + i3 + ",arg2:" + i4);
                                    break;
                                }
                                break;
                            case 22:
                                break;
                            case 23:
                                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "MSG_CB_EVENT_IR_CAM_CLOSED");
                                break;
                            case 24:
                                IMiuiFaceManager.EnrollmentCallback enrollmentCallback3 = this.mEnrollmentCallback;
                                if (enrollmentCallback3 != null) {
                                    enrollmentCallback3.onEnrollmentError(6, (CharSequence) null);
                                    cancelEnrollment();
                                    break;
                                }
                                break;
                            default:
                                switch (i2) {
                                    case 30:
                                        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricEventCallback  MSG_CB_EVENT_ENROLL_SUCCESS mEnrollmentCallback:" + this.mEnrollmentCallback);
                                        IMiuiFaceManager.EnrollmentCallback enrollmentCallback4 = this.mEnrollmentCallback;
                                        if (enrollmentCallback4 != null) {
                                            enrollmentCallback4.onEnrollmentProgress(0, i3);
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
                                            this.mDatabaseStatus = 0;
                                            prepareDatabase();
                                            ReentrantLock reentrantLock3 = lock;
                                            try {
                                                C13329n.C13330a aVar4 = C13329n.f61327a;
                                                reentrantLock3.unlock();
                                                C13329n.m85676a(C13339u.f61331a);
                                                break;
                                            } catch (Throwable th3) {
                                                C13329n.C13330a aVar5 = C13329n.f61327a;
                                                C13329n.m85676a(C13332o.m85684a(th3));
                                                break;
                                            }
                                        }
                                        break;
                                    case 31:
                                        IMiuiFaceManager.EnrollmentCallback enrollmentCallback5 = this.mEnrollmentCallback;
                                        if (enrollmentCallback5 != null) {
                                            enrollmentCallback5.onEnrollmentHelp(i3, (CharSequence) null);
                                            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "MSG_CB_EVENT_ENROLL_ERROR arg1 = " + i3);
                                            break;
                                        }
                                        break;
                                    case 32:
                                        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "MSG_CB_EVENT_ENROLL_INFO arg1 = " + i3);
                                        IMiuiFaceManager.EnrollmentCallback enrollmentCallback6 = this.mEnrollmentCallback;
                                        if (enrollmentCallback6 != null) {
                                            enrollmentCallback6.onEnrollmentHelp(i3, (CharSequence) null);
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case 40:
                                                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricEventCallback  MSG_CB_EVENT_VERIFY_SUCCESS mAuthenticationCallback:" + this.mAuthenticationCallback);
                                                IMiuiFaceManager.AuthenticationCallback authenticationCallback = this.mAuthenticationCallback;
                                                if (authenticationCallback != null) {
                                                    authenticationCallback.onAuthenticationSucceeded((Miuiface) null);
                                                    cancelAuthentication();
                                                    break;
                                                }
                                                break;
                                            case 41:
                                                IMiuiFaceManager.AuthenticationCallback authenticationCallback2 = this.mAuthenticationCallback;
                                                if (authenticationCallback2 != null) {
                                                    authenticationCallback2.onAuthenticationHelp(70, (CharSequence) null);
                                                    break;
                                                }
                                                break;
                                            case 42:
                                                IMiuiFaceManager.AuthenticationCallback authenticationCallback3 = this.mAuthenticationCallback;
                                                if (authenticationCallback3 != null) {
                                                    authenticationCallback3.onAuthenticationHelp(i3, (CharSequence) null);
                                                    break;
                                                }
                                                break;
                                            case 43:
                                                IMiuiFaceManager.RemovalCallback removalCallback = this.mRemovalCallback;
                                                if (removalCallback != null) {
                                                    Miuiface miuiface = this.mRemovalMiuiface;
                                                    List<Miuiface> list = this.mMiuifaceList;
                                                    if (list != null) {
                                                        i5 = list.size();
                                                    }
                                                    removalCallback.onRemovalSucceeded(miuiface, i5);
                                                    this.mRemovalCallback = null;
                                                    this.mRemovalMiuiface = null;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                        }
                    }
                    IMiuiFaceManager.EnrollmentCallback enrollmentCallback7 = this.mEnrollmentCallback;
                    if (enrollmentCallback7 != null) {
                        enrollmentCallback7.onEnrollmentError(5, (CharSequence) null);
                        cancelEnrollment();
                    }
                }
            } else if (biometricConnect.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricEventCallback  MSG_CB_EVENT_RGB_CAM_PREVIEW_SIZE mEnrollmentCallback:" + this.mEnrollmentCallback + " arg1:" + i3 + ",arg2:" + i4);
            }
        }
    }

    public void onBiometricEventClassLoader(Bundle bundle) {
        C13706o.m87929f(bundle, "bundle");
        if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricEventClassLoader");
        }
        bundle.setClassLoader(BiometricConnect.class.getClassLoader());
    }

    public void onBiometricServiceConnected() {
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "onBiometricServiceConnected " + this);
        this.mDisonnected = false;
        prepareDatabase();
    }

    public void onBiometricServiceDisconnected() {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d(LOG_TAG, "onBiometricServiceDisconnected " + this);
        if (!this.mDisonnected) {
            biometricLoggerImpl.mo68217d(LOG_TAG, "xiaomi--> set mDisonnected true " + this);
            this.mDisonnected = true;
            release();
        }
    }

    public void preInitAuthen() {
        tryConnectService();
    }

    public void release() {
        if (isReleased()) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "release ignore " + this);
            return;
        }
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "release ctx:" + this.context + ", this:" + this);
        this.isReleased = true;
    }

    public void remove(Miuiface miuiface, IMiuiFaceManager.RemovalCallback removalCallback) {
        C13706o.m87929f(miuiface, "face");
        C13706o.m87929f(removalCallback, "callback");
        if (isReleased()) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "removeTemplate ignore!");
        } else if (this.mDatabaseStatus != 2) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "removeTemplate error mDatabaseStatus :" + this.mDatabaseStatus);
        } else {
            TemplateItem findTemplate = findTemplate(miuiface.getMiuifaceId());
            if (findTemplate == null) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "removeTemplate findTemplate " + miuiface.getMiuifaceId() + " is null");
                return;
            }
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "removeTemplate");
            List<TemplateItem> list = this.mTemplateItemList;
            if (list != null) {
                list.remove(findTemplate);
            }
            this.mDatabaseChanged = true;
            this.mRemovalCallback = removalCallback;
            this.mRemovalMiuiface = miuiface;
            commitDatabase();
        }
    }

    public void rename(int i, String str) {
        C13706o.m87929f(str, "name");
        if (isReleased()) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, "setTemplateName ignore!");
        } else if (this.mDatabaseStatus != 2) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "setTemplateName error mPrepareDbStatus:" + this.mDatabaseStatus);
        } else {
            TemplateItem findTemplate = findTemplate(i);
            if (findTemplate == null) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "setTemplateName findTemplate " + i + " is null");
                return;
            }
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "setTemplateName");
            findTemplate.setName(str);
            this.mDatabaseChanged = true;
            commitDatabase();
        }
    }

    public void resetTimeout(byte[] bArr) {
        C13706o.m87929f(bArr, "token");
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "resetTimeout");
    }
}
