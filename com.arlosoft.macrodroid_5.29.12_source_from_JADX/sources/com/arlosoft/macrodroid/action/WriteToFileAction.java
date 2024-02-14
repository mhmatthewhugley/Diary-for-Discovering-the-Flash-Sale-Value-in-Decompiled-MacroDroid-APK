package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2224m;
import p128m0.C7752g5;
import p148q0.C8151a;
import p156r2.C8194a;
import p319lc.C15626c;

public class WriteToFileAction extends Action implements C2224m {
    public static final Parcelable.Creator<WriteToFileAction> CREATOR = new C2801c();
    private static final int PICKER_ID = 9876;
    private transient TextView dirText;
    private boolean m_append;
    private String m_filename;
    private String m_logText;
    private String m_path;
    private String m_pathName;
    private String m_pathUri;
    /* access modifiers changed from: private */
    public boolean m_prepend;
    private String m_temporaryPathName;
    /* access modifiers changed from: private */
    public boolean overwrite;
    /* access modifiers changed from: private */
    public Object writeFileLock;

    /* renamed from: com.arlosoft.macrodroid.action.WriteToFileAction$a */
    class C2799a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f7701a;

        /* renamed from: c */
        final /* synthetic */ String f7702c;

        C2799a(String str, String str2) {
            this.f7701a = str;
            this.f7702c = str2;
        }

