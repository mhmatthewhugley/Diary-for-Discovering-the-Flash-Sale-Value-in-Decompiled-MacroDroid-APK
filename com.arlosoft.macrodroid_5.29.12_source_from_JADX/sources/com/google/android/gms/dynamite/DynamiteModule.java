package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class DynamiteModule {
    @NonNull
    @KeepForSdk

    /* renamed from: b */
    public static final VersionPolicy f4040b = new zzf();
    @NonNull
    @KeepForSdk

    /* renamed from: c */
    public static final VersionPolicy f4041c = new zzg();
    @NonNull
    @KeepForSdk

    /* renamed from: d */
    public static final VersionPolicy f4042d = new zzh();
    @NonNull
    @KeepForSdk

    /* renamed from: e */
    public static final VersionPolicy f4043e = new zzi();
    @NonNull
    @KeepForSdk

    /* renamed from: f */
    public static final VersionPolicy f4044f = new zzj();
    @NonNull
    @KeepForSdk

    /* renamed from: g */
    public static final VersionPolicy f4045g = new zzk();
    @Nullable

    /* renamed from: h */
    private static Boolean f4046h = null;
    @Nullable

    /* renamed from: i */
    private static String f4047i = null;

    /* renamed from: j */
    private static boolean f4048j = false;

    /* renamed from: k */
    private static int f4049k = -1;
    @Nullable

    /* renamed from: l */
    private static Boolean f4050l;

    /* renamed from: m */
    private static final ThreadLocal f4051m = new ThreadLocal();

    /* renamed from: n */
    private static final ThreadLocal f4052n = new zzd();

    /* renamed from: o */
    private static final VersionPolicy.IVersions f4053o = new zze();
    @NonNull

    /* renamed from: p */
    public static final VersionPolicy f4054p = new zzl();
    @Nullable

    /* renamed from: q */
    private static zzq f4055q;
    @Nullable

    /* renamed from: r */
    private static zzr f4056r;

    /* renamed from: a */
    private final Context f4057a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class DynamiteLoaderClassLoader {
        @Nullable
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzp) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzp) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface VersionPolicy {

        @KeepForSdk
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public interface IVersions {
            /* renamed from: a */
            int mo22056a(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;

            /* renamed from: b */
            int mo22057b(@NonNull Context context, @NonNull String str);
        }

        @KeepForSdk
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class SelectionResult {
            @KeepForSdk

            /* renamed from: a */
            public int f4058a = 0;
            @KeepForSdk

            /* renamed from: b */
            public int f4059b = 0;
            @KeepForSdk

            /* renamed from: c */
            public int f4060c = 0;
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        SelectionResult mo22055a(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.m4488k(context);
        this.f4057a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m5094a(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.m4470a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static int m5095c(@NonNull Context context, @NonNull String str) {
        return m5097f(context, str, false);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public static DynamiteModule m5096e(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        int i;
        Boolean bool;
        DynamiteModule dynamiteModule;
        IObjectWrapper iObjectWrapper;
        zzr zzr;
        Boolean valueOf;
        IObjectWrapper iObjectWrapper2;
        Context context2 = context;
        VersionPolicy versionPolicy2 = versionPolicy;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal threadLocal = f4051m;
        zzn zzn = (zzn) threadLocal.get();
        zzn zzn2 = new zzn((zzm) null);
        threadLocal.set(zzn2);
        ThreadLocal threadLocal2 = f4052n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult a = versionPolicy2.mo22055a(context2, str2, f4053o);
            int i2 = a.f4058a;
            int i3 = a.f4059b;
            Log.i("DynamiteModule", "Considering local module " + str2 + ":" + i2 + " and remote module " + str2 + ":" + i3);
            int i4 = a.f4060c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a.f4058a != 0) {
                        i4 = -1;
                    }
                }
                if (!(i4 == 1 && a.f4059b == 0)) {
                    if (i4 == -1) {
                        DynamiteModule h = m5099h(context2, str2);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = zzn2.f4063a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zzn);
                        return h;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a.f4059b;
                            try {
                                synchronized (cls) {
                                    if (m5102k(context)) {
                                        bool = f4046h;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", (zzp) null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i5);
                                        synchronized (cls) {
                                            zzr = f4056r;
                                        }
                                        if (zzr != null) {
                                            zzn zzn3 = (zzn) threadLocal.get();
                                            if (zzn3 == null || zzn3.f4063a == null) {
                                                throw new LoadingException("No result cursor", (zzp) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = zzn3.f4063a;
                                            ObjectWrapper.m5051g8(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f4049k >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                iObjectWrapper2 = zzr.mo22068Z8(ObjectWrapper.m5051g8(applicationContext), str2, i5, ObjectWrapper.m5051g8(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapper2 = zzr.mo22069g8(ObjectWrapper.m5051g8(applicationContext), str2, i5, ObjectWrapper.m5051g8(cursor2));
                                            }
                                            Context context3 = (Context) ObjectWrapper.m5050A1(iObjectWrapper2);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new LoadingException("Failed to get module context", (zzp) null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", (zzp) null);
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i5);
                                        zzq l = m5103l(context);
                                        if (l != null) {
                                            int b = l.mo22064b();
                                            if (b >= 3) {
                                                zzn zzn4 = (zzn) threadLocal.get();
                                                if (zzn4 != null) {
                                                    iObjectWrapper = l.mo22067sb(ObjectWrapper.m5051g8(context), str2, i5, ObjectWrapper.m5051g8(zzn4.f4063a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", (zzp) null);
                                                }
                                            } else if (b == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapper = l.mo22061Ib(ObjectWrapper.m5051g8(context), str2, i5);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapper = l.mo22066ia(ObjectWrapper.m5051g8(context), str2, i5);
                                            }
                                            Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
                                            if (A1 != null) {
                                                dynamiteModule = new DynamiteModule((Context) A1);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", (zzp) null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", (zzp) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = zzn2.f4063a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(zzn);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", (zzp) null);
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, (zzp) null);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                CrashUtils.m4870a(context2, th);
                                throw new LoadingException("Failed to load remote module.", th, (zzp) null);
                            }
                        } catch (LoadingException e3) {
                            String message = e3.getMessage();
                            Log.w("DynamiteModule", "Failed to load remote module: " + message);
                            int i6 = a.f4058a;
                            if (i6 != 0) {
                                if (versionPolicy.mo22055a(context2, str2, new zzo(i6, 0)).f4060c == -1) {
                                    DynamiteModule h2 = m5099h(context2, str2);
                                    if (i != 0) {
                                        f4052n.set(Long.valueOf(longValue));
                                    }
                                    return h2;
                                }
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e3, (zzp) null);
                        }
                    } else {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i4, (zzp) null);
                    }
                }
            }
            int i7 = a.f4058a;
            int i8 = a.f4059b;
            throw new LoadingException("No acceptable module " + str2 + " found. Local version is " + i7 + " and remote version is " + i8 + ".", (zzp) null);
        } finally {
            if (longValue == 0) {
                f4052n.remove();
            } else {
                f4052n.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = zzn2.f4063a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f4051m.set(zzn);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    /* renamed from: f */
    public static int m5097f(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r1 = f4046h     // Catch:{ all -> 0x01bf }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d8
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            m5100i(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x003f:
            boolean r5 = m5102k(r10)     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            return r3
        L_0x0048:
            boolean r5 = f4048j     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            r6 = 1
            int r6 = m5098g(r10, r11, r12, r6)     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r7 = f4047i     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.zzb.m5109a()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = f4047i     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.m4488k(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.zzc r7 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = f4047i     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.m4488k(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
        L_0x008f:
            m5100i(r7)     // Catch:{ LoadingException -> 0x009d }
            r1.set(r2, r7)     // Catch:{ LoadingException -> 0x009d }
            f4046h = r5     // Catch:{ LoadingException -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            goto L_0x00d6
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r4.<init>()     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x01bf }
            r4.append(r1)     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01bf }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x01bf }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01bf }
        L_0x00d6:
            f4046h = r1     // Catch:{ all -> 0x01bf }
        L_0x00d8:
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0100
            int r10 = m5098g(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00e4 }
            return r10
        L_0x00e4:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r12.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01c2 }
            r12.append(r11)     // Catch:{ all -> 0x01c2 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01c2 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01c2 }
            return r3
        L_0x0100:
            com.google.android.gms.dynamite.zzq r4 = m5103l(r10)     // Catch:{ all -> 0x01c2 }
            if (r4 != 0) goto L_0x0108
            goto L_0x01b6
        L_0x0108:
            int r0 = r4.mo22064b()     // Catch:{ RemoteException -> 0x0195 }
            r1 = 3
            if (r0 < r1) goto L_0x0170
            java.lang.ThreadLocal r0 = f4051m     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            android.database.Cursor r0 = r0.f4063a     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01b6
        L_0x0123:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.ThreadLocal r0 = f4052n     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0195 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0195 }
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.IObjectWrapper r11 = r4.mo22062Jb(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r11)     // Catch:{ RemoteException -> 0x0195 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0195 }
            if (r11 == 0) goto L_0x015d
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r12 != 0) goto L_0x0148
            goto L_0x015d
        L_0x0148:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r12 <= 0) goto L_0x0155
            boolean r0 = m5101j(r11)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r0 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r2 = r11
        L_0x0156:
            if (r2 == 0) goto L_0x015b
            r2.close()     // Catch:{ all -> 0x01c2 }
        L_0x015b:
            r3 = r12
            goto L_0x01b6
        L_0x015d:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r11 == 0) goto L_0x01b6
            r11.close()     // Catch:{ all -> 0x01c2 }
            goto L_0x01b6
        L_0x016a:
            r12 = move-exception
            r2 = r11
            goto L_0x01b9
        L_0x016d:
            r12 = move-exception
            r2 = r11
            goto L_0x0197
        L_0x0170:
            r1 = 2
            if (r0 != r1) goto L_0x0183
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10)     // Catch:{ RemoteException -> 0x0195 }
            int r3 = r4.mo22063Z8(r0, r11, r12)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01b6
        L_0x0183:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10)     // Catch:{ RemoteException -> 0x0195 }
            int r3 = r4.mo22065g8(r0, r11, r12)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01b6
        L_0x0193:
            r12 = r11
            goto L_0x01b9
        L_0x0195:
            r11 = move-exception
            r12 = r11
        L_0x0197:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x01b7 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            r12.<init>()     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01b7 }
            r12.append(r11)     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01b7 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x01b6
            r2.close()     // Catch:{ all -> 0x01c2 }
        L_0x01b6:
            return r3
        L_0x01b7:
            r11 = move-exception
            goto L_0x0193
        L_0x01b9:
            if (r2 == 0) goto L_0x01be
            r2.close()     // Catch:{ all -> 0x01c2 }
        L_0x01be:
            throw r12     // Catch:{ all -> 0x01c2 }
        L_0x01bf:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            throw r11     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            r11 = move-exception
            com.google.android.gms.common.util.CrashUtils.m4870a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m5097f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c9  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m5098g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f4052n     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r12.<init>()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f4047i = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f4049k = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f4048j = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m5101j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b8
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009b }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            goto L_0x00c7
        L_0x00b5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00c5 }
            if (r12 == 0) goto L_0x00bd
            throw r11     // Catch:{ all -> 0x00c5 }
        L_0x00bd:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00c5 }
            throw r12     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            r0 = r10
        L_0x00c7:
            if (r0 == 0) goto L_0x00cc
            r0.close()
        L_0x00cc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m5098g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    private static DynamiteModule m5099h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: i */
    private static void m5100i(ClassLoader classLoader) throws LoadingException {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            f4056r = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (zzp) null);
        }
    }

    /* renamed from: j */
    private static boolean m5101j(Cursor cursor) {
        zzn zzn = (zzn) f4051m.get();
        if (zzn == null || zzn.f4063a != null) {
            return false;
        }
        zzn.f4063a = cursor;
        return true;
    }

    /* renamed from: k */
    private static boolean m5102k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f4050l)) {
            return true;
        }
        boolean z = false;
        if (f4050l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.m3542h().mo21157j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f4050l = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4048j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    @Nullable
    /* renamed from: l */
    private static zzq m5103l(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = f4055q;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzq != null) {
                    f4055q = zzq;
                    return zzq;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Context mo22053b() {
        return this.f4057a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public IBinder mo22054d(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.f4057a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (zzp) null);
        }
    }
}
