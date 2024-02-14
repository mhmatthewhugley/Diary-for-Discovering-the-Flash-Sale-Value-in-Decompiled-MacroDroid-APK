package p269g9;

import android.content.Context;
import android.content.SharedPreferences;
import dev.skomlach.common.contextprovider.C12104a;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo71668d2 = {"Lg9/a;", "", "", "name", "Landroid/content/SharedPreferences;", "a", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: g9.a */
/* compiled from: SharedPreferenceProvider.kt */
public final class C12317a {

    /* renamed from: a */
    public static final C12317a f58995a = new C12317a();

    /* renamed from: b */
    private static final Context f58996b = C12104a.f58372a.mo68283g();

    private C12317a() {
    }

    /* renamed from: a */
    public final SharedPreferences mo68640a(String str) {
        C13706o.m87929f(str, "name");
        SharedPreferences sharedPreferences = f58996b.getSharedPreferences(str, 0);
        C13706o.m87928e(sharedPreferences, "appContext.getSharedPref…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
