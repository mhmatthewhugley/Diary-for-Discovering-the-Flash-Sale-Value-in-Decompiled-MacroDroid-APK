package com.google.android.play.core.splitinstall;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class SplitInstallRequest {

    /* renamed from: a */
    private final List f51791a;

    /* renamed from: b */
    private final List f51792b;

    /* compiled from: com.google.android.play:core@@1.10.3 */
    public static class Builder {

        /* renamed from: a */
        private final List f51793a = new ArrayList();

        /* renamed from: b */
        private final List f51794b = new ArrayList();

        private Builder() {
        }
    }

    /* renamed from: a */
    public List<Locale> mo59961a() {
        return this.f51792b;
    }

    /* renamed from: b */
    public List<String> mo59962b() {
        return this.f51791a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f51791a, this.f51792b});
    }
}
