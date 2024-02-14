package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User;
import com.google.firebase.crashlytics.internal.model.C1897xfe724d07;
import com.google.firebase.crashlytics.internal.model.C1899xc2f5febc;
import com.google.firebase.crashlytics.internal.model.C1901x7c929f5b;
import com.google.firebase.crashlytics.internal.model.C1903x7e3e3ebd;
import com.google.firebase.crashlytics.internal.model.C1905xce3d994b;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

@AutoValue
@Encodable
public abstract class CrashlyticsReport {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Charset f5419a = Charset.forName("UTF-8");

    @AutoValue
    public static abstract class ApplicationExitInfo {

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            /* renamed from: a */
            public abstract ApplicationExitInfo mo23165a();

            @NonNull
            /* renamed from: b */
            public abstract Builder mo23166b(@NonNull int i);

            @NonNull
            /* renamed from: c */
            public abstract Builder mo23167c(@NonNull int i);

            @NonNull
            /* renamed from: d */
            public abstract Builder mo23168d(@NonNull String str);

            @NonNull
            /* renamed from: e */
            public abstract Builder mo23169e(@NonNull long j);

            @NonNull
            /* renamed from: f */
            public abstract Builder mo23170f(@NonNull int i);

            @NonNull
            /* renamed from: g */
            public abstract Builder mo23171g(@NonNull long j);

            @NonNull
            /* renamed from: h */
            public abstract Builder mo23172h(@NonNull long j);

            @NonNull
            /* renamed from: i */
            public abstract Builder mo23173i(@Nullable String str);
        }

        @NonNull
        /* renamed from: a */
        public static Builder m7192a() {
            return new AutoValue_CrashlyticsReport_ApplicationExitInfo.Builder();
        }

        @NonNull
        /* renamed from: b */
        public abstract int mo23154b();

        @NonNull
        /* renamed from: c */
        public abstract int mo23155c();

        @NonNull
        /* renamed from: d */
        public abstract String mo23156d();

        @NonNull
        /* renamed from: e */
        public abstract long mo23157e();

        @NonNull
        /* renamed from: f */
        public abstract int mo23159f();

        @NonNull
        /* renamed from: g */
        public abstract long mo23160g();

        @NonNull
        /* renamed from: h */
        public abstract long mo23161h();

