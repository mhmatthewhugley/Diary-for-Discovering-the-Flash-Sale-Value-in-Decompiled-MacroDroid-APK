package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public abstract class JsonGenerator {
    /* renamed from: d */
    private void m72250d(boolean z, Object obj) throws IOException {
        ClassInfo classInfo;
        boolean z2;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (Data.m72652c(obj)) {
                mo60183i();
            } else if (obj instanceof String) {
                mo60192r((String) obj);
            } else {
                boolean z3 = true;
                if (obj instanceof Number) {
                    if (z) {
                        mo60192r(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        mo60188n((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        mo60189o((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        mo60187m(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z3 = false;
                        }
                        Preconditions.m72713a(z3);
                        mo60185k(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        mo60186l(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z3 = false;
                        }
                        Preconditions.m72713a(z3);
                        mo60184j(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    mo60179e(((Boolean) obj).booleanValue());
                } else if (obj instanceof DateTime) {
                    mo60192r(((DateTime) obj).mo60736c());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    mo60190p();
                    for (Object d : Types.m72741l(obj)) {
                        m72250d(z, d);
                    }
                    mo60180f();
                } else if (cls.isEnum()) {
                    String e = FieldInfo.m72675j((Enum) obj).mo60745e();
                    if (e == null) {
                        mo60183i();
                    } else {
                        mo60192r(e);
                    }
                } else {
                    mo60191q();
                    boolean z4 = (obj instanceof Map) && !(obj instanceof GenericData);
                    if (z4) {
                        classInfo = null;
                    } else {
                        classInfo = ClassInfo.m72640f(cls);
                    }
                    for (Map.Entry next : Data.m72655f(obj).entrySet()) {
                        Object value = next.getValue();
                        if (value != null) {
                            String str = (String) next.getKey();
                            if (z4) {
                                z2 = z;
                            } else {
                                Field a = classInfo.mo60708a(str);
                                z2 = (a == null || a.getAnnotation(JsonString.class) == null) ? false : true;
                            }
                            mo60182h(str);
                            m72250d(z2, value);
                        }
                    }
                    mo60181g();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo60177a() throws IOException {
    }

    /* renamed from: b */
    public abstract void mo60178b() throws IOException;

    /* renamed from: c */
    public final void mo60525c(Object obj) throws IOException {
        m72250d(false, obj);
    }

    /* renamed from: e */
    public abstract void mo60179e(boolean z) throws IOException;

    /* renamed from: f */
    public abstract void mo60180f() throws IOException;

    /* renamed from: g */
    public abstract void mo60181g() throws IOException;

    /* renamed from: h */
    public abstract void mo60182h(String str) throws IOException;

    /* renamed from: i */
    public abstract void mo60183i() throws IOException;

    /* renamed from: j */
    public abstract void mo60184j(double d) throws IOException;

    /* renamed from: k */
    public abstract void mo60185k(float f) throws IOException;

    /* renamed from: l */
    public abstract void mo60186l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo60187m(long j) throws IOException;

    /* renamed from: n */
    public abstract void mo60188n(BigDecimal bigDecimal) throws IOException;

    /* renamed from: o */
    public abstract void mo60189o(BigInteger bigInteger) throws IOException;

    /* renamed from: p */
    public abstract void mo60190p() throws IOException;

    /* renamed from: q */
    public abstract void mo60191q() throws IOException;

    /* renamed from: r */
    public abstract void mo60192r(String str) throws IOException;
}
