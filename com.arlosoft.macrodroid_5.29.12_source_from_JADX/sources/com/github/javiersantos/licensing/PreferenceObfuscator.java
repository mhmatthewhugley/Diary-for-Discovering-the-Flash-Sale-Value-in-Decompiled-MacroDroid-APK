package com.github.javiersantos.licensing;

import android.content.SharedPreferences;

public class PreferenceObfuscator {

    /* renamed from: a */
    private final SharedPreferences f16236a;

    /* renamed from: b */
    private final Obfuscator f16237b;

    /* renamed from: c */
    private SharedPreferences.Editor f16238c;

    /* renamed from: a */
    public void mo34335a() {
        SharedPreferences.Editor editor = this.f16238c;
        if (editor != null) {
            editor.commit();
            this.f16238c = null;
        }
    }

    /* renamed from: b */
    public void mo34336b(String str, String str2) {
        if (this.f16238c == null) {
            this.f16238c = this.f16236a.edit();
        }
        this.f16238c.putString(str, this.f16237b.mo34315a(str2, str));
    }
}
