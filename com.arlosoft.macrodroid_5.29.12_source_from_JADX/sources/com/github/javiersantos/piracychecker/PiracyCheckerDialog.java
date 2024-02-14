package com.github.javiersantos.piracychecker;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.github.javiersantos.piracychecker.utils.LibraryUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/content/Context;", "context", "Lja/u;", "Z", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "<init>", "()V", "f", "Companion", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyCheckerDialog.kt */
public final class PiracyCheckerDialog extends DialogFragment {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static PiracyCheckerDialog f16300a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f16301c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f16302d;

    /* renamed from: f */
    public static final Companion f16303f = new Companion((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog$Companion;", "", "", "dialogTitle", "dialogContent", "Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;", "a", "content", "Ljava/lang/String;", "pcDialog", "Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;", "title", "<init>", "()V", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* compiled from: PiracyCheckerDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final PiracyCheckerDialog mo34348a(String str, String str2) {
            C13706o.m87930g(str, "dialogTitle");
            C13706o.m87930g(str2, "dialogContent");
            PiracyCheckerDialog.f16300a = new PiracyCheckerDialog();
            PiracyCheckerDialog.f16301c = str;
            PiracyCheckerDialog.f16302d = str2;
            return PiracyCheckerDialog.f16300a;
        }
    }

    /* renamed from: Z */
    public final void mo34347Z(Context context) {
        PiracyCheckerDialog piracyCheckerDialog;
        C13706o.m87930g(context, "context");
        if (!(context instanceof AppCompatActivity)) {
            context = null;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        if (appCompatActivity != null && (piracyCheckerDialog = f16300a) != null) {
            piracyCheckerDialog.show(appCompatActivity.getSupportFragmentManager(), "[LICENSE_DIALOG]");
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog;
        super.onCreateDialog(bundle);
        setCancelable(false);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String str = f16301c;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = f16302d;
            if (str3 != null) {
                str2 = str3;
            }
            alertDialog = LibraryUtilsKt.m26247a(activity, str, str2);
        } else {
            alertDialog = null;
        }
        if (alertDialog == null) {
            C13706o.m87939p();
        }
        return alertDialog;
    }
}
