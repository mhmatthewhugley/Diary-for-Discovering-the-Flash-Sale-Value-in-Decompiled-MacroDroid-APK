package dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper;

import android.os.Parcelable;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bd\u0010eJ\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004J\u001a\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R$\u0010&\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R$\u0010)\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R$\u0010,\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R$\u0010/\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R$\u00102\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R$\u00105\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0015\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R$\u00108\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0015\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R$\u0010;\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0015\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010\u0019R$\u0010>\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0015\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R$\u0010A\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0015\u001a\u0004\bB\u0010\u0017\"\u0004\bC\u0010\u0019R$\u0010D\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0015\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019R$\u0010G\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0015\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u0010\u0019R$\u0010J\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0015\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010\u0019R$\u0010M\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0015\u001a\u0004\bN\u0010\u0017\"\u0004\bO\u0010\u0019R$\u0010P\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0015\u001a\u0004\bQ\u0010\u0017\"\u0004\bR\u0010\u0019R$\u0010S\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0015\u001a\u0004\bT\u0010\u0017\"\u0004\bU\u0010\u0019R$\u0010V\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010\u0015\u001a\u0004\bW\u0010\u0017\"\u0004\bX\u0010\u0019R$\u0010Y\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bY\u0010\u0015\u001a\u0004\bZ\u0010\u0017\"\u0004\b[\u0010\u0019R$\u0010\\\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u0015\u001a\u0004\b]\u0010\u0017\"\u0004\b^\u0010\u0019R\u001c\u0010`\u001a\b\u0012\u0002\b\u0003\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010b\u001a\b\u0012\u0002\b\u0003\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u001c\u0010c\u001a\b\u0012\u0002\b\u0003\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010a¨\u0006f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/wrapper/BiometricConnect;", "", "Lja/u;", "syncDebugLog", "", "id", "", "name", "Data", "group_id", "Landroid/os/Parcelable;", "getDBTemplate", "getDBGroup", "", "DEBUG_LOG", "Z", "getDEBUG_LOG", "()Z", "setDEBUG_LOG", "(Z)V", "MSG_VER_SER_MAJ", "Ljava/lang/String;", "getMSG_VER_SER_MAJ", "()Ljava/lang/String;", "setMSG_VER_SER_MAJ", "(Ljava/lang/String;)V", "MSG_VER_SER_MIN", "getMSG_VER_SER_MIN", "setMSG_VER_SER_MIN", "MSG_VER_MODULE_MAJ", "getMSG_VER_MODULE_MAJ", "setMSG_VER_MODULE_MAJ", "MSG_VER_MODULE_MIN", "getMSG_VER_MODULE_MIN", "setMSG_VER_MODULE_MIN", "MSG_REPLY_MODULE_ID", "getMSG_REPLY_MODULE_ID", "setMSG_REPLY_MODULE_ID", "MSG_REPLY_ARG1", "getMSG_REPLY_ARG1", "setMSG_REPLY_ARG1", "MSG_REPLY_ARG2", "getMSG_REPLY_ARG2", "setMSG_REPLY_ARG2", "MSG_REPLY_NO_SEND_WAIT", "getMSG_REPLY_NO_SEND_WAIT", "setMSG_REPLY_NO_SEND_WAIT", "SERVICE_PACKAGE_NAME", "getSERVICE_PACKAGE_NAME", "setSERVICE_PACKAGE_NAME", "MSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX", "getMSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX", "setMSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX", "MSG_CB_BUNDLE_DB_GROUP_ID_MAX", "getMSG_CB_BUNDLE_DB_GROUP_ID_MAX", "setMSG_CB_BUNDLE_DB_GROUP_ID_MAX", "MSG_CB_BUNDLE_DB_TEMPLATE", "getMSG_CB_BUNDLE_DB_TEMPLATE", "setMSG_CB_BUNDLE_DB_TEMPLATE", "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE", "getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE", "setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE", "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE", "getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE", "setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE", "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE", "getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE", "setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE", "MSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI", "getMSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI", "setMSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI", "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP", "getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP", "setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP", "MSG_CB_BUNDLE_FACE_IS_IR", "getMSG_CB_BUNDLE_FACE_IS_IR", "setMSG_CB_BUNDLE_FACE_IS_IR", "MSG_CB_BUNDLE_FACE_HAS_FACE", "getMSG_CB_BUNDLE_FACE_HAS_FACE", "setMSG_CB_BUNDLE_FACE_HAS_FACE", "MSG_CB_BUNDLE_FACE_RECT_BOUND", "getMSG_CB_BUNDLE_FACE_RECT_BOUND", "setMSG_CB_BUNDLE_FACE_RECT_BOUND", "MSG_CB_BUNDLE_FACE_FLOAT_YAW", "getMSG_CB_BUNDLE_FACE_FLOAT_YAW", "setMSG_CB_BUNDLE_FACE_FLOAT_YAW", "MSG_CB_BUNDLE_FACE_FLOAT_ROLL", "getMSG_CB_BUNDLE_FACE_FLOAT_ROLL", "setMSG_CB_BUNDLE_FACE_FLOAT_ROLL", "MSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST", "getMSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST", "setMSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST", "MSG_CB_BUNDLE_FACE_POINTS_ARRAY", "getMSG_CB_BUNDLE_FACE_POINTS_ARRAY", "setMSG_CB_BUNDLE_FACE_POINTS_ARRAY", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "dbtemplateClass", "dbgroupClass", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricConnect.kt */
public final class BiometricConnect {
    private static boolean DEBUG_LOG;
    public static final BiometricConnect INSTANCE = new BiometricConnect();
    private static String MSG_CB_BUNDLE_DB_GROUP_ID_MAX;
    private static String MSG_CB_BUNDLE_DB_TEMPLATE;
    private static String MSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX;
    private static String MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP;
    private static String MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE;
    private static String MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE;
    private static String MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE;
    private static String MSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI;
    private static String MSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST;
    private static String MSG_CB_BUNDLE_FACE_FLOAT_ROLL;
    private static String MSG_CB_BUNDLE_FACE_FLOAT_YAW;
    private static String MSG_CB_BUNDLE_FACE_HAS_FACE;
    private static String MSG_CB_BUNDLE_FACE_IS_IR;
    private static String MSG_CB_BUNDLE_FACE_POINTS_ARRAY;
    private static String MSG_CB_BUNDLE_FACE_RECT_BOUND;
    private static String MSG_REPLY_ARG1;
    private static String MSG_REPLY_ARG2;
    private static String MSG_REPLY_MODULE_ID;
    private static String MSG_REPLY_NO_SEND_WAIT;
    private static String MSG_VER_MODULE_MAJ;
    private static String MSG_VER_MODULE_MIN;
    private static String MSG_VER_SER_MAJ;
    private static String MSG_VER_SER_MIN;
    private static String SERVICE_PACKAGE_NAME;
    private static Class<?> clazz;
    private static Class<?> dbgroupClass;
    private static Class<?> dbtemplateClass;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r0 = r0.getField("DEBUG_LOG");
     */
    static {
        /*
            dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect r0 = new dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect
            r0.<init>()
            INSTANCE = r0
            java.lang.String r0 = "android.miui.BiometricConnect"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            clazz = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.String r0 = "android.miui.BiometricConnect$DBTemplate"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            dbtemplateClass = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.String r0 = "android.miui.BiometricConnect$DBGroup"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            dbgroupClass = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.lang.String r2 = "DEBUG_LOG"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.getBoolean(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            DEBUG_LOG = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "MSG_VER_SER_MAJ"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_VER_SER_MAJ = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x005b
            java.lang.String r2 = "MSG_VER_SER_MIN"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_VER_SER_MIN = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = "MSG_VER_MODULE_MAJ"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0072
        L_0x0071:
            r0 = r1
        L_0x0072:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_VER_MODULE_MAJ = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0087
            java.lang.String r2 = "MSG_VER_MODULE_MIN"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0088
        L_0x0087:
            r0 = r1
        L_0x0088:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_VER_MODULE_MIN = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r2 = "MSG_REPLY_MODULE_ID"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x009e
        L_0x009d:
            r0 = r1
        L_0x009e:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_REPLY_MODULE_ID = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r2 = "MSG_REPLY_NO_SEND_WAIT"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x00b4
        L_0x00b3:
            r0 = r1
        L_0x00b4:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_REPLY_NO_SEND_WAIT = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r2 = "MSG_REPLY_ARG1"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x00ca
        L_0x00c9:
            r0 = r1
        L_0x00ca:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_REPLY_ARG1 = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = "MSG_REPLY_ARG2"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x00e0
        L_0x00df:
            r0 = r1
        L_0x00e0:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_REPLY_ARG2 = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r2 = "SERVICE_PACKAGE_NAME"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x00f6
        L_0x00f5:
            r0 = r1
        L_0x00f6:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            SERVICE_PACKAGE_NAME = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x010b
            java.lang.String r2 = "MSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x010c
        L_0x010b:
            r0 = r1
        L_0x010c:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0121
            java.lang.String r2 = "MSG_CB_BUNDLE_DB_GROUP_ID_MAX"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0122
        L_0x0121:
            r0 = r1
        L_0x0122:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_DB_GROUP_ID_MAX = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0137
            java.lang.String r2 = "MSG_CB_BUNDLE_DB_TEMPLATE"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0138
        L_0x0137:
            r0 = r1
        L_0x0138:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_DB_TEMPLATE = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r2 = "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x014e
        L_0x014d:
            r0 = r1
        L_0x014e:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0163
            java.lang.String r2 = "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0164
        L_0x0163:
            r0 = r1
        L_0x0164:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0179
            java.lang.String r2 = "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x017a
        L_0x0179:
            r0 = r1
        L_0x017a:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x018f
            java.lang.String r2 = "MSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0190
        L_0x018f:
            r0 = r1
        L_0x0190:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01a5
            java.lang.String r2 = "MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x01a6
        L_0x01a5:
            r0 = r1
        L_0x01a6:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01bb
            java.lang.String r2 = "MSG_CB_BUNDLE_FACE_IS_IR"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x01bc
        L_0x01bb:
            r0 = r1
        L_0x01bc:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_FACE_IS_IR = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01d1
            java.lang.String r2 = "MSG_CB_BUNDLE_FACE_HAS_FACE"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x01d2
        L_0x01d1:
            r0 = r1
        L_0x01d2:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_FACE_HAS_FACE = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01e7
            java.lang.String r2 = "MSG_CB_BUNDLE_FACE_RECT_BOUND"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01e7
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x01e8
        L_0x01e7:
            r0 = r1
        L_0x01e8:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_FACE_RECT_BOUND = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01fd
            java.lang.String r2 = "MSG_CB_BUNDLE_FACE_FLOAT_YAW"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x01fe
        L_0x01fd:
            r0 = r1
        L_0x01fe:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_FACE_FLOAT_YAW = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0213
            java.lang.String r2 = "MSG_CB_BUNDLE_FACE_FLOAT_ROLL"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0213
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0214
        L_0x0213:
            r0 = r1
        L_0x0214:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_FACE_FLOAT_ROLL = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0229
            java.lang.String r2 = "MSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x0229
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x022a
        L_0x0229:
            r0 = r1
        L_0x022a:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST = r0     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            java.lang.Class<?> r0 = clazz     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x023e
            java.lang.String r2 = "MSG_CB_BUNDLE_FACE_POINTS_ARRAY"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            if (r0 == 0) goto L_0x023e
            java.lang.Object r1 = r0.get(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
        L_0x023e:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            MSG_CB_BUNDLE_FACE_POINTS_ARRAY = r1     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0249, all -> 0x0243 }
            goto L_0x0249
        L_0x0243:
            r0 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r1 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r1.mo68218e((java.lang.Throwable) r0)
        L_0x0249:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.BiometricConnect.<clinit>():void");
    }

    private BiometricConnect() {
    }

    public final Parcelable getDBGroup(int i, String str) {
        Object obj;
        Constructor<?> constructor;
        try {
            Class<?> cls = dbgroupClass;
            if (cls == null || (constructor = cls.getConstructor(new Class[]{Integer.TYPE, String.class})) == null) {
                obj = null;
            } else {
                obj = constructor.newInstance(new Object[]{Integer.valueOf(i), str});
            }
            C13706o.m87927d(obj, "null cannot be cast to non-null type android.os.Parcelable");
            return (Parcelable) obj;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return null;
        }
    }

    public final Parcelable getDBTemplate(int i, String str, String str2, int i2) {
        Object obj;
        Class cls;
        Constructor<?> constructor;
        Class<String> cls2 = String.class;
        try {
            Class<?> cls3 = dbtemplateClass;
            if (cls3 == null || (constructor = cls3.getConstructor(new Class[]{(cls = Integer.TYPE), cls2, cls2, cls})) == null) {
                obj = null;
            } else {
                obj = constructor.newInstance(new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)});
            }
            C13706o.m87927d(obj, "null cannot be cast to non-null type android.os.Parcelable");
            return (Parcelable) obj;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return null;
        }
    }

    public final boolean getDEBUG_LOG() {
        return DEBUG_LOG;
    }

    public final String getMSG_CB_BUNDLE_DB_GROUP_ID_MAX() {
        return MSG_CB_BUNDLE_DB_GROUP_ID_MAX;
    }

    public final String getMSG_CB_BUNDLE_DB_TEMPLATE() {
        return MSG_CB_BUNDLE_DB_TEMPLATE;
    }

    public final String getMSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX() {
        return MSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX;
    }

    public final String getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP() {
        return MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP;
    }

    public final String getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE() {
        return MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE;
    }

    public final String getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE() {
        return MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE;
    }

    public final String getMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE() {
        return MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE;
    }

    public final String getMSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI() {
        return MSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI;
    }

    public final String getMSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST() {
        return MSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST;
    }

    public final String getMSG_CB_BUNDLE_FACE_FLOAT_ROLL() {
        return MSG_CB_BUNDLE_FACE_FLOAT_ROLL;
    }

    public final String getMSG_CB_BUNDLE_FACE_FLOAT_YAW() {
        return MSG_CB_BUNDLE_FACE_FLOAT_YAW;
    }

    public final String getMSG_CB_BUNDLE_FACE_HAS_FACE() {
        return MSG_CB_BUNDLE_FACE_HAS_FACE;
    }

    public final String getMSG_CB_BUNDLE_FACE_IS_IR() {
        return MSG_CB_BUNDLE_FACE_IS_IR;
    }

    public final String getMSG_CB_BUNDLE_FACE_POINTS_ARRAY() {
        return MSG_CB_BUNDLE_FACE_POINTS_ARRAY;
    }

    public final String getMSG_CB_BUNDLE_FACE_RECT_BOUND() {
        return MSG_CB_BUNDLE_FACE_RECT_BOUND;
    }

    public final String getMSG_REPLY_ARG1() {
        return MSG_REPLY_ARG1;
    }

    public final String getMSG_REPLY_ARG2() {
        return MSG_REPLY_ARG2;
    }

    public final String getMSG_REPLY_MODULE_ID() {
        return MSG_REPLY_MODULE_ID;
    }

    public final String getMSG_REPLY_NO_SEND_WAIT() {
        return MSG_REPLY_NO_SEND_WAIT;
    }

    public final String getMSG_VER_MODULE_MAJ() {
        return MSG_VER_MODULE_MAJ;
    }

    public final String getMSG_VER_MODULE_MIN() {
        return MSG_VER_MODULE_MIN;
    }

    public final String getMSG_VER_SER_MAJ() {
        return MSG_VER_SER_MAJ;
    }

    public final String getMSG_VER_SER_MIN() {
        return MSG_VER_SER_MIN;
    }

    public final String getSERVICE_PACKAGE_NAME() {
        return SERVICE_PACKAGE_NAME;
    }

    public final void setDEBUG_LOG(boolean z) {
        DEBUG_LOG = z;
    }

    public final void setMSG_CB_BUNDLE_DB_GROUP_ID_MAX(String str) {
        MSG_CB_BUNDLE_DB_GROUP_ID_MAX = str;
    }

    public final void setMSG_CB_BUNDLE_DB_TEMPLATE(String str) {
        MSG_CB_BUNDLE_DB_TEMPLATE = str;
    }

    public final void setMSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX(String str) {
        MSG_CB_BUNDLE_DB_TEMPLATE_ID_MAX = str;
    }

    public final void setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP(String str) {
        MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DEPTHMAP = str;
    }

    public final void setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE(String str) {
        MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_DISTANCE = str;
    }

    public final void setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE(String str) {
        MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_FACE = str;
    }

    public final void setMSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE(String str) {
        MSG_CB_BUNDLE_ENROLL_PARAM_DETECT_ZONE = str;
    }

    public final void setMSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI(String str) {
        MSG_CB_BUNDLE_ENROLL_PARAM_WAITING_UI = str;
    }

    public final void setMSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST(String str) {
        MSG_CB_BUNDLE_FACE_FLOAT_EYE_DIST = str;
    }

    public final void setMSG_CB_BUNDLE_FACE_FLOAT_ROLL(String str) {
        MSG_CB_BUNDLE_FACE_FLOAT_ROLL = str;
    }

    public final void setMSG_CB_BUNDLE_FACE_FLOAT_YAW(String str) {
        MSG_CB_BUNDLE_FACE_FLOAT_YAW = str;
    }

    public final void setMSG_CB_BUNDLE_FACE_HAS_FACE(String str) {
        MSG_CB_BUNDLE_FACE_HAS_FACE = str;
    }

    public final void setMSG_CB_BUNDLE_FACE_IS_IR(String str) {
        MSG_CB_BUNDLE_FACE_IS_IR = str;
    }

    public final void setMSG_CB_BUNDLE_FACE_POINTS_ARRAY(String str) {
        MSG_CB_BUNDLE_FACE_POINTS_ARRAY = str;
    }

    public final void setMSG_CB_BUNDLE_FACE_RECT_BOUND(String str) {
        MSG_CB_BUNDLE_FACE_RECT_BOUND = str;
    }

    public final void setMSG_REPLY_ARG1(String str) {
        MSG_REPLY_ARG1 = str;
    }

    public final void setMSG_REPLY_ARG2(String str) {
        MSG_REPLY_ARG2 = str;
    }

    public final void setMSG_REPLY_MODULE_ID(String str) {
        MSG_REPLY_MODULE_ID = str;
    }

    public final void setMSG_REPLY_NO_SEND_WAIT(String str) {
        MSG_REPLY_NO_SEND_WAIT = str;
    }

    public final void setMSG_VER_MODULE_MAJ(String str) {
        MSG_VER_MODULE_MAJ = str;
    }

    public final void setMSG_VER_MODULE_MIN(String str) {
        MSG_VER_MODULE_MIN = str;
    }

    public final void setMSG_VER_SER_MAJ(String str) {
        MSG_VER_SER_MAJ = str;
    }

    public final void setMSG_VER_SER_MIN(String str) {
        MSG_VER_SER_MIN = str;
    }

    public final void setSERVICE_PACKAGE_NAME(String str) {
        SERVICE_PACKAGE_NAME = str;
    }

    public final void syncDebugLog() {
        Method method;
        try {
            Class<?> cls = clazz;
            if (cls != null && (method = cls.getMethod("syncDebugLog", new Class[0])) != null) {
                method.invoke((Object) null, new Object[0]);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }
}
