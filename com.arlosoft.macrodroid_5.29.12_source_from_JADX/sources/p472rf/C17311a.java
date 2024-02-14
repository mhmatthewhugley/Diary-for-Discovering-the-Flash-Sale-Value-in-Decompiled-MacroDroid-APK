package p472rf;

import android.app.AlertDialog;
import androidx.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\"*\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"*\u0010\n\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Landroid/app/AlertDialog$Builder;", "", "value", "getTitleResource", "(Landroid/app/AlertDialog$Builder;)I", "b", "(Landroid/app/AlertDialog$Builder;I)V", "titleResource", "getMessageResource", "a", "messageResource", "alertdialog_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: rf.a */
/* compiled from: AlertDialog.kt */
public final class C17311a {
    /* renamed from: a */
    public static final void m101019a(AlertDialog.Builder builder, @StringRes int i) {
        C13706o.m87929f(builder, "$this$messageResource");
        builder.setMessage(i);
    }

    /* renamed from: b */
    public static final void m101020b(AlertDialog.Builder builder, @StringRes int i) {
        C13706o.m87929f(builder, "$this$titleResource");
        builder.setTitle(i);
    }
}
