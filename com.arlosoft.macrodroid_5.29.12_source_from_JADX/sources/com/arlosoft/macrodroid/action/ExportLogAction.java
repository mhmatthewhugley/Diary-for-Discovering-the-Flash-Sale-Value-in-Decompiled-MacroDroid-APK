package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.database.room.C4403i;
import com.arlosoft.macrodroid.database.room.C4429s;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6459y0;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.p312io.C13667b;
import kotlin.p312io.C13675i;
import kotlin.text.C15147d;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import org.apache.commons.p353io.IOUtils;
import p128m0.C7873x0;
import p135n1.C7967d;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;
import p370qa.C16269p;

/* compiled from: ExportLogAction.kt */
public final class ExportLogAction extends Action {
    public static final Parcelable.Creator<ExportLogAction> CREATOR = new C2427a();

    /* renamed from: f */
    public static final C2428b f7227f = new C2428b((C13695i) null);
    /* access modifiers changed from: private */
    public static final SimpleDateFormat logDateTimeFormat = new SimpleDateFormat("dd-MM-yy HH:mm:ss", Locale.getDefault());

    /* renamed from: d */
    public transient MacroDroidRoomDatabase f7228d;
    private String displayPath;
    private String fileName;
    private String filePath;
    /* access modifiers changed from: private */
    public boolean needsFileReconfiguration;
    /* access modifiers changed from: private */
    public String pathUri;
    private transient String temporaryPathName;
    /* access modifiers changed from: private */
    public boolean userLog;
    /* access modifiers changed from: private */
    public transient String workingFilename;
    private transient String workingPathUri;

    /* renamed from: com.arlosoft.macrodroid.action.ExportLogAction$a */
    /* compiled from: ExportLogAction.kt */
    public static final class C2427a implements Parcelable.Creator<ExportLogAction> {
        C2427a() {
        }

