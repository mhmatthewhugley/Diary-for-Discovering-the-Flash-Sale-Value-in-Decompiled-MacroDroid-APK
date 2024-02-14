package com.tencent.soter.core.sotercore;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.soter.core.model.ConstantsSoter;
import com.tencent.soter.core.model.SLogger;
import com.tencent.soter.core.model.SoterCoreResult;
import com.tencent.soter.core.model.SoterDelegate;
import com.tencent.soter.core.model.SoterErrCode;
import com.tencent.soter.core.model.SoterPubKeyModel;
import com.tencent.soter.soterserver.ISoterService;
import com.tencent.soter.soterserver.SoterSessionResult;
import com.tencent.soter.soterserver.SoterSignResult;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;

public class SoterCoreTreble extends SoterCoreBase implements ConstantsSoter, SoterErrCode {
    private static final int CONNECTED = 2;
    private static final int CONNECTING = 1;
    protected static final int DEFAULT_BLOCK_TIME = 3000;
    private static final int DISCONNECT = 0;
    public static final String TAG = "Soter.SoterCoreTreble";
    /* access modifiers changed from: private */
    public static int connectState = 0;
    /* access modifiers changed from: private */
    public static boolean isInitializeSuccessed = false;
    private static boolean isInitializing = false;
    /* access modifiers changed from: private */
    public static final Object lock = new Object();
    protected static ISoterService mSoterService;
    /* access modifiers changed from: private */
    public static SyncJob syncJob = new SyncJob();
    public static int uid = 0;
    /* access modifiers changed from: private */
    public boolean canRetry = true;
    private int disconnectCount = 0;
    private boolean hasBind = false;
    private long lastBindTime = 0;
    private Context mContext;
    /* access modifiers changed from: private */
    public IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() {
        public void binderDied() {
            SLogger.m81941i(SoterCoreTreble.TAG, "soter: binder died", new Object[0]);
            ISoterService iSoterService = SoterCoreTreble.mSoterService;
            if (iSoterService != null) {
                iSoterService.asBinder().unlinkToDeath(SoterCoreTreble.this.mDeathRecipient, 0);
                SoterCoreTreble.mSoterService = null;
                if (SoterCoreTreble.this.serviceListener != null) {
                    SoterCoreTreble.this.serviceListener.onServiceBinderDied();
                }
                synchronized (SoterCoreTreble.lock) {
                    int unused = SoterCoreTreble.connectState = 0;
                    SoterCoreTreble.this.unbindService();
                    SoterCoreTreble.this.rebindService();
                }
            }
        }
    };
    private Handler mMainLooperHandler = new Handler(Looper.getMainLooper());
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        public void onBindingDied(ComponentName componentName) {
            SLogger.m81941i(SoterCoreTreble.TAG, "soter: binding died", new Object[0]);
            int unused = SoterCoreTreble.connectState = 0;
            SoterCoreTreble.mSoterService = null;
            int unused2 = SoterCoreTreble.this.noResponseCount = 0;
            SoterCoreTreble.this.unbindService();
            SoterCoreTreble.this.rebindService();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            SLogger.m81941i(SoterCoreTreble.TAG, "soter: onServiceConnected", new Object[0]);
            synchronized (SoterCoreTreble.lock) {
                int unused = SoterCoreTreble.connectState = 2;
            }
            int unused2 = SoterCoreTreble.this.noResponseCount = 0;
            try {
                iBinder.linkToDeath(SoterCoreTreble.this.mDeathRecipient, 0);
                SoterCoreTreble.mSoterService = ISoterService.Stub.asInterface(iBinder);
            } catch (RemoteException e) {
                SLogger.m81940e(SoterCoreTreble.TAG, "soter: Binding deathRecipient is error - RemoteException" + e.toString(), new Object[0]);
            }
            if (SoterCoreTreble.this.serviceListener != null) {
                SoterCoreTreble.this.serviceListener.onServiceConnected();
            }
            SLogger.m81941i(SoterCoreTreble.TAG, "soter: Binding is done - Service connected", new Object[0]);
            SoterCoreTreble.syncJob.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (SoterCoreTreble.lock) {
                int unused = SoterCoreTreble.connectState = 0;
                SoterCoreTreble.mSoterService = null;
                int unused2 = SoterCoreTreble.this.noResponseCount = 0;
                if (SoterCoreTreble.this.serviceListener != null) {
                    SoterCoreTreble.this.serviceListener.onServiceDisconnected();
                }
                SLogger.m81941i(SoterCoreTreble.TAG, "soter: unBinding is done - Service disconnected", new Object[0]);
                SoterCoreTreble.this.rebindService();
                SoterCoreTreble.syncJob.countDown();
            }
        }
    };
    /* access modifiers changed from: private */
    public int noResponseCount = 0;
    /* access modifiers changed from: private */
    public SoterCoreTrebleServiceListener serviceListener;

    static /* synthetic */ int access$508(SoterCoreTreble soterCoreTreble) {
        int i = soterCoreTreble.noResponseCount;
        soterCoreTreble.noResponseCount = i + 1;
        return i;
    }

    private boolean checkIfServiceNull() {
        if (mSoterService != null) {
            return false;
        }
        SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
        SoterCoreTrebleServiceListener soterCoreTrebleServiceListener = this.serviceListener;
        if (soterCoreTrebleServiceListener == null) {
            return true;
        }
        soterCoreTrebleServiceListener.onNoServiceWhenCalling();
        return true;
    }

    private static long getFib(long j) {
        long j2 = 0;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        long j3 = 1;
        if (j == 1 || j == 2) {
            return 1;
        }
        long j4 = 1;
        int i2 = 3;
        while (((long) i2) <= j) {
            j2 = j3 + j4;
            i2++;
            j3 = j4;
            j4 = j2;
        }
        return j2;
    }

    public static boolean isInitializing() {
        return isInitializing;
    }

    /* access modifiers changed from: private */
    public void rebindService() {
        if (this.canRetry) {
            this.disconnectCount++;
            long fib = getFib((long) this.disconnectCount);
            long elapsedRealtime = fib - ((SystemClock.elapsedRealtime() - this.lastBindTime) / 1000);
            SLogger.m81939d(TAG, "fib: %s, rebind delay: %sS", Long.valueOf(fib), Long.valueOf(elapsedRealtime));
            if (elapsedRealtime <= 0) {
                bindService();
            } else {
                this.mMainLooperHandler.postDelayed(new Runnable() {
                    public void run() {
                        SoterCoreTreble.this.bindServiceIfNeeded();
                    }
                }, elapsedRealtime * 1000);
            }
        }
    }

    private void resetDisconnectCount() {
        this.disconnectCount = 0;
    }

    private void scheduleTimeoutTask() {
        final long fib = getFib((long) (this.noResponseCount + 3));
        this.mMainLooperHandler.postDelayed(new Runnable() {
            public void run() {
                if (SoterCoreTreble.this.canRetry && SoterCoreTreble.isInitializeSuccessed) {
                    SoterCoreTreble.access$508(SoterCoreTreble.this);
                    if (SoterCoreTreble.connectState != 2) {
                        SLogger.m81941i(SoterCoreTreble.TAG, "soter: bindservice no response: %s", Long.valueOf(fib));
                        SoterCoreTreble.this.bindService();
                    }
                }
            }
        }, fib * 1000);
    }

    public void bindService() {
        Intent intent = new Intent();
        intent.setAction("com.tencent.soter.soterserver.ISoterService");
        intent.setPackage("com.tencent.soter.soterserver");
        if (this.mContext == null) {
            SLogger.m81940e(TAG, "soter: bindService context is null ", new Object[0]);
            return;
        }
        connectState = 1;
        SoterCoreTrebleServiceListener soterCoreTrebleServiceListener = this.serviceListener;
        if (soterCoreTrebleServiceListener != null) {
            soterCoreTrebleServiceListener.onStartServiceConnecting();
        }
        this.lastBindTime = SystemClock.elapsedRealtime();
        this.hasBind = this.mContext.bindService(intent, this.mServiceConnection, 1);
        scheduleTimeoutTask();
        SLogger.m81941i(TAG, "soter: bindService binding is start ", new Object[0]);
    }

    public void bindServiceIfNeeded() {
        ISoterService iSoterService;
        if (connectState != 2 || (iSoterService = mSoterService) == null || !iSoterService.asBinder().isBinderAlive() || !mSoterService.asBinder().pingBinder()) {
            SLogger.m81941i(TAG, "soter: bindServiceIfNeeded try to bind", new Object[0]);
            bindService();
            return;
        }
        SLogger.m81939d(TAG, "no need rebind", new Object[0]);
    }

    public byte[] finishSign(long j) throws Exception {
        SLogger.m81941i(TAG, "soter: finishSign in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return null;
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return null;
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            SoterSignResult finishSign = mSoterService.finishSign(j);
            bArr = finishSign.exportData;
            if (finishSign.resultCode == 0) {
                return bArr;
            }
            throw new Exception("finishSign error");
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: finishSign fail: ");
        }
    }

    public SoterCoreResult generateAppGlobalSecureKey() {
        SLogger.m81941i(TAG, "soter: generateAppSecureKey in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return new SoterCoreResult(4);
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return new SoterCoreResult(4);
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            return new SoterCoreResult(4);
        }
        try {
            if (mSoterService.generateAppSecureKey(uid) == 0) {
                return new SoterCoreResult(0);
            }
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: generateAppSecureKey fail: ");
        }
        return new SoterCoreResult(4);
    }

    public SoterCoreResult generateAuthKey(String str) {
        SLogger.m81941i(TAG, "soter: generateAuthKey in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return new SoterCoreResult(6);
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return new SoterCoreResult(6);
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return new SoterCoreResult(6);
        }
        try {
            if (mSoterService.generateAuthKey(uid, str) == 0) {
                return new SoterCoreResult(0);
            }
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: generateAuthKey fail: ");
        }
        return new SoterCoreResult(6);
    }

    public SoterPubKeyModel getAppGlobalSecureKeyModel() {
        SLogger.m81941i(TAG, "soter: getAppGlobalSecureKeyModel in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return null;
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return null;
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return null;
        }
        try {
            byte[] bArr = mSoterService.getAppSecureKey(uid).exportData;
            if (bArr != null && bArr.length > 0) {
                return SoterCoreBase.retrieveJsonFromExportedData(bArr);
            }
            SLogger.m81940e(TAG, "soter: soter: key can not be retrieved", new Object[0]);
            return null;
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: getAppGlobalSecureKeyModel fail: ");
            return null;
        }
    }

    public Signature getAuthInitAndSign(String str) {
        return null;
    }

    public SoterPubKeyModel getAuthKeyModel(String str) {
        SLogger.m81941i(TAG, "soter: getAuthKeyModel in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return null;
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return null;
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return null;
        }
        try {
            byte[] bArr = mSoterService.getAuthKey(uid, str).exportData;
            if (bArr != null && bArr.length > 0) {
                return SoterCoreBase.retrieveJsonFromExportedData(bArr);
            }
            SLogger.m81940e(TAG, "soter: key can not be retrieved", new Object[0]);
            return null;
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: getAuthKeyModel fail: ");
            return null;
        }
    }

    public int getVersion() {
        SLogger.m81941i(TAG, "soter: getVersion in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return 0;
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return 0;
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return 0;
        }
        try {
            return mSoterService.getVersion();
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: getVersion fail: ");
            return 0;
        }
    }

    public boolean hasAppGlobalSecureKey() {
        SLogger.m81941i(TAG, "soter: hasAppGlobalSecureKey in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return false;
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return false;
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return false;
        }
        try {
            return mSoterService.hasAskAlready(uid);
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: hasAppGlobalSecureKey fail: ");
            return false;
        }
    }

    public boolean hasAuthKey(String str) {
        SLogger.m81941i(TAG, "soter: hasAuthKey in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return false;
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return false;
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return false;
        }
        try {
            return mSoterService.hasAuthKey(uid, str);
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: hasAuthKey fail: ");
            return false;
        }
    }

    public Signature initAuthKeySignature(String str) throws InvalidKeyException, NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException {
        return null;
    }

    public SoterSessionResult initSigh(String str, String str2) {
        SLogger.m81941i(TAG, "soter: initSigh in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return null;
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return null;
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return null;
        }
        try {
            return mSoterService.initSigh(uid, str, str2);
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: initSigh fail: ");
            return null;
        }
    }

    public boolean initSoter(Context context) {
        this.mContext = context;
        SLogger.m81941i(TAG, "soter: initSoter in", new Object[0]);
        isInitializing = true;
        syncJob.doAsSyncJob(ConstantsSoter.FACEID_AUTH_CHECK_TIME, new Runnable() {
            public void run() {
                SoterCoreTreble.this.bindServiceIfNeeded();
                SLogger.m81941i(SoterCoreTreble.TAG, "soter: initSoter binding", new Object[0]);
            }
        });
        isInitializing = false;
        if (connectState == 2) {
            SLogger.m81941i(TAG, "soter: initSoter finish", new Object[0]);
            isInitializeSuccessed = true;
            return true;
        }
        connectState = 0;
        SLogger.m81940e(TAG, "soter: initSoter error", new Object[0]);
        return false;
    }

    public boolean isAppGlobalSecureKeyValid() {
        SLogger.m81941i(TAG, "soter: isAppGlobalSecureKeyValid in", new Object[0]);
        if (!hasAppGlobalSecureKey() || getAppGlobalSecureKeyModel() == null) {
            return false;
        }
        return true;
    }

    public boolean isAuthKeyValid(String str, boolean z) {
        SLogger.m81941i(TAG, "soter: isAuthKeyValid in", new Object[0]);
        if (!hasAuthKey(str) || getAuthKeyModel(str) == null) {
            return false;
        }
        return true;
    }

    public boolean isNativeSupportSoter() {
        if (!SoterDelegate.isTriggeredOOM()) {
            return true;
        }
        SLogger.m81943w(TAG, "soter: the device has already triggered OOM. mark as not support", new Object[0]);
        return false;
    }

    public boolean isTrebleServiceConnected() {
        return connectState == 2;
    }

    public void releaseTrebleServiceConnection() {
        this.canRetry = false;
        unbindService();
    }

    public SoterCoreResult removeAppGlobalSecureKey() {
        SLogger.m81941i(TAG, "soter: removeAppGlobalSecureKey in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return new SoterCoreResult(5);
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return new SoterCoreResult(5);
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return new SoterCoreResult(5);
        }
        try {
            if (mSoterService.removeAllAuthKey(uid) == 0) {
                return new SoterCoreResult(0);
            }
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: removeAppGlobalSecureKey fail: ");
        }
        return new SoterCoreResult(5);
    }

    public SoterCoreResult removeAuthKey(String str, boolean z) {
        SLogger.m81941i(TAG, "soter: removeAuthKey in", new Object[0]);
        if (!isNativeSupportSoter()) {
            return new SoterCoreResult(7);
        }
        if (this.mContext == null) {
            SLogger.m81943w(TAG, "soter: context is null", new Object[0]);
            return new SoterCoreResult(7);
        }
        bindServiceIfNeeded();
        if (checkIfServiceNull()) {
            SLogger.m81943w(TAG, "soter: soter service not found", new Object[0]);
            return new SoterCoreResult(7);
        }
        try {
            if (mSoterService.removeAuthKey(uid, str) == 0) {
                if (!z) {
                    return new SoterCoreResult(0);
                }
                if (mSoterService.removeAllAuthKey(uid) == 0) {
                    return new SoterCoreResult(0);
                }
                return new SoterCoreResult(5);
            }
        } catch (RemoteException e) {
            SLogger.printErrStackTrace(TAG, e, "soter: removeAuthKey fail: ");
        }
        return new SoterCoreResult(7);
    }

    public void setTrebleServiceListener(SoterCoreTrebleServiceListener soterCoreTrebleServiceListener) {
        this.serviceListener = soterCoreTrebleServiceListener;
    }

    public void triggerTrebleServiceConnecting() {
        resetDisconnectCount();
        bindServiceIfNeeded();
    }

    public void unbindService() {
        if (this.hasBind) {
            try {
                this.mContext.unbindService(this.mServiceConnection);
            } catch (Exception e) {
                SLogger.printErrStackTrace(TAG, e, "");
            } catch (Throwable th) {
                this.hasBind = false;
                throw th;
            }
            this.hasBind = false;
        }
    }
}
