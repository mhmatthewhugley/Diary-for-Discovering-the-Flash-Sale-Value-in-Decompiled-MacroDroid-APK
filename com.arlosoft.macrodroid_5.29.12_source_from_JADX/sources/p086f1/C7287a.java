package p086f1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import p081e1.C7264a;
import p172u1.C10283c;

/* renamed from: f1.a */
/* compiled from: PreferenceCache */
public class C7287a implements C7264a {

    /* renamed from: a */
    private final SharedPreferences f17795a;

    /* renamed from: b */
    private final Gson f17796b = C10283c.m40414d(true, true).mo64004c();

    public C7287a(@NonNull Context context, @NonNull String str) {
        this.f17795a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public <T> void mo37131a(Gson gson, @NonNull String str, @Nullable T t) {
        this.f17795a.edit().putString(str, t == null ? null : gson.mo63985t(t, t.getClass())).apply();
    }

    /* renamed from: b */
    public <T> void mo37132b(@NonNull String str, @Nullable T t) {
        this.f17795a.edit().putString(str, t == null ? null : this.f17796b.mo63985t(t, t.getClass())).apply();
    }

    /* renamed from: c */
    public <T> T mo37133c(@NonNull String str, @NonNull Class<T> cls) {
        return this.f17796b.mo63976j(this.f17795a.getString(str, (String) null), cls);
    }
}
