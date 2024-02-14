package com.fingerprints.service;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Log;
import com.fingerprints.service.IFingerprintClient;
import com.fingerprints.service.IFingerprintService;
import com.tencent.soter.core.model.ConstantsSoter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;

public class FingerprintManager {
    static final int ARG_IDENTIFY_UPDATED = 1;
    public static final int CAPTURE_FAILED_TOO_FAST = 1;
    public static final int DELETE_TEMPLATES_SUCCESS = 1;
    static final int FPC_GUIDE_DATA_INVALID = Integer.MIN_VALUE;
    static final int FPC_GUIDE_DIRECTION_E = 7;
    static final int FPC_GUIDE_DIRECTION_N = 5;
    static final int FPC_GUIDE_DIRECTION_NA = 0;
    static final int FPC_GUIDE_DIRECTION_NE = 6;
    static final int FPC_GUIDE_DIRECTION_NW = 4;
    static final int FPC_GUIDE_DIRECTION_S = 2;
    static final int FPC_GUIDE_DIRECTION_SE = 3;
    static final int FPC_GUIDE_DIRECTION_SW = 1;
    static final int FPC_GUIDE_DIRECTION_W = 8;
    static final int INTERNEL_FINGERDOWN_TIMEOUT = 3000;
    static final int MEG_FINGERDOWN_TIMEOUT = 26;
    public static final int MEG_WAIT_FINGERDOWN_TIMEOUT = 21;
    public static final int MSG_CAPTURE_FAILED = 19;
    public static final int MSG_DELETE_RESULT = 30;
    static final int MSG_ENROLMENT_DATA_IMAGE_QUALITY = 14;
    static final int MSG_ENROLMENT_DATA_IMAGE_STITCHED = 18;
    static final int MSG_ENROLMENT_DATA_IMMOBILE = 15;
    static final int MSG_ENROLMENT_DATA_NEXT_DIRECTION = 16;
    static final int MSG_ENROLMENT_DATA_PROGRESS = 17;
    static final int MSG_ENROLMENT_DONE = 5;
    static final int MSG_ENROLMENT_FAILED = 8;
    static final int MSG_ENROLMENT_LAST_TOUCH = 11;
    static final int MSG_ENROLMENT_MASK_LIST = 13;
    static final int MSG_ENROLMENT_NEXT_TOUCH = 12;
    static final int MSG_ENROLMENT_SEND_GUIDE_DATA = 10;
    static final int MSG_ENROLMENT_TOUCHES_QUALITY = 9;
    static final int MSG_ENROL_PROGRESS = 4;
    public static final int MSG_FINGER_PRESENT = 2;
    public static final int MSG_FINGER_UP = 3;
    public static final int MSG_IDENTIFY_MATCH = 6;
    public static final int MSG_IDENTIFY_NO_MATCH = 7;
    public static final int MSG_NOT_ENABLED = 22;
    public static final int MSG_NOT_ENROLLED = 20;
    public static final int MSG_SENSOR_ERROR = 25;
    public static final int MSG_UNKNOWN = 23;
    public static final int MSG_USER_CANCEL = 24;
    public static final int MSG_WAITING_FINGER = 1;
    /* access modifiers changed from: private */
    public static String TAG = "MzFingerManager";
    /* access modifiers changed from: private */
    public static Bundle mBundle;
    /* access modifiers changed from: private */
    public static Bundle mGuidedDataBundle;
    /* access modifiers changed from: private */
    public CaptureCallback mCaptureCallback;
    private IFingerprintClient mClient;
    /* access modifiers changed from: private */
    public DeleteTemplateCallback mDeleteTemplateCallback;
    /* access modifiers changed from: private */
    public EnrolCallback mEnrolCallback;
    /* access modifiers changed from: private */
    public EventHandler mEventhHandler;
    private GuidedDataCallback mGuidedDataCallback;
    /* access modifiers changed from: private */
    public IdentifyCallback mIdentifyCallback;
    /* access modifiers changed from: private */
    public IdentifyListener mIdentifyListener;
    /* access modifiers changed from: private */
    public boolean mReadyToStore = false;
    private IFingerprintService mService;
    /* access modifiers changed from: private */
    public int mUserdata = Integer.MIN_VALUE;
    HandlerThread mzHanderThread;

    public interface AlipayIdentifyCallback extends IdentifyCallback {
        void onCancel();
    }

