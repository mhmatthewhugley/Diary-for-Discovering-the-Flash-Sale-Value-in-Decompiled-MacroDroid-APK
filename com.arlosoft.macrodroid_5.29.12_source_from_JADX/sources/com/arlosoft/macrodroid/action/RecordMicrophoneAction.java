package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.io.File;
import p057a2.C2214c;
import p057a2.C2224m;
import p112j2.C7439d0;
import p128m0.C7854u2;
import p148q0.C8151a;
import p156r2.C8194a;
import p319lc.C15626c;

public class RecordMicrophoneAction extends Action implements C2224m, C2214c {
    private static final int CANCEL_RECORDING = -2;
    public static final Parcelable.Creator<RecordMicrophoneAction> CREATOR = new C2604b();
    private static final int PICKER_ID_SAF = 9876;
    private static final int RECORDING_FORMAT_3GPP = 0;
    private static final int RECORDING_FORMAT_AAC = 2;
    private static final int RECORDING_FORMAT_MPEG4 = 1;
    private static final int RECORD_UNTIL_CANCELLED = -1;
    private static final int SOURCE_CAMCORDER = 1;
    private static final int SOURCE_MIC_STANDARD = 0;
    private static final int SOURCE_UNPROCESSED = 2;
    private static MediaRecorder s_mediaRecorder;
    private static PendingIntent s_pendingIntent;
    private static final int[] s_recordTimes = {30, 60, 120, 300, 600, PathInterpolatorCompat.MAX_NUM_POINTS, 6000, -1, -2};
    private static boolean s_recordingInProgress = false;
    private static final Object s_recordingLock = new Object();
    private static final String[] s_recordingOptions = {"3GPP", "MPEG4", "AAC"};
    private static PowerManager.WakeLock s_wakeLock;
    private String customFilename;
    private transient TextView dirText;
    private String m_path;
    private String m_recordTimeString;
    private int m_recordingFormat;
    private int m_secondsToRecordFor;
    private String pathName;
    private String pathUri;
    private int source;
    private transient String temporaryPathName;

    /* renamed from: com.arlosoft.macrodroid.action.RecordMicrophoneAction$a */
    class C2603a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7482a;

        /* renamed from: c */
        final /* synthetic */ RadioButton f7483c;

        /* renamed from: d */
        final /* synthetic */ EditText f7484d;