        public void run() {
            synchronized (WriteToFileAction.this.writeFileLock) {
                if (WriteToFileAction.this.m_prepend) {
                    WriteToFileAction.this.m13865H3(this.f7701a, this.f7702c);
                } else if (WriteToFileAction.this.overwrite) {
                    WriteToFileAction.this.m13867J3(this.f7701a, this.f7702c, true);
                } else {
                    WriteToFileAction.this.m13867J3(this.f7701a, this.f7702c, false);
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WriteToFileAction$b */
    class C2800b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7704a;

        /* renamed from: c */
        final /* synthetic */ EditText f7705c;

        /* renamed from: d */
        final /* synthetic */ EditText f7706d;

        C2800b(Button button, EditText editText, EditText editText2) {
            this.f7704a = button;
            this.f7705c = editText;
            this.f7706d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f7704a.setEnabled(this.f7705c.length() > 0 && this.f7706d.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WriteToFileAction$c */
    class C2801c implements Parcelable.Creator<WriteToFileAction> {
        C2801c() {
        }

        /* renamed from: a */
        public WriteToFileAction createFromParcel(Parcel parcel) {
            return new WriteToFileAction(parcel, (C2799a) null);
        }

        /* renamed from: b */
        public WriteToFileAction[] newArray(int i) {
            return new WriteToFileAction[i];
        }
    }

    /* synthetic */ WriteToFileAction(Parcel parcel, C2799a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m13858A3(AppCompatDialog appCompatDialog, EditText editText, EditText editText2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, View view) {
        String str = this.m_temporaryPathName;
        if (str == null && this.m_path == null) {
            C15626c.makeText(mo27827K0(), C17541R$string.action_write_to_file_select_folder, 1).show();
            return;
        }
        this.m_pathName = str;
        appCompatDialog.dismiss();
        this.m_logText = editText.getText().toString();
        this.m_filename = editText2.getText().toString();
        this.m_append = radioButton.isChecked();
        this.m_prepend = radioButton2.isChecked();
        this.overwrite = radioButton3.isChecked();
        this.dirText = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m13859B3(AppCompatDialog appCompatDialog, View view) {
        this.dirText = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m13860C3(AppCompatDialog appCompatDialog, DialogInterface dialogInterface) {
        this.dirText = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m13861D3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m13862E3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m13863F3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m13864G3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.OutputStreamWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.OutputStreamWriter] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.io.OutputStreamWriter] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:92|93|94|95|96|97|98|99|100|101) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:62|63|64|65|66|67|68|69|70|71|107) */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:59|60|78|81|82|83|84|85|86|87|88|89|90|103) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:2|3|4|5|6|7|(1:9)|(1:11)(7:12|13|14|15|16|17|18)|19|20|21|22|23|24|105) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:39|40|41|42|43|44|45|46) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:31|32|33|34|35|36|37|38|106) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0122 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0125 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0128 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0161 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0164 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0167 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x016f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0172 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0175 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:89:0x0167=Splitter:B:89:0x0167, B:70:0x0128=Splitter:B:70:0x0128, B:23:0x008f=Splitter:B:23:0x008f, B:37:0x00bf=Splitter:B:37:0x00bf} */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: H3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m13865H3(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "application/custom"
            java.lang.String r1 = r12.m_path
            java.lang.String r2 = "UTF-8"
            r3 = 0
            if (r1 != 0) goto L_0x00cf
            java.lang.String r1 = r12.m_pathUri     // Catch:{ all -> 0x009b }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x009b }
            android.content.Context r4 = r12.mo27827K0()     // Catch:{ all -> 0x009b }
            androidx.documentfile.provider.DocumentFile r1 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r4, r1)     // Catch:{ all -> 0x009b }
            androidx.documentfile.provider.DocumentFile r4 = r1.findFile(r13)     // Catch:{ all -> 0x009b }
            java.lang.String r5 = "prepend_temp.txt"
            androidx.documentfile.provider.DocumentFile r5 = r1.createFile(r0, r5)     // Catch:{ all -> 0x009b }
            android.content.Context r6 = r12.mo27827K0()     // Catch:{ all -> 0x009b }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x009b }
            android.net.Uri r7 = r5.getUri()     // Catch:{ all -> 0x009b }
            java.lang.String r8 = "wa"
            java.io.OutputStream r6 = r6.openOutputStream(r7, r8)     // Catch:{ all -> 0x009b }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0098 }
            r7.<init>(r6, r2)     // Catch:{ all -> 0x0098 }
            r7.write(r14)     // Catch:{ all -> 0x0094 }
            r7.flush()     // Catch:{ all -> 0x0094 }
            if (r4 != 0) goto L_0x0044
            androidx.documentfile.provider.DocumentFile r4 = r1.createFile(r0, r13)     // Catch:{ all -> 0x0094 }
        L_0x0044:
            if (r4 != 0) goto L_0x004a
            r12.m13866I3(r13)     // Catch:{ all -> 0x0094 }
            goto L_0x0089
        L_0x004a:
            android.content.Context r14 = r12.mo27827K0()     // Catch:{ all -> 0x0094 }
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch:{ all -> 0x0094 }
            android.net.Uri r0 = r4.getUri()     // Catch:{ all -> 0x0094 }
            java.io.InputStream r3 = r14.openInputStream(r0)     // Catch:{ all -> 0x0094 }
            r12.m13882x3(r3, r6)     // Catch:{ all -> 0x0094 }
            android.content.Context r14 = r12.mo27827K0()     // Catch:{ all -> 0x0094 }
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch:{ all -> 0x0094 }
            android.net.Uri r0 = r5.getUri()     // Catch:{ all -> 0x0094 }
            java.io.InputStream r14 = r14.openInputStream(r0)     // Catch:{ all -> 0x0094 }
            android.content.Context r0 = r12.mo27827K0()     // Catch:{ all -> 0x0094 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0094 }
            android.net.Uri r1 = r4.getUri()     // Catch:{ all -> 0x0094 }
            java.io.OutputStream r0 = r0.openOutputStream(r1)     // Catch:{ all -> 0x0094 }
            org.apache.commons.p353io.IOUtils.copy((java.io.InputStream) r14, (java.io.OutputStream) r0)     // Catch:{ all -> 0x0094 }
            r0.close()     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            r14.close()     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            r5.delete()     // Catch:{ all -> 0x0094 }
        L_0x0089:
            r3.close()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            r6.close()     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            r7.close()     // Catch:{ Exception -> 0x016a }
            goto L_0x016a
        L_0x0094:
            r14 = move-exception
            r0 = r3
            r3 = r7
            goto L_0x009e
        L_0x0098:
            r14 = move-exception
            r0 = r3
            goto L_0x009e
        L_0x009b:
            r14 = move-exception
            r0 = r3
            r6 = r0
        L_0x009e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r1.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "Could not prepend to file: "
            r1.append(r2)     // Catch:{ all -> 0x00c4 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x00c4 }
            r1.append(r14)     // Catch:{ all -> 0x00c4 }
            java.lang.String r14 = r1.toString()     // Catch:{ all -> 0x00c4 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r14)     // Catch:{ all -> 0x00c4 }
            r12.m13866I3(r13)     // Catch:{ all -> 0x00c4 }
            r0.close()     // Catch:{ Exception -> 0x00bc }
        L_0x00bc:
            r6.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            r3.close()     // Catch:{ Exception -> 0x016a }
            goto L_0x016a
        L_0x00c4:
            r13 = move-exception
            r0.close()     // Catch:{ Exception -> 0x00c8 }
        L_0x00c8:
            r6.close()     // Catch:{ Exception -> 0x00cb }
        L_0x00cb:
            r3.close()     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            throw r13
        L_0x00cf:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x013a }
            java.lang.String r1 = r12.m_path     // Catch:{ all -> 0x013a }
            r0.<init>(r1, r13)     // Catch:{ all -> 0x013a }
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x013a }
            java.lang.String r1 = r12.m_path     // Catch:{ all -> 0x013a }
            java.lang.String r4 = "TempPrepend.txt"
            r13.<init>(r1, r4)     // Catch:{ all -> 0x013a }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x013a }
            r4 = 1
            r1.<init>(r13, r4)     // Catch:{ all -> 0x013a }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0134 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0134 }
            r4.write(r14)     // Catch:{ all -> 0x0130 }
            r4.flush()     // Catch:{ all -> 0x0130 }
            boolean r14 = r0.exists()     // Catch:{ all -> 0x0130 }
            if (r14 == 0) goto L_0x0118
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ all -> 0x0130 }
            r14.<init>(r0)     // Catch:{ all -> 0x0130 }
            java.nio.channels.FileChannel r14 = r14.getChannel()     // Catch:{ all -> 0x0130 }
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch:{ all -> 0x0115 }
            r7 = 0
            long r9 = r14.size()     // Catch:{ all -> 0x0115 }
            r5 = r3
            r6 = r14
            r5.transferFrom(r6, r7, r9)     // Catch:{ all -> 0x0115 }
            r0.delete()     // Catch:{ all -> 0x0115 }
            r11 = r3
            r3 = r14
            r14 = r11
            goto L_0x0119
        L_0x0115:
            r13 = move-exception
            r0 = r3
            goto L_0x0138
        L_0x0118:
            r14 = r3
        L_0x0119:
            com.arlosoft.macrodroid.utils.C6362a0.m24599e(r13, r0)     // Catch:{ all -> 0x012c }
            r13.delete()     // Catch:{ all -> 0x012c }
            r4.close()     // Catch:{ Exception -> 0x0122 }
        L_0x0122:
            r1.close()     // Catch:{ Exception -> 0x0125 }
        L_0x0125:
            r3.close()     // Catch:{ Exception -> 0x0128 }
        L_0x0128:
            r14.close()     // Catch:{ Exception -> 0x016a }
            goto L_0x016a
        L_0x012c:
            r13 = move-exception
            r0 = r14
            r14 = r3
            goto L_0x0138
        L_0x0130:
            r13 = move-exception
            r14 = r3
            r0 = r14
            goto L_0x0138
        L_0x0134:
            r13 = move-exception
            r14 = r3
            r0 = r14
            r4 = r0
        L_0x0138:
            r3 = r1
            goto L_0x013e
        L_0x013a:
            r13 = move-exception
            r14 = r3
            r0 = r14
            r4 = r0
        L_0x013e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016b }
            r1.<init>()     // Catch:{ all -> 0x016b }
            java.lang.String r2 = "Error - writing to file: "
            r1.append(r2)     // Catch:{ all -> 0x016b }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x016b }
            r1.append(r13)     // Catch:{ all -> 0x016b }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x016b }
            java.lang.Long r1 = r12.mo27840Y0()     // Catch:{ all -> 0x016b }
            long r1 = r1.longValue()     // Catch:{ all -> 0x016b }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r13, r1)     // Catch:{ all -> 0x016b }
            r4.close()     // Catch:{ Exception -> 0x0161 }
        L_0x0161:
            r3.close()     // Catch:{ Exception -> 0x0164 }
        L_0x0164:
            r14.close()     // Catch:{ Exception -> 0x0167 }
        L_0x0167:
            r0.close()     // Catch:{ Exception -> 0x016a }
        L_0x016a:
            return
        L_0x016b:
            r13 = move-exception
            r4.close()     // Catch:{ Exception -> 0x016f }
        L_0x016f:
            r3.close()     // Catch:{ Exception -> 0x0172 }
        L_0x0172:
            r14.close()     // Catch:{ Exception -> 0x0175 }
        L_0x0175:
            r0.close()     // Catch:{ Exception -> 0x0178 }
        L_0x0178:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.WriteToFileAction.m13865H3(java.lang.String, java.lang.String):void");
    }

    /* renamed from: I3 */
    private void m13866I3(String str) {
        C4878b.m18869h("Error - could not write to file: " + str + ". Need to re-select path and grant access.", mo27840Y0().longValue());
        C8194a.m34000a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.write_file_failed_please_reconfigure_directory), mo27837X0().getName());
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: J3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m13867J3(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r6.m_path     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r2 = "UTF-8"
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = r6.m_pathUri     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            android.content.Context r3 = r6.mo27827K0()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            androidx.documentfile.provider.DocumentFile r1 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r3, r1)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            androidx.documentfile.provider.DocumentFile r3 = r1.findFile(r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r4 = "application/custom"
            if (r9 == 0) goto L_0x0027
            if (r3 == 0) goto L_0x0022
            r3.delete()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
        L_0x0022:
            androidx.documentfile.provider.DocumentFile r3 = r1.createFile(r4, r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            goto L_0x002d
        L_0x0027:
            if (r3 != 0) goto L_0x002d
            androidx.documentfile.provider.DocumentFile r3 = r1.createFile(r4, r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
        L_0x002d:
            if (r3 != 0) goto L_0x0034
            r6.m13866I3(r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r9 = r0
            goto L_0x004b
        L_0x0034:
            android.content.Context r7 = r6.mo27827K0()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            android.net.Uri r9 = r3.getUri()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r1 = "wa"
            java.io.OutputStream r7 = r7.openOutputStream(r9, r1)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r9.<init>(r7, r2)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
        L_0x004b:
            r5 = r0
            r0 = r9
            r9 = r5
            goto L_0x0063
        L_0x004f:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r3 = r6.m_path     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r1.<init>(r3, r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            boolean r7 = r6.m_append     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r9.<init>(r1, r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0070 }
            r7.<init>(r9, r2)     // Catch:{ Exception -> 0x0070 }
            r0 = r7
        L_0x0063:
            r0.write(r8)     // Catch:{ Exception -> 0x0070 }
            r0.close()     // Catch:{ Exception -> 0x0070 }
        L_0x0069:
            r0.close()     // Catch:{ Exception -> 0x0098 }
            r9.close()     // Catch:{ Exception -> 0x0098 }
            goto L_0x0098
        L_0x0070:
            r7 = move-exception
            goto L_0x0077
        L_0x0072:
            r7 = move-exception
            r9 = r0
            goto L_0x009a
        L_0x0075:
            r7 = move-exception
            r9 = r0
        L_0x0077:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r8.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "Error - writing to file: "
            r8.append(r1)     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0099 }
            r8.append(r7)     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0099 }
            java.lang.Long r8 = r6.mo27840Y0()     // Catch:{ all -> 0x0099 }
            long r1 = r8.longValue()     // Catch:{ all -> 0x0099 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r7, r1)     // Catch:{ all -> 0x0099 }
            goto L_0x0069
        L_0x0098:
            return
        L_0x0099:
            r7 = move-exception
        L_0x009a:
            r0.close()     // Catch:{ Exception -> 0x00a0 }
            r9.close()     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.WriteToFileAction.m13867J3(java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: w3 */
    private void m13881w3() {
        try {
            mo27850j0().startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), PICKER_ID);
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, "   " + SelectableItem.m15535j1(C17541R$string.action_write_to_file_select_folder) + "   ", 1).show();
        } catch (Exception unused) {
            Context applicationContext2 = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext2, "ACTION_OPEN_DOCUMENT_TREE " + SelectableItem.m15535j1(C17541R$string.not_supported), 0).show();
        }
    }

    /* renamed from: x3 */
    private void m13882x3(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: y3 */
    private void m13883y3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_write_to_file);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.filename);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.text_to_write);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.append_radio_button);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.prepend_radio_button);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.overwrite_radio_button);
        ImageButton imageButton = (ImageButton) appCompatDialog.findViewById(C17532R$id.pick_dir_button);
        this.dirText = (TextView) appCompatDialog.findViewById(C17532R$id.directory_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.special_text_button_text_content);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.special_text_button_filename);
        this.m_temporaryPathName = this.m_pathName;
        editText.setText(this.m_filename);
        editText2.setText(this.m_logText);
        radioButton.setChecked(this.m_append);
        radioButton2.setChecked(this.m_prepend);
        radioButton3.setChecked(this.overwrite);
        String str = this.m_path;
        if (str != null) {
            this.dirText.setText(str);
        } else {
            String str2 = this.m_temporaryPathName;
            if (str2 != null) {
                this.dirText.setText(str2);
            } else {
                TextView textView = this.dirText;
                textView.setText("<" + SelectableItem.m15535j1(C17541R$string.action_write_to_file_select_folder) + ">");
            }
        }
        imageButton.setOnClickListener(new C3267mq(this));
        C2800b bVar = new C2800b(button, editText, editText2);
        editText.addTextChangedListener(bVar);
        editText2.addTextChangedListener(bVar);
        Button button5 = button3;
        C3381qq qqVar = r0;
        Button button6 = button4;
        C3381qq qqVar2 = new C3381qq(this, appCompatDialog, editText2, editText, radioButton, radioButton2, radioButton3);
        button.setOnClickListener(qqVar);
        String str3 = this.m_filename;
        button.setEnabled(str3 != null && str3.length() > 0 && this.m_logText.length() > 0);
        button2.setOnClickListener(new C3353pq(this, appCompatDialog));
        appCompatDialog.setOnCancelListener(new C3239lq(this, appCompatDialog));
        C3464sq sqVar = new C3464sq(editText2);
        C3410rq rqVar = new C3410rq(editText);
        button5.setOnClickListener(new C3295nq(this, j0, sqVar));
        button6.setOnClickListener(new C3323oq(this, j0, rqVar));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m13884z3(View view) {
        m13881w3();
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_filename, this.m_logText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_filename = strArr[0];
            this.m_logText = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_filename;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7752g5.m32347u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        new C2799a(C4023j0.m15760t0(mo27827K0(), this.m_filename, triggerContextInfo, mo27837X0()), C4023j0.m15760t0(mo27827K0(), this.m_logText, triggerContextInfo, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX)).start();
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 == -1 && i == PICKER_ID) {
            Uri data = intent.getData();
            this.m_pathUri = data.toString();
            this.m_path = null;
            mo27827K0().getContentResolver().takePersistableUriPermission(data, 3);
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), data);
            DocumentFile parentFile = fromTreeUri.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(parentFile != null ? parentFile.getName() : "");
            sb.append("/");
            sb.append(fromTreeUri.getName());
            String sb2 = sb.toString();
            this.m_temporaryPathName = sb2;
            TextView textView = this.dirText;
            if (textView != null) {
                textView.setText(sb2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m13883y3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_logText);
        parcel.writeString(this.m_filename);
        parcel.writeInt(this.m_append ? 1 : 0);
        parcel.writeInt(this.m_prepend ? 1 : 0);
        parcel.writeInt(this.overwrite ? 1 : 0);
        parcel.writeString(this.m_path);
        parcel.writeString(this.m_pathUri);
        parcel.writeString(this.m_pathName);
    }

    public WriteToFileAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private WriteToFileAction() {
        this.m_append = true;
        this.m_prepend = false;
        this.overwrite = false;
        this.writeFileLock = new Object();
    }

    private WriteToFileAction(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_append = true;
        this.m_prepend = false;
        this.overwrite = false;
        this.writeFileLock = new Object();
        this.m_logText = parcel.readString();
        this.m_filename = parcel.readString();
        this.m_append = parcel.readInt() != 0;
        this.m_prepend = parcel.readInt() != 0;
        this.overwrite = parcel.readInt() == 0 ? false : z;
        this.m_path = parcel.readString();
        this.m_pathUri = parcel.readString();
        this.m_pathName = parcel.readString();
    }
}
