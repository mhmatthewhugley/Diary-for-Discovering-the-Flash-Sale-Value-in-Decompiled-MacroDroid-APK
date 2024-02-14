package com.arlosoft.macrodroid.templatestore.p071ui.profile;

import android.graphics.Bitmap;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import kotlin.jvm.internal.C13706o;
import p056a1.C2211a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.h */
/* compiled from: ProfileImageProvider.kt */
public final class C5331h {

    /* renamed from: a */
    private final C2211a f13172a = new C2211a();

    /* renamed from: a */
    public final void mo30527a(AvatarView avatarView, Bitmap bitmap, String str) {
        C13706o.m87929f(avatarView, "avatarView");
        C13706o.m87929f(bitmap, "bitmap");
        C13706o.m87929f(str, "imageUsername");
        this.f13172a.mo41153b(avatarView, bitmap, str);
    }

    /* renamed from: b */
    public final void mo30528b(AvatarView avatarView, String str, String str2) {
        C13706o.m87929f(avatarView, "avatarView");
        C13706o.m87929f(str, "imageName");
        C13706o.m87929f(str2, "imageUsername");
        if ((str.length() == 0) || C13706o.m87924a(str, "null")) {
            this.f13172a.mo41155d(avatarView, (String) null, str2);
            return;
        }
        this.f13172a.mo41155d(avatarView, "https://backend.macrodroid.com/profilepics/" + str, str2);
    }
}
