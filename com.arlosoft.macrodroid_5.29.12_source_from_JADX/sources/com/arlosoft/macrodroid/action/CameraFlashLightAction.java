package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.TorchActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7784l;
import p148q0.C8151a;

public class CameraFlashLightAction extends Action {
    public static final Parcelable.Creator<CameraFlashLightAction> CREATOR = new C2344b();
    private static Camera s_camera = null;
    private static boolean s_cameraLightOn = false;
    /* access modifiers changed from: private */
    public transient boolean ignoreCallback;
    private boolean m_launchForeground;
    /* access modifiers changed from: private */
    public int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.CameraFlashLightAction$a */
    class C2343a extends CameraManager.TorchCallback {

        /* renamed from: a */
        final /* synthetic */ CameraManager f7154a;

        /* renamed from: b */
        final /* synthetic */ TriggerContextInfo f7155b;

        C2343a(CameraManager cameraManager, TriggerContextInfo triggerContextInfo) {
            this.f7154a = cameraManager;
            this.f7155b = triggerContextInfo;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:(3:3|4|(1:6))|7|(1:(1:13)(1:14))(1:15)|16|17|18|19|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h("Failed to set torch mode, trying legacy mechanism: " + r5.toString(), r4.f7156c.mo27840Y0().longValue());
            com.arlosoft.macrodroid.action.CameraFlashLightAction.m9889o3(r4.f7156c, r4.f7155b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
            p148q0.C8151a.m33873n(r5);
            p112j2.C7439d0.m30909o0(r4.f7156c.mo27827K0(), "android.permission.CAMERA", r4.f7156c.mo25559a1(), true, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h("Could not access camera flash", r4.f7156c.mo27840Y0().longValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTorchModeChanged(@androidx.annotation.NonNull java.lang.String r5, boolean r6) {
            /*
                r4 = this;
                super.onTorchModeChanged(r5, r6)
                com.arlosoft.macrodroid.action.CameraFlashLightAction r0 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this
                boolean r0 = r0.ignoreCallback
                if (r0 == 0) goto L_0x000c
                return
            L_0x000c:
                android.hardware.camera2.CameraManager r0 = r4.f7154a     // Catch:{ Exception -> 0x0021 }
                android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r5)     // Catch:{ Exception -> 0x0021 }
                android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ Exception -> 0x0021 }
                java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0021 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0021 }
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x0021 }
                if (r0 != 0) goto L_0x0021
                return
            L_0x0021:
                com.arlosoft.macrodroid.action.CameraFlashLightAction r0 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this
                int r0 = r0.m_state
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0034
                if (r0 == r2) goto L_0x0030
                r3 = 2
                if (r0 == r3) goto L_0x0032
            L_0x0030:
                r6 = 0
                goto L_0x0035
            L_0x0032:
                r6 = r6 ^ r2
                goto L_0x0035
            L_0x0034:
                r6 = 1
            L_0x0035:
                com.arlosoft.macrodroid.action.CameraFlashLightAction r0 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this     // Catch:{ IllegalArgumentException -> 0x003f }
                boolean unused = r0.ignoreCallback = r2     // Catch:{ IllegalArgumentException -> 0x003f }
                android.hardware.camera2.CameraManager r0 = r4.f7154a     // Catch:{ IllegalArgumentException -> 0x003f }
                r0.unregisterTorchCallback(r4)     // Catch:{ IllegalArgumentException -> 0x003f }
            L_0x003f:
                android.hardware.camera2.CameraManager r0 = r4.f7154a     // Catch:{ CameraAccessException -> 0x0086, SecurityException -> 0x0070, Exception -> 0x0045 }
                r0.setTorchMode(r5, r6)     // Catch:{ CameraAccessException -> 0x0086, SecurityException -> 0x0070, Exception -> 0x0045 }
                goto L_0x0095
            L_0x0045:
                r5 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Failed to set torch mode, trying legacy mechanism: "
                r6.append(r0)
                java.lang.String r5 = r5.toString()
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.arlosoft.macrodroid.action.CameraFlashLightAction r6 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this
                java.lang.Long r6 = r6.mo27840Y0()
                long r0 = r6.longValue()
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r5, r0)
                com.arlosoft.macrodroid.action.CameraFlashLightAction r5 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r4.f7155b
                r5.m9893s3(r6)
                goto L_0x0095
            L_0x0070:
                r5 = move-exception
                p148q0.C8151a.m33873n(r5)
                com.arlosoft.macrodroid.action.CameraFlashLightAction r5 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this
                android.content.Context r5 = r5.mo27827K0()
                com.arlosoft.macrodroid.action.CameraFlashLightAction r6 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this
                java.lang.String r6 = r6.mo25559a1()
                java.lang.String r0 = "android.permission.CAMERA"
                p112j2.C7439d0.m30909o0(r5, r0, r6, r2, r1)
                goto L_0x0095
            L_0x0086:
                com.arlosoft.macrodroid.action.CameraFlashLightAction r5 = com.arlosoft.macrodroid.action.CameraFlashLightAction.this
                java.lang.Long r5 = r5.mo27840Y0()
                long r5 = r5.longValue()
                java.lang.String r0 = "Could not access camera flash"
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r5)
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.CameraFlashLightAction.C2343a.onTorchModeChanged(java.lang.String, boolean):void");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.CameraFlashLightAction$b */
    class C2344b implements Parcelable.Creator<CameraFlashLightAction> {
        C2344b() {
        }

        /* renamed from: a */
        public CameraFlashLightAction createFromParcel(Parcel parcel) {
            return new CameraFlashLightAction(parcel, (C2343a) null);
        }

        /* renamed from: b */
        public CameraFlashLightAction[] newArray(int i) {
            return new CameraFlashLightAction[i];
        }
    }

    /* synthetic */ CameraFlashLightAction(Parcel parcel, C2343a aVar) {
        this(parcel);
    }

    /* renamed from: p3 */
    private String[] m9890p3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_camera_flash_light_light_on), MacroDroidApplication.m14845u().getString(C17541R$string.action_camera_flash_light_light_off), MacroDroidApplication.m14845u().getString(C17541R$string.action_camera_flash_light_light_toggle)};
    }

    /* renamed from: q3 */
    private String[] m9891q3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_camera_flash_light_background), MacroDroidApplication.m14845u().getString(C17541R$string.action_camera_flash_light_foreground)};
    }

