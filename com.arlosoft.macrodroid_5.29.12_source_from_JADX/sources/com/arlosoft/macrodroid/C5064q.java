package com.arlosoft.macrodroid;

import android.content.DialogInterface;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;

/* renamed from: com.arlosoft.macrodroid.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5064q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ExportImportActivity f12677a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f12678c;

    /* renamed from: d */
    public final /* synthetic */ String f12679d;

    /* renamed from: f */
    public final /* synthetic */ DocumentFile f12680f;

    /* renamed from: g */
    public final /* synthetic */ EditText f12681g;

    public /* synthetic */ C5064q(ExportImportActivity exportImportActivity, AppCompatDialog appCompatDialog, String str, DocumentFile documentFile, EditText editText) {
        this.f12677a = exportImportActivity;
        this.f12678c = appCompatDialog;
        this.f12679d = str;
        this.f12680f = documentFile;
        this.f12681g = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12677a.m9468u2(this.f12678c, this.f12679d, this.f12680f, this.f12681g, dialogInterface, i);
    }
}
