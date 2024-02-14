package com.google.firebase.crashlytics.internal.model;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

@AutoValue
public abstract class StaticSessionData {

    @AutoValue
    public static abstract class AppData {
        /* renamed from: b */
        public static AppData m7430b(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
            return new AutoValue_StaticSessionData_AppData(str, str2, str3, str4, i, developmentPlatformProvider);
        }

        /* renamed from: a */
        public abstract String mo23418a();

        /* renamed from: c */
        public abstract int mo23419c();

        /* renamed from: d */
        public abstract DevelopmentPlatformProvider mo23420d();

        /* renamed from: e */
        public abstract String mo23421e();

        /* renamed from: f */
        public abstract String mo23423f();

        /* renamed from: g */
        public abstract String mo23424g();
    }

    @AutoValue
    public static abstract class DeviceData {
        /* renamed from: c */
        public static DeviceData m7437c(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new AutoValue_StaticSessionData_DeviceData(i, str, i2, j, j2, z, i3, str2, str3);
        }

        /* renamed from: a */
        public abstract int mo23427a();

        /* renamed from: b */
        public abstract int mo23428b();

        /* renamed from: d */
        public abstract long mo23429d();

        /* renamed from: e */
        public abstract boolean mo23430e();

        /* renamed from: f */
        public abstract String mo23432f();

        /* renamed from: g */
        public abstract String mo23433g();

        /* renamed from: h */
        public abstract String mo23434h();

        /* renamed from: i */
        public abstract int mo23436i();

        /* renamed from: j */
        public abstract long mo23437j();
    }

    @AutoValue
    public static abstract class OsData {
        /* renamed from: a */
        public static OsData m7447a(String str, String str2, boolean z) {
            return new AutoValue_StaticSessionData_OsData(str, str2, z);
        }

        /* renamed from: b */
        public abstract boolean mo23439b();

        /* renamed from: c */
        public abstract String mo23440c();

        /* renamed from: d */
        public abstract String mo23441d();
    }

    /* renamed from: b */
    public static StaticSessionData m7426b(AppData appData, OsData osData, DeviceData deviceData) {
        return new AutoValue_StaticSessionData(appData, osData, deviceData);
    }

    /* renamed from: a */
    public abstract AppData mo23412a();

    /* renamed from: c */
    public abstract DeviceData mo23413c();

    /* renamed from: d */
    public abstract OsData mo23414d();
}
