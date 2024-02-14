package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 H2\u00020\u0001:\u0006IHJKLMB\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0003J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0017\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\rH\u0007J\u0016\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fR\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0018\u00010*R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010'R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0018\u000109R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006N"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient;", "", "Lja/u;", "release", "removeAllMessage", "Landroid/os/IBinder;", "service", "onServiceBind", "", "lock", "onServiceUnbind", "handle_startService", "handle_releaseService", "", "module_id", "handle_getServiceVersion", "Landroid/os/Message;", "msg", "handle_sendService", "finalize", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ServiceCallback;", "cb", "startService", "releaseService", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ClientLister;", "l", "getServiceVersion", "cmd", "arg", "sendCommand", "key", "Landroid/os/Bundle;", "bundle", "sendBundle", "Ljava/util/concurrent/locks/ReentrantLock;", "accessLock_", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/os/HandlerThread;", "mCallbackThread", "Landroid/os/HandlerThread;", "mClientLister", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ClientLister;", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ConnectHandler;", "mConnectHandler", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ConnectHandler;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "mMainThread", "Landroid/os/Messenger;", "mReplyMessager", "Landroid/os/Messenger;", "mSendMessager", "mServiceCallback", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ServiceCallback;", "mServiceConnectStatus", "I", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$MyServiceConnection;", "mServiceConnection", "Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$MyServiceConnection;", "", "mTagInfo", "Ljava/lang/String;", "Ljava/util/concurrent/CountDownLatch;", "replayReadyLatch_", "Ljava/util/concurrent/CountDownLatch;", "serviceReadyLatch_", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "()V", "Companion", "ClientLister", "ConnectHandler", "MyHandler", "MyServiceConnection", "ServiceCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricClient.kt */
public final class BiometricClient {
    public static final Companion Companion = new Companion((C13695i) null);
    private static final String LOG_TAG = "BiometricClient";
    private static final int MSG_GET_VERSION = 5002;
    private static final int MSG_RELEASE_SERVICE = 5001;
    private static final int MSG_RELEASE_TIMEOUT = 5;
    private static final int MSG_REPLAY_TIMEOUT = 2;
    private static final int MSG_SEND_SERVEICE = 5003;
    private static final int MSG_START_SERVICE = 5000;
    private static final int SERVICE_READY_TIMEOUT = 2;
    private static final int SERVICE_STATUS_CONNECTED = 2;
    private static final int SERVICE_STATUS_CONNECTING = 1;
    private static final int SERVICE_STATUS_CONNECTING_ERROR = 12;
    private static final int SERVICE_STATUS_CONNECTING_TIME_OUT = 11;
    private static final int SERVICE_STATUS_DISCONNECT = 5;
    private static final int SERVICE_STATUS_DISCONNECTING = 3;
    private static final int SERVICE_STATUS_NONE = 0;
    private static final int SERVICE_STATUS_UNBIND = 4;
    /* access modifiers changed from: private */
    public final ReentrantLock accessLock_ = new ReentrantLock();
    private final Context context;
    private HandlerThread mCallbackThread;
    /* access modifiers changed from: private */
    public ClientLister mClientLister;
    private ConnectHandler mConnectHandler;
    private Handler mHandler;
    private HandlerThread mMainThread;
    private Messenger mReplyMessager;
    private Messenger mSendMessager;
    /* access modifiers changed from: private */
    public ServiceCallback mServiceCallback;
    /* access modifiers changed from: private */
    public int mServiceConnectStatus;
    private MyServiceConnection mServiceConnection;
    /* access modifiers changed from: private */
    public String mTagInfo;
    /* access modifiers changed from: private */
    public CountDownLatch replayReadyLatch_;
    private CountDownLatch serviceReadyLatch_;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ClientLister;", "", "", "f", "f2", "Lja/u;", "onVersion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricClient.kt */
    public interface ClientLister {
        void onVersion(float f, float f2);
    }