        @Nullable
        /* renamed from: i */
        public abstract String mo23163i();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
    }

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract CrashlyticsReport mo23145a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo23146b(@NonNull String str);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo23147c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo23148d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract Builder mo23149e(@NonNull String str);

        @NonNull
        /* renamed from: f */
        public abstract Builder mo23150f(FilesPayload filesPayload);

        @NonNull
        /* renamed from: g */
        public abstract Builder mo23151g(int i);

        @NonNull
        /* renamed from: h */
        public abstract Builder mo23152h(@NonNull String str);

        @NonNull
        /* renamed from: i */
        public abstract Builder mo23153i(@NonNull Session session);
    }

    @AutoValue
    public static abstract class CustomAttribute {

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            /* renamed from: a */
            public abstract CustomAttribute mo23179a();

            @NonNull
            /* renamed from: b */
            public abstract Builder mo23180b(@NonNull String str);

            @NonNull
            /* renamed from: c */
            public abstract Builder mo23181c(@NonNull String str);
        }

        @NonNull
        /* renamed from: a */
        public static Builder m7219a() {
            return new AutoValue_CrashlyticsReport_CustomAttribute.Builder();
        }

        @NonNull
        /* renamed from: b */
        public abstract String mo23174b();

        @NonNull
        /* renamed from: c */
        public abstract String mo23175c();
    }

    @AutoValue
    public static abstract class FilesPayload {

        @AutoValue.Builder
        public static abstract class Builder {
            /* renamed from: a */
            public abstract FilesPayload mo23187a();

            /* renamed from: b */
            public abstract Builder mo23188b(ImmutableList<File> immutableList);

            /* renamed from: c */
            public abstract Builder mo23189c(String str);
        }

        @AutoValue
        public static abstract class File {

            @AutoValue.Builder
            public static abstract class Builder {
                /* renamed from: a */
                public abstract File mo23195a();

                /* renamed from: b */
                public abstract Builder mo23196b(byte[] bArr);

                /* renamed from: c */
                public abstract Builder mo23197c(String str);
            }

            @NonNull
            /* renamed from: a */
            public static Builder m7231a() {
                return new AutoValue_CrashlyticsReport_FilesPayload_File.Builder();
            }

            @NonNull
            /* renamed from: b */
            public abstract byte[] mo23190b();

            @NonNull
            /* renamed from: c */
            public abstract String mo23191c();
        }

        @NonNull
        /* renamed from: a */
        public static Builder m7225a() {
            return new AutoValue_CrashlyticsReport_FilesPayload.Builder();
        }

        @NonNull
        /* renamed from: b */
        public abstract ImmutableList<File> mo23182b();

        @Nullable
        /* renamed from: c */
        public abstract String mo23183c();
    }

    @AutoValue
    public static abstract class Session {

        @AutoValue
        public static abstract class Application {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                /* renamed from: a */
                public abstract Application mo23235a();

                @NonNull
                /* renamed from: b */
                public abstract Builder mo23236b(@Nullable String str);

                @NonNull
                /* renamed from: c */
                public abstract Builder mo23237c(@Nullable String str);

                @NonNull
                /* renamed from: d */
                public abstract Builder mo23238d(@NonNull String str);

                @NonNull
                /* renamed from: e */
                public abstract Builder mo23239e(@NonNull String str);

                @NonNull
                /* renamed from: f */
                public abstract Builder mo23240f(@NonNull String str);

                @NonNull
                /* renamed from: g */
                public abstract Builder mo23241g(@NonNull String str);
            }

            @AutoValue
            public static abstract class Organization {

                @AutoValue.Builder
                public static abstract class Builder {
                }

                @NonNull
                /* renamed from: a */
                public abstract String mo23242a();
            }

            @NonNull
            /* renamed from: a */
            public static Builder m7253a() {
                return new AutoValue_CrashlyticsReport_Session_Application.Builder();
            }

            @Nullable
            /* renamed from: b */
            public abstract String mo23225b();

            @Nullable
            /* renamed from: c */
            public abstract String mo23226c();

            @Nullable
            /* renamed from: d */
            public abstract String mo23227d();

            @NonNull
            /* renamed from: e */
            public abstract String mo23228e();

            @Nullable
            /* renamed from: f */
            public abstract String mo23230f();

            @Nullable
            /* renamed from: g */
            public abstract Organization mo23231g();

            @NonNull
            /* renamed from: h */
            public abstract String mo23232h();
        }

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            /* renamed from: a */
            public abstract Session mo23213a();

            @NonNull
            /* renamed from: b */
            public abstract Builder mo23214b(@NonNull Application application);

            @NonNull
            /* renamed from: c */
            public abstract Builder mo23215c(boolean z);

            @NonNull
            /* renamed from: d */
            public abstract Builder mo23216d(@NonNull Device device);

            @NonNull
            /* renamed from: e */
            public abstract Builder mo23217e(@NonNull Long l);

            @NonNull
            /* renamed from: f */
            public abstract Builder mo23218f(@NonNull ImmutableList<Event> immutableList);

            @NonNull
            /* renamed from: g */
            public abstract Builder mo23219g(@NonNull String str);

            @NonNull
            /* renamed from: h */
            public abstract Builder mo23220h(int i);

            @NonNull
            /* renamed from: i */
            public abstract Builder mo23221i(@NonNull String str);

            @NonNull
            /* renamed from: j */
            public Builder mo23451j(@NonNull byte[] bArr) {
                return mo23221i(new String(bArr, CrashlyticsReport.f5419a));
            }

            @NonNull
            /* renamed from: k */
            public abstract Builder mo23222k(@NonNull OperatingSystem operatingSystem);

            @NonNull
            /* renamed from: l */
            public abstract Builder mo23223l(long j);

            @NonNull
            /* renamed from: m */
            public abstract Builder mo23224m(@NonNull User user);
        }

        @AutoValue
        public static abstract class Device {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                /* renamed from: a */
                public abstract Device mo23258a();

                @NonNull
                /* renamed from: b */
                public abstract Builder mo23259b(int i);

                @NonNull
                /* renamed from: c */
                public abstract Builder mo23260c(int i);

                @NonNull
                /* renamed from: d */
                public abstract Builder mo23261d(long j);

                @NonNull
                /* renamed from: e */
                public abstract Builder mo23262e(@NonNull String str);

                @NonNull
                /* renamed from: f */
                public abstract Builder mo23263f(@NonNull String str);

                @NonNull
                /* renamed from: g */
                public abstract Builder mo23264g(@NonNull String str);

                @NonNull
                /* renamed from: h */
                public abstract Builder mo23265h(long j);

                @NonNull
                /* renamed from: i */
                public abstract Builder mo23266i(boolean z);

                @NonNull
                /* renamed from: j */
                public abstract Builder mo23267j(int i);
            }

            @NonNull
            /* renamed from: a */
            public static Builder m7282a() {
                return new AutoValue_CrashlyticsReport_Session_Device.Builder();
            }

            @NonNull
            /* renamed from: b */
            public abstract int mo23246b();

            /* renamed from: c */
            public abstract int mo23247c();

            /* renamed from: d */
            public abstract long mo23248d();

            @NonNull
            /* renamed from: e */
            public abstract String mo23249e();

            @NonNull
            /* renamed from: f */
            public abstract String mo23251f();

            @NonNull
            /* renamed from: g */
            public abstract String mo23252g();

            /* renamed from: h */
            public abstract long mo23253h();

            /* renamed from: i */
            public abstract int mo23255i();

            /* renamed from: j */
            public abstract boolean mo23256j();
        }

        @AutoValue
        public static abstract class Event {

            @AutoValue
            public static abstract class Application {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    /* renamed from: a */
                    public abstract Application mo23292a();

                    @NonNull
                    /* renamed from: b */
                    public abstract Builder mo23293b(@Nullable Boolean bool);

                    @NonNull
                    /* renamed from: c */
                    public abstract Builder mo23294c(@NonNull ImmutableList<CustomAttribute> immutableList);

                    @NonNull
                    /* renamed from: d */
                    public abstract Builder mo23295d(@NonNull Execution execution);

                    @NonNull
                    /* renamed from: e */
                    public abstract Builder mo23296e(@NonNull ImmutableList<CustomAttribute> immutableList);

                    @NonNull
                    /* renamed from: f */
                    public abstract Builder mo23297f(int i);
                }

                @AutoValue
                public static abstract class Execution {

                    @AutoValue
                    public static abstract class BinaryImage {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            /* renamed from: a */
                            public abstract BinaryImage mo23319a();

                            @NonNull
                            /* renamed from: b */
                            public abstract Builder mo23320b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract Builder mo23321c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract Builder mo23322d(long j);

                            @NonNull
                            /* renamed from: e */
                            public abstract Builder mo23323e(@Nullable String str);

                            @NonNull
                            /* renamed from: f */
                            public Builder mo23453f(@NonNull byte[] bArr) {
                                return mo23323e(new String(bArr, CrashlyticsReport.f5419a));
                            }
                        }

                        @NonNull
                        /* renamed from: a */
                        public static Builder m7328a() {
                            return new C1897xfe724d07.Builder();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo23312b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo23313c();

                        /* renamed from: d */
                        public abstract long mo23314d();

                        @Encodable.Ignore
                        @Nullable
                        /* renamed from: e */
                        public abstract String mo23315e();

                        @Nullable
                        @Encodable.Field
                        /* renamed from: f */
                        public byte[] mo23452f() {
                            String e = mo23315e();
                            if (e != null) {
                                return e.getBytes(CrashlyticsReport.f5419a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    public static abstract class Builder {
                        @NonNull
                        /* renamed from: a */
                        public abstract Execution mo23306a();

                        @NonNull
                        /* renamed from: b */
                        public abstract Builder mo23307b(@NonNull ApplicationExitInfo applicationExitInfo);

                        @NonNull
                        /* renamed from: c */
                        public abstract Builder mo23308c(@NonNull ImmutableList<BinaryImage> immutableList);

                        @NonNull
                        /* renamed from: d */
                        public abstract Builder mo23309d(@NonNull Exception exception);

                        @NonNull
                        /* renamed from: e */
                        public abstract Builder mo23310e(@NonNull Signal signal);

                        @NonNull
                        /* renamed from: f */
                        public abstract Builder mo23311f(@NonNull ImmutableList<Thread> immutableList);
                    }

                    @AutoValue
                    public static abstract class Exception {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            /* renamed from: a */
                            public abstract Exception mo23332a();

                            @NonNull
                            /* renamed from: b */
                            public abstract Builder mo23333b(@NonNull Exception exception);

                            @NonNull
                            /* renamed from: c */
                            public abstract Builder mo23334c(@NonNull ImmutableList<Thread.Frame> immutableList);

                            @NonNull
                            /* renamed from: d */
                            public abstract Builder mo23335d(int i);

                            @NonNull
                            /* renamed from: e */
                            public abstract Builder mo23336e(@NonNull String str);

                            @NonNull
                            /* renamed from: f */
                            public abstract Builder mo23337f(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static Builder m7346a() {
                            return new C1899xc2f5febc.Builder();
                        }

                        @Nullable
                        /* renamed from: b */
                        public abstract Exception mo23324b();

                        @NonNull
                        /* renamed from: c */
                        public abstract ImmutableList<Thread.Frame> mo23325c();

                        /* renamed from: d */
                        public abstract int mo23326d();

                        @Nullable
                        /* renamed from: e */
                        public abstract String mo23327e();

                        @NonNull
                        /* renamed from: f */
                        public abstract String mo23329f();
                    }

                    @AutoValue
                    public static abstract class Signal {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            /* renamed from: a */
                            public abstract Signal mo23344a();

                            @NonNull
                            /* renamed from: b */
                            public abstract Builder mo23345b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract Builder mo23346c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract Builder mo23347d(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static Builder m7358a() {
                            return new C1901x7c929f5b.Builder();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo23338b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo23339c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo23340d();
                    }

                    @AutoValue
                    public static abstract class Thread {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            /* renamed from: a */
                            public abstract Thread mo23354a();

                            @NonNull
                            /* renamed from: b */
                            public abstract Builder mo23355b(@NonNull ImmutableList<Frame> immutableList);

                            @NonNull
                            /* renamed from: c */
                            public abstract Builder mo23356c(int i);

                            @NonNull
                            /* renamed from: d */
                            public abstract Builder mo23357d(@NonNull String str);
                        }

                        @AutoValue
                        public static abstract class Frame {

                            @AutoValue.Builder
                            public static abstract class Builder {
                                @NonNull
                                /* renamed from: a */
                                public abstract Frame mo23366a();

                                @NonNull
                                /* renamed from: b */
                                public abstract Builder mo23367b(@NonNull String str);

                                @NonNull
                                /* renamed from: c */
                                public abstract Builder mo23368c(int i);

                                @NonNull
                                /* renamed from: d */
                                public abstract Builder mo23369d(long j);

                                @NonNull
                                /* renamed from: e */
                                public abstract Builder mo23370e(long j);

                                @NonNull
                                /* renamed from: f */
                                public abstract Builder mo23371f(@NonNull String str);
                            }

                            @NonNull
                            /* renamed from: a */
                            public static Builder m7374a() {
                                return new C1905xce3d994b.Builder();
                            }

                            @Nullable
                            /* renamed from: b */
                            public abstract String mo23358b();

                            /* renamed from: c */
                            public abstract int mo23359c();

                            /* renamed from: d */
                            public abstract long mo23360d();

                            /* renamed from: e */
                            public abstract long mo23361e();

                            @NonNull
                            /* renamed from: f */
                            public abstract String mo23363f();
                        }

                        @NonNull
                        /* renamed from: a */
                        public static Builder m7366a() {
                            return new C1903x7e3e3ebd.Builder();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract ImmutableList<Frame> mo23348b();

                        /* renamed from: c */
                        public abstract int mo23349c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo23350d();
                    }

                    @NonNull
                    /* renamed from: a */
                    public static Builder m7322a() {
                        return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder();
                    }

                    @Nullable
                    /* renamed from: b */
                    public abstract ApplicationExitInfo mo23298b();

                    @NonNull
                    /* renamed from: c */
                    public abstract ImmutableList<BinaryImage> mo23299c();

                    @Nullable
                    /* renamed from: d */
                    public abstract Exception mo23300d();

                    @NonNull
                    /* renamed from: e */
                    public abstract Signal mo23301e();

                    @Nullable
                    /* renamed from: f */
                    public abstract ImmutableList<Thread> mo23303f();
                }

                @NonNull
                /* renamed from: a */
                public static Builder m7309a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Application.Builder();
                }

                @Nullable
                /* renamed from: b */
                public abstract Boolean mo23283b();

                @Nullable
                /* renamed from: c */
                public abstract ImmutableList<CustomAttribute> mo23284c();

                @NonNull
                /* renamed from: d */
                public abstract Execution mo23285d();

                @Nullable
                /* renamed from: e */
                public abstract ImmutableList<CustomAttribute> mo23286e();

                /* renamed from: f */
                public abstract int mo23288f();

                @NonNull
                /* renamed from: g */
                public abstract Builder mo23289g();
            }

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                /* renamed from: a */
                public abstract Event mo23277a();

                @NonNull
                /* renamed from: b */
                public abstract Builder mo23278b(@NonNull Application application);

                @NonNull
                /* renamed from: c */
                public abstract Builder mo23279c(@NonNull Device device);

                @NonNull
                /* renamed from: d */
                public abstract Builder mo23280d(@NonNull Log log);

                @NonNull
                /* renamed from: e */
                public abstract Builder mo23281e(long j);

                @NonNull
                /* renamed from: f */
                public abstract Builder mo23282f(@NonNull String str);
            }

            @AutoValue
            public static abstract class Device {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    /* renamed from: a */
                    public abstract Device mo23381a();

                    @NonNull
                    /* renamed from: b */
                    public abstract Builder mo23382b(Double d);

                    @NonNull
                    /* renamed from: c */
                    public abstract Builder mo23383c(int i);

                    @NonNull
                    /* renamed from: d */
                    public abstract Builder mo23384d(long j);

                    @NonNull
                    /* renamed from: e */
                    public abstract Builder mo23385e(int i);

                    @NonNull
                    /* renamed from: f */
                    public abstract Builder mo23386f(boolean z);

                    @NonNull
                    /* renamed from: g */
                    public abstract Builder mo23387g(long j);
                }

                @NonNull
                /* renamed from: a */
                public static Builder m7392a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Device.Builder();
                }

                @Nullable
                /* renamed from: b */
                public abstract Double mo23372b();

                /* renamed from: c */
                public abstract int mo23373c();

                /* renamed from: d */
                public abstract long mo23374d();

                /* renamed from: e */
                public abstract int mo23375e();

                /* renamed from: f */
                public abstract long mo23377f();

                /* renamed from: g */
                public abstract boolean mo23378g();
            }

            @AutoValue
            public static abstract class Log {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    /* renamed from: a */
                    public abstract Log mo23392a();

                    @NonNull
                    /* renamed from: b */
                    public abstract Builder mo23393b(@NonNull String str);
                }

                @NonNull
                /* renamed from: a */
                public static Builder m7406a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Log.Builder();
                }

                @NonNull
                /* renamed from: b */
                public abstract String mo23388b();
            }

            @NonNull
            /* renamed from: a */
            public static Builder m7302a() {
                return new AutoValue_CrashlyticsReport_Session_Event.Builder();
            }

            @NonNull
            /* renamed from: b */
            public abstract Application mo23268b();

            @NonNull
            /* renamed from: c */
            public abstract Device mo23269c();

            @Nullable
            /* renamed from: d */
            public abstract Log mo23270d();

            /* renamed from: e */
            public abstract long mo23271e();

            @NonNull
            /* renamed from: f */
            public abstract String mo23273f();

            @NonNull
            /* renamed from: g */
            public abstract Builder mo23274g();
        }

        @AutoValue
        public static abstract class OperatingSystem {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                /* renamed from: a */
                public abstract OperatingSystem mo23401a();

                @NonNull
                /* renamed from: b */
                public abstract Builder mo23402b(@NonNull String str);

                @NonNull
                /* renamed from: c */
                public abstract Builder mo23403c(boolean z);

                @NonNull
                /* renamed from: d */
                public abstract Builder mo23404d(int i);

                @NonNull
                /* renamed from: e */
                public abstract Builder mo23405e(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static Builder m7410a() {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo23394b();

            /* renamed from: c */
            public abstract int mo23395c();

            @NonNull
            /* renamed from: d */
            public abstract String mo23396d();

            /* renamed from: e */
            public abstract boolean mo23397e();
        }

        @AutoValue
        public static abstract class User {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                /* renamed from: a */
                public abstract User mo23410a();

                @NonNull
                /* renamed from: b */
                public abstract Builder mo23411b(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static Builder m7420a() {
                return new AutoValue_CrashlyticsReport_Session_User.Builder();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo23406b();
        }

        @NonNull
        /* renamed from: a */
        public static Builder m7237a() {
            return new AutoValue_CrashlyticsReport_Session.Builder().mo23215c(false);
        }

        @NonNull
        /* renamed from: b */
        public abstract Application mo23198b();

        @Nullable
        /* renamed from: c */
        public abstract Device mo23199c();

        @Nullable
        /* renamed from: d */
        public abstract Long mo23200d();

        @Nullable
        /* renamed from: e */
        public abstract ImmutableList<Event> mo23201e();

        @NonNull
        /* renamed from: f */
        public abstract String mo23203f();

        /* renamed from: g */
        public abstract int mo23204g();

        @NonNull
        @Encodable.Ignore
        /* renamed from: h */
        public abstract String mo23205h();

        @NonNull
        @Encodable.Field
        /* renamed from: i */
        public byte[] mo23448i() {
            return mo23205h().getBytes(CrashlyticsReport.f5419a);
        }

        @Nullable
        /* renamed from: j */
        public abstract OperatingSystem mo23207j();

        /* renamed from: k */
        public abstract long mo23208k();

        @Nullable
        /* renamed from: l */
        public abstract User mo23209l();

        /* renamed from: m */
        public abstract boolean mo23210m();

        @NonNull
        /* renamed from: n */
        public abstract Builder mo23211n();

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: o */
        public Session mo23449o(@NonNull ImmutableList<Event> immutableList) {
            return mo23211n().mo23218f(immutableList).mo23213a();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: p */
        public Session mo23450p(long j, boolean z, @Nullable String str) {
            Builder n = mo23211n();
            n.mo23217e(Long.valueOf(j));
            n.mo23215c(z);
            if (str != null) {
                n.mo23224m(User.m7420a().mo23411b(str).mo23410a());
            }
            return n.mo23213a();
        }
    }

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @NonNull
    /* renamed from: b */
    public static Builder m7179b() {
        return new AutoValue_CrashlyticsReport.Builder();
    }

    @NonNull
    /* renamed from: c */
    public abstract String mo23133c();

    @NonNull
    /* renamed from: d */
    public abstract String mo23134d();

    @NonNull
    /* renamed from: e */
    public abstract String mo23135e();

    @NonNull
    /* renamed from: f */
    public abstract String mo23137f();

    @Nullable
    /* renamed from: g */
    public abstract FilesPayload mo23138g();

    /* renamed from: h */
    public abstract int mo23139h();

    @NonNull
    /* renamed from: i */
    public abstract String mo23141i();

    @Nullable
    /* renamed from: j */
    public abstract Session mo23142j();

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: k */
    public abstract Builder mo23143k();

    @NonNull
    /* renamed from: l */
    public CrashlyticsReport mo23445l(@NonNull ImmutableList<Session.Event> immutableList) {
        if (mo23142j() != null) {
            return mo23143k().mo23153i(mo23142j().mo23449o(immutableList)).mo23145a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    /* renamed from: m */
    public CrashlyticsReport mo23446m(@NonNull FilesPayload filesPayload) {
        return mo23143k().mo23153i((Session) null).mo23150f(filesPayload).mo23145a();
    }

    @NonNull
    /* renamed from: n */
    public CrashlyticsReport mo23447n(long j, boolean z, @Nullable String str) {
        Builder k = mo23143k();
        if (mo23142j() != null) {
            k.mo23153i(mo23142j().mo23450p(j, z, str));
        }
        return k.mo23145a();
    }
}
