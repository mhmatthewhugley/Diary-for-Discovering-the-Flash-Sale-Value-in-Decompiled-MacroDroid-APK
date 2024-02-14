package com.google.firebase.crashlytics.internal.settings;

public class Settings {

    /* renamed from: a */
    public final SessionData f5480a;

    /* renamed from: b */
    public final FeatureFlagData f5481b;

    /* renamed from: c */
    public final long f5482c;

    /* renamed from: d */
    public final int f5483d;

    /* renamed from: e */
    public final int f5484e;

    /* renamed from: f */
    public final double f5485f;

    /* renamed from: g */
    public final double f5486g;

    /* renamed from: h */
    public final int f5487h;

    public static class FeatureFlagData {

        /* renamed from: a */
        public final boolean f5488a;

        /* renamed from: b */
        public final boolean f5489b;

        public FeatureFlagData(boolean z, boolean z2) {
            this.f5488a = z;
            this.f5489b = z2;
        }
    }

    public static class SessionData {

        /* renamed from: a */
        public final int f5490a;

        /* renamed from: b */
        public final int f5491b;

        public SessionData(int i, int i2) {
            this.f5490a = i;
            this.f5491b = i2;
        }
    }

    public Settings(long j, SessionData sessionData, FeatureFlagData featureFlagData, int i, int i2, double d, double d2, int i3) {
        this.f5482c = j;
        this.f5480a = sessionData;
        this.f5481b = featureFlagData;
        this.f5483d = i;
        this.f5484e = i2;
        this.f5485f = d;
        this.f5486g = d2;
        this.f5487h = i3;
    }

    /* renamed from: a */
    public boolean mo23524a(long j) {
        return this.f5482c < j;
    }
}