    @Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$Companion;", "", "()V", "LOG_TAG", "", "MSG_GET_VERSION", "", "MSG_RELEASE_SERVICE", "MSG_RELEASE_TIMEOUT", "MSG_REPLAY_TIMEOUT", "MSG_SEND_SERVEICE", "MSG_START_SERVICE", "SERVICE_READY_TIMEOUT", "SERVICE_STATUS_CONNECTED", "SERVICE_STATUS_CONNECTING", "SERVICE_STATUS_CONNECTING_ERROR", "SERVICE_STATUS_CONNECTING_TIME_OUT", "SERVICE_STATUS_DISCONNECT", "SERVICE_STATUS_DISCONNECTING", "SERVICE_STATUS_NONE", "SERVICE_STATUS_UNBIND", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: BiometricClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ConnectHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "Lja/u;", "handleMessage", "Landroid/os/Looper;", "looper", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient;Landroid/os/Looper;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricClient.kt */
    private final class ConnectHandler extends Handler {
        final /* synthetic */ BiometricClient this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ConnectHandler(BiometricClient biometricClient, Looper looper) {
            super(looper);
            C13706o.m87929f(looper, "looper");
            this.this$0 = biometricClient;
            BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + biometricClient.mTagInfo + ":ConnectHandler");
        }

