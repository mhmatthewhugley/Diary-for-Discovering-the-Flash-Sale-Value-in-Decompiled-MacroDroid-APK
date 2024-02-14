package dev.skomlach.biometric.compat.engine.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserHandle;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import dev.skomlach.biometric.compat.utils.BiometricLockoutFix;
import dev.skomlach.biometric.compat.utils.HexUtils;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p269g9.C12317a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b0\u00101J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\nH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u0006\u0010\u0010\u001a\u00020\fJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00063"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule;", "Ldev/skomlach/biometric/compat/engine/core/interfaces/BiometricModule;", "", "", "getHashes", "", "result", "getUniqueId", "s", "md5", "", "getUserId", "Lja/u;", "lockout", "tag", "getManagers", "updateBiometricEnrollChanged", "manager", "", "getIds", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "reason", "", "restartCauseTimeout", "Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "biometricMethod", "Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "getBiometricMethod", "()Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "", "firstTimeout", "Ljava/lang/Long;", "I", "Landroid/content/SharedPreferences;", "preferences", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getName", "()Ljava/lang/String;", "name", "isUserAuthCanByUsedWithCrypto", "()Z", "isLockOut", "isBiometricEnrollChanged", "<init>", "(Ldev/skomlach/biometric/compat/engine/BiometricMethod;)V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: AbstractBiometricModule.kt */
public abstract class AbstractBiometricModule implements BiometricModule {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static boolean DEBUG_MANAGERS = false;
    private static final String ENROLLED_PREF = "enrolled_";
    private final BiometricMethod biometricMethod;
    private final Context context = C12104a.f58372a.mo68283g();
    private Long firstTimeout;
    private final SharedPreferences preferences = C12317a.f58995a.mo68640a("BiometricCompat_AbstractModule");
    private final int tag;