    public interface CaptureCallback {
        void onCaptureCompleted();

        void onCaptureFailed(int i);

        void onInput();

        void onWaitingForInput();
    }

    public interface DeleteTemplateCallback {
        void onDeleteResult(boolean z);
    }

    public interface EnrolCallback {
        void onEnrolled(int i);

        void onEnrollmentFailed();

        void onFingerDownTimeOut();

        void onProgress(GuidedData guidedData);
    }

    private class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            String access$000 = FingerprintManager.TAG;
            Log.i(access$000, "Message     what  " + message.what);
            boolean z = false;
            switch (message.what) {
                case 1:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onWaitingForInput();
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onStatus(1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 2:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onInput();
                    }
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        sendMessageDelayed(obtainMessage(26), ConstantsSoter.FACEID_AUTH_CHECK_TIME);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onStatus(2, FingerprintManager.this.mUserdata);
                        removeMessages(21);
                        return;
                    }
                    return;
                case 3:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onCaptureCompleted();
                    }
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        removeMessages(26);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onStatus(3, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 4:
                    EnrolCallback unused = FingerprintManager.this.mEnrolCallback;
                    return;
                case 5:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.mEnrolCallback.onEnrolled(message.arg1);
                        if (FingerprintManager.this.mReadyToStore) {
                            boolean unused2 = FingerprintManager.this.mReadyToStore = false;
                            EnrolCallback unused3 = FingerprintManager.this.mEnrolCallback = null;
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    if (FingerprintManager.this.mIdentifyCallback != null) {
                        IdentifyCallback access$500 = FingerprintManager.this.mIdentifyCallback;
                        int i = message.arg1;
                        if (message.arg2 == 1) {
                            z = true;
                        }
                        access$500.onIdentified(i, z);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(6, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 7:
                    if (FingerprintManager.this.mIdentifyCallback != null) {
                        FingerprintManager.this.mIdentifyCallback.onNoMatch();
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(7, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 8:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.mEnrolCallback.onEnrollmentFailed();
                        return;
                    }
                    return;
                case 10:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.PackGuidedData();
                        return;
                    }
                    return;
                case 11:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putIntArray("lastTouch", message.getData().getIntArray("lastTouch"));
                        return;
                    }
                    return;
                case 12:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putIntArray("nextTouch", message.getData().getIntArray("nextTouch"));
                        return;
                    }
                    return;
                case 13:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putIntArray("maskList", message.getData().getIntArray("maskList"));
                        FingerprintManager.mGuidedDataBundle.putInt("maskNumber", message.arg1);
                        return;
                    }
                    return;
                case 14:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt("acceptance", message.arg1);
                        FingerprintManager.mGuidedDataBundle.putInt("reject_reason", message.arg2);
                        return;
                    }
                    return;
                case 15:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt("immobile", message.arg1);
                        return;
                    }
                    return;
                case 16:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt("next_direction", message.arg1);
                        return;
                    }
                    return;
                case 17:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt("progress", message.arg1);
                        if (message.arg1 == 100) {
                            boolean unused4 = FingerprintManager.this.mReadyToStore = true;
                            return;
                        }
                        return;
                    }
                    return;
                case 18:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.mGuidedDataBundle.putInt("stitched", message.arg1);
                        return;
                    }
                    return;
                case 19:
                    if (FingerprintManager.this.mCaptureCallback != null) {
                        FingerprintManager.this.mCaptureCallback.onCaptureFailed(message.arg1);
                    }
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(19, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 21:
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(21, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 24:
                    if (FingerprintManager.this.mIdentifyListener != null) {
                        FingerprintManager.this.mIdentifyListener.onResult(24, message.arg1, FingerprintManager.this.mUserdata);
                        return;
                    }
                    return;
                case 26:
                    if (FingerprintManager.this.mEnrolCallback != null) {
                        FingerprintManager.this.mEnrolCallback.onFingerDownTimeOut();
                        return;
                    }
                    return;
                case 30:
                    if (FingerprintManager.this.mDeleteTemplateCallback != null) {
                        String unused5 = FingerprintManager.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append(" MSG_DELETE_RESULT    msg.arg1:  ");
                        sb.append(message.arg1);
                        DeleteTemplateCallback access$900 = FingerprintManager.this.mDeleteTemplateCallback;
                        if (message.arg1 == 1) {
                            z = true;
                        }
                        access$900.onDeleteResult(z);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public class GuidedData {
        public GuidedRect guidedLastTouch;
        public GuidedMaskList guidedMaskList;
        public int guidedNextDirection;
        public GuidedRect guidedNextTouch;
        public int guidedProgress;
        public GuidedResult guidedResult;

        public GuidedData(int i, int i2, GuidedResult guidedResult2, GuidedRect guidedRect, GuidedRect guidedRect2, GuidedMaskList guidedMaskList2) {
            this.guidedProgress = i;
            this.guidedNextDirection = i2;
            this.guidedResult = guidedResult2;
            this.guidedLastTouch = guidedRect;
            this.guidedNextTouch = guidedRect2;
            this.guidedMaskList = guidedMaskList2;
        }
    }

    public interface GuidedDataCallback {
        void onImageQuality(int i, int i2);

        void onImageStitched(int i);

        void onImmobile(int i);

        void onLastTouch(int[] iArr);

        void onMaskList(int i, int[] iArr);

        void onNextDirection(int i);

        void onNextTouch(int[] iArr);

        void onProgressPercentage(int i);

        void onSendGuideData();
    }

    public class GuidedMaskList {
        public ArrayList<GuidedRect> guidedMaskList;
        public int guidedNumberOfMask;

        public GuidedMaskList(ArrayList<GuidedRect> arrayList, int i) {
            this.guidedMaskList = arrayList;
            this.guidedNumberOfMask = i;
        }
    }

    public class GuidedRect {
        public Point guidedBottomLeft;
        public Point guidedBottomRight;
        public Point guidedTopLeft;
        public Point guidedTopRight;

        public GuidedRect(Point point, Point point2, Point point3, Point point4) {
            this.guidedBottomLeft = point;
            this.guidedBottomRight = point2;
            this.guidedTopLeft = point3;
            this.guidedTopRight = point4;
        }
    }

    public class GuidedRejectReasons {
        public boolean guidedLowCoverage;
        public boolean guidedLowQuality;

        public GuidedRejectReasons(boolean z, boolean z2) {
            this.guidedLowCoverage = z;
            this.guidedLowQuality = z2;
        }
    }

    public class GuidedResult {
        public int guidedAcceptance;
        public boolean guidedImmobile;
        public GuidedRejectReasons guidedRejectReasons;
        public boolean guidedStitched;

        public GuidedResult(int i, boolean z, boolean z2, GuidedRejectReasons guidedRejectReasons2) {
            this.guidedAcceptance = i;
            this.guidedStitched = z;
            this.guidedImmobile = z2;
            this.guidedRejectReasons = guidedRejectReasons2;
        }
    }

    public interface IdentifyCallback {
        void onIdentified(int i, boolean z);

        void onNoMatch();
    }

    public interface IdentifyListener {
        void onResult(int i, int i2, int i3);

        void onStatus(int i, int i2);
    }

    private FingerprintManager(IBinder iBinder, Looper looper) throws RemoteException {
        this.mService = IFingerprintService.Stub.asInterface(iBinder);
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("result_handler");
            this.mzHanderThread = handlerThread;
            handlerThread.start();
            looper = this.mzHanderThread.getLooper();
        }
        String str = TAG;
        Log.e(str, "get fp method time, mService = " + this.mService);
        EventHandler eventHandler = new EventHandler(looper);
        mBundle = new Bundle();
        mGuidedDataBundle = new Bundle();
        C68321 r4 = new IFingerprintClient.Stub() {
            public void onBundleMessage(int i, int i2, int i3, Bundle bundle) throws RemoteException {
                Message obtainMessage = FingerprintManager.this.mEventhHandler.obtainMessage(i, i2, i3);
                obtainMessage.setData(bundle);
                FingerprintManager.this.mEventhHandler.sendMessage(obtainMessage);
            }

            public void onBundleMessage2(int i, int i2, int[] iArr) throws RemoteException {
                Message obtainMessage = FingerprintManager.this.mEventhHandler.obtainMessage(i, i2, 0);
                switch (i) {
                    case 11:
                        FingerprintManager.mBundle.putIntArray("lastTouch", iArr);
                        obtainMessage.setData(FingerprintManager.mBundle);
                        break;
                    case 12:
                        FingerprintManager.mBundle.putIntArray("nextTouch", iArr);
                        obtainMessage.setData(FingerprintManager.mBundle);
                        break;
                    case 13:
                        FingerprintManager.mBundle.putIntArray("maskList", iArr);
                        FingerprintManager.mBundle.putInt("maskNumber", i2);
                        obtainMessage.setData(FingerprintManager.mBundle);
                        break;
                }
                FingerprintManager.this.mEventhHandler.sendMessage(obtainMessage);
            }

            public void onMessage(int i, int i2, int i3) throws RemoteException {
                String access$000 = FingerprintManager.TAG;
                Log.i(access$000, " onMessage--------what  " + i);
                FingerprintManager.this.mEventhHandler.sendMessage(FingerprintManager.this.mEventhHandler.obtainMessage(i, i2, i3));
            }
        };
        this.mClient = r4;
        IFingerprintService iFingerprintService = this.mService;
        if (iFingerprintService == null || !iFingerprintService.open(r4)) {
            throw new RuntimeException();
        }
        this.mEventhHandler = eventHandler;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0139 A[LOOP:0: B:19:0x0137->B:20:0x0139, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void PackGuidedData() {
        /*
            r19 = this;
            r8 = r19
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "progress"
            int r6 = r0.getInt(r1)
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "next_direction"
            int r7 = r0.getInt(r1)
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "acceptance"
            int r2 = r0.getInt(r1)
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "stitched"
            int r0 = r0.getInt(r1)
            r9 = 0
            r10 = 1
            if (r0 != 0) goto L_0x0028
            r3 = 0
            goto L_0x0029
        L_0x0028:
            r3 = 1
        L_0x0029:
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "immobile"
            int r0 = r0.getInt(r1)
            if (r0 != 0) goto L_0x0035
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "reject_reason"
            int r0 = r0.getInt(r1)
            android.os.Bundle r1 = mGuidedDataBundle
            java.lang.String r5 = "maskNumber"
            int r11 = r1.getInt(r5)
            if (r0 == r10) goto L_0x0055
            r1 = 16
            if (r0 == r1) goto L_0x0053
            r1 = 17
            if (r0 == r1) goto L_0x0055
            r0 = 0
        L_0x0051:
            r1 = 0
            goto L_0x0057
        L_0x0053:
            r0 = 1
            goto L_0x0051
        L_0x0055:
            r0 = 0
            r1 = 1
        L_0x0057:
            com.fingerprints.service.FingerprintManager$GuidedRejectReasons r5 = new com.fingerprints.service.FingerprintManager$GuidedRejectReasons
            r5.<init>(r0, r1)
            com.fingerprints.service.FingerprintManager$GuidedResult r12 = new com.fingerprints.service.FingerprintManager$GuidedResult
            r0 = r12
            r1 = r19
            r0.<init>(r2, r3, r4, r5)
            android.graphics.Point r2 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "lastTouch"
            int[] r0 = r0.getIntArray(r1)
            r0 = r0[r9]
            android.os.Bundle r3 = mGuidedDataBundle
            int[] r3 = r3.getIntArray(r1)
            r3 = r3[r10]
            r2.<init>(r0, r3)
            android.graphics.Point r3 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            int[] r0 = r0.getIntArray(r1)
            r4 = 2
            r0 = r0[r4]
            android.os.Bundle r5 = mGuidedDataBundle
            int[] r5 = r5.getIntArray(r1)
            r13 = 3
            r5 = r5[r13]
            r3.<init>(r0, r5)
            android.graphics.Point r5 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            int[] r0 = r0.getIntArray(r1)
            r14 = 4
            r0 = r0[r14]
            android.os.Bundle r15 = mGuidedDataBundle
            int[] r15 = r15.getIntArray(r1)
            r16 = 5
            r15 = r15[r16]
            r5.<init>(r0, r15)
            android.graphics.Point r15 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            int[] r0 = r0.getIntArray(r1)
            r17 = 6
            r0 = r0[r17]
            android.os.Bundle r14 = mGuidedDataBundle
            int[] r1 = r14.getIntArray(r1)
            r14 = 7
            r1 = r1[r14]
            r15.<init>(r0, r1)
            android.graphics.Point r1 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r14 = "nextTouch"
            int[] r0 = r0.getIntArray(r14)
            r0 = r0[r9]
            android.os.Bundle r9 = mGuidedDataBundle
            int[] r9 = r9.getIntArray(r14)
            r9 = r9[r10]
            r1.<init>(r0, r9)
            android.graphics.Point r9 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            int[] r0 = r0.getIntArray(r14)
            r0 = r0[r4]
            android.os.Bundle r4 = mGuidedDataBundle
            int[] r4 = r4.getIntArray(r14)
            r4 = r4[r13]
            r9.<init>(r0, r4)
            android.graphics.Point r10 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            int[] r0 = r0.getIntArray(r14)
            r4 = 4
            r0 = r0[r4]
            android.os.Bundle r4 = mGuidedDataBundle
            int[] r4 = r4.getIntArray(r14)
            r4 = r4[r16]
            r10.<init>(r0, r4)
            android.graphics.Point r13 = new android.graphics.Point
            android.os.Bundle r0 = mGuidedDataBundle
            int[] r0 = r0.getIntArray(r14)
            r0 = r0[r17]
            android.os.Bundle r4 = mGuidedDataBundle
            int[] r4 = r4.getIntArray(r14)
            r14 = 7
            r4 = r4[r14]
            r13.<init>(r0, r4)
            com.fingerprints.service.FingerprintManager$GuidedRect r14 = new com.fingerprints.service.FingerprintManager$GuidedRect
            r0 = r14
            r16 = r1
            r1 = r19
            r4 = r5
            r5 = r15
            r0.<init>(r2, r3, r4, r5)
            com.fingerprints.service.FingerprintManager$GuidedRect r15 = new com.fingerprints.service.FingerprintManager$GuidedRect
            r0 = r15
            r2 = r16
            r3 = r9
            r4 = r10
            r5 = r13
            r0.<init>(r2, r3, r4, r5)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
        L_0x0137:
            if (r10 >= r11) goto L_0x01bf
            android.os.Bundle r0 = mGuidedDataBundle
            java.lang.String r1 = "maskList"
            int[] r0 = r0.getIntArray(r1)
            int r2 = r10 * 8
            int r3 = r2 + 0
            r0 = r0[r3]
            android.os.Bundle r3 = mGuidedDataBundle
            int[] r3 = r3.getIntArray(r1)
            int r4 = r2 + 1
            r3 = r3[r4]
            android.os.Bundle r4 = mGuidedDataBundle
            int[] r4 = r4.getIntArray(r1)
            int r5 = r2 + 2
            r4 = r4[r5]
            android.os.Bundle r5 = mGuidedDataBundle
            int[] r5 = r5.getIntArray(r1)
            int r13 = r2 + 3
            r5 = r5[r13]
            android.os.Bundle r13 = mGuidedDataBundle
            int[] r13 = r13.getIntArray(r1)
            int r16 = r2 + 4
            r13 = r13[r16]
            r16 = r15
            android.os.Bundle r15 = mGuidedDataBundle
            int[] r15 = r15.getIntArray(r1)
            int r17 = r2 + 5
            r15 = r15[r17]
            r17 = r14
            android.os.Bundle r14 = mGuidedDataBundle
            int[] r14 = r14.getIntArray(r1)
            int r18 = r2 + 6
            r14 = r14[r18]
            r18 = r12
            android.os.Bundle r12 = mGuidedDataBundle
            int[] r1 = r12.getIntArray(r1)
            r12 = 7
            int r2 = r2 + r12
            r1 = r1[r2]
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r13, r15)
            android.graphics.Point r13 = new android.graphics.Point
            r13.<init>(r14, r1)
            android.graphics.Point r14 = new android.graphics.Point
            r14.<init>(r0, r3)
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r4, r5)
            com.fingerprints.service.FingerprintManager$GuidedRect r15 = new com.fingerprints.service.FingerprintManager$GuidedRect
            r0 = r15
            r1 = r19
            r4 = r2
            r2 = r14
            r5 = r13
            r0.<init>(r2, r3, r4, r5)
            r9.add(r15)
            int r10 = r10 + 1
            r15 = r16
            r14 = r17
            r12 = r18
            goto L_0x0137
        L_0x01bf:
            r18 = r12
            r17 = r14
            r16 = r15
            com.fingerprints.service.FingerprintManager$GuidedMaskList r10 = new com.fingerprints.service.FingerprintManager$GuidedMaskList
            r10.<init>(r9, r11)
            com.fingerprints.service.FingerprintManager$GuidedData r9 = new com.fingerprints.service.FingerprintManager$GuidedData
            r0 = r9
            r1 = r19
            r2 = r6
            r3 = r7
            r4 = r18
            r5 = r17
            r6 = r16
            r7 = r10
            r0.<init>(r2, r3, r4, r5, r6, r7)
            com.fingerprints.service.FingerprintManager$EnrolCallback r0 = r8.mEnrolCallback
            r0.onProgress(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fingerprints.service.FingerprintManager.PackGuidedData():void");
    }

    public static void notifyScreenOff() {
        try {
            String str = TAG;
            Log.i(str, " notifyScreenOff--------  " + Thread.currentThread().hashCode());
            IBinder service = ServiceManager.getService("fingerprints_service");
            if (service != null) {
                IFingerprintService.Stub.asInterface(service).notifyScreenOff();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void notifyScreenOn() {
        try {
            String str = TAG;
            Log.i(str, " notifyScreenOn--------  " + Thread.currentThread().hashCode());
            IBinder service = ServiceManager.getService("fingerprints_service");
            if (service != null) {
                IFingerprintService.Stub.asInterface(service).notifyScreenOn();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static FingerprintManager open() {
        try {
            return new FingerprintManager((IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", new Class[]{String.class}).invoke((Object) null, new Object[]{"fingerprints_service"}), Looper.myLooper());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return null;
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return null;
        } catch (RuntimeException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public void abort() {
        try {
            this.mService.cancel(this.mClient);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void deleteFingerData(DeleteTemplateCallback deleteTemplateCallback, int[] iArr) {
        if (deleteTemplateCallback != null) {
            this.mDeleteTemplateCallback = deleteTemplateCallback;
            try {
                this.mService.removeData(this.mClient, iArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public int[] getIds() {
        try {
            Log.i(TAG, "getIds      ");
            return this.mService.getIds(this.mClient);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isFingerEnable() {
        try {
            return this.mService.isFingerEnable();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSurpport() {
        try {
            return this.mService.isSurpport();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void release() {
        Log.i(TAG, " release--------              ");
        if (this.mzHanderThread != null) {
            Log.i(TAG, " release--------  mzHanderThread");
            this.mzHanderThread.quit();
            this.mzHanderThread = null;
        }
        try {
            this.mService.release(this.mClient);
            if (this.mCaptureCallback != null) {
                this.mCaptureCallback = null;
            }
            if (this.mEnrolCallback != null && !this.mReadyToStore) {
                this.mEnrolCallback = null;
            }
            if (this.mIdentifyCallback != null) {
                this.mIdentifyCallback = null;
            }
            this.mIdentifyListener = null;
            this.mClient = null;
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setCaptureCallback(CaptureCallback captureCallback) {
        this.mCaptureCallback = captureCallback;
    }

    public void shouldRestartByScreenOn() {
        try {
            String str = TAG;
            Log.i(str, " shouldRestartByScreenOn--------  " + Thread.currentThread().hashCode());
            this.mService.shouldRestartByScreenOn(this.mClient);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void startEnrol(EnrolCallback enrolCallback, int i) {
        Objects.requireNonNull(enrolCallback);
        this.mEnrolCallback = enrolCallback;
        try {
            this.mService.startGuidedEnrol(this.mClient, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void startIdentify(IdentifyCallback identifyCallback, int[] iArr) {
        if (iArr != null && identifyCallback != null) {
            this.mIdentifyCallback = identifyCallback;
            try {
                this.mService.startIdentify(this.mClient, iArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean updateTA(String str) {
        try {
            return this.mService.updateTA(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void startIdentify(IdentifyListener identifyListener, int[] iArr, int i, int i2) {
        if (iArr == null || identifyListener == null) {
            throw null;
        }
        this.mIdentifyListener = identifyListener;
        this.mUserdata = i2;
        String str = TAG;
        Log.i(str, " startIdentify--------  " + iArr[0]);
        if (i > 0) {
            EventHandler eventHandler = this.mEventhHandler;
            eventHandler.sendMessageDelayed(eventHandler.obtainMessage(21, -1, i2), (long) i);
        }
        try {
            this.mService.startIdentify(this.mClient, iArr);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
