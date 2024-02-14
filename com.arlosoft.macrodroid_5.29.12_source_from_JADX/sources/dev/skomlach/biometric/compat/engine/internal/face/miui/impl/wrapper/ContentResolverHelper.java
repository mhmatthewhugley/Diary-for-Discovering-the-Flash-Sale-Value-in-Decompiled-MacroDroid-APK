package dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper;

import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u001c\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/wrapper/ContentResolverHelper;", "", "Landroid/content/ContentResolver;", "cr", "Landroid/net/Uri;", "uri", "", "notifyForDescendents", "Landroid/database/ContentObserver;", "observer", "", "userHandle", "Lja/u;", "registerContentObserver", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ContentResolverHelper.kt */
public final class ContentResolverHelper {
    public static final ContentResolverHelper INSTANCE = new ContentResolverHelper();
    private static Class<?> clazz;

    static {
        try {
            clazz = Class.forName("android.content.ContentResolver");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private ContentResolverHelper() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE.mo68218e(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r10.registerContentObserver(r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void registerContentObserver(android.content.ContentResolver r10, android.net.Uri r11, boolean r12, android.database.ContentObserver r13, int r14) {
        /*
            r9 = this;
            java.lang.String r0 = "cr"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.Class<?> r0 = clazz     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "registerContentObserver"
            r2 = 4
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0048 }
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0048 }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0048 }
            r6 = 1
            r3[r6] = r4     // Catch:{ all -> 0x0048 }
            java.lang.Class<android.database.ContentObserver> r4 = android.database.ContentObserver.class
            r7 = 2
            r3[r7] = r4     // Catch:{ all -> 0x0048 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0048 }
            r8 = 3
            r3[r8] = r4     // Catch:{ all -> 0x0048 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0052
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0048 }
            r1[r5] = r11     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0048 }
            r1[r6] = r2     // Catch:{ all -> 0x0048 }
            r1[r7] = r13     // Catch:{ all -> 0x0048 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0048 }
            r1[r8] = r14     // Catch:{ all -> 0x0048 }
            r0.invoke(r10, r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0052
        L_0x0048:
            r10.registerContentObserver(r11, r12, r13)     // Catch:{ all -> 0x004c }
            goto L_0x0052
        L_0x004c:
            r10 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r11 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r11.mo68218e((java.lang.Throwable) r10)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.ContentResolverHelper.registerContentObserver(android.content.ContentResolver, android.net.Uri, boolean, android.database.ContentObserver, int):void");
    }
}