        public void handleMessage(Message message) {
            CountDownLatch access$getReplayReadyLatch_$p;
            ClientLister access$getMClientLister$p;
            CountDownLatch access$getReplayReadyLatch_$p2;
            C13706o.m87929f(message, NotificationCompat.CATEGORY_MESSAGE);
            if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage cb - what:" + message.what + ", arg1:" + message.arg1);
            }
            if (message.what == 9999) {
                BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, "MSG_CONNECT_TEST ok");
                if (this.this$0.replayReadyLatch_ != null && (access$getReplayReadyLatch_$p2 = this.this$0.replayReadyLatch_) != null) {
                    access$getReplayReadyLatch_$p2.countDown();
                    return;
                }
                return;
            }
            ReentrantLock access$getAccessLock_$p = this.this$0.accessLock_;
            try {
                C13329n.C13330a aVar = C13329n.f61327a;
                access$getAccessLock_$p.lock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th) {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th));
            }
            if (this.this$0.mServiceCallback == null) {
                BiometricLoggerImpl.INSTANCE.mo68220e(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage cb ignore- what:" + message.what + ", arg1:" + message.arg1);
                ReentrantLock access$getAccessLock_$p2 = this.this$0.accessLock_;
                try {
                    C13329n.C13330a aVar3 = C13329n.f61327a;
                    access$getAccessLock_$p2.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th2) {
                    C13329n.C13330a aVar4 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th2));
                }
            } else {
                Bundle data = message.getData();
                data.setClassLoader(BiometricConnect.class.getClassLoader());
                boolean z = data.getBoolean("result");
                int i = message.what;
                if (i == 1000) {
                    BiometricConnect biometricConnect = BiometricConnect.INSTANCE;
                    int i2 = data.getInt(biometricConnect.getMSG_VER_SER_MAJ());
                    int i3 = data.getInt(biometricConnect.getMSG_VER_SER_MIN());
                    int i4 = data.getInt(biometricConnect.getMSG_VER_MODULE_MAJ());
                    int i5 = data.getInt(biometricConnect.getMSG_VER_MODULE_MIN());
                    BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage cb - MSG_SEVICE_VERSION:SVC: v" + i2 + "." + i3 + ", Module: v" + i4 + "." + i5);
                    if (!(this.this$0.mClientLister == null || (access$getMClientLister$p = this.this$0.mClientLister) == null)) {
                        access$getMClientLister$p.onVersion(((float) ((i2 * 100) + i3)) / 100.0f, ((float) ((i4 * 100) + i5)) / 100.0f);
                    }
                    ReentrantLock access$getAccessLock_$p3 = this.this$0.accessLock_;
                    try {
                        C13329n.C13330a aVar5 = C13329n.f61327a;
                        access$getAccessLock_$p3.unlock();
                        C13329n.m85676a(C13339u.f61331a);
                    } catch (Throwable th3) {
                        C13329n.C13330a aVar6 = C13329n.f61327a;
                        C13329n.m85676a(C13332o.m85684a(th3));
                    }
                } else if (i != 1001) {
                    BiometricConnect biometricConnect2 = BiometricConnect.INSTANCE;
                    String msg_reply_module_id = biometricConnect2.getMSG_REPLY_MODULE_ID();
                    if (i == 1004) {
                        if (!z || this.this$0.mServiceCallback == null) {
                            BiometricLoggerImpl.INSTANCE.mo68220e(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage cb MSG_CALLBACK_EVENT ignore- what:" + message.what + ", arg1:" + message.arg1);
                        } else {
                            ServiceCallback access$getMServiceCallback$p = this.this$0.mServiceCallback;
                            if (access$getMServiceCallback$p != null) {
                                access$getMServiceCallback$p.onBiometricEventCallback(data.getInt(msg_reply_module_id), data.getInt(NotificationCompat.CATEGORY_EVENT), data.getInt(biometricConnect2.getMSG_REPLY_ARG1()), data.getInt(biometricConnect2.getMSG_REPLY_ARG2()));
                            }
                        }
                        ReentrantLock access$getAccessLock_$p4 = this.this$0.accessLock_;
                        try {
                            C13329n.C13330a aVar7 = C13329n.f61327a;
                            access$getAccessLock_$p4.unlock();
                            C13329n.m85676a(C13339u.f61331a);
                        } catch (Throwable th4) {
                            C13329n.C13330a aVar8 = C13329n.f61327a;
                            C13329n.m85676a(C13332o.m85684a(th4));
                        }
                    } else if (i != 1005) {
                        ReentrantLock access$getAccessLock_$p5 = this.this$0.accessLock_;
                        try {
                            C13329n.C13330a aVar9 = C13329n.f61327a;
                            access$getAccessLock_$p5.unlock();
                            C13329n.m85676a(C13339u.f61331a);
                        } catch (Throwable th5) {
                            C13329n.C13330a aVar10 = C13329n.f61327a;
                            C13329n.m85676a(C13332o.m85684a(th5));
                        }
                    } else {
                        if (!z || this.this$0.mServiceCallback == null) {
                            BiometricLoggerImpl.INSTANCE.mo68220e(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage cb MSG_CALLBACK_BUNDLE ignore- what:" + message.what + ", arg1:" + message.arg1);
                        } else {
                            ServiceCallback access$getMServiceCallback$p2 = this.this$0.mServiceCallback;
                            if (access$getMServiceCallback$p2 != null) {
                                int i6 = data.getInt(msg_reply_module_id);
                                int i7 = data.getInt("key");
                                C13706o.m87928e(data, "in_bundle");
                                access$getMServiceCallback$p2.onBiometricBundleCallback(i6, i7, data);
                            }
                        }
                        ReentrantLock access$getAccessLock_$p6 = this.this$0.accessLock_;
                        try {
                            C13329n.C13330a aVar11 = C13329n.f61327a;
                            access$getAccessLock_$p6.unlock();
                            C13329n.m85676a(C13339u.f61331a);
                        } catch (Throwable th6) {
                            C13329n.C13330a aVar12 = C13329n.f61327a;
                            C13329n.m85676a(C13332o.m85684a(th6));
                        }
                    }
                } else {
                    int i8 = message.arg1;
                    if (2 == i8) {
                        if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                            BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage cb - MSG_COMMAND_DEINIT_CALLBACK");
                        }
                        this.this$0.onServiceUnbind(false);
                    } else if (1 == i8 && BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                        BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage cb - MSG_COMMAND_INIT_CALLBACK");
                    }
                    ReentrantLock access$getAccessLock_$p7 = this.this$0.accessLock_;
                    try {
                        C13329n.C13330a aVar13 = C13329n.f61327a;
                        access$getAccessLock_$p7.unlock();
                        C13329n.m85676a(C13339u.f61331a);
                    } catch (Throwable th7) {
                        C13329n.C13330a aVar14 = C13329n.f61327a;
                        C13329n.m85676a(C13332o.m85684a(th7));
                    }
                }
                if (!data.getBoolean(BiometricConnect.INSTANCE.getMSG_REPLY_NO_SEND_WAIT()) && (access$getReplayReadyLatch_$p = this.this$0.replayReadyLatch_) != null) {
                    access$getReplayReadyLatch_$p.countDown();
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$MyHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "Lja/u;", "handleMessage", "Landroid/os/Looper;", "looper", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient;Landroid/os/Looper;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricClient.kt */
    private final class MyHandler extends Handler {
        final /* synthetic */ BiometricClient this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MyHandler(BiometricClient biometricClient, Looper looper) {
            super(looper);
            C13706o.m87929f(looper, "looper");
            this.this$0 = biometricClient;
        }

        public void handleMessage(Message message) {
            C13706o.m87929f(message, NotificationCompat.CATEGORY_MESSAGE);
            if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + this.this$0.mTagInfo + ":handleMessage main what:" + message.what);
            }
            switch (message.what) {
                case 5000:
                    this.this$0.handle_startService();
                    return;
                case BiometricClient.MSG_RELEASE_SERVICE /*5001*/:
                    this.this$0.handle_releaseService();
                    return;
                case BiometricClient.MSG_GET_VERSION /*5002*/:
                    this.this$0.handle_getServiceVersion(message.arg1);
                    return;
                case BiometricClient.MSG_SEND_SERVEICE /*5003*/:
                    BiometricClient biometricClient = this.this$0;
                    Object obj = message.obj;
                    C13706o.m87927d(obj, "null cannot be cast to non-null type android.os.Message");
                    biometricClient.handle_sendService((Message) obj);
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$MyServiceConnection;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Lja/u;", "onServiceConnected", "onServiceDisconnected", "<init>", "(Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricClient.kt */
    private final class MyServiceConnection implements ServiceConnection {
        public MyServiceConnection() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C13706o.m87929f(componentName, "name");
            C13706o.m87929f(iBinder, NotificationCompat.CATEGORY_SERVICE);
            BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + BiometricClient.this.mTagInfo + ":onServiceConnected mServiceConnectStatus:" + BiometricClient.this.mServiceConnectStatus);
            BiometricClient.this.onServiceBind(iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C13706o.m87929f(componentName, "name");
            BiometricLoggerImpl.INSTANCE.mo68217d(BiometricClient.LOG_TAG, ":" + BiometricClient.this.mTagInfo + ":onServiceDisconnected mServiceConnectStatus:" + BiometricClient.this.mServiceConnectStatus);
            BiometricClient.this.onServiceUnbind(true);
            BiometricClient.this.handle_releaseService();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/BiometricClient$ServiceCallback;", "", "", "i", "i2", "Landroid/os/Bundle;", "bundle", "Lja/u;", "onBiometricBundleCallback", "i3", "i4", "onBiometricEventCallback", "onBiometricEventClassLoader", "onBiometricServiceConnected", "onBiometricServiceDisconnected", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricClient.kt */
    public interface ServiceCallback {
        void onBiometricBundleCallback(int i, int i2, Bundle bundle);

        void onBiometricEventCallback(int i, int i2, int i3, int i4);

        void onBiometricEventClassLoader(Bundle bundle);

        void onBiometricServiceConnected();

        void onBiometricServiceDisconnected();
    }

    public BiometricClient() {
        Context g = C12104a.f58372a.mo68283g();
        this.context = g;
        HandlerThread handlerThread = new HandlerThread("BiometricMainThread_" + this.mTagInfo);
        this.mMainThread = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        C13706o.m87928e(looper, "it.looper");
        this.mHandler = new MyHandler(this, looper);
        this.mTagInfo = g.toString();
        HandlerThread handlerThread2 = new HandlerThread("BiometricClientCBThread_" + this.mTagInfo);
        this.mCallbackThread = handlerThread2;
        handlerThread2.start();
        Looper looper2 = handlerThread2.getLooper();
        C13706o.m87928e(looper2, "it.looper");
        this.mConnectHandler = new ConnectHandler(this, looper2);
        this.mReplyMessager = new Messenger(this.mConnectHandler);
        BiometricConnect.INSTANCE.syncDebugLog();
        StringBuilder sb = new StringBuilder();
        sb.append(":");
        sb.append(this.mTagInfo);
        sb.append(":BiometricClient MainThread id:");
        HandlerThread handlerThread3 = this.mMainThread;
        Long l = null;
        sb.append(handlerThread3 != null ? Long.valueOf(handlerThread3.getId()) : null);
        sb.append(" CallbackThread id:");
        HandlerThread handlerThread4 = this.mCallbackThread;
        sb.append(handlerThread4 != null ? Long.valueOf(handlerThread4.getId()) : l);
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, sb.toString());
    }

    /* access modifiers changed from: private */
    public final void handle_getServiceVersion(int i) {
        ReentrantLock reentrantLock = this.accessLock_;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th));
        }
        if (this.mServiceConnectStatus != 2) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_getServiceVersion error: service not Connected");
            ReentrantLock reentrantLock2 = this.accessLock_;
            try {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar4 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
        } else {
            try {
                if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                    BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_getServiceVersion");
                }
                Message obtain = Message.obtain((Handler) null, 1000, i, 0);
                obtain.replyTo = this.mReplyMessager;
                this.replayReadyLatch_ = new CountDownLatch(1);
                Messenger messenger = this.mSendMessager;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                ReentrantLock reentrantLock3 = this.accessLock_;
                try {
                    C13329n.C13330a aVar5 = C13329n.f61327a;
                    reentrantLock3.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th3) {
                    C13329n.C13330a aVar6 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th3));
                }
                try {
                    CountDownLatch countDownLatch = this.replayReadyLatch_;
                    if (countDownLatch != null && !countDownLatch.await(2, TimeUnit.SECONDS)) {
                        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_getServiceVersion - ERROR: timeout!");
                    }
                } catch (InterruptedException e) {
                    BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                    biometricLoggerImpl.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_getServiceVersion - ERROR: " + e);
                    biometricLoggerImpl.mo68218e((Throwable) e);
                }
            } catch (RemoteException e2) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl2.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_getServiceVersion - RemoteException ERROR: " + e2);
                biometricLoggerImpl2.mo68218e((Throwable) e2);
            } catch (Exception e3) {
                BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl3.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_getServiceVersion - Exception ERROR: " + e3);
                biometricLoggerImpl3.mo68218e((Throwable) e3);
            }
            if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_getServiceVersion end");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handle_releaseService() {
        ReentrantLock reentrantLock = this.accessLock_;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th));
        }
        if (this.mTagInfo == null) {
            BiometricLoggerImpl.INSTANCE.mo68220e(LOG_TAG, ":" + this.mTagInfo + ":handle_releaseService mClientInfoList is null");
            ReentrantLock reentrantLock2 = this.accessLock_;
            try {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar4 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
        } else {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_releaseService mServiceConnectStatus:" + this.mServiceConnectStatus + " ");
            if (4 != this.mServiceConnectStatus) {
                onServiceUnbind(false);
            }
            try {
                MyServiceConnection myServiceConnection = this.mServiceConnection;
                if (myServiceConnection != null) {
                    this.context.unbindService(myServiceConnection);
                }
            } catch (IllegalArgumentException e) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_releaseService IllegalArgumentException:" + e.toString());
            } catch (NullPointerException e2) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_releaseService NullPointerException:" + e2.toString());
            } catch (Exception e3) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_releaseService Exception:" + e3.toString());
            }
            this.mServiceConnectStatus = 5;
            this.mServiceConnection = null;
            release();
            ReentrantLock reentrantLock3 = this.accessLock_;
            try {
                C13329n.C13330a aVar5 = C13329n.f61327a;
                reentrantLock3.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th3) {
                C13329n.C13330a aVar6 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th3));
            }
            if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_releaseService end");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handle_sendService(Message message) {
        ReentrantLock reentrantLock = this.accessLock_;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th));
        }
        if (this.mServiceConnectStatus != 2) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_sendService error: service not Connected");
            ReentrantLock reentrantLock2 = this.accessLock_;
            try {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar4 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
        } else {
            if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_sendService");
            }
            try {
                message.replyTo = this.mReplyMessager;
                this.replayReadyLatch_ = new CountDownLatch(1);
                Messenger messenger = this.mSendMessager;
                if (messenger != null) {
                    messenger.send(message);
                }
                ReentrantLock reentrantLock3 = this.accessLock_;
                try {
                    C13329n.C13330a aVar5 = C13329n.f61327a;
                    reentrantLock3.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th3) {
                    C13329n.C13330a aVar6 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th3));
                }
                try {
                    CountDownLatch countDownLatch = this.replayReadyLatch_;
                    if (countDownLatch != null && !countDownLatch.await(2, TimeUnit.SECONDS)) {
                        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_sendService - ERROR: timeout! cmd:" + message.arg1 + " arg:" + message.arg2);
                    }
                } catch (InterruptedException e) {
                    BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                    biometricLoggerImpl.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_sendService - ERROR: " + e);
                    biometricLoggerImpl.mo68218e((Throwable) e);
                }
            } catch (RemoteException e2) {
                BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl2.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_sendService - ERROR: " + e2);
                biometricLoggerImpl2.mo68218e((Throwable) e2);
            } catch (Exception e3) {
                BiometricLoggerImpl biometricLoggerImpl3 = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl3.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_sendService - Exception ERROR: " + e3);
                biometricLoggerImpl3.mo68218e((Throwable) e3);
            }
            if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":handle_sendService end");
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handle_startService() {
        /*
            r9 = this;
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect r0 = dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect.INSTANCE
            boolean r0 = r0.getDEBUG_LOG()
            r1 = 2
            r2 = 0
            r3 = 1
            java.lang.String r4 = ":"
            java.lang.String r5 = "BiometricClient"
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r6 = r9.mTagInfo
            r0.append(r6)
            java.lang.String r6 = ":handle_startService"
            r0.append(r6)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r6 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r2] = r5
            java.lang.String r0 = r0.toString()
            r7[r3] = r0
            r6.mo68217d(r7)
        L_0x0030:
            java.util.concurrent.locks.ReentrantLock r0 = r9.accessLock_
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x003d }
            r0.lock()     // Catch:{ all -> 0x003d }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x003d }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0047
        L_0x003d:
            r0 = move-exception
            ja.n$a r6 = p297ja.C13329n.f61327a
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)
            p297ja.C13329n.m85676a(r0)
        L_0x0047:
            r9.mServiceConnectStatus = r3
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r3)
            r9.serviceReadyLatch_ = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r6 = "com.xiaomi.biometric.BiometricService"
            r0.<init>(r6)
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect r6 = dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect.INSTANCE
            java.lang.String r6 = r6.getSERVICE_PACKAGE_NAME()
            r0.setPackage(r6)
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.BiometricClient$MyServiceConnection r6 = new dev.skomlach.biometric.compat.engine.internal.face.miui.impl.BiometricClient$MyServiceConnection
            r6.<init>()
            r9.mServiceConnection = r6
            android.content.Context r7 = r9.context     // Catch:{ Exception -> 0x006f }
            r8 = 65
            r7.bindService(r0, r6, r8)     // Catch:{ Exception -> 0x006f }
            goto L_0x0094
        L_0x006f:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = r9.mTagInfo
            r6.append(r7)
            java.lang.String r7 = ":handle_startService - bindService Exception ERROR: "
            r6.append(r7)
            r6.append(r0)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r2] = r5
            java.lang.String r6 = r6.toString()
            r7[r3] = r6
            r0.mo68217d(r7)
        L_0x0094:
            java.util.concurrent.locks.ReentrantLock r0 = r9.accessLock_
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x00a1 }
            r0.unlock()     // Catch:{ all -> 0x00a1 }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00a1 }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x00ab
        L_0x00a1:
            r0 = move-exception
            ja.n$a r6 = p297ja.C13329n.f61327a
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)
            p297ja.C13329n.m85676a(r0)
        L_0x00ab:
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect r0 = dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect.INSTANCE
            boolean r0 = r0.getDEBUG_LOG()
            if (r0 == 0) goto L_0x00d4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r6 = r9.mTagInfo
            r0.append(r6)
            java.lang.String r6 = ":handle_startService await..."
            r0.append(r6)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r6 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r2] = r5
            java.lang.String r0 = r0.toString()
            r7[r3] = r0
            r6.mo68217d(r7)
        L_0x00d4:
            java.util.concurrent.CountDownLatch r0 = r9.serviceReadyLatch_     // Catch:{ Exception -> 0x013b }
            if (r0 == 0) goto L_0x00e4
            r6 = 2
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x013b }
            boolean r0 = r0.await(r6, r8)     // Catch:{ Exception -> 0x013b }
            if (r0 != 0) goto L_0x00e4
            r0 = 1
            goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            if (r0 == 0) goto L_0x0195
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013b }
            r0.<init>()     // Catch:{ Exception -> 0x013b }
            r0.append(r4)     // Catch:{ Exception -> 0x013b }
            java.lang.String r6 = r9.mTagInfo     // Catch:{ Exception -> 0x013b }
            r0.append(r6)     // Catch:{ Exception -> 0x013b }
            java.lang.String r6 = ":handle_startService - ERROR: tmeout!"
            r0.append(r6)     // Catch:{ Exception -> 0x013b }
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r6 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ Exception -> 0x013b }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x013b }
            r7[r2] = r5     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x013b }
            r7[r3] = r0     // Catch:{ Exception -> 0x013b }
            r6.mo68217d(r7)     // Catch:{ Exception -> 0x013b }
            java.util.concurrent.locks.ReentrantLock r0 = r9.accessLock_     // Catch:{ Exception -> 0x013b }
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x0115 }
            r0.lock()     // Catch:{ all -> 0x0115 }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0115 }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x0115 }
            goto L_0x011f
        L_0x0115:
            r0 = move-exception
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ Exception -> 0x013b }
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)     // Catch:{ Exception -> 0x013b }
            p297ja.C13329n.m85676a(r0)     // Catch:{ Exception -> 0x013b }
        L_0x011f:
            r0 = 11
            r9.mServiceConnectStatus = r0     // Catch:{ Exception -> 0x013b }
            java.util.concurrent.locks.ReentrantLock r0 = r9.accessLock_     // Catch:{ Exception -> 0x013b }
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x0130 }
            r0.unlock()     // Catch:{ all -> 0x0130 }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0130 }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x0195
        L_0x0130:
            r0 = move-exception
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ Exception -> 0x013b }
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)     // Catch:{ Exception -> 0x013b }
            p297ja.C13329n.m85676a(r0)     // Catch:{ Exception -> 0x013b }
            goto L_0x0195
        L_0x013b:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = r9.mTagInfo
            r6.append(r7)
            java.lang.String r7 = ":handle_startService - ERROR: "
            r6.append(r7)
            r6.append(r0)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r7 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r2] = r5
            java.lang.String r6 = r6.toString()
            r8[r3] = r6
            r7.mo68217d(r8)
            r7.mo68218e((java.lang.Throwable) r0)
            java.util.concurrent.locks.ReentrantLock r0 = r9.accessLock_
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x0170 }
            r0.lock()     // Catch:{ all -> 0x0170 }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0170 }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x0170 }
            goto L_0x017a
        L_0x0170:
            r0 = move-exception
            ja.n$a r6 = p297ja.C13329n.f61327a
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)
            p297ja.C13329n.m85676a(r0)
        L_0x017a:
            r0 = 12
            r9.mServiceConnectStatus = r0
            java.util.concurrent.locks.ReentrantLock r0 = r9.accessLock_
            ja.n$a r6 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x018b }
            r0.unlock()     // Catch:{ all -> 0x018b }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x018b }
            p297ja.C13329n.m85676a(r0)     // Catch:{ all -> 0x018b }
            goto L_0x0195
        L_0x018b:
            r0 = move-exception
            ja.n$a r6 = p297ja.C13329n.f61327a
            java.lang.Object r0 = p297ja.C13332o.m85684a(r0)
            p297ja.C13329n.m85676a(r0)
        L_0x0195:
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect r0 = dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect.INSTANCE
            boolean r0 = r0.getDEBUG_LOG()
            if (r0 == 0) goto L_0x01be
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = r9.mTagInfo
            r0.append(r4)
            java.lang.String r4 = ":handle_startService ok"
            r0.append(r4)
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r4 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            java.lang.String r0 = r0.toString()
            r1[r3] = r0
            r4.mo68217d(r1)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.BiometricClient.handle_startService():void");
    }

    /* access modifiers changed from: private */
    public final void onServiceBind(IBinder iBinder) {
        String str = ":" + this.mTagInfo + ":onServiceBind begin";
        C13706o.m87928e(str, "stringBuilder.toString()");
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, str);
        ReentrantLock reentrantLock = this.accessLock_;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            C13329n.m85676a(C13332o.m85684a(th));
        }
        if (this.mTagInfo == null) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":onServiceBind mTagInfo is null");
            ReentrantLock reentrantLock2 = this.accessLock_;
            try {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar4 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
        } else {
            this.mServiceConnectStatus = 2;
            this.mSendMessager = new Messenger(iBinder);
            CountDownLatch countDownLatch = this.serviceReadyLatch_;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            if (this.mServiceCallback != null) {
                BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, "mServiceCallback yes");
                ServiceCallback serviceCallback = this.mServiceCallback;
                if (serviceCallback != null) {
                    serviceCallback.onBiometricServiceConnected();
                }
            }
            ReentrantLock reentrantLock3 = this.accessLock_;
            try {
                C13329n.C13330a aVar5 = C13329n.f61327a;
                reentrantLock3.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th3) {
                C13329n.C13330a aVar6 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th3));
            }
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":onServiceBind end");
        }
    }

    /* access modifiers changed from: private */
    public final void onServiceUnbind(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.accessLock_;
            try {
                C13329n.C13330a aVar = C13329n.f61327a;
                reentrantLock.lock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th) {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th));
            }
        }
        int i = this.mServiceConnectStatus;
        if (4 == i || 5 == i) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":onServiceUnbind ignore mServiceConnectStatus:" + this.mServiceConnectStatus);
            if (z) {
                ReentrantLock reentrantLock2 = this.accessLock_;
                try {
                    C13329n.C13330a aVar3 = C13329n.f61327a;
                    reentrantLock2.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th2) {
                    C13329n.C13330a aVar4 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th2));
                }
            }
        } else {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":onServiceUnbind mServiceConnectStatus:" + this.mServiceConnectStatus);
            this.mServiceConnectStatus = 4;
            ServiceCallback serviceCallback = this.mServiceCallback;
            if (serviceCallback != null) {
                serviceCallback.onBiometricServiceDisconnected();
            }
            if (z) {
                ReentrantLock reentrantLock3 = this.accessLock_;
                try {
                    C13329n.C13330a aVar5 = C13329n.f61327a;
                    reentrantLock3.unlock();
                    C13329n.m85676a(C13339u.f61331a);
                } catch (Throwable th3) {
                    C13329n.C13330a aVar6 = C13329n.f61327a;
                    C13329n.m85676a(C13332o.m85684a(th3));
                }
            }
        }
    }

    private final void release() {
        Looper looper;
        Looper looper2;
        if (this.mHandler != null) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":release");
            HandlerThread handlerThread = this.mCallbackThread;
            if (handlerThread != null) {
                if (!(handlerThread == null || (looper2 = handlerThread.getLooper()) == null)) {
                    looper2.quit();
                }
                HandlerThread handlerThread2 = this.mCallbackThread;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                this.mCallbackThread = null;
            }
            this.mConnectHandler = null;
            this.mReplyMessager = null;
            HandlerThread handlerThread3 = this.mMainThread;
            if (handlerThread3 != null) {
                if (!(handlerThread3 == null || (looper = handlerThread3.getLooper()) == null)) {
                    looper.quit();
                }
                HandlerThread handlerThread4 = this.mMainThread;
                if (handlerThread4 != null) {
                    handlerThread4.quit();
                }
                this.mMainThread = null;
            }
            this.mHandler = null;
        }
    }

    private final void removeAllMessage() {
        if (this.mHandler != null) {
            String str = ":" + this.mTagInfo + ":removeAllMessage";
            C13706o.m87928e(str, "stringBuilder.toString()");
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, str);
            for (int i = 5000; i < 5004; i++) {
                while (true) {
                    Handler handler = this.mHandler;
                    if (!(handler != null && handler.hasMessages(i))) {
                        break;
                    }
                    BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":removeAllMessage arg：" + i);
                    Handler handler2 = this.mHandler;
                    if (handler2 != null) {
                        handler2.removeMessages(i);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void sendCommand$default(BiometricClient biometricClient, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        biometricClient.sendCommand(i, i2);
    }

    public final void finalize() throws Throwable {
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":finalize");
        release();
    }

    public final void getServiceVersion(int i, ClientLister clientLister) {
        if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":getServiceVersion module_id:" + i);
        }
        this.mClientLister = clientLister;
        Message obtain = Message.obtain(this.mHandler);
        obtain.what = MSG_GET_VERSION;
        obtain.arg1 = i;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
    }

    public final void releaseService(ServiceCallback serviceCallback) {
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":releaseService  mServiceConnectStatus:" + this.mServiceConnectStatus);
        removeAllMessage();
        sendCommand$default(this, 2, 0, 2, (Object) null);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendEmptyMessage(MSG_RELEASE_SERVICE);
        }
    }

    public final void sendBundle(int i, Bundle bundle) {
        C13706o.m87929f(bundle, "bundle");
        if (BiometricConnect.INSTANCE.getDEBUG_LOG()) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":Send MSG: sendBundle key:" + i);
        }
        Message obtain = Message.obtain();
        obtain.what = 1002;
        bundle.putInt("tag", i);
        obtain.setData(bundle);
        Message obtain2 = Message.obtain(this.mHandler, MSG_SEND_SERVEICE);
        obtain2.obj = obtain;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain2);
        }
    }

    public final void sendCommand(int i) {
        sendCommand$default(this, i, 0, 2, (Object) null);
    }

    public final void sendCommand(int i, int i2) {
        BiometricConnect biometricConnect = BiometricConnect.INSTANCE;
        if (biometricConnect.getDEBUG_LOG()) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":Send MSG: sendCommand cmd:" + i + ",arg:" + i2);
        }
        Message obtain = Message.obtain();
        obtain.what = 1001;
        obtain.arg1 = i;
        obtain.arg2 = i2;
        Message obtain2 = Message.obtain(this.mHandler, MSG_SEND_SERVEICE);
        obtain2.obj = obtain;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain2);
        }
        if (biometricConnect.getDEBUG_LOG()) {
            BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":Send MSG: sendCommand cmd:" + i + " ok");
        }
    }

    public final void startService(ServiceCallback serviceCallback) {
        this.mServiceCallback = serviceCallback;
        this.mServiceConnectStatus = 0;
        this.mSendMessager = null;
        BiometricLoggerImpl.INSTANCE.mo68217d(LOG_TAG, ":" + this.mTagInfo + ":startService");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendEmptyMessage(5000);
        }
        Bundle bundle = new Bundle();
        bundle.putString("info", this.mTagInfo);
        sendBundle(0, bundle);
    }
}
