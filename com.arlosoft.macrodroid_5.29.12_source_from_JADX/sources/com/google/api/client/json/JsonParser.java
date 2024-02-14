package com.google.api.client.json;

import com.google.api.client.json.JsonPolymorphicTypeMap;
import com.google.api.client.util.Beta;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sets;
import com.google.api.client.util.Types;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class JsonParser {

    /* renamed from: a */
    private static WeakHashMap<Class<?>, Field> f52539a = new WeakHashMap<>();

    /* renamed from: b */
    private static final Lock f52540b = new ReentrantLock();

    /* renamed from: com.google.api.client.json.JsonParser$1 */
    static /* synthetic */ class C108351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f52541a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.api.client.json.JsonToken[] r0 = com.google.api.client.json.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52541a = r0
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f52541a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.api.client.json.JsonToken r1 = com.google.api.client.json.JsonToken.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.json.JsonParser.C108351.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b3 A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01b6 A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e4 A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ea A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01ef A[ADDED_TO_REGION, Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x020c A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0215 A[Catch:{ IllegalArgumentException -> 0x032c }, RETURN] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m72275A(java.lang.reflect.Field r9, java.lang.reflect.Type r10, java.util.ArrayList<java.lang.reflect.Type> r11, java.lang.Object r12, com.google.api.client.json.CustomizeJsonParser r13, boolean r14) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.reflect.Type r10 = com.google.api.client.util.Data.m72660k(r11, r10)
            boolean r2 = r10 instanceof java.lang.Class
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r10
            java.lang.Class r2 = (java.lang.Class) r2
            goto L_0x0012
        L_0x0011:
            r2 = r3
        L_0x0012:
            boolean r4 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x001d
            r2 = r10
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.Class r2 = com.google.api.client.util.Types.m72736g(r2)
        L_0x001d:
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            if (r2 != r4) goto L_0x0025
            r8.mo60198B()
            return r3
        L_0x0025:
            com.google.api.client.json.JsonToken r4 = r8.mo60203f()
            int[] r5 = com.google.api.client.json.JsonParser.C108351.f52541a     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonToken r6 = r8.mo60203f()     // Catch:{ IllegalArgumentException -> 0x032c }
            int r6 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x032c }
            r5 = r5[r6]     // Catch:{ IllegalArgumentException -> 0x032c }
            r6 = 0
            r7 = 1
            switch(r5) {
                case 1: goto L_0x0216;
                case 2: goto L_0x01b9;
                case 3: goto L_0x01b9;
                case 4: goto L_0x0216;
                case 5: goto L_0x0216;
                case 6: goto L_0x0192;
                case 7: goto L_0x0192;
                case 8: goto L_0x00de;
                case 9: goto L_0x00de;
                case 10: goto L_0x0089;
                case 11: goto L_0x003e;
                default: goto L_0x003a;
            }     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x003a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x030d
        L_0x003e:
            if (r2 == 0) goto L_0x0046
            boolean r12 = r2.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r12 != 0) goto L_0x0047
        L_0x0046:
            r6 = 1
        L_0x0047:
            java.lang.String r12 = "primitive number field but found a JSON null"
            com.google.api.client.util.Preconditions.m72714b(r6, r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == 0) goto L_0x0080
            int r12 = r2.getModifiers()     // Catch:{ IllegalArgumentException -> 0x032c }
            r12 = r12 & 1536(0x600, float:2.152E-42)
            if (r12 == 0) goto L_0x0080
            java.lang.Class<java.util.Collection> r12 = java.util.Collection.class
            boolean r12 = com.google.api.client.util.Types.m72740k(r2, r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r12 == 0) goto L_0x006b
            java.util.Collection r10 = com.google.api.client.util.Data.m72656g(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Class r10 = r10.getClass()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r9 = com.google.api.client.util.Data.m72658i(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x006b:
            java.lang.Class<java.util.Map> r12 = java.util.Map.class
            boolean r12 = com.google.api.client.util.Types.m72740k(r2, r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r12 == 0) goto L_0x0080
            java.util.Map r10 = com.google.api.client.util.Data.m72657h(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Class r10 = r10.getClass()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r9 = com.google.api.client.util.Data.m72658i(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0080:
            java.lang.Class r10 = com.google.api.client.util.Types.m72735f(r11, r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r9 = com.google.api.client.util.Data.m72658i(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0089:
            java.lang.String r11 = r8.mo60211n()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r11 = r11.trim()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r11 = r11.toLowerCase(r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Class r12 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == r12) goto L_0x00a3
            if (r2 == r1) goto L_0x00a3
            java.lang.Class r12 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == r12) goto L_0x00a3
            if (r2 != r0) goto L_0x00bb
        L_0x00a3:
            java.lang.String r12 = "nan"
            boolean r12 = r11.equals(r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r12 != 0) goto L_0x00d5
            java.lang.String r12 = "infinity"
            boolean r12 = r11.equals(r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r12 != 0) goto L_0x00d5
            java.lang.String r12 = "-infinity"
            boolean r11 = r11.equals(r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r11 != 0) goto L_0x00d5
        L_0x00bb:
            if (r2 == 0) goto L_0x00cf
            java.lang.Class<java.lang.Number> r11 = java.lang.Number.class
            boolean r11 = r11.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r11 == 0) goto L_0x00cf
            if (r9 == 0) goto L_0x00d0
            java.lang.Class<com.google.api.client.json.JsonString> r11 = com.google.api.client.json.JsonString.class
            java.lang.annotation.Annotation r11 = r9.getAnnotation(r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r11 == 0) goto L_0x00d0
        L_0x00cf:
            r6 = 1
        L_0x00d0:
            java.lang.String r11 = "number field formatted as a JSON string must use the @JsonString annotation"
            com.google.api.client.util.Preconditions.m72714b(r6, r11)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x00d5:
            java.lang.String r11 = r8.mo60211n()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r9 = com.google.api.client.util.Data.m72659j(r10, r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x00de:
            if (r9 == 0) goto L_0x00e8
            java.lang.Class<com.google.api.client.json.JsonString> r11 = com.google.api.client.json.JsonString.class
            java.lang.annotation.Annotation r11 = r9.getAnnotation(r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r11 != 0) goto L_0x00e9
        L_0x00e8:
            r6 = 1
        L_0x00e9:
            java.lang.String r11 = "number type formatted as a JSON number cannot use @JsonString annotation"
            com.google.api.client.util.Preconditions.m72714b(r6, r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == 0) goto L_0x018d
            java.lang.Class<java.math.BigDecimal> r11 = java.math.BigDecimal.class
            boolean r11 = r2.isAssignableFrom(r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r11 == 0) goto L_0x00fa
            goto L_0x018d
        L_0x00fa:
            java.lang.Class<java.math.BigInteger> r11 = java.math.BigInteger.class
            if (r2 != r11) goto L_0x0103
            java.math.BigInteger r9 = r8.mo60200b()     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0103:
            if (r2 == r0) goto L_0x0184
            java.lang.Class r11 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r11) goto L_0x010b
            goto L_0x0184
        L_0x010b:
            java.lang.Class<java.lang.Long> r11 = java.lang.Long.class
            if (r2 == r11) goto L_0x017b
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r11) goto L_0x0114
            goto L_0x017b
        L_0x0114:
            if (r2 == r1) goto L_0x0172
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r11) goto L_0x011b
            goto L_0x0172
        L_0x011b:
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            if (r2 == r11) goto L_0x0169
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r11) goto L_0x0124
            goto L_0x0169
        L_0x0124:
            java.lang.Class<java.lang.Short> r11 = java.lang.Short.class
            if (r2 == r11) goto L_0x0160
            java.lang.Class r11 = java.lang.Short.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r11) goto L_0x012d
            goto L_0x0160
        L_0x012d:
            java.lang.Class<java.lang.Byte> r11 = java.lang.Byte.class
            if (r2 == r11) goto L_0x0157
            java.lang.Class r11 = java.lang.Byte.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r11) goto L_0x0136
            goto L_0x0157
        L_0x0136:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x032c }
            int r13 = r10.length()     // Catch:{ IllegalArgumentException -> 0x032c }
            int r13 = r13 + 30
            r12.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r13 = "expected numeric type but got "
            r12.append(r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            r12.append(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r10 = r12.toString()     // Catch:{ IllegalArgumentException -> 0x032c }
            r11.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            throw r11     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x0157:
            byte r10 = r8.mo60201c()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Byte r9 = java.lang.Byte.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0160:
            short r10 = r8.mo60210m()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Short r9 = java.lang.Short.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0169:
            int r10 = r8.mo60208k()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0172:
            float r10 = r8.mo60207j()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Float r9 = java.lang.Float.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x017b:
            long r10 = r8.mo60209l()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0184:
            double r10 = r8.mo60205h()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Double r9 = java.lang.Double.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x018d:
            java.math.BigDecimal r9 = r8.mo60204g()     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0192:
            if (r10 == 0) goto L_0x01a5
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == r11) goto L_0x01a5
            if (r2 == 0) goto L_0x01a3
            java.lang.Class<java.lang.Boolean> r11 = java.lang.Boolean.class
            boolean r11 = r2.isAssignableFrom(r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r11 == 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r11 = 0
            goto L_0x01a6
        L_0x01a5:
            r11 = 1
        L_0x01a6:
            java.lang.String r12 = "expected type Boolean or boolean but got %s"
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x032c }
            r13[r6] = r10     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.util.Preconditions.m72715c(r11, r12, r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonToken r10 = com.google.api.client.json.JsonToken.VALUE_TRUE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r4 != r10) goto L_0x01b6
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x01b8
        L_0x01b6:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x01b8:
            return r9
        L_0x01b9:
            boolean r14 = com.google.api.client.util.Types.m72739j(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r10 == 0) goto L_0x01ce
            if (r14 != 0) goto L_0x01ce
            if (r2 == 0) goto L_0x01cc
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = com.google.api.client.util.Types.m72740k(r2, r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r0 = 0
            goto L_0x01cf
        L_0x01ce:
            r0 = 1
        L_0x01cf:
            java.lang.String r1 = "expected collection or array type but got %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x032c }
            r4[r6] = r10     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.util.Preconditions.m72715c(r0, r1, r4)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r13 == 0) goto L_0x01e1
            if (r9 == 0) goto L_0x01e1
            java.util.Collection r12 = r13.mo60515b(r12, r9)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x01e2
        L_0x01e1:
            r12 = r3
        L_0x01e2:
            if (r12 != 0) goto L_0x01e8
            java.util.Collection r12 = com.google.api.client.util.Data.m72656g(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x01e8:
            if (r14 == 0) goto L_0x01ef
            java.lang.reflect.Type r3 = com.google.api.client.util.Types.m72731b(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x01fd
        L_0x01ef:
            if (r2 == 0) goto L_0x01fd
            java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x01fd
            java.lang.reflect.Type r3 = com.google.api.client.util.Types.m72733d(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x01fd:
            java.lang.reflect.Type r10 = com.google.api.client.util.Data.m72660k(r11, r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = r13
            r0.m72280x(r1, r2, r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r14 == 0) goto L_0x0215
            java.lang.Class r10 = com.google.api.client.util.Types.m72735f(r11, r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r9 = com.google.api.client.util.Types.m72744o(r12, r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0215:
            return r12
        L_0x0216:
            boolean r0 = com.google.api.client.util.Types.m72739j(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 != 0) goto L_0x021e
            r0 = 1
            goto L_0x021f
        L_0x021e:
            r0 = 0
        L_0x021f:
            java.lang.String r1 = "expected object or map type but got %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x032c }
            r4[r6] = r10     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.util.Preconditions.m72715c(r0, r1, r4)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r14 == 0) goto L_0x022f
            java.lang.reflect.Field r14 = m72278d(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x0230
        L_0x022f:
            r14 = r3
        L_0x0230:
            if (r2 == 0) goto L_0x0239
            if (r13 == 0) goto L_0x0239
            java.lang.Object r12 = r13.mo60516c(r12, r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x023a
        L_0x0239:
            r12 = r3
        L_0x023a:
            if (r2 == 0) goto L_0x0246
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = com.google.api.client.util.Types.m72740k(r2, r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x0246
            r0 = 1
            goto L_0x0247
        L_0x0246:
            r0 = 0
        L_0x0247:
            if (r14 == 0) goto L_0x024f
            com.google.api.client.json.GenericJson r12 = new com.google.api.client.json.GenericJson     // Catch:{ IllegalArgumentException -> 0x032c }
            r12.<init>()     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x025f
        L_0x024f:
            if (r12 != 0) goto L_0x025f
            if (r0 != 0) goto L_0x025b
            if (r2 != 0) goto L_0x0256
            goto L_0x025b
        L_0x0256:
            java.lang.Object r12 = com.google.api.client.util.Types.m72742m(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x025f
        L_0x025b:
            java.util.Map r12 = com.google.api.client.util.Data.m72657h(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x025f:
            int r1 = r11.size()     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r10 == 0) goto L_0x0268
            r11.add(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x0268:
            if (r0 == 0) goto L_0x028f
            java.lang.Class<com.google.api.client.util.GenericData> r0 = com.google.api.client.util.GenericData.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 != 0) goto L_0x028f
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x0280
            java.lang.reflect.Type r0 = com.google.api.client.util.Types.m72734e(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            r4 = r0
            goto L_0x0281
        L_0x0280:
            r4 = r3
        L_0x0281:
            if (r4 == 0) goto L_0x028f
            r2 = r12
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IllegalArgumentException -> 0x032c }
            r0 = r8
            r1 = r9
            r3 = r4
            r4 = r11
            r5 = r13
            r0.m72281z(r1, r2, r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r12
        L_0x028f:
            r8.m72279s(r11, r12, r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r10 == 0) goto L_0x0297
            r11.remove(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x0297:
            if (r14 != 0) goto L_0x029a
            return r12
        L_0x029a:
            r10 = r12
            com.google.api.client.json.GenericJson r10 = (com.google.api.client.json.GenericJson) r10     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r13 = r14.getName()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r10 = r10.get(r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r10 == 0) goto L_0x02a9
            r13 = 1
            goto L_0x02aa
        L_0x02a9:
            r13 = 0
        L_0x02aa:
            java.lang.String r0 = "No value specified for @JsonPolymorphicTypeMap field"
            com.google.api.client.util.Preconditions.m72714b(r13, r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r10 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Class<com.google.api.client.json.JsonPolymorphicTypeMap> r13 = com.google.api.client.json.JsonPolymorphicTypeMap.class
            java.lang.annotation.Annotation r13 = r14.getAnnotation(r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonPolymorphicTypeMap r13 = (com.google.api.client.json.JsonPolymorphicTypeMap) r13     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonPolymorphicTypeMap$TypeDef[] r13 = r13.typeDefinitions()     // Catch:{ IllegalArgumentException -> 0x032c }
            int r14 = r13.length     // Catch:{ IllegalArgumentException -> 0x032c }
            r0 = 0
        L_0x02c1:
            if (r0 >= r14) goto L_0x02d7
            r1 = r13[r0]     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r2 = r1.key()     // Catch:{ IllegalArgumentException -> 0x032c }
            boolean r2 = r2.equals(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == 0) goto L_0x02d4
            java.lang.Class r3 = r1.ref()     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x02d7
        L_0x02d4:
            int r0 = r0 + 1
            goto L_0x02c1
        L_0x02d7:
            r2 = r3
            if (r2 == 0) goto L_0x02db
            r6 = 1
        L_0x02db:
            java.lang.String r13 = "No TypeDef annotation found with key: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            int r14 = r10.length()     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r14 == 0) goto L_0x02ec
            java.lang.String r10 = r13.concat(r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x02f1
        L_0x02ec:
            java.lang.String r10 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x032c }
            r10.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x02f1:
            com.google.api.client.util.Preconditions.m72714b(r6, r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonFactory r10 = r8.mo60206i()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r12 = r10.mo60524j(r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonParser r0 = r10.mo60175e(r12)     // Catch:{ IllegalArgumentException -> 0x032c }
            r0.m72276E()     // Catch:{ IllegalArgumentException -> 0x032c }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r3 = r11
            java.lang.Object r9 = r0.m72275A(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x030d:
            java.lang.String r11 = java.lang.String.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x032c }
            int r13 = r11.length()     // Catch:{ IllegalArgumentException -> 0x032c }
            int r13 = r13 + 27
            r12.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r13 = "unexpected JSON node type: "
            r12.append(r13)     // Catch:{ IllegalArgumentException -> 0x032c }
            r12.append(r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r11 = r12.toString()     // Catch:{ IllegalArgumentException -> 0x032c }
            r10.<init>(r11)     // Catch:{ IllegalArgumentException -> 0x032c }
            throw r10     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x032c:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r8.mo60202e()
            if (r12 == 0) goto L_0x0340
            java.lang.String r13 = "key "
            r11.append(r13)
            r11.append(r12)
        L_0x0340:
            if (r9 == 0) goto L_0x0351
            if (r12 == 0) goto L_0x0349
            java.lang.String r12 = ", "
            r11.append(r12)
        L_0x0349:
            java.lang.String r12 = "field "
            r11.append(r12)
            r11.append(r9)
        L_0x0351:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r9.<init>(r11, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.json.JsonParser.m72275A(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, com.google.api.client.json.CustomizeJsonParser, boolean):java.lang.Object");
    }

    /* renamed from: E */
    private JsonToken m72276E() throws IOException {
        JsonToken f = mo60203f();
        if (f == null) {
            f = mo60212o();
        }
        Preconditions.m72714b(f != null, "no JSON input found");
        return f;
    }

    /* renamed from: F */
    private JsonToken m72277F() throws IOException {
        JsonToken E = m72276E();
        int i = C108351.f52541a[E.ordinal()];
        boolean z = true;
        if (i == 1) {
            JsonToken o = mo60212o();
            if (!(o == JsonToken.FIELD_NAME || o == JsonToken.END_OBJECT)) {
                z = false;
            }
            Preconditions.m72714b(z, o);
            return o;
        } else if (i != 2) {
            return E;
        } else {
            return mo60212o();
        }
    }

    /* renamed from: d */
    private static Field m72278d(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock = f52540b;
        lock.lock();
        try {
            if (f52539a.containsKey(cls)) {
                Field field2 = f52539a.get(cls);
                lock.unlock();
                return field2;
            }
            for (FieldInfo b : ClassInfo.m72640f(cls).mo60710c()) {
                Field b2 = b.mo60743b();
                JsonPolymorphicTypeMap jsonPolymorphicTypeMap = (JsonPolymorphicTypeMap) b2.getAnnotation(JsonPolymorphicTypeMap.class);
                if (jsonPolymorphicTypeMap != null) {
                    Preconditions.m72715c(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    Preconditions.m72715c(Data.m72653d(b2.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, b2.getType());
                    JsonPolymorphicTypeMap.TypeDef[] typeDefinitions = jsonPolymorphicTypeMap.typeDefinitions();
                    HashSet a = Sets.m72724a();
                    Preconditions.m72714b(typeDefinitions.length > 0, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (JsonPolymorphicTypeMap.TypeDef typeDef : typeDefinitions) {
                        Preconditions.m72715c(a.add(typeDef.key()), "Class contains two @TypeDef annotations with identical key: %s", typeDef.key());
                    }
                    field = b2;
                }
            }
            f52539a.put(cls, field);
            return field;
        } finally {
            f52540b.unlock();
        }
    }

    /* renamed from: s */
    private void m72279s(ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        if (obj instanceof GenericJson) {
            ((GenericJson) obj).mo60518g(mo60206i());
        }
        JsonToken F = m72277F();
        Class<?> cls = obj.getClass();
        ClassInfo f = ClassInfo.m72640f(cls);
        boolean isAssignableFrom = GenericData.class.isAssignableFrom(cls);
        if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            while (F == JsonToken.FIELD_NAME) {
                String n = mo60211n();
                mo60212o();
                if (customizeJsonParser == null || !customizeJsonParser.mo60517d(obj, n)) {
                    FieldInfo b = f.mo60709b(n);
                    if (b != null) {
                        if (!b.mo60748h() || b.mo60749i()) {
                            Field b2 = b.mo60743b();
                            int size = arrayList.size();
                            arrayList.add(b2.getGenericType());
                            Object A = m72275A(b2, b.mo60744d(), arrayList, obj, customizeJsonParser, true);
                            arrayList.remove(size);
                            b.mo60750m(obj, A);
                        } else {
                            throw new IllegalArgumentException("final array/object fields are not supported");
                        }
                    } else if (isAssignableFrom) {
                        ((GenericData) obj).mo60078d(n, m72275A((Field) null, (Type) null, arrayList, obj, customizeJsonParser, true));
                    } else {
                        if (customizeJsonParser != null) {
                            customizeJsonParser.mo60514a(obj, n);
                        }
                        mo60198B();
                    }
                    F = mo60212o();
                } else {
                    return;
                }
            }
            return;
        }
        m72281z((Field) null, (Map) obj, Types.m72734e(cls), arrayList, customizeJsonParser);
    }

    /* renamed from: x */
    private <T> void m72280x(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) throws IOException {
        JsonToken F = m72277F();
        while (F != JsonToken.END_ARRAY) {
            collection.add(m72275A(field, type, arrayList, collection, customizeJsonParser, true));
            F = mo60212o();
        }
    }

    /* renamed from: z */
    private void m72281z(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) throws IOException {
        JsonToken F = m72277F();
        while (F == JsonToken.FIELD_NAME) {
            String n = mo60211n();
            mo60212o();
            if (customizeJsonParser == null || !customizeJsonParser.mo60517d(map, n)) {
                map.put(n, m72275A(field, type, arrayList, map, customizeJsonParser, true));
                F = mo60212o();
            } else {
                return;
            }
        }
    }

    /* renamed from: B */
    public abstract JsonParser mo60198B() throws IOException;

    /* renamed from: C */
    public final String mo60531C(Set<String> set) throws IOException {
        JsonToken F = m72277F();
        while (F == JsonToken.FIELD_NAME) {
            String n = mo60211n();
            mo60212o();
            if (set.contains(n)) {
                return n;
            }
            mo60198B();
            F = mo60212o();
        }
        return null;
    }

    /* renamed from: D */
    public final void mo60532D(String str) throws IOException {
        mo60531C(Collections.singleton(str));
    }

    /* renamed from: a */
    public abstract void mo60199a() throws IOException;

    /* renamed from: b */
    public abstract BigInteger mo60200b() throws IOException;

    /* renamed from: c */
    public abstract byte mo60201c() throws IOException;

    /* renamed from: e */
    public abstract String mo60202e() throws IOException;

    /* renamed from: f */
    public abstract JsonToken mo60203f();

    /* renamed from: g */
    public abstract BigDecimal mo60204g() throws IOException;

    /* renamed from: h */
    public abstract double mo60205h() throws IOException;

    /* renamed from: i */
    public abstract JsonFactory mo60206i();

    /* renamed from: j */
    public abstract float mo60207j() throws IOException;

    /* renamed from: k */
    public abstract int mo60208k() throws IOException;

    /* renamed from: l */
    public abstract long mo60209l() throws IOException;

    /* renamed from: m */
    public abstract short mo60210m() throws IOException;

    /* renamed from: n */
    public abstract String mo60211n() throws IOException;

    /* renamed from: o */
    public abstract JsonToken mo60212o() throws IOException;

    @Beta
    /* renamed from: p */
    public final <T> T mo60533p(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        return mo60535r(cls, false, customizeJsonParser);
    }

    /* renamed from: q */
    public Object mo60534q(Type type, boolean z) throws IOException {
        return mo60535r(type, z, (CustomizeJsonParser) null);
    }

    @Beta
    /* renamed from: r */
    public Object mo60535r(Type type, boolean z, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                m72276E();
            }
            return m72275A((Field) null, type, new ArrayList(), (Object) null, customizeJsonParser, true);
        } finally {
            if (z) {
                mo60199a();
            }
        }
    }

    /* renamed from: t */
    public final <T> T mo60536t(Class<T> cls) throws IOException {
        return mo60537u(cls, (CustomizeJsonParser) null);
    }

    @Beta
    /* renamed from: u */
    public final <T> T mo60537u(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            return mo60533p(cls, customizeJsonParser);
        } finally {
            mo60199a();
        }
    }

    /* renamed from: v */
    public final <T> Collection<T> mo60538v(Class<?> cls, Class<T> cls2) throws IOException {
        return mo60539w(cls, cls2, (CustomizeJsonParser) null);
    }

    @Beta
    /* renamed from: w */
    public final <T> Collection<T> mo60539w(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) throws IOException {
        Collection<Object> g = Data.m72656g(cls);
        mo60540y(g, cls2, customizeJsonParser);
        return g;
    }

    @Beta
    /* renamed from: y */
    public final <T> void mo60540y(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        m72280x((Field) null, collection, cls, new ArrayList(), customizeJsonParser);
    }
}
