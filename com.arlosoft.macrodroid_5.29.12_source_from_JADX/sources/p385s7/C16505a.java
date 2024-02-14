package p385s7;

import android.util.Log;
import com.stericson.RootShell.exceptions.RootDeniedException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import p367q7.C16225a;
import p376r7.C16355b;
import p394t7.C16579a;
import p394t7.C16580b;
import p403u7.C16654b;
import p403u7.C16655c;

/* renamed from: s7.a */
/* compiled from: RootTools */
public final class C16505a {

    /* renamed from: a */
    private static C16655c f67201a = null;

    /* renamed from: b */
    public static boolean f67202b = false;

    /* renamed from: c */
    public static String f67203c;

    /* renamed from: A */
    public static void m98556A(String str, String str2) {
        m98557B(str, str2, 3, (Exception) null);
    }

    /* renamed from: B */
    public static void m98557B(String str, String str2, int i, Exception exc) {
        if (str2 != null && !str2.equals("") && f67202b) {
            if (str == null) {
                str = "RootTools v5.0";
            }
            if (i == 2) {
                Log.e(str, str2, exc);
            }
        }
    }

    /* renamed from: C */
    public static boolean m98558C(String str, String str2) {
        return new C16654b().mo79550c(str, str2);
    }

    /* renamed from: D */
    public static void m98559D(C16655c cVar) {
        f67201a = cVar;
    }

    /* renamed from: a */
    public static boolean m98560a(String str) {
        return m98571l().mo79551a(str);
    }

    /* renamed from: b */
    public static void m98561b() throws IOException {
        C16225a.m97478a();
    }

    /* renamed from: c */
    public static boolean m98562c(String str, String str2, boolean z, boolean z2) {
        return m98571l().mo79552c(str, str2, z, z2);
    }

    /* renamed from: d */
    public static boolean m98563d(String str, boolean z) {
        return m98571l().mo79553d(str, z);
    }

    /* renamed from: e */
    public static boolean m98564e(String str) {
        return m98565f(str, false);
    }

    /* renamed from: f */
    public static boolean m98565f(String str, boolean z) {
        return C16225a.m97481d(str, z);
    }

    /* renamed from: g */
    public static boolean m98566g(String[] strArr) throws Exception {
        return m98571l().mo79555f(strArr);
    }

    /* renamed from: h */
    public static List<String> m98567h(String str) throws Exception {
        return m98571l().mo79556g(str);
    }

    /* renamed from: i */
    public static String m98568i(String str) {
        return m98571l().mo79557h(str);
    }

    /* renamed from: j */
    public static C16580b m98569j(String str) {
        return m98571l().mo79559j(str);
    }

    /* renamed from: k */
    public static String m98570k(String str) {
        return m98571l().mo79560k(str);
    }

    /* renamed from: l */
    private static final C16655c m98571l() {
        C16655c cVar = f67201a;
        if (cVar != null) {
            return cVar;
        }
        C16655c.m99073l();
        return f67201a;
    }

    /* renamed from: m */
    public static ArrayList<C16579a> m98572m() throws Exception {
        return m98571l().mo79561m();
    }

    /* renamed from: n */
    public static List<String> m98573n() {
        return Arrays.asList(System.getenv("PATH").split(":"));
    }

    /* renamed from: o */
    public static C16355b m98574o(boolean z) throws IOException, TimeoutException, RootDeniedException {
        return m98575p(z, 0);
    }

    /* renamed from: p */
    public static C16355b m98575p(boolean z, int i) throws IOException, TimeoutException, RootDeniedException {
        return m98577r(z, i, C16355b.f66860A, 3);
    }

    /* renamed from: q */
    public static C16355b m98576q(boolean z, int i, C16355b.C16359d dVar) throws IOException, TimeoutException, RootDeniedException {
        return m98577r(z, i, dVar, 3);
    }

    /* renamed from: r */
    public static C16355b m98577r(boolean z, int i, C16355b.C16359d dVar, int i2) throws IOException, TimeoutException, RootDeniedException {
        return C16225a.m97487j(z, i, dVar, i2);
    }

    /* renamed from: s */
    public static C16355b m98578s(boolean z, C16355b.C16359d dVar) throws IOException, TimeoutException, RootDeniedException {
        return m98577r(z, 0, dVar, 3);
    }

    /* renamed from: t */
    public static long m98579t(String str) {
        return m98571l().mo79563o(str);
    }

    /* renamed from: u */
    public static String m98580u(String str) {
        return m98571l().mo79564p(str);
    }

    /* renamed from: v */
    public static boolean m98581v() {
        return C16225a.m97488k(0, 3);
    }

    /* renamed from: w */
    public static boolean m98582w(int i, int i2) {
        return C16225a.m97488k(i, i2);
    }

    /* renamed from: x */
    public static boolean m98583x() {
        return C16225a.m97489l();
    }

    /* renamed from: y */
    public static boolean m98584y(String str) {
        return m98571l().mo79566r(str);
    }

    /* renamed from: z */
    public static void m98585z(String str) {
        m98557B((String) null, str, 3, (Exception) null);
    }
}
