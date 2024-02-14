package p398tb;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import p362pb.C16152c;

/* renamed from: tb.e */
/* compiled from: JvmPrimitiveType */
public enum C16610e {
    BOOLEAN(C13859i.BOOLEAN, TypedValues.Custom.S_BOOLEAN, "Z", "java.lang.Boolean"),
    CHAR(C13859i.CHAR, "char", "C", "java.lang.Character"),
    BYTE(C13859i.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(C13859i.SHORT, "short", ExifInterface.LATITUDE_SOUTH, "java.lang.Short"),
    INT(C13859i.INT, "int", "I", "java.lang.Integer"),
    FLOAT(C13859i.FLOAT, TypedValues.Custom.S_FLOAT, "F", "java.lang.Float"),
    LONG(C13859i.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(C13859i.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: A */
    private static final Map<String, C16610e> f67436A = null;

    /* renamed from: B */
    private static final Map<C13859i, C16610e> f67437B = null;

    /* renamed from: C */
    private static final Map<String, C16610e> f67438C = null;

    /* renamed from: z */
    private static final Set<C16152c> f67448z = null;
    private final String desc;
    private final String name;
    private final C13859i primitiveType;
    private final C16152c wrapperFqName;

    static {
        int i;
        f67448z = new HashSet();
        f67436A = new HashMap();
        f67437B = new EnumMap(C13859i.class);
        f67438C = new HashMap();
        for (C16610e eVar : values()) {
            f67448z.add(eVar.mo79465j());
            f67436A.put(eVar.mo79463g(), eVar);
            f67437B.put(eVar.mo79464i(), eVar);
            f67438C.put(eVar.mo79462f(), eVar);
        }
    }

    private C16610e(C13859i iVar, String str, String str2, String str3) {
        if (iVar == null) {
            m98933b(6);
        }
        if (str == null) {
            m98933b(7);
        }
        if (str2 == null) {
            m98933b(8);
        }
        if (str3 == null) {
            m98933b(9);
        }
        this.primitiveType = iVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new C16152c(str3);
    }

    /* renamed from: d */
    public static C16610e m98934d(String str) {
        if (str == null) {
            m98933b(1);
        }
        C16610e eVar = f67436A.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    /* renamed from: e */
    public static C16610e m98935e(C13859i iVar) {
        if (iVar == null) {
            m98933b(3);
        }
        C16610e eVar = f67437B.get(iVar);
        if (eVar == null) {
            m98933b(4);
        }
        return eVar;
    }

    /* renamed from: f */
    public String mo79462f() {
        String str = this.desc;
        if (str == null) {
            m98933b(12);
        }
        return str;
    }

    /* renamed from: g */
    public String mo79463g() {
        String str = this.name;
        if (str == null) {
            m98933b(11);
        }
        return str;
    }

    /* renamed from: i */
    public C13859i mo79464i() {
        C13859i iVar = this.primitiveType;
        if (iVar == null) {
            m98933b(10);
        }
        return iVar;
    }

    /* renamed from: j */
    public C16152c mo79465j() {
        C16152c cVar = this.wrapperFqName;
        if (cVar == null) {
            m98933b(13);
        }
        return cVar;
    }
}
