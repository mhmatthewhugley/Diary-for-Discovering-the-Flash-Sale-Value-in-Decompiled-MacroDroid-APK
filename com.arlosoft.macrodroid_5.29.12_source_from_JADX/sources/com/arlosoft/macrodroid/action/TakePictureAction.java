package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.TakePictureActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.io.File;
import p057a2.C2214c;
import p128m0.C7812o4;
import p319lc.C15626c;

public class TakePictureAction extends Action implements C2214c {
    public static final Parcelable.Creator<TakePictureAction> CREATOR = new C2716a();
    private static final int PICKER_ID_SAF = 9876;
    private transient TextView dirText;
    private int m_flashOption;
    private String m_path;
    private boolean m_showIcon;
    private boolean m_useFrontCamera;
    private String newPath;
    private String pathName;
    private String pathUri;
    private transient String temporaryPathName;

    /* renamed from: com.arlosoft.macrodroid.action.TakePictureAction$a */
    class C2716a implements Parcelable.Creator<TakePictureAction> {
        C2716a() {
        }

        /* renamed from: a */
        public TakePictureAction createFromParcel(Parcel parcel) {
            return new TakePictureAction(parcel, (C2716a) null);
        }

        /* renamed from: b */
        public TakePictureAction[] newArray(int i) {
            return new TakePictureAction[i];
        }
    }