    /* renamed from: r3 */
    private void m9892r3(TriggerContextInfo triggerContextInfo) {
        CameraManager cameraManager = (CameraManager) mo27827K0().getSystemService("camera");
        this.ignoreCallback = false;
        try {
            cameraManager.registerTorchCallback(new C2343a(cameraManager, triggerContextInfo), (Handler) null);
        } catch (Exception e) {
            C4878b.m18869h("Failed to set torch mode, tring legacy mechanism: " + e.toString(), mo27840Y0().longValue());
            m9893s3(triggerContextInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public synchronized void m9893s3(TriggerContextInfo triggerContextInfo) {
        boolean z;
        boolean z2;
        int i = this.m_state;
        if (i == 0) {
            z = true;
        } else if (i == 1 || i != 2) {
            z = false;
        } else {
            if (this.m_launchForeground) {
                z2 = TorchActivity.m13999M1();
            } else {
                z2 = s_cameraLightOn;
            }
            z = !z2;
        }
        if (this.m_launchForeground) {
            if (z) {
                Intent intent = new Intent(mo27827K0(), TorchActivity.class);
                intent.addFlags(268435456);
                mo27827K0().startActivity(intent);
            } else {
                TorchActivity.m14000N1();
            }
        } else if (z) {
            try {
                if (!s_cameraLightOn) {
                    if (s_camera == null) {
                        s_camera = Camera.open();
                    }
                    s_cameraLightOn = true;
                    Camera.Parameters parameters = s_camera.getParameters();
                    parameters.setFlashMode("torch");
                    s_camera.setParameters(parameters);
                    s_camera.startPreview();
                }
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Error enabling camera flash light: " + e.getMessage()));
            }
        } else if (s_cameraLightOn) {
            if (s_camera == null) {
                s_camera = Camera.open();
            }
            s_cameraLightOn = false;
            s_camera.stopPreview();
            s_camera.release();
            s_camera = null;
        }
        return;
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m9894t3(DialogInterface dialogInterface, int i) {
        this.m_state = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m9895u3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_launchForeground ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m9890p3()[this.m_state];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m9891q3()[this.m_launchForeground];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7784l.m32502u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (Build.VERSION.SDK_INT >= 23) {
            m9892r3(triggerContextInfo);
        } else {
            m9893s3(triggerContextInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9891q3();
    }

    /* renamed from: v2 */
    public void mo24677v2() {
        String j1 = SelectableItem.m15535j1(C17541R$string.select_option);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) j1);
        builder.setSingleChoiceItems((CharSequence[]) m9890p3(), this.m_state, (DialogInterface.OnClickListener) new C3611y0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3584x0(this));
        builder.create().show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
        parcel.writeInt(this.m_launchForeground ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.m_launchForeground = z;
    }

    public CameraFlashLightAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CameraFlashLightAction() {
        this.m_launchForeground = false;
    }

    private CameraFlashLightAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
        this.m_launchForeground = parcel.readInt() == 0;
    }
}
