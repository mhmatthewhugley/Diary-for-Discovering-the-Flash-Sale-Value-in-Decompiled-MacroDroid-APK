package androidx.core.content;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\b"}, mo71668d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lja/u;", "action", "edit", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: SharedPreferences.kt */
public final class SharedPreferencesKt {
    public static final void edit(SharedPreferences sharedPreferences, boolean z, C16265l<? super SharedPreferences.Editor, C13339u> lVar) {
        C13706o.m87929f(sharedPreferences, "<this>");
        C13706o.m87929f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C13706o.m87928e(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        C13706o.m87929f(sharedPreferences, "<this>");
        C13706o.m87929f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C13706o.m87928e(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
