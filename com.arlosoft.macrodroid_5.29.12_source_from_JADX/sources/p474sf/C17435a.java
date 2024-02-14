package p474sf;

import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\t\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\",\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\b8G@FX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"(\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, mo71668d2 = {"Landroidx/appcompat/app/AlertDialog$Builder;", "", "value", "getTitleResource", "(Landroidx/appcompat/app/AlertDialog$Builder;)I", "c", "(Landroidx/appcompat/app/AlertDialog$Builder;I)V", "titleResource", "", "getTitle", "(Landroidx/appcompat/app/AlertDialog$Builder;)Ljava/lang/CharSequence;", "b", "(Landroidx/appcompat/app/AlertDialog$Builder;Ljava/lang/CharSequence;)V", "title", "getMessageResource", "a", "messageResource", "alertdialog-appcompat_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: sf.a */
/* compiled from: AlertDialog.kt */
public final class C17435a {
    /* renamed from: a */
    public static final void m101223a(AlertDialog.Builder builder, int i) {
        C13706o.m87929f(builder, "$this$messageResource");
        builder.setMessage(i);
    }

    /* renamed from: b */
    public static final void m101224b(AlertDialog.Builder builder, CharSequence charSequence) {
        C13706o.m87929f(builder, "$this$title");
        builder.setTitle(charSequence);
    }

    /* renamed from: c */
    public static final void m101225c(AlertDialog.Builder builder, int i) {
        C13706o.m87929f(builder, "$this$titleResource");
        builder.setTitle(i);
    }
}
