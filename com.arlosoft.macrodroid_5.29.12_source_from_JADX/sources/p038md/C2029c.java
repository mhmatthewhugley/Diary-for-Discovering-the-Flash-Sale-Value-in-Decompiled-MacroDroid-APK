package p038md;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¨\u0006\u000b"}, mo71668d2 = {"Landroid/content/Context;", "", "message", "title", "Lkotlin/Function1;", "Lmd/a;", "Landroid/content/DialogInterface;", "Lja/u;", "init", "Landroid/app/AlertDialog;", "a", "commons-base_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: md.c */
/* compiled from: AndroidDialogs.kt */
public final class C2029c {
    /* renamed from: a */
    public static final C2025a<AlertDialog> m8416a(Context context, CharSequence charSequence, CharSequence charSequence2, C16265l<? super C2025a<? extends DialogInterface>, C13339u> lVar) {
        C13706o.m87930g(context, "receiver$0");
        C13706o.m87930g(charSequence, "message");
        C2026b bVar = new C2026b(context);
        if (charSequence2 != null) {
            bVar.mo24113e(charSequence2);
        }
        bVar.mo24112d(charSequence);
        if (lVar != null) {
            lVar.invoke(bVar);
        }
        return bVar;
    }
}