    @Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/AbstractBiometricModule$Companion;", "", "()V", "DEBUG_MANAGERS", "", "getDEBUG_MANAGERS", "()Z", "setDEBUG_MANAGERS", "(Z)V", "ENROLLED_PREF", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: AbstractBiometricModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final boolean getDEBUG_MANAGERS() {
            return AbstractBiometricModule.DEBUG_MANAGERS;
        }

        public final void setDEBUG_MANAGERS(boolean z) {
            AbstractBiometricModule.DEBUG_MANAGERS = z;
        }
    }

    public AbstractBiometricModule(BiometricMethod biometricMethod2) {
        C13706o.m87929f(biometricMethod2, "biometricMethod");
        this.biometricMethod = biometricMethod2;
        this.tag = biometricMethod2.getId();
    }

    private final Set<String> getHashes() {
        HashSet hashSet = new HashSet();
        Set<Object> managers = getManagers();
        ArrayList arrayList = new ArrayList();
        for (Object ids : managers) {
            arrayList.addAll(getIds(ids));
        }
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            C13706o.m87928e(str, "i");
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                i = num.intValue() + 1;
            }
            hashMap.put(str, Integer.valueOf(i));
        }
        for (String str2 : hashMap.keySet()) {
            Integer num2 = (Integer) hashMap.get(str2);
            if (num2 == null) {
                num2 = 0;
            }
            C13706o.m87928e(num2, "countMatches[key] ?: 0");
            int intValue = num2.intValue();
            if (intValue == 0) {
                hashSet2.add(str2);
            } else if (intValue >= 0) {
                int i2 = 0;
                while (true) {
                    hashSet2.add(str2 + "; index=" + i2);
                    if (i2 == intValue) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            C13706o.m87928e(str3, "id");
            String md5 = md5(str3);
            if (md5 != null) {
                BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                String name = getName();
                biometricLoggerImpl.mo68220e(name + ": getHashes " + str3 + " -> " + md5);
                hashSet.add(md5);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b A[Catch:{ all -> 0x00bc, all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x006e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getUniqueId(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0009
            java.lang.String r11 = java.lang.String.valueOf(r11)
            return r11
        L_0x0009:
            boolean r0 = r11 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0012
            java.lang.String r11 = java.lang.String.valueOf(r11)
            return r11
        L_0x0012:
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0019
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L_0x0019:
            r0 = 1
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.Class r3 = r11.getClass()     // Catch:{ all -> 0x00df }
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()     // Catch:{ all -> 0x00df }
            java.lang.String r4 = "result.javaClass.declaredMethods"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)     // Catch:{ all -> 0x00df }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00df }
            r4.<init>()     // Catch:{ all -> 0x00df }
            int r5 = r3.length     // Catch:{ all -> 0x00df }
            r6 = 0
        L_0x0034:
            if (r6 >= r5) goto L_0x0071
            r7 = r3[r6]     // Catch:{ all -> 0x00df }
            java.lang.String r8 = r7.getName()     // Catch:{ all -> 0x00df }
            java.lang.String r9 = "it.name"
            kotlin.jvm.internal.C13706o.m87928e(r8, r9)     // Catch:{ all -> 0x00df }
            java.lang.String r9 = "id"
            boolean r8 = kotlin.text.C15176v.m93639t(r8, r9, r0)     // Catch:{ all -> 0x00df }
            if (r8 == 0) goto L_0x0068
            java.lang.Class r8 = r7.getReturnType()     // Catch:{ all -> 0x00df }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x00df }
            boolean r8 = kotlin.jvm.internal.C13706o.m87924a(r8, r9)     // Catch:{ all -> 0x00df }
            if (r8 != 0) goto L_0x0068
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch:{ all -> 0x00df }
            java.lang.String r9 = "it.parameterTypes"
            kotlin.jvm.internal.C13706o.m87928e(r8, r9)     // Catch:{ all -> 0x00df }
            int r8 = r8.length     // Catch:{ all -> 0x00df }
            if (r8 != 0) goto L_0x0063
            r8 = 1
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            if (r8 == 0) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            if (r8 == 0) goto L_0x006e
            r4.add(r7)     // Catch:{ all -> 0x00df }
        L_0x006e:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x0071:
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x00df }
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x00c3
            java.lang.Class r3 = r11.getClass()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x00df }
        L_0x0087:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00df }
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x00df }
            boolean r5 = r4.isAccessible()     // Catch:{ all -> 0x00df }
            if (r5 != 0) goto L_0x009c
            r4.setAccessible(r0)     // Catch:{ all -> 0x00df }
        L_0x009c:
            java.lang.String r6 = "; "
            r2.append(r6)     // Catch:{ all -> 0x00bc }
            java.lang.String r6 = r4.getName()     // Catch:{ all -> 0x00bc }
            r2.append(r6)     // Catch:{ all -> 0x00bc }
            java.lang.String r6 = "="
            r2.append(r6)     // Catch:{ all -> 0x00bc }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x00bc }
            java.lang.Object r6 = r4.invoke(r11, r6)     // Catch:{ all -> 0x00bc }
            r2.append(r6)     // Catch:{ all -> 0x00bc }
            if (r5 != 0) goto L_0x0087
            r4.setAccessible(r1)     // Catch:{ all -> 0x00df }
            goto L_0x0087
        L_0x00bc:
            r11 = move-exception
            if (r5 != 0) goto L_0x00c2
            r4.setAccessible(r1)     // Catch:{ all -> 0x00df }
        L_0x00c2:
            throw r11     // Catch:{ all -> 0x00df }
        L_0x00c3:
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "stringBuilder.toString()"
            kotlin.jvm.internal.C13706o.m87928e(r11, r2)     // Catch:{ all -> 0x00df }
            java.lang.CharSequence r11 = kotlin.text.C15177w.m93672R0(r11)     // Catch:{ all -> 0x00df }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00df }
            int r2 = r11.length()     // Catch:{ all -> 0x00df }
            if (r2 <= 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            if (r0 == 0) goto L_0x00f8
            return r11
        L_0x00df:
            r11 = move-exception
            boolean r2 = DEBUG_MANAGERS
            if (r2 == 0) goto L_0x00f8
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r2 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r10.getName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3[r1] = r4
            r3[r0] = r11
            r2.mo68220e((java.lang.Object[]) r3)
        L_0x00f8:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule.getUniqueId(java.lang.Object):java.lang.String");
    }

    private final String md5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
            instance.reset();
            Charset forName = Charset.forName("UTF-8");
            C13706o.m87928e(forName, "forName(\"UTF-8\")");
            byte[] bytes = str.getBytes(forName);
            C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            HexUtils hexUtils = HexUtils.INSTANCE;
            byte[] digest = instance.digest();
            C13706o.m87928e(digest, "digest.digest()");
            return hexUtils.bytesToHex(digest);
        } catch (Exception unused) {
            return null;
        }
    }

    public final BiometricMethod getBiometricMethod() {
        return this.biometricMethod;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[Catch:{ all -> 0x0125, all -> 0x0135 }, LOOP:0: B:3:0x001b->B:17:0x0053, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0052 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> getIds(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "manager"
            kotlin.jvm.internal.C13706o.m87929f(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            java.lang.Class r3 = r14.getClass()     // Catch:{ all -> 0x0135 }
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = "manager.javaClass.declaredMethods"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)     // Catch:{ all -> 0x0135 }
            int r4 = r3.length     // Catch:{ all -> 0x0135 }
            r5 = 0
        L_0x001b:
            if (r5 >= r4) goto L_0x0056
            r6 = r3[r5]     // Catch:{ all -> 0x0135 }
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = "it.name"
            kotlin.jvm.internal.C13706o.m87928e(r7, r8)     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = "enrolled"
            boolean r7 = kotlin.text.C15177w.m93659L(r7, r8, r1)     // Catch:{ all -> 0x0135 }
            if (r7 == 0) goto L_0x004f
            java.lang.Class r7 = r6.getReturnType()     // Catch:{ all -> 0x0135 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0135 }
            boolean r7 = kotlin.jvm.internal.C13706o.m87924a(r7, r8)     // Catch:{ all -> 0x0135 }
            if (r7 != 0) goto L_0x004f
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = "it.parameterTypes"
            kotlin.jvm.internal.C13706o.m87928e(r7, r8)     // Catch:{ all -> 0x0135 }
            int r7 = r7.length     // Catch:{ all -> 0x0135 }
            if (r7 != 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x004f
            r7 = 1
            goto L_0x0050
        L_0x004f:
            r7 = 0
        L_0x0050:
            if (r7 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == 0) goto L_0x005e
            boolean r3 = r6.isAccessible()     // Catch:{ all -> 0x0135 }
            goto L_0x005f
        L_0x005e:
            r3 = 1
        L_0x005f:
            if (r3 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r6.setAccessible(r1)     // Catch:{ all -> 0x0135 }
        L_0x0067:
            if (r6 == 0) goto L_0x012c
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0125 }
            java.lang.Object r14 = r6.invoke(r14, r4)     // Catch:{ all -> 0x0125 }
            if (r14 == 0) goto L_0x012c
            boolean r4 = r14 instanceof java.util.Collection     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x008f
            java.util.Collection r14 = (java.util.Collection) r14     // Catch:{ all -> 0x0125 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0125 }
        L_0x007b:
            boolean r4 = r14.hasNext()     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x012c
            java.lang.Object r4 = r14.next()     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = r13.getUniqueId(r4)     // Catch:{ all -> 0x0125 }
            r0.add(r4)     // Catch:{ all -> 0x0125 }
            goto L_0x007b
        L_0x008f:
            boolean r4 = r14 instanceof int[]     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x00ca
            int[] r14 = (int[]) r14     // Catch:{ all -> 0x0125 }
            int r4 = r14.length     // Catch:{ all -> 0x0125 }
            r5 = 0
        L_0x0097:
            if (r5 >= r4) goto L_0x012c
            r7 = r14[r5]     // Catch:{ all -> 0x0125 }
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r8 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x0125 }
            java.lang.String r10 = r13.getName()     // Catch:{ all -> 0x0125 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
            r11.<init>()     // Catch:{ all -> 0x0125 }
            r11.append(r10)     // Catch:{ all -> 0x0125 }
            java.lang.String r10 = ": Int ids "
            r11.append(r10)     // Catch:{ all -> 0x0125 }
            r11.append(r7)     // Catch:{ all -> 0x0125 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x0125 }
            r9[r2] = r10     // Catch:{ all -> 0x0125 }
            r8.mo68220e((java.lang.Object[]) r9)     // Catch:{ all -> 0x0125 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0125 }
            java.lang.String r7 = r13.getUniqueId(r7)     // Catch:{ all -> 0x0125 }
            r0.add(r7)     // Catch:{ all -> 0x0125 }
            int r5 = r5 + 1
            goto L_0x0097
        L_0x00ca:
            boolean r4 = r14 instanceof long[]     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x0105
            long[] r14 = (long[]) r14     // Catch:{ all -> 0x0125 }
            int r4 = r14.length     // Catch:{ all -> 0x0125 }
            r5 = 0
        L_0x00d2:
            if (r5 >= r4) goto L_0x012c
            r7 = r14[r5]     // Catch:{ all -> 0x0125 }
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r9 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ all -> 0x0125 }
            java.lang.String r11 = r13.getName()     // Catch:{ all -> 0x0125 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
            r12.<init>()     // Catch:{ all -> 0x0125 }
            r12.append(r11)     // Catch:{ all -> 0x0125 }
            java.lang.String r11 = ": Long ids "
            r12.append(r11)     // Catch:{ all -> 0x0125 }
            r12.append(r7)     // Catch:{ all -> 0x0125 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0125 }
            r10[r2] = r11     // Catch:{ all -> 0x0125 }
            r9.mo68220e((java.lang.Object[]) r10)     // Catch:{ all -> 0x0125 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0125 }
            java.lang.String r7 = r13.getUniqueId(r7)     // Catch:{ all -> 0x0125 }
            r0.add(r7)     // Catch:{ all -> 0x0125 }
            int r5 = r5 + 1
            goto L_0x00d2
        L_0x0105:
            boolean r4 = r14 instanceof java.lang.Object[]     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x011d
            java.lang.Object[] r14 = (java.lang.Object[]) r14     // Catch:{ all -> 0x0125 }
            int r4 = r14.length     // Catch:{ all -> 0x0125 }
            r5 = 0
        L_0x010d:
            if (r5 >= r4) goto L_0x012c
            r7 = r14[r5]     // Catch:{ all -> 0x0125 }
            if (r7 == 0) goto L_0x011a
            java.lang.String r7 = r13.getUniqueId(r7)     // Catch:{ all -> 0x0125 }
            r0.add(r7)     // Catch:{ all -> 0x0125 }
        L_0x011a:
            int r5 = r5 + 1
            goto L_0x010d
        L_0x011d:
            java.lang.String r14 = r13.getUniqueId(r14)     // Catch:{ all -> 0x0125 }
            r0.add(r14)     // Catch:{ all -> 0x0125 }
            goto L_0x012c
        L_0x0125:
            r14 = move-exception
            if (r3 != 0) goto L_0x012b
            r6.setAccessible(r2)     // Catch:{ all -> 0x0135 }
        L_0x012b:
            throw r14     // Catch:{ all -> 0x0135 }
        L_0x012c:
            if (r3 != 0) goto L_0x014e
            if (r6 != 0) goto L_0x0131
            goto L_0x014e
        L_0x0131:
            r6.setAccessible(r2)     // Catch:{ all -> 0x0135 }
            goto L_0x014e
        L_0x0135:
            r14 = move-exception
            boolean r3 = DEBUG_MANAGERS
            if (r3 == 0) goto L_0x014e
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r3 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r13.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4[r2] = r5
            r4[r1] = r14
            r3.mo68220e((java.lang.Object[]) r4)
        L_0x014e:
            java.util.List r14 = kotlin.collections.C13566b0.m87419T(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.AbstractBiometricModule.getIds(java.lang.Object):java.util.List");
    }

    public abstract Set<Object> getManagers();

    public final String getName() {
        String simpleName = getClass().getSimpleName();
        C13706o.m87928e(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public final int getUserId() {
        try {
            Method[] methods = UserHandle.class.getMethods();
            C13706o.m87928e(methods, "UserHandle::class.java.methods");
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                if (C13706o.m87924a(method.getName(), "myUserId")) {
                    arrayList.add(method);
                }
            }
            Object invoke = ((Method) arrayList.get(0)).invoke((Object) null, new Object[0]);
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) invoke).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public boolean isBiometricEnrollChanged() {
        SharedPreferences sharedPreferences = this.preferences;
        int tag2 = tag();
        Set<String> stringSet = sharedPreferences.getStringSet(ENROLLED_PREF + tag2, (Set) null);
        if (stringSet != null) {
            return !C13706o.m87924a(getHashes(), stringSet);
        }
        updateBiometricEnrollChanged();
        return false;
    }

    public boolean isLockOut() {
        return BiometricLockoutFix.INSTANCE.isLockOut(this.biometricMethod.getBiometricType());
    }

    public boolean isUserAuthCanByUsedWithCrypto() {
        return true;
    }

    public final void lockout() {
        if (!isLockOut()) {
            BiometricLockoutFix.INSTANCE.lockout(this.biometricMethod.getBiometricType());
        }
    }

    public final boolean restartCauseTimeout(AuthenticationFailureReason authenticationFailureReason) {
        boolean z = false;
        if (authenticationFailureReason == AuthenticationFailureReason.TIMEOUT) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.firstTimeout;
            if (l == null) {
                this.firstTimeout = Long.valueOf(currentTimeMillis);
                return true;
            } else if (l == null) {
                return false;
            } else {
                if (currentTimeMillis - l.longValue() <= TimeUnit.SECONDS.toMillis(30)) {
                    z = true;
                }
                if (!z) {
                    this.firstTimeout = null;
                }
                return z;
            }
        } else {
            this.firstTimeout = null;
            return false;
        }
    }

    public int tag() {
        return this.tag;
    }

    public final void updateBiometricEnrollChanged() {
        SharedPreferences.Editor edit = this.preferences.edit();
        int tag2 = tag();
        edit.putStringSet(ENROLLED_PREF + tag2, getHashes()).apply();
    }
}
