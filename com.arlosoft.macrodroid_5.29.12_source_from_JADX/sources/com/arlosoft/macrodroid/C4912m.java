package com.arlosoft.macrodroid;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;

/* renamed from: com.arlosoft.macrodroid.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4912m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ExportImportActivity f12346a;

    /* renamed from: c */
    public final /* synthetic */ DocumentFile f12347c;

    /* renamed from: d */
    public final /* synthetic */ EditText f12348d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f12349f;

    /* renamed from: g */
    public final /* synthetic */ String f12350g;

    public /* synthetic */ C4912m(ExportImportActivity exportImportActivity, DocumentFile documentFile, EditText editText, AppCompatDialog appCompatDialog, String str) {
        this.f12346a = exportImportActivity;
        this.f12347c = documentFile;
        this.f12348d = editText;
        this.f12349f = appCompatDialog;
        this.f12350g = str;
    }

    public final void onClick(View view) {
        this.f12346a.m9469v2(this.f12347c, this.f12348d, this.f12349f, this.f12350g, view);
    }
}
