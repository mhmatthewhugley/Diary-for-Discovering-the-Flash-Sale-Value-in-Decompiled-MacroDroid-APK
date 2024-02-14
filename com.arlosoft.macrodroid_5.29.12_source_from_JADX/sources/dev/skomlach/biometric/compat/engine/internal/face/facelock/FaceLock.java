package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import dev.skomlach.biometric.compat.utils.ReflectionTools;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12114c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u0001:\u0003546B\u0007¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J0\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0018\u00010\u001bR\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR>\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u001ej\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001`\u001f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u001c\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u001c\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010-\u001a\u00020,8\u0002XD¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock;", "", "Landroid/content/ServiceConnection;", "connection", "", "bind", "Lja/u;", "unbind", "Landroid/os/IBinder;", "token", "", "x", "y", "width", "height", "startUi", "stopUi", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/IFaceLockCallback;", "cb", "registerCallback", "unregisterCallback", "mFaceLockService", "Ljava/lang/Object;", "getMFaceLockService", "()Ljava/lang/Object;", "setMFaceLockService", "(Ljava/lang/Object;)V", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock$ServiceConnectionWrapper;", "mServiceConnection", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock$ServiceConnectionWrapper;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mMap", "Ljava/util/HashMap;", "getMMap", "()Ljava/util/HashMap;", "setMMap", "(Ljava/util/HashMap;)V", "Ljava/lang/Class;", "flInterface", "Ljava/lang/Class;", "flInterfaceStub", "flCallbackInterface", "flCallbackInterfaceStub", "", "pkg", "Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "()V", "Companion", "CallBackBinder", "ServiceConnectionWrapper", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FaceLock.kt */
public final class FaceLock {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final String TAG = FaceLock.class.getSimpleName();
    private final Context context = C12104a.f58372a.mo68283g();
    private Class<?> flCallbackInterface;
    /* access modifiers changed from: private */
    public Class<?> flCallbackInterfaceStub;
    private Class<?> flInterface;
    /* access modifiers changed from: private */
    public Class<?> flInterfaceStub;
    private Object mFaceLockService;
    private HashMap<IFaceLockCallback, Object> mMap = new HashMap<>();
    private ServiceConnectionWrapper mServiceConnection;
    private final String pkg = "com.android.facelock";

    @Metadata(mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock$CallBackBinder;", "Landroid/os/Binder;", "mCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/facelock/IFaceLockCallback;", "(Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock;Ldev/skomlach/biometric/compat/engine/internal/face/facelock/IFaceLockCallback;)V", "mMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "onTransact", "", "code", "data", "Landroid/os/Parcel;", "reply", "flags", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: FaceLock.kt */
    private final class CallBackBinder extends Binder {
        private final IFaceLockCallback mCallback;
        private final HashMap<Integer, String> mMap = new HashMap<>();
        final /* synthetic */ FaceLock this$0;

        public CallBackBinder(FaceLock faceLock, IFaceLockCallback iFaceLockCallback) {
            Field field;
            Boolean valueOf;
            C13706o.m87929f(iFaceLockCallback, "mCallback");
            this.this$0 = faceLock;
            this.mCallback = iFaceLockCallback;
            Method[] methods = IFaceLockCallback.class.getMethods();
            C13706o.m87928e(methods, "methods");
            for (Method method : methods) {
                try {
                    Class access$getFlCallbackInterfaceStub$p = this.this$0.flCallbackInterfaceStub;
                    Object obj = null;
                    if (access$getFlCallbackInterfaceStub$p != null) {
                        field = access$getFlCallbackInterfaceStub$p.getDeclaredField("TRANSACTION_" + method.getName());
                    } else {
                        field = null;
                    }
                    valueOf = field != null ? Boolean.valueOf(field.isAccessible()) : null;
                    Boolean bool = Boolean.FALSE;
                    if (C13706o.m87924a(valueOf, bool)) {
                        field.setAccessible(true);
                    }
                    if (field != null) {
                        field.setAccessible(true);
                    }
                    HashMap<Integer, String> hashMap = this.mMap;
                    obj = field != null ? field.get((Object) null) : obj;
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Int");
                    String name = method.getName();
                    C13706o.m87928e(name, "m.name");
                    hashMap.put((Integer) obj, name);
                    if (C13706o.m87924a(valueOf, bool)) {
                        field.setAccessible(false);
                    }
                } catch (NoSuchFieldException unused) {
                } catch (IllegalArgumentException e) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(e, FaceLock.TAG);
                } catch (IllegalAccessException e2) {
                    BiometricLoggerImpl.INSTANCE.mo68219e(e2, FaceLock.TAG);
                } catch (Throwable th) {
                    if (C13706o.m87924a(valueOf, Boolean.FALSE)) {
                        field.setAccessible(false);
                    }
                    throw th;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: onTransact$lambda-0  reason: not valid java name */
        public static final void m101303onTransact$lambda0(CallBackBinder callBackBinder, int i) {
            C13706o.m87929f(callBackBinder, "this$0");
            try {
                IFaceLockCallback.class.getMethod(callBackBinder.mMap.get(Integer.valueOf(i)), new Class[0]).invoke(callBackBinder.mCallback, new Object[0]);
            } catch (IllegalArgumentException e) {
                BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                String access$getTAG$cp = FaceLock.TAG;
                String message = e.getMessage();
                biometricLoggerImpl.mo68219e(e, access$getTAG$cp + message);
            } catch (IllegalAccessException e2) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                String access$getTAG$cp2 = FaceLock.TAG;
                String message2 = e2.getMessage();
                biometricLoggerImpl2.mo68219e(e2, access$getTAG$cp2 + message2);
            } catch (InvocationTargetException e3) {
                BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
                String access$getTAG$cp3 = FaceLock.TAG;
                String message3 = e3.getMessage();
                biometricLoggerImpl3.mo68219e(e3, access$getTAG$cp3 + message3);
            } catch (NoSuchMethodException e4) {
                BiometricLoggerImpl biometricLoggerImpl4 = BiometricLoggerImpl.INSTANCE;
                String access$getTAG$cp4 = FaceLock.TAG;
                String message4 = e4.getMessage();
                biometricLoggerImpl4.mo68219e(e4, access$getTAG$cp4 + message4);
            }
        }

        /* access modifiers changed from: protected */
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C13706o.m87929f(parcel, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            if (this.mMap.containsKey(Integer.valueOf(i))) {
                BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                String access$getTAG$cp = FaceLock.TAG;
                String str = this.mMap.get(Integer.valueOf(i));
                biometricLoggerImpl.mo68217d(access$getTAG$cp + " onTransact " + str);
                C12114c.f58379a.mo68305g(new C12033a(this, i));
                return true;
            }
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            String access$getTAG$cp2 = FaceLock.TAG;
            biometricLoggerImpl2.mo68217d(access$getTAG$cp2 + " unknown transact : " + i);
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: FaceLock.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock$ServiceConnectionWrapper;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Lja/u;", "onServiceConnected", "onServiceDisconnected", "mServiceConnection", "Landroid/content/ServiceConnection;", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLock;Landroid/content/ServiceConnection;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: FaceLock.kt */
    private final class ServiceConnectionWrapper implements ServiceConnection {
        private final ServiceConnection mServiceConnection;
        final /* synthetic */ FaceLock this$0;

        public ServiceConnectionWrapper(FaceLock faceLock, ServiceConnection serviceConnection) {
            C13706o.m87929f(serviceConnection, "mServiceConnection");
            this.this$0 = faceLock;
            this.mServiceConnection = serviceConnection;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object obj;
            Method method;
            C13706o.m87929f(componentName, "name");
            C13706o.m87929f(iBinder, NotificationCompat.CATEGORY_SERVICE);
            BiometricLoggerImpl.INSTANCE.mo68217d(FaceLock.TAG + " service connected");
            try {
                FaceLock faceLock = this.this$0;
                Class access$getFlInterfaceStub$p = faceLock.flInterfaceStub;
                if (access$getFlInterfaceStub$p == null || (method = access$getFlInterfaceStub$p.getMethod("asInterface", new Class[]{IBinder.class})) == null) {
                    obj = null;
                } else {
                    obj = method.invoke((Object) null, new Object[]{iBinder});
                }
                faceLock.setMFaceLockService(obj);
                this.mServiceConnection.onServiceConnected(componentName, iBinder);
            } catch (IllegalArgumentException e) {
                this.this$0.setMFaceLockService((Object) null);
                BiometricLoggerImpl.INSTANCE.mo68219e(e, FaceLock.TAG + e.getMessage());
            } catch (IllegalAccessException e2) {
                this.this$0.setMFaceLockService((Object) null);
                BiometricLoggerImpl.INSTANCE.mo68219e(e2, FaceLock.TAG + e2.getMessage());
            } catch (InvocationTargetException e3) {
                this.this$0.setMFaceLockService((Object) null);
                BiometricLoggerImpl.INSTANCE.mo68219e(e3, FaceLock.TAG + e3.getMessage());
            } catch (NoSuchMethodException e4) {
                this.this$0.setMFaceLockService((Object) null);
                BiometricLoggerImpl.INSTANCE.mo68219e(e4, FaceLock.TAG + e4.getMessage());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C13706o.m87929f(componentName, "name");
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            String access$getTAG$cp = FaceLock.TAG;
            biometricLoggerImpl.mo68217d(access$getTAG$cp + " service disconnected");
            this.mServiceConnection.onServiceDisconnected(componentName);
            this.this$0.setMFaceLockService((Object) null);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FaceLock() {
        /*
            r8 = this;
            java.lang.String r0 = "$Stub"
            r8.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r8.mMap = r1
            java.lang.String r1 = "com.android.facelock"
            r8.pkg = r1
            dev.skomlach.common.contextprovider.a r2 = dev.skomlach.common.contextprovider.C12104a.f58372a
            android.content.Context r2 = r2.mo68283g()
            r8.context = r2
            java.lang.String r2 = "com.android.internal.policy.IFaceLockInterface"
            java.lang.String r3 = "com.android.internal.policy.IFaceLockCallback"
            java.lang.String r4 = "com.android.facelock.ITrustedFaceInterface"
            java.lang.String r5 = "com.android.facelock.ITrustedFaceCallback"
            dev.skomlach.biometric.compat.utils.ReflectionTools r6 = dev.skomlach.biometric.compat.utils.ReflectionTools.INSTANCE     // Catch:{ all -> 0x0059 }
            java.lang.Class r7 = r6.getClassFromPkg(r1, r2)     // Catch:{ all -> 0x0059 }
            r8.flInterface = r7     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r7.<init>()     // Catch:{ all -> 0x0059 }
            r7.append(r2)     // Catch:{ all -> 0x0059 }
            r7.append(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0059 }
            java.lang.Class r2 = r6.getClassFromPkg(r1, r2)     // Catch:{ all -> 0x0059 }
            r8.flInterfaceStub = r2     // Catch:{ all -> 0x0059 }
            java.lang.Class r2 = r6.getClassFromPkg(r1, r3)     // Catch:{ all -> 0x0059 }
            r8.flCallbackInterface = r2     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r2.<init>()     // Catch:{ all -> 0x0059 }
            r2.append(r3)     // Catch:{ all -> 0x0059 }
            r2.append(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0059 }
            java.lang.Class r1 = r6.getClassFromPkg(r1, r2)     // Catch:{ all -> 0x0059 }
            r8.flCallbackInterfaceStub = r1     // Catch:{ all -> 0x0059 }
            goto L_0x009b
        L_0x0059:
            dev.skomlach.biometric.compat.utils.ReflectionTools r1 = dev.skomlach.biometric.compat.utils.ReflectionTools.INSTANCE     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r8.pkg     // Catch:{ all -> 0x009a }
            java.lang.Class r2 = r1.getClassFromPkg(r2, r4)     // Catch:{ all -> 0x009a }
            r8.flInterface = r2     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r8.pkg     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
            r3.append(r4)     // Catch:{ all -> 0x009a }
            r3.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009a }
            java.lang.Class r2 = r1.getClassFromPkg(r2, r3)     // Catch:{ all -> 0x009a }
            r8.flInterfaceStub = r2     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r8.pkg     // Catch:{ all -> 0x009a }
            java.lang.Class r2 = r1.getClassFromPkg(r2, r5)     // Catch:{ all -> 0x009a }
            r8.flCallbackInterface = r2     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r8.pkg     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
            r3.append(r5)     // Catch:{ all -> 0x009a }
            r3.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x009a }
            java.lang.Class r0 = r1.getClassFromPkg(r2, r0)     // Catch:{ all -> 0x009a }
            r8.flCallbackInterfaceStub = r0     // Catch:{ all -> 0x009a }
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            java.lang.Class<?> r0 = r8.flCallbackInterfaceStub
            if (r0 == 0) goto L_0x00a0
            return
        L_0x00a0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " not supported"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.facelock.FaceLock.<init>():void");
    }

    public final boolean bind(ServiceConnection serviceConnection) {
        C13706o.m87929f(serviceConnection, "connection");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + " bind to service");
        if (this.mServiceConnection != null) {
            return false;
        }
        this.mServiceConnection = new ServiceConnectionWrapper(this, serviceConnection);
        Class<?> cls = this.flInterface;
        Intent intent = new Intent(cls != null ? cls.getName() : null);
        intent.setPackage(this.pkg);
        Context context2 = this.context;
        ServiceConnectionWrapper serviceConnectionWrapper = this.mServiceConnection;
        if (serviceConnectionWrapper == null) {
            return false;
        }
        return context2.bindService(intent, serviceConnectionWrapper, 1);
    }

    /* access modifiers changed from: protected */
    public final Object getMFaceLockService() {
        return this.mFaceLockService;
    }

    /* access modifiers changed from: protected */
    public final HashMap<IFaceLockCallback, Object> getMMap() {
        return this.mMap;
    }

    public final void registerCallback(IFaceLockCallback iFaceLockCallback) throws NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Method method;
        C13706o.m87929f(iFaceLockCallback, "cb");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + " registerCallback");
        ReflectionTools reflectionTools = ReflectionTools.INSTANCE;
        String str2 = this.pkg;
        Class<?> cls = this.flCallbackInterface;
        String name = cls != null ? cls.getName() : null;
        Constructor<?> declaredConstructor = reflectionTools.getClassFromPkg(str2, name + "$Stub$Proxy").getDeclaredConstructor(new Class[]{IBinder.class});
        boolean isAccessible = declaredConstructor.isAccessible();
        if (!isAccessible) {
            try {
                declaredConstructor.setAccessible(true);
            } catch (Throwable th) {
                if (!isAccessible) {
                    declaredConstructor.setAccessible(false);
                }
                throw th;
            }
        }
        Object newInstance = declaredConstructor.newInstance(new Object[]{new CallBackBinder(this, iFaceLockCallback)});
        Class<?> cls2 = this.flInterface;
        if (!(cls2 == null || (method = cls2.getMethod("registerCallback", new Class[]{this.flCallbackInterface})) == null)) {
            method.invoke(this.mFaceLockService, new Object[]{newInstance});
        }
        HashMap<IFaceLockCallback, Object> hashMap = this.mMap;
        C13706o.m87928e(newInstance, "callbacks");
        hashMap.put(iFaceLockCallback, newInstance);
        if (!isAccessible) {
            declaredConstructor.setAccessible(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void setMFaceLockService(Object obj) {
        this.mFaceLockService = obj;
    }

    /* access modifiers changed from: protected */
    public final void setMMap(HashMap<IFaceLockCallback, Object> hashMap) {
        C13706o.m87929f(hashMap, "<set-?>");
        this.mMap = hashMap;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void startUi(android.os.IBinder r15, int r16, int r17, int r18, int r19) throws android.os.RemoteException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException {
        /*
            r14 = this;
            r0 = r14
            java.lang.String r1 = "startUi"
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r2 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " startUi"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 0
            r4[r6] = r5
            r2.mo68217d(r4)
            r2 = 0
            java.lang.Class<?> r4 = r0.flInterface     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x002f
            java.lang.String r5 = "start"
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x003a }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ all -> 0x003a }
            goto L_0x0030
        L_0x002f:
            r4 = r2
        L_0x0030:
            if (r4 == 0) goto L_0x0039
            java.lang.Object r5 = r0.mFaceLockService     // Catch:{ all -> 0x003a }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x003a }
            r4.invoke(r5, r7)     // Catch:{ all -> 0x003a }
        L_0x0039:
            return
        L_0x003a:
            r4 = 4
            r5 = 3
            r7 = 2
            r8 = 5
            java.lang.Class<?> r9 = r0.flInterface     // Catch:{ all -> 0x008f }
            r10 = 6
            if (r9 == 0) goto L_0x005c
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ all -> 0x008f }
            java.lang.Class<android.os.IBinder> r12 = android.os.IBinder.class
            r11[r6] = r12     // Catch:{ all -> 0x008f }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x008f }
            r11[r3] = r12     // Catch:{ all -> 0x008f }
            r11[r7] = r12     // Catch:{ all -> 0x008f }
            r11[r5] = r12     // Catch:{ all -> 0x008f }
            r11[r4] = r12     // Catch:{ all -> 0x008f }
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x008f }
            r11[r8] = r12     // Catch:{ all -> 0x008f }
            java.lang.reflect.Method r9 = r9.getMethod(r1, r11)     // Catch:{ all -> 0x008f }
            goto L_0x005d
        L_0x005c:
            r9 = r2
        L_0x005d:
            if (r9 == 0) goto L_0x008e
            java.lang.Object r11 = r0.mFaceLockService     // Catch:{ all -> 0x008f }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x008f }
            r10[r6] = r15     // Catch:{ all -> 0x008f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x008f }
            r10[r3] = r12     // Catch:{ all -> 0x008f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x008f }
            r10[r7] = r12     // Catch:{ all -> 0x008f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x008f }
            r10[r5] = r12     // Catch:{ all -> 0x008f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x008f }
            r10[r4] = r12     // Catch:{ all -> 0x008f }
            dev.skomlach.biometric.compat.utils.LockType r12 = dev.skomlach.biometric.compat.utils.LockType.INSTANCE     // Catch:{ all -> 0x008f }
            android.content.Context r13 = r0.context     // Catch:{ all -> 0x008f }
            boolean r12 = r12.isBiometricWeakLivelinessEnabled(r13)     // Catch:{ all -> 0x008f }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x008f }
            r10[r8] = r12     // Catch:{ all -> 0x008f }
            r9.invoke(r11, r10)     // Catch:{ all -> 0x008f }
        L_0x008e:
            return
        L_0x008f:
            java.lang.Class<?> r9 = r0.flInterface     // Catch:{ all -> 0x00ca }
            if (r9 == 0) goto L_0x00a7
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ all -> 0x00ca }
            java.lang.Class<android.os.IBinder> r10 = android.os.IBinder.class
            r2[r6] = r10     // Catch:{ all -> 0x00ca }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ca }
            r2[r3] = r10     // Catch:{ all -> 0x00ca }
            r2[r7] = r10     // Catch:{ all -> 0x00ca }
            r2[r5] = r10     // Catch:{ all -> 0x00ca }
            r2[r4] = r10     // Catch:{ all -> 0x00ca }
            java.lang.reflect.Method r2 = r9.getMethod(r1, r2)     // Catch:{ all -> 0x00ca }
        L_0x00a7:
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r1 = r0.mFaceLockService     // Catch:{ all -> 0x00ca }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00ca }
            r8[r6] = r15     // Catch:{ all -> 0x00ca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00ca }
            r8[r3] = r6     // Catch:{ all -> 0x00ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00ca }
            r8[r7] = r3     // Catch:{ all -> 0x00ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x00ca }
            r8[r5] = r3     // Catch:{ all -> 0x00ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x00ca }
            r8[r4] = r3     // Catch:{ all -> 0x00ca }
            r2.invoke(r1, r8)     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.facelock.FaceLock.startUi(android.os.IBinder, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0.invoke(r4.mFaceLockService, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = r4.flInterface;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stopUi() throws android.os.RemoteException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException {
        /*
            r4 = this;
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " stopUi"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r1[r3] = r2
            r0.mo68217d(r1)
            java.lang.Class<?> r0 = r4.flInterface     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = "stop"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0034 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r4.mFaceLockService     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0034 }
            r0.invoke(r1, r2)     // Catch:{ all -> 0x0034 }
        L_0x0033:
            return
        L_0x0034:
            java.lang.Class<?> r0 = r4.flInterface     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = "stopUi"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0049 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r4.mFaceLockService     // Catch:{ all -> 0x0049 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0049 }
            r0.invoke(r1, r2)     // Catch:{ all -> 0x0049 }
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.facelock.FaceLock.stopUi():void");
    }

    public final void unbind() {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + " unbind from service");
        ServiceConnectionWrapper serviceConnectionWrapper = this.mServiceConnection;
        if (serviceConnectionWrapper != null) {
            this.context.unbindService(serviceConnectionWrapper);
        }
        this.mServiceConnection = null;
    }

    public final void unregisterCallback(IFaceLockCallback iFaceLockCallback) throws RemoteException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Method method;
        C13706o.m87929f(iFaceLockCallback, "cb");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        String str = TAG;
        biometricLoggerImpl.mo68217d(str + " unregisterCallback");
        Class<?> cls = this.flInterface;
        if (!(cls == null || (method = cls.getMethod("unregisterCallback", new Class[]{this.flCallbackInterface})) == null)) {
            method.invoke(this.mFaceLockService, new Object[]{this.mMap.get(iFaceLockCallback)});
        }
        this.mMap.remove(iFaceLockCallback);
    }
}