    /* synthetic */ TakePictureAction(Parcel parcel, C2716a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m13251A3(DialogInterface dialogInterface, int i) {
        this.m_flashOption = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m13252B3(DialogInterface dialogInterface, int i) {
        m13271u3();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m13253C3(DialogInterface dialogInterface, int i) {
        this.m_showIcon = i == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m13254D3(DialogInterface dialogInterface, int i) {
        m13272v3();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m13255E3(View view) {
        m13269s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m13256F3(AppCompatDialog appCompatDialog, View view) {
        String str = this.temporaryPathName;
        if (str == null && this.m_path == null) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.action_write_to_file_select_folder, 1).show();
            return;
        }
        this.pathName = str;
        appCompatDialog.dismiss();
        this.m_path = null;
        this.newPath = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m13258H3(DialogInterface dialogInterface, int i) {
        this.m_useFrontCamera = i == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m13259I3(DialogInterface dialogInterface, int i) {
        if (this.m_useFrontCamera) {
            this.m_flashOption = 0;
            m13271u3();
            return;
        }
        m13270t3();
    }

    /* renamed from: s3 */
    private void m13269s3() {
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

    /* renamed from: t3 */
    private void m13270t3() {
        if (mo27836X()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.action_take_picture_flash_mode);
            builder.setSingleChoiceItems((CharSequence[]) m13274x3(), this.m_flashOption, (DialogInterface.OnClickListener) new C3263mm(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3291nm(this));
            builder.create().show();
        }
    }

    /* renamed from: u3 */
    private void m13271u3() {
        if (mo27836X()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.action_take_picture_display_icon);
            builder.setSingleChoiceItems((CharSequence[]) m13275y3(), this.m_showIcon ^ true ? 1 : 0, (DialogInterface.OnClickListener) new C3179jm(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3207km(this));
            builder.create().show();
        }
    }

    /* renamed from: v3 */
    private void m13272v3() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.m_path = null;
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_set_path);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        ImageButton imageButton = (ImageButton) appCompatDialog.findViewById(C17532R$id.pick_dir_button);
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.customFilenameLayout)).setVisibility(8);
        ((RadioGroup) appCompatDialog.findViewById(C17532R$id.filename_radio_buttons)).setVisibility(8);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.directory_text);
        this.dirText = textView;
        String str = this.pathName;
        this.temporaryPathName = str;
        if (this.m_path != null) {
            textView.setText(m13276z3());
        } else if (str != null) {
            textView.setText(str);
        } else {
            textView.setText("<" + SelectableItem.m15535j1(C17541R$string.action_write_to_file_select_folder) + ">");
        }
        this.temporaryPathName = this.pathName;
        imageButton.setOnClickListener(new C3349pm(this));
        button.setOnClickListener(new C3377qm(this, appCompatDialog));
        button2.setOnClickListener(new C3319om(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: w3 */
    private String[] m13273w3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_take_picture_front_facing), SelectableItem.m15535j1(C17541R$string.action_take_picture_rear_facing)};
    }

    /* renamed from: x3 */
    private String[] m13274x3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_take_picture_flash_off), SelectableItem.m15535j1(C17541R$string.action_take_picture_flash_on), SelectableItem.m15535j1(C17541R$string.action_take_picture_flash_auto)};
    }

    /* renamed from: y3 */
    private String[] m13275y3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_take_picture_show_icon), SelectableItem.m15535j1(C17541R$string.action_take_picture_hide_icon)};
    }

    /* renamed from: z3 */
    private String m13276z3() {
        String str = this.newPath;
        if (str != null) {
            return str;
        }
        String str2 = this.m_path;
        if (str2 != null) {
            return str2;
        }
        return new File(Environment.getExternalStorageDirectory(), "MacroDroid/Photos").getAbsolutePath();
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
        String str = "";
        if (Camera.getNumberOfCameras() <= 1) {
            return str;
        }
        if (this.m_useFrontCamera) {
            return m13273w3()[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m13273w3()[1]);
        if (this.m_flashOption != 0) {
            str = ", " + m13274x3()[this.m_flashOption];
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7812o4.m32642u();
    }

    /* renamed from: W */
    public boolean mo25030W() {
        return true;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i;
        int i2 = 0;
        if (Camera.getNumberOfCameras() > 1) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i3 = 0;
                while (true) {
                    if (i3 >= Camera.getNumberOfCameras()) {
                        break;
                    }
                    Camera.getCameraInfo(i3, cameraInfo);
                    boolean z = this.m_useFrontCamera;
                    if (z || cameraInfo.facing != 0) {
                        if (z && cameraInfo.facing == 1) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                i2 = i3;
                i = i2;
            } catch (RuntimeException e) {
                C4878b.m18869h("Exception calling getCameraInfo: " + e.toString(), mo27840Y0().longValue());
            }
            TakePictureActivity.m13992V1(mo27827K0(), i, this.m_showIcon, this.m_flashOption, this.pathUri, m13276z3(), mo27837X0().getName(), mo27840Y0().longValue());
        }
        i = 0;
        TakePictureActivity.m13992V1(mo27827K0(), i, this.m_showIcon, this.m_flashOption, this.pathUri, m13276z3(), mo27837X0().getName(), mo27840Y0().longValue());
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: d */
    public boolean mo24423d() {
        if (Build.VERSION.SDK_INT >= 30 && this.m_path != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
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
    /* renamed from: u1 */
    public void mo24714u1() {
        if (Camera.getNumberOfCameras() > 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
                Camera.getCameraInfo(i, cameraInfo);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.action_take_picture);
            String[] w3 = m13273w3();
            boolean z = true ^ this.m_useFrontCamera;
            builder.setSingleChoiceItems((CharSequence[]) w3, z ? 1 : 0, (DialogInterface.OnClickListener) new C3235lm(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3151im(this));
            builder.create().show();
            return;
        }
        m13271u3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_useFrontCamera ^ true ? 1 : 0);
        parcel.writeInt(this.m_showIcon ^ true ? 1 : 0);
        parcel.writeInt(this.m_flashOption);
        parcel.writeString(this.m_path);
        parcel.writeString(this.newPath);
        parcel.writeString(this.pathUri);
        parcel.writeString(this.pathName);
    }

    public TakePictureAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_flashOption = 0;
    }

    public TakePictureAction() {
        this.m_useFrontCamera = true;
        this.m_showIcon = true;
        this.m_path = null;
    }

    private TakePictureAction(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_useFrontCamera = parcel.readInt() == 0;
        this.m_showIcon = parcel.readInt() != 0 ? false : z;
        this.m_flashOption = parcel.readInt();
        this.m_path = parcel.readString();
        this.newPath = parcel.readString();
        this.pathUri = parcel.readString();
        this.pathName = parcel.readString();
    }
}