        /* renamed from: a */
        public ExportLogAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ExportLogAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ExportLogAction[] newArray(int i) {
            return new ExportLogAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ExportLogAction$b */
    /* compiled from: ExportLogAction.kt */
    public static final class C2428b {
        private C2428b() {
        }

        public /* synthetic */ C2428b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ExportLogAction$c */
    /* compiled from: ExportLogAction.kt */
    public static final class C2429c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7229a;

        /* renamed from: c */
        final /* synthetic */ EditText f7230c;

        /* renamed from: d */
        final /* synthetic */ TextView f7231d;

        /* renamed from: f */
        final /* synthetic */ ExportLogAction f7232f;

        C2429c(Button button, EditText editText, TextView textView, ExportLogAction exportLogAction) {
            this.f7229a = button;
            this.f7230c = editText;
            this.f7231d = textView;
            this.f7232f = exportLogAction;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "arg0");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "arg0");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
            if (kotlin.jvm.internal.C13706o.m87924a(r4, '<' + com.arlosoft.macrodroid.action.ExportLogAction.m10593q3(com.arlosoft.macrodroid.C17541R$string.select_export_directory) + '>') == false) goto L_0x004a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                java.lang.String r4 = "arg0"
                kotlin.jvm.internal.C13706o.m87929f(r3, r4)
                android.widget.Button r3 = r2.f7229a
                android.widget.EditText r4 = r2.f7230c
                android.text.Editable r4 = r4.getText()
                java.lang.String r5 = "filename.text"
                kotlin.jvm.internal.C13706o.m87928e(r4, r5)
                int r4 = r4.length()
                r5 = 1
                r6 = 0
                if (r4 <= 0) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0049
                android.widget.TextView r4 = r2.f7231d
                java.lang.CharSequence r4 = r4.getText()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 60
                r0.append(r1)
                r1 = 2131954814(0x7f130c7e, float:1.9546138E38)
                java.lang.String r1 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r1)
                r0.append(r1)
                r1 = 62
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r0)
                if (r4 != 0) goto L_0x0049
                goto L_0x004a
            L_0x0049:
                r5 = 0
            L_0x004a:
                r3.setEnabled(r5)
                com.arlosoft.macrodroid.action.ExportLogAction r3 = r2.f7232f
                android.widget.EditText r4 = r2.f7230c
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                r3.workingFilename = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ExportLogAction.C2429c.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ExportLogAction$d */
    /* compiled from: ExportLogAction.kt */
    static final class C2430d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $filenameToUse;
        Object L$0;
        int label;
        final /* synthetic */ ExportLogAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2430d(ExportLogAction exportLogAction, String str, C13635d<? super C2430d> dVar) {
            super(2, dVar);
            this.this$0 = exportLogAction;
            this.$filenameToUse = str;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2430d(this.this$0, this.$filenameToUse, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2430d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            OutputStream outputStream;
            Throwable th;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this.this$0.mo27827K0(), Uri.parse(this.this$0.pathUri));
                C13706o.m87926c(fromTreeUri);
                if (!fromTreeUri.canWrite()) {
                    String str = "Cannot access export directory, exportDir = " + fromTreeUri;
                    Long Y0 = this.this$0.mo27840Y0();
                    C13706o.m87928e(Y0, "macroGuid");
                    C4878b.m18869h(str, Y0.longValue());
                    this.this$0.needsFileReconfiguration = true;
                    C4934n.m18998M().mo29695o0(this.this$0.mo27837X0());
                    C6459y0.m24788b(this.this$0.mo27827K0(), this.this$0.mo27837X0().getName());
                } else {
                    String str2 = this.$filenameToUse;
                    C13706o.m87926c(str2);
                    DocumentFile findFile = fromTreeUri.findFile(str2);
                    if (findFile != null && findFile.exists()) {
                        findFile.delete();
                    }
                    String str3 = this.$filenameToUse;
                    C13706o.m87926c(str3);
                    DocumentFile createFile = fromTreeUri.createFile("*/*", str3);
                    ContentResolver contentResolver = this.this$0.mo27827K0().getContentResolver();
                    C13706o.m87926c(createFile);
                    OutputStream openOutputStream = contentResolver.openOutputStream(createFile.getUri());
                    C13706o.m87926c(openOutputStream);
                    if (this.this$0.userLog) {
                        FileInputStream openFileInput = MacroDroidApplication.f9883I.mo27303b().openFileInput("MacroDroidUserLog.txt");
                        if (openFileInput != null) {
                            DataInputStream dataInputStream = new DataInputStream(openFileInput);
                            Charset charset = C15147d.f64349b;
                            InputStreamReader inputStreamReader = new InputStreamReader(dataInputStream, charset);
                            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                            try {
                                String g0 = C13566b0.m87432g0(C13675i.m87862e(bufferedReader), IOUtils.LINE_SEPARATOR_WINDOWS, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
                                C13667b.m87853a(bufferedReader, (Throwable) null);
                                byte[] bytes = C15176v.m93630E(g0, "\\\\n", IOUtils.LINE_SEPARATOR_WINDOWS, false, 4, (Object) null).getBytes(charset);
                                C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
                                openOutputStream.write(bytes);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                C13667b.m87853a(bufferedReader, th);
                                throw th3;
                            }
                        }
                    } else {
                        C4429s g = this.this$0.mo25021C3().mo28681g();
                        C4403i iVar = C4403i.VERBOSE;
                        this.L$0 = openOutputStream;
                        this.label = 1;
                        obj2 = g.mo28777b(iVar, this);
                        if (obj2 == c) {
                            return c;
                        }
                        outputStream = openOutputStream;
                    }
                }
                return C13339u.f61331a;
            } else if (i == 1) {
                outputStream = (OutputStream) this.L$0;
                try {
                    C13332o.m85685b(obj);
                    obj2 = obj;
                } catch (Exception e) {
                    Long Y02 = this.this$0.mo27840Y0();
                    C13706o.m87928e(Y02, "macroGuid");
                    C4878b.m18869h("Exporing log failed: " + e, Y02.longValue());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            for (SystemLogEntry systemLogEntry : (List) obj2) {
                byte[] bytes2 = (ExportLogAction.logDateTimeFormat.format(C13654b.m87835c(systemLogEntry.mo28691g())) + " - " + systemLogEntry.mo28688e() + 10).getBytes(C15147d.f64349b);
                C13706o.m87928e(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes2);
            }
            outputStream.close();
            return C13339u.f61331a;
        }
    }

    public ExportLogAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ExportLogAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m10582A3(Activity activity, C4023j0.C4028e eVar, ExportLogAction exportLogAction, View view) {
        C13706o.m87929f(eVar, "$subjectMagicTextListener");
        C13706o.m87929f(exportLogAction, "this$0");
        C4023j0.m15698D(activity, eVar, exportLogAction.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* renamed from: B3 */
    private final String[] m10583B3() {
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        return new String[]{aVar.mo27303b().getString(C17541R$string.user_log), aVar.mo27303b().getString(C17541R$string.action_clear_log_option_system_log)};
    }

    /* renamed from: D1 */
    private final void m10584D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38299d(this);
    }

    /* renamed from: D3 */
    private final void m10585D3() {
        try {
            mo27850j0().startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 0);
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.select_export_directory, 1).show();
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: u3 */
    private final void m10597u3(String str) {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.export_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_export_log);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        View findViewById = appCompatDialog.findViewById(C17532R$id.exportdialog_filename);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById2);
        Button button = (Button) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById3);
        Button button2 = (Button) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.export_dialog_export_path);
        C13706o.m87926c(findViewById4);
        TextView textView = (TextView) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.export_dialog_folder_chooser);
        C13706o.m87926c(findViewById5);
        Button button3 = (Button) findViewById5;
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.fileExtension);
        C13706o.m87926c(findViewById6);
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.export_dialog_filename_magic_text_chooser);
        C13706o.m87926c(findViewById7);
        Button button4 = (Button) findViewById7;
        ((TextView) findViewById6).setText(".txt");
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            textView.setText(str);
        } else {
            String str2 = this.filePath;
            if (str2 == null || str2.length() == 0) {
                textView.setText('<' + SelectableItem.m15535j1(C17541R$string.select_export_directory) + '>');
            } else {
                textView.setText(this.filePath);
            }
        }
        String str3 = this.workingFilename;
        if (!(str3 == null || str3.length() == 0)) {
            editText.setText(this.workingFilename);
            editText.setSelection(editText.length());
        } else {
            String str4 = this.fileName;
            if (str4 != null) {
                editText.setText(str4);
                editText.setSelection(editText.length());
            }
        }
        button3.setOnClickListener(new C3359q4(this, appCompatDialog));
        Editable text = editText.getText();
        C13706o.m87928e(text, "filename.text");
        if (text.length() > 0) {
            CharSequence text2 = textView.getText();
            if (!C13706o.m87924a(text2, '<' + SelectableItem.m15535j1(C17541R$string.select_export_directory) + '>')) {
                z = true;
            }
        }
        button.setEnabled(z);
        editText.setSelection(editText.getText().length());
        editText.addTextChangedListener(new C2429c(button, editText, textView, this));
        button.setOnClickListener(new C3331p4(this, editText, textView, appCompatDialog));
        button2.setOnClickListener(new C3301o4(appCompatDialog));
        button4.setOnClickListener(new C3273n4(j0, new C3387r4(editText), this));
        appCompatDialog.show();
    }

    /* renamed from: v3 */
    static /* synthetic */ void m10598v3(ExportLogAction exportLogAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        exportLogAction.m10597u3(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m10599w3(ExportLogAction exportLogAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(exportLogAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        exportLogAction.m10585D3();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m10600x3(ExportLogAction exportLogAction, EditText editText, TextView textView, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(exportLogAction, "this$0");
        C13706o.m87929f(editText, "$filename");
        C13706o.m87929f(textView, "$exportPath");
        C13706o.m87929f(appCompatDialog, "$dialog");
        String str = exportLogAction.workingPathUri;
        if (str == null) {
            str = exportLogAction.pathUri;
        }
        DocumentFile fromTreeUri = DocumentFile.fromTreeUri(exportLogAction.mo27827K0(), Uri.parse(str));
        C13706o.m87926c(fromTreeUri);
        if (!fromTreeUri.canRead() || !fromTreeUri.canWrite()) {
            C15626c.makeText(exportLogAction.mo27827K0(), C17541R$string.please_reconigiure_file_path_to_accessible_location, 1).show();
            return;
        }
        exportLogAction.needsFileReconfiguration = false;
        exportLogAction.fileName = editText.getText().toString();
        exportLogAction.filePath = textView.getText().toString();
        exportLogAction.displayPath = textView.getText().toString();
        String str2 = exportLogAction.workingPathUri;
        if (str2 != null) {
            exportLogAction.pathUri = str2;
        }
        appCompatDialog.dismiss();
        exportLogAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m10601y3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m10602z3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$filename");
        C13706o.m87929f(fVar, "pair");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* renamed from: C3 */
    public final MacroDroidRoomDatabase mo25021C3() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f7228d;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.userLog ^ true ? 1 : 0;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return !this.needsFileReconfiguration;
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (!mo24824M1()) {
            return SelectableItem.m15535j1(C17541R$string.please_reconigiure_file_path_to_accessible_location);
        }
        return null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = m10583B3()[!this.userLog];
        C13706o.m87928e(str, "getOptions()[if (userLog) 0 else 1]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7873x0.f18937j.mo37776a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
        String str = this.pathUri;
        if (str != null) {
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), Uri.parse(str));
            if (SystemClock.elapsedRealtime() / ((long) 1000) > 90) {
                C13706o.m87926c(fromTreeUri);
                if (!fromTreeUri.canWrite()) {
                    this.needsFileReconfiguration = true;
                    C4878b.m18868g("Cannot access export path: " + this.displayPath);
                    C6459y0.m24788b(mo27827K0(), mo27837X0().getName());
                }
            }
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2430d(this, C4023j0.m15760t0(mo27827K0(), this.fileName, triggerContextInfo, mo27837X0()) + ".txt", (C13635d<? super C2430d>) null), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10583B3();
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i2 == -1) {
            mo27877y2(activity);
            Uri data = intent != null ? intent.getData() : null;
            ContentResolver contentResolver = mo27827K0().getContentResolver();
            C13706o.m87926c(data);
            contentResolver.takePersistableUriPermission(data, 3);
            this.workingPathUri = data.toString();
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), data);
            DocumentFile G = C4061t1.m15956G(fromTreeUri);
            StringBuilder sb = new StringBuilder();
            sb.append(G != null ? G.getName() : "");
            sb.append('/');
            C13706o.m87926c(fromTreeUri);
            sb.append(fromTreeUri.getName());
            String sb2 = sb.toString();
            this.temporaryPathName = sb2;
            C13706o.m87926c(sb2);
            if (C15176v.m93634I(sb2, "primary:", false, 2, (Object) null)) {
                String str = this.temporaryPathName;
                C13706o.m87926c(str);
                String substring = str.substring(8);
                C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                this.temporaryPathName = substring;
            }
            m10597u3(this.temporaryPathName);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m10598v3(this, (String) null, 1, (Object) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.userLog ? 1 : 0);
        parcel.writeString(this.filePath);
        parcel.writeString(this.fileName);
        parcel.writeString(this.pathUri);
        parcel.writeString(this.displayPath);
        parcel.writeInt(this.needsFileReconfiguration ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.userLog = i == 0;
    }

    private ExportLogAction() {
        m10584D1();
        this.userLog = true;
    }

    private ExportLogAction(Parcel parcel) {
        super(parcel);
        m10584D1();
        boolean z = true;
        this.userLog = parcel.readInt() == 0;
        this.filePath = parcel.readString();
        this.fileName = parcel.readString();
        this.pathUri = parcel.readString();
        this.displayPath = parcel.readString();
        this.needsFileReconfiguration = parcel.readInt() == 0 ? false : z;
    }
}