        C2603a(Button button, RadioButton radioButton, EditText editText) {
            this.f7482a = button;
            this.f7483c = radioButton;
            this.f7484d = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7482a.setEnabled(this.f7483c.isChecked() || this.f7484d.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.RecordMicrophoneAction$b */
    class C2604b implements Parcelable.Creator<RecordMicrophoneAction> {
        C2604b() {
        }

        /* renamed from: a */
        public RecordMicrophoneAction createFromParcel(Parcel parcel) {
            return new RecordMicrophoneAction(parcel, (C2603a) null);
        }

        /* renamed from: b */
        public RecordMicrophoneAction[] newArray(int i) {
            return new RecordMicrophoneAction[i];
        }
    }

    /* synthetic */ RecordMicrophoneAction(Parcel parcel, C2603a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m12005A3(DialogInterface dialogInterface, int i) {
        this.m_recordingFormat = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m12006B3(DialogInterface dialogInterface, int i) {
        m12030v3();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m12007C3(View view) {
        m12028t3();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m12008D3(ViewGroup viewGroup, Button button, EditText editText, CompoundButton compoundButton, boolean z) {
        boolean z2 = false;
        viewGroup.setVisibility(z ? 0 : 8);
        if (!z || editText.getText().length() > 0) {
            z2 = true;
        }
        button.setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m12009E3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m12010F3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m12011G3(RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog, View view) {
        String str = this.temporaryPathName;
        if (str == null && this.m_path == null) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.action_write_to_file_select_folder, 1).show();
            return;
        }
        this.pathName = str;
        if (radioButton.isChecked()) {
            this.customFilename = editText.getText().toString();
        } else {
            this.customFilename = null;
        }
        appCompatDialog.dismiss();
        this.m_path = null;
        this.dirText = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m12012H3(AppCompatDialog appCompatDialog, View view) {
        this.dirText = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m12013I3(DialogInterface dialogInterface, int i) {
        this.source = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m12014J3(DialogInterface dialogInterface, int i) {
        m12029u3();
    }

    /* renamed from: K3 */
    private void m12015K3(String str) {
        C4878b.m18869h("Error - could not write to file: " + str + ". Need to re-select path and grant access.", mo27840Y0().longValue());
        C8194a.m34000a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.please_reconfigure_record_microphone_action_to_set_new_file_path), mo27837X0().getName());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:49|50|51|52|55|56|(1:58)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0148 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0152 A[Catch:{ Exception -> 0x01e9 }] */
    /* renamed from: L3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12016L3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r12) {
        /*
            r11 = this;
            java.lang.Object r0 = s_recordingLock
            monitor-enter(r0)
            boolean r1 = s_recordingInProgress     // Catch:{ all -> 0x0270 }
            r2 = 0
            if (r1 == 0) goto L_0x0035
            android.media.MediaRecorder r1 = s_mediaRecorder     // Catch:{ Exception -> 0x001a }
            r1.stop()     // Catch:{ Exception -> 0x001a }
            android.media.MediaRecorder r1 = s_mediaRecorder     // Catch:{ Exception -> 0x001a }
            r1.reset()     // Catch:{ Exception -> 0x001a }
            android.media.MediaRecorder r1 = s_mediaRecorder     // Catch:{ Exception -> 0x001a }
            r1.release()     // Catch:{ Exception -> 0x001a }
            s_recordingInProgress = r2     // Catch:{ Exception -> 0x001a }
            goto L_0x0035
        L_0x001a:
            r1 = move-exception
            java.lang.String r3 = r11.m_classType     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r4.<init>()     // Catch:{ all -> 0x0270 }
            java.lang.String r5 = "Exception trying to stop audio recording: "
            r4.append(r5)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0270 }
            r4.append(r1)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0270 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0270 }
        L_0x0035:
            android.media.MediaRecorder r1 = new android.media.MediaRecorder     // Catch:{ Exception -> 0x003d }
            r1.<init>()     // Catch:{ Exception -> 0x003d }
            s_mediaRecorder = r1     // Catch:{ Exception -> 0x003d }
            goto L_0x0058
        L_0x003d:
            r1 = move-exception
            java.lang.String r3 = r11.m_classType     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r4.<init>()     // Catch:{ all -> 0x0270 }
            java.lang.String r5 = "Unable to initialize media recorder: "
            r4.append(r5)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0270 }
            r4.append(r1)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0270 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0270 }
        L_0x0058:
            r1 = 1
            int r3 = r11.source     // Catch:{ Exception -> 0x0254 }
            r4 = 2
            if (r3 == 0) goto L_0x007e
            if (r3 == r1) goto L_0x0077
            if (r3 == r4) goto L_0x0063
            goto L_0x0083
        L_0x0063:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0254 }
            r5 = 24
            if (r3 < r5) goto L_0x0071
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ Exception -> 0x0254 }
            r5 = 9
            r3.setAudioSource(r5)     // Catch:{ Exception -> 0x0254 }
            goto L_0x0083
        L_0x0071:
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ Exception -> 0x0254 }
            r3.setAudioSource(r2)     // Catch:{ Exception -> 0x0254 }
            goto L_0x0083
        L_0x0077:
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ Exception -> 0x0254 }
            r5 = 5
            r3.setAudioSource(r5)     // Catch:{ Exception -> 0x0254 }
            goto L_0x0083
        L_0x007e:
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ Exception -> 0x0254 }
            r3.setAudioSource(r1)     // Catch:{ Exception -> 0x0254 }
        L_0x0083:
            int r3 = r11.m_recordingFormat     // Catch:{ all -> 0x0270 }
            if (r3 != 0) goto L_0x0094
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setOutputFormat(r1)     // Catch:{ all -> 0x0270 }
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setAudioEncoder(r1)     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = ".3gp"
            goto L_0x00cb
        L_0x0094:
            r5 = 44100(0xac44, float:6.1797E-41)
            r6 = 96000(0x17700, float:1.34525E-40)
            r7 = 3
            if (r3 != r1) goto L_0x00b4
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setOutputFormat(r4)     // Catch:{ all -> 0x0270 }
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setAudioEncoder(r7)     // Catch:{ all -> 0x0270 }
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setAudioEncodingBitRate(r6)     // Catch:{ all -> 0x0270 }
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setAudioSamplingRate(r5)     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = ".mp4"
            goto L_0x00cb
        L_0x00b4:
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r4 = 6
            r3.setOutputFormat(r4)     // Catch:{ all -> 0x0270 }
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setAudioEncoder(r7)     // Catch:{ all -> 0x0270 }
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setAudioEncodingBitRate(r6)     // Catch:{ all -> 0x0270 }
            android.media.MediaRecorder r3 = s_mediaRecorder     // Catch:{ all -> 0x0270 }
            r3.setAudioSamplingRate(r5)     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = ".aac"
        L_0x00cb:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0270 }
            java.lang.String r5 = r11.m12034z3()     // Catch:{ all -> 0x0270 }
            r4.<init>(r5)     // Catch:{ all -> 0x0270 }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x0270 }
            if (r5 != 0) goto L_0x00dd
            r4.mkdirs()     // Catch:{ all -> 0x0270 }
        L_0x00dd:
            java.lang.String r5 = ""
            android.content.Context r6 = r11.mo27827K0()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r7 = "alarm"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ Exception -> 0x01e9 }
            android.app.AlarmManager r6 = (android.app.AlarmManager) r6     // Catch:{ Exception -> 0x01e9 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r8 = "yyyy-MM-dd_HH-mm-ss"
            r7.<init>(r8)     // Catch:{ Exception -> 0x01e9 }
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x01e9 }
            r8.<init>()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r7 = r7.format(r8)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r8 = r11.customFilename     // Catch:{ Exception -> 0x01e9 }
            if (r8 == 0) goto L_0x010f
            android.content.Context r7 = r11.mo27827K0()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r8 = r11.customFilename     // Catch:{ Exception -> 0x01e9 }
            com.arlosoft.macrodroid.macro.Macro r9 = r11.mo27837X0()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r12 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r7, r8, r12, r9)     // Catch:{ Exception -> 0x01e9 }
            r5 = r12
            goto L_0x0110
        L_0x010f:
            r5 = r7
        L_0x0110:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e9 }
            r12.<init>()     // Catch:{ Exception -> 0x01e9 }
            r12.append(r5)     // Catch:{ Exception -> 0x01e9 }
            r12.append(r3)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r7 = r11.m_path     // Catch:{ Exception -> 0x01e9 }
            r8 = 0
            if (r7 == 0) goto L_0x0156
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0147 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r9.<init>()     // Catch:{ Exception -> 0x0147 }
            r9.append(r4)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r4 = "/"
            r9.append(r4)     // Catch:{ Exception -> 0x0147 }
            r9.append(r12)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x0147 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0147 }
            android.media.MediaRecorder r4 = s_mediaRecorder     // Catch:{ Exception -> 0x0148 }
            java.lang.String r9 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x0148 }
            r4.setOutputFile(r9)     // Catch:{ Exception -> 0x0148 }
            goto L_0x0191
        L_0x0147:
            r7 = r8
        L_0x0148:
            androidx.documentfile.provider.DocumentFile r4 = androidx.documentfile.provider.DocumentFile.fromFile(r7)     // Catch:{ Exception -> 0x01e9 }
            boolean r4 = r4.canWrite()     // Catch:{ Exception -> 0x01e9 }
            if (r4 != 0) goto L_0x0191
            r11.m12015K3(r12)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0191
        L_0x0156:
            java.lang.String r4 = r11.pathUri     // Catch:{ Exception -> 0x01e9 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x01e9 }
            android.content.Context r7 = r11.mo27827K0()     // Catch:{ Exception -> 0x01e9 }
            androidx.documentfile.provider.DocumentFile r4 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r7, r4)     // Catch:{ Exception -> 0x01e9 }
            androidx.documentfile.provider.DocumentFile r7 = r4.findFile(r12)     // Catch:{ Exception -> 0x01e9 }
            if (r7 != 0) goto L_0x0170
            java.lang.String r7 = "application/custom"
            androidx.documentfile.provider.DocumentFile r7 = r4.createFile(r7, r12)     // Catch:{ Exception -> 0x01e9 }
        L_0x0170:
            if (r7 != 0) goto L_0x0176
            r11.m12015K3(r12)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0191
        L_0x0176:
            android.content.Context r12 = r11.mo27827K0()     // Catch:{ Exception -> 0x01e9 }
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch:{ Exception -> 0x01e9 }
            android.net.Uri r4 = r7.getUri()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r7 = "rw"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r4, r7)     // Catch:{ Exception -> 0x01e9 }
            java.io.FileDescriptor r12 = r12.getFileDescriptor()     // Catch:{ Exception -> 0x01e9 }
            android.media.MediaRecorder r4 = s_mediaRecorder     // Catch:{ Exception -> 0x01e9 }
            r4.setOutputFile(r12)     // Catch:{ Exception -> 0x01e9 }
        L_0x0191:
            android.media.MediaRecorder r12 = s_mediaRecorder     // Catch:{ Exception -> 0x01e9 }
            r12.prepare()     // Catch:{ Exception -> 0x01e9 }
            android.media.MediaRecorder r12 = s_mediaRecorder     // Catch:{ Exception -> 0x01e9 }
            r12.start()     // Catch:{ Exception -> 0x01e9 }
            s_recordingInProgress = r1     // Catch:{ Exception -> 0x01e9 }
            android.os.PowerManager$WakeLock r12 = s_wakeLock     // Catch:{ Exception -> 0x01e9 }
            r12.acquire()     // Catch:{ Exception -> 0x01e9 }
            int r12 = r11.m_secondsToRecordFor     // Catch:{ Exception -> 0x01e9 }
            if (r12 <= 0) goto L_0x0252
            android.app.PendingIntent r12 = s_pendingIntent     // Catch:{ Exception -> 0x01e9 }
            if (r12 == 0) goto L_0x01af
            r6.cancel(r12)     // Catch:{ Exception -> 0x01e9 }
            s_pendingIntent = r8     // Catch:{ Exception -> 0x01e9 }
        L_0x01af:
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x01e9 }
            android.content.Context r4 = r11.mo27827K0()     // Catch:{ Exception -> 0x01e9 }
            java.lang.Class<com.arlosoft.macrodroid.action.receivers.StopRecordingAudioReceiver> r7 = com.arlosoft.macrodroid.action.receivers.StopRecordingAudioReceiver.class
            r12.<init>(r4, r7)     // Catch:{ Exception -> 0x01e9 }
            android.content.Context r4 = r11.mo27827K0()     // Catch:{ Exception -> 0x01e9 }
            r7 = 1073741824(0x40000000, float:2.0)
            int r8 = com.arlosoft.macrodroid.utils.C6368b1.f14959b     // Catch:{ Exception -> 0x01e9 }
            r7 = r7 | r8
            android.app.PendingIntent r12 = android.app.PendingIntent.getBroadcast(r4, r2, r12, r7)     // Catch:{ Exception -> 0x01e9 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01e9 }
            r7 = 23
            if (r4 < r7) goto L_0x01db
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01e9 }
            int r4 = r11.m_secondsToRecordFor     // Catch:{ Exception -> 0x01e9 }
            int r4 = r4 * 1000
            long r9 = (long) r4     // Catch:{ Exception -> 0x01e9 }
            long r7 = r7 + r9
            r6.setExactAndAllowWhileIdle(r2, r7, r12)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0252
        L_0x01db:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01e9 }
            int r4 = r11.m_secondsToRecordFor     // Catch:{ Exception -> 0x01e9 }
            int r4 = r4 * 1000
            long r9 = (long) r4     // Catch:{ Exception -> 0x01e9 }
            long r7 = r7 + r9
            r6.setExact(r2, r7, r12)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0252
        L_0x01e9:
            r12 = move-exception
            android.content.Context r4 = r11.mo27827K0()     // Catch:{ all -> 0x0270 }
            r6 = 2131954262(0x7f130a56, float:1.9545018E38)
            java.lang.String r7 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r6)     // Catch:{ all -> 0x0270 }
            com.arlosoft.macrodroid.common.C4061t1.m15959H0(r4, r7, r2)     // Catch:{ all -> 0x0270 }
            android.content.Context r2 = r11.mo27827K0()     // Catch:{ all -> 0x0270 }
            r4 = 2131954591(0x7f130b9f, float:1.9545686E38)
            java.lang.String r7 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r4)     // Catch:{ all -> 0x0270 }
            com.arlosoft.macrodroid.common.C4061t1.m15959H0(r2, r7, r1)     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r1.<init>()     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r6)     // Catch:{ all -> 0x0270 }
            r1.append(r2)     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = ": "
            r1.append(r2)     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x0270 }
            r1.append(r2)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0270 }
            java.lang.Long r2 = r11.mo27840Y0()     // Catch:{ all -> 0x0270 }
            long r6 = r2.longValue()     // Catch:{ all -> 0x0270 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r1, r6)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r4)     // Catch:{ all -> 0x0270 }
            java.lang.Long r2 = r11.mo27840Y0()     // Catch:{ all -> 0x0270 }
            long r6 = r2.longValue()     // Catch:{ all -> 0x0270 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r1, r6)     // Catch:{ all -> 0x0270 }
            boolean r12 = r12 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x0270 }
            if (r12 == 0) goto L_0x0252
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r12.<init>()     // Catch:{ all -> 0x0270 }
            r12.append(r5)     // Catch:{ all -> 0x0270 }
            r12.append(r3)     // Catch:{ all -> 0x0270 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0270 }
            r11.m12015K3(r12)     // Catch:{ all -> 0x0270 }
        L_0x0252:
            monitor-exit(r0)     // Catch:{ all -> 0x0270 }
            return
        L_0x0254:
            android.content.Context r12 = r11.mo27827K0()     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = "android.permission.RECORD_AUDIO"
            java.lang.String r4 = r11.mo25559a1()     // Catch:{ all -> 0x0270 }
            p112j2.C7439d0.m30909o0(r12, r3, r4, r1, r2)     // Catch:{ all -> 0x0270 }
            java.lang.String r12 = "Recording microphone failed, please ensure you have granted access to the microphone"
            java.lang.Long r1 = r11.mo27840Y0()     // Catch:{ all -> 0x0270 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x0270 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r12, r1)     // Catch:{ all -> 0x0270 }
            monitor-exit(r0)     // Catch:{ all -> 0x0270 }
            return
        L_0x0270:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0270 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.RecordMicrophoneAction.m12016L3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* renamed from: M3 */
    public static void m12017M3() {
        synchronized (s_recordingLock) {
            if (s_recordingInProgress) {
                try {
                    s_mediaRecorder.stop();
                    s_mediaRecorder.reset();
                    s_mediaRecorder.release();
                    s_pendingIntent = null;
                    s_recordingInProgress = false;
                    s_wakeLock.release();
                } catch (Exception e) {
                    Log.e("STOP RECORDING", "Exception trying to stop audio recording: " + e.getMessage());
                    if (s_wakeLock.isHeld()) {
                        s_wakeLock.release();
                    }
                }
            }
        }
    }

    /* renamed from: t3 */
    private void m12028t3() {
        String str;
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && (str = this.pathUri) != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", str);
            }
            mo27850j0().startActivityForResult(intent, PICKER_ID_SAF);
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, "   " + SelectableItem.m15535j1(C17541R$string.action_write_to_file_select_folder) + "   ", 1).show();
        } catch (Exception unused) {
            Context applicationContext2 = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext2, "ACTION_OPEN_DOCUMENT_TREE " + SelectableItem.m15535j1(C17541R$string.not_supported), 0).show();
        }
    }

    /* renamed from: u3 */
    private void m12029u3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_format);
        builder.setSingleChoiceItems((CharSequence[]) s_recordingOptions, this.m_recordingFormat, (DialogInterface.OnClickListener) new C3311oe(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3255me(this));
        builder.create().show();
    }

    /* renamed from: v3 */
    private void m12030v3() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.m_path = null;
        }
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_set_path);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        this.temporaryPathName = this.pathName;
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        ImageButton imageButton = (ImageButton) appCompatDialog.findViewById(C17532R$id.pick_dir_button);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.default_filename_radio_button);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.custom_filename_radio_button);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.custom_filename_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.filename_magic_text_button);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.customFilenameLayout);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.fileExtension);
        TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.directory_text);
        this.dirText = textView2;
        String str = this.m_path;
        if (str != null) {
            textView2.setText(str);
        } else {
            String str2 = this.temporaryPathName;
            if (str2 != null) {
                textView2.setText(str2);
            } else {
                textView2.setText("<" + SelectableItem.m15535j1(C17541R$string.action_write_to_file_select_folder) + ">");
            }
        }
        if (this.customFilename == null) {
            radioButton.setChecked(true);
        } else {
            radioButton2.setChecked(true);
        }
        imageButton.setOnClickListener(new C3341pe(this));
        viewGroup.setVisibility(this.customFilename != null ? 0 : 8);
        String str3 = this.customFilename;
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        radioButton2.setOnCheckedChangeListener(new C3480te(viewGroup, button, editText));
        editText.addTextChangedListener(new C2603a(button, radioButton, editText));
        C3516ue ueVar = new C3516ue(editText);
        int i = this.m_recordingFormat;
        if (i == 0) {
            textView.setText(".3gp");
        } else if (i == 1) {
            textView.setText(".mp4");
        } else if (i == 2) {
            textView.setText(".aac");
        }
        button3.setOnClickListener(new C3369qe(this, j0, ueVar));
        button.setOnClickListener(new C3397re(this, radioButton2, editText, appCompatDialog));
        button2.setOnClickListener(new C3430se(this, appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: w3 */
    private void m12031w3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) m12032x3(), this.source, (DialogInterface.OnClickListener) new C3227le(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3283ne(this));
        builder.create().show();
    }

    /* renamed from: x3 */
    private String[] m12032x3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_record_microphone_source_standard), SelectableItem.m15535j1(C17541R$string.action_record_microphone_source_camcorder), SelectableItem.m15535j1(C17541R$string.action_record_microphone_source_unprocessed)};
    }

    /* renamed from: y3 */
    private String[] m12033y3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.seconds_30), SelectableItem.m15535j1(C17541R$string.minute_1), SelectableItem.m15535j1(C17541R$string.minutes_2), SelectableItem.m15535j1(C17541R$string.minutes_5), SelectableItem.m15535j1(C17541R$string.minutes_10), SelectableItem.m15535j1(C17541R$string.minutes_30), SelectableItem.m15535j1(C17541R$string.minutes_60), SelectableItem.m15535j1(C17541R$string.action_record_microphone_until_cancelled), SelectableItem.m15535j1(C17541R$string.action_record_microphone_cancel_recording)};
    }

    /* renamed from: z3 */
    private String m12034z3() {
        String str = this.m_path;
        if (str != null) {
            return str;
        }
        return new File(Environment.getExternalStorageDirectory(), "MacroDroid/Recordings").getAbsolutePath();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = 0;
        while (true) {
            int[] iArr = s_recordTimes;
            if (i >= iArr.length) {
                return 0;
            }
            if (this.m_secondsToRecordFor == iArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.customFilename};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.customFilename = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return !mo24423d();
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (!mo24824M1()) {
            return SelectableItem.m15535j1(C17541R$string.requires_file_path_reconfiguration_android_10_plus);
        }
        return null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m12033y3()[mo24671D0()];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7854u2.m32846u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo24692U2() {
        m12017M3();
    }

    /* renamed from: W */
    public boolean mo25030W() {
        return true;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.RECORD_AUDIO") != 0) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.RECORD_AUDIO", SelectableItem.m15535j1(C17541R$string.action_record_microphone), true, false);
        } else if (this.m_secondsToRecordFor == -2) {
            if (s_pendingIntent != null) {
                ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(s_pendingIntent);
                s_pendingIntent = null;
            }
            m12017M3();
        } else {
            m12016L3(triggerContextInfo);
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: c3 */
    public void mo24699c3() {
        m12017M3();
    }

    /* renamed from: d */
    public boolean mo24423d() {
        if (Build.VERSION.SDK_INT >= 30 && this.m_path != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12033y3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.action_record_microphone_select_rec_time);
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == PICKER_ID_SAF && i2 == -1) {
            Uri data = intent.getData();
            this.pathUri = data.toString();
            mo27827K0().getContentResolver().takePersistableUriPermission(data, 3);
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), data);
            DocumentFile G = C4061t1.m15956G(fromTreeUri);
            StringBuilder sb = new StringBuilder();
            sb.append(G != null ? G.getName() : "");
            sb.append("/");
            sb.append(fromTreeUri.getName());
            String sb2 = sb.toString();
            this.temporaryPathName = sb2;
            TextView textView = this.dirText;
            if (textView != null) {
                textView.setText(sb2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m12031w3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_secondsToRecordFor);
        parcel.writeString(this.m_recordTimeString);
        parcel.writeInt(this.m_recordingFormat);
        parcel.writeString(this.m_path);
        parcel.writeInt(this.source);
        parcel.writeString(this.customFilename);
        parcel.writeString(this.pathUri);
        parcel.writeString(this.pathName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_recordTimeString = m12033y3()[i];
        this.m_secondsToRecordFor = s_recordTimes[i];
    }

    public RecordMicrophoneAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private RecordMicrophoneAction() {
        this.m_path = null;
        if (s_wakeLock == null) {
            s_wakeLock = ((PowerManager) mo27827K0().getSystemService("power")).newWakeLock(1, "macrodroid:recordmicrophoneaction");
        }
        this.m_recordTimeString = m12033y3()[0];
        this.m_secondsToRecordFor = s_recordTimes[0];
    }

    private RecordMicrophoneAction(Parcel parcel) {
        super(parcel);
        this.m_secondsToRecordFor = parcel.readInt();
        this.m_recordTimeString = parcel.readString();
        this.m_recordingFormat = parcel.readInt();
        this.m_path = parcel.readString();
        this.source = parcel.readInt();
        this.customFilename = parcel.readString();
        this.pathUri = parcel.readString();
        this.pathName = parcel.readString();
    }
}
