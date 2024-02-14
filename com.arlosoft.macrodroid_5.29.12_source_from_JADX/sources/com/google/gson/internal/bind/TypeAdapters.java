package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {

    /* renamed from: A */
    public static final TypeAdapter<String> f55975A;

    /* renamed from: B */
    public static final TypeAdapter<BigDecimal> f55976B = new TypeAdapter<BigDecimal>() {
        /* renamed from: f */
        public BigDecimal mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value((Number) bigDecimal);
        }
    };

    /* renamed from: C */
    public static final TypeAdapter<BigInteger> f55977C = new TypeAdapter<BigInteger>() {
        /* renamed from: f */
        public BigInteger mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value((Number) bigInteger);
        }
    };

    /* renamed from: D */
    public static final TypeAdapterFactory f55978D;

    /* renamed from: E */
    public static final TypeAdapter<StringBuilder> f55979E;

    /* renamed from: F */
    public static final TypeAdapterFactory f55980F;

    /* renamed from: G */
    public static final TypeAdapter<StringBuffer> f55981G;

    /* renamed from: H */
    public static final TypeAdapterFactory f55982H;

    /* renamed from: I */
    public static final TypeAdapter<URL> f55983I;

    /* renamed from: J */
    public static final TypeAdapterFactory f55984J;

    /* renamed from: K */
    public static final TypeAdapter<URI> f55985K;

    /* renamed from: L */
    public static final TypeAdapterFactory f55986L;

    /* renamed from: M */
    public static final TypeAdapter<InetAddress> f55987M;

    /* renamed from: N */
    public static final TypeAdapterFactory f55988N;

    /* renamed from: O */
    public static final TypeAdapter<UUID> f55989O;

    /* renamed from: P */
    public static final TypeAdapterFactory f55990P;

    /* renamed from: Q */
    public static final TypeAdapter<Currency> f55991Q;

    /* renamed from: R */
    public static final TypeAdapterFactory f55992R;

    /* renamed from: S */
    public static final TypeAdapterFactory f55993S = new TypeAdapterFactory() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.mo64306c() != Timestamp.class) {
                return null;
            }
            final TypeAdapter<Date> m = gson.mo63979m(Date.class);
            return new TypeAdapter<Timestamp>() {
                /* renamed from: f */
                public Timestamp mo40900c(JsonReader jsonReader) throws IOException {
                    Date date = (Date) m.mo40900c(jsonReader);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                /* renamed from: g */
                public void mo40901e(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                    m.mo40901e(jsonWriter, timestamp);
                }
            };
        }
    };

    /* renamed from: T */
    public static final TypeAdapter<Calendar> f55994T;

    /* renamed from: U */
    public static final TypeAdapterFactory f55995U;

    /* renamed from: V */
    public static final TypeAdapter<Locale> f55996V;

    /* renamed from: W */
    public static final TypeAdapterFactory f55997W;

    /* renamed from: X */
    public static final TypeAdapter<JsonElement> f55998X;

    /* renamed from: Y */
    public static final TypeAdapterFactory f55999Y;

    /* renamed from: Z */
    public static final TypeAdapterFactory f56000Z = new TypeAdapterFactory() {
        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.gson.reflect.TypeToken<T>, com.google.gson.reflect.TypeToken] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.google.gson.TypeAdapter<T> mo40897a(com.google.gson.Gson r2, com.google.gson.reflect.TypeToken<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.mo64306c()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter r2 = new com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C1151330.mo40897a(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
        }
    };

    /* renamed from: a */
    public static final TypeAdapter<Class> f56001a;

    /* renamed from: b */
    public static final TypeAdapterFactory f56002b;

    /* renamed from: c */
    public static final TypeAdapter<BitSet> f56003c;

    /* renamed from: d */
    public static final TypeAdapterFactory f56004d;

    /* renamed from: e */
    public static final TypeAdapter<Boolean> f56005e;

    /* renamed from: f */
    public static final TypeAdapter<Boolean> f56006f = new TypeAdapter<Boolean>() {
        /* renamed from: f */
        public Boolean mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }
    };

    /* renamed from: g */
    public static final TypeAdapterFactory f56007g;

    /* renamed from: h */
    public static final TypeAdapter<Number> f56008h;

    /* renamed from: i */
    public static final TypeAdapterFactory f56009i;

    /* renamed from: j */
    public static final TypeAdapter<Number> f56010j;

    /* renamed from: k */
    public static final TypeAdapterFactory f56011k;

    /* renamed from: l */
    public static final TypeAdapter<Number> f56012l;

    /* renamed from: m */
    public static final TypeAdapterFactory f56013m;

    /* renamed from: n */
    public static final TypeAdapter<AtomicInteger> f56014n;

    /* renamed from: o */
    public static final TypeAdapterFactory f56015o;

    /* renamed from: p */
    public static final TypeAdapter<AtomicBoolean> f56016p;

    /* renamed from: q */
    public static final TypeAdapterFactory f56017q;

    /* renamed from: r */
    public static final TypeAdapter<AtomicIntegerArray> f56018r;

    /* renamed from: s */
    public static final TypeAdapterFactory f56019s;

    /* renamed from: t */
    public static final TypeAdapter<Number> f56020t = new TypeAdapter<Number>() {
        /* renamed from: f */
        public Number mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };

    /* renamed from: u */
    public static final TypeAdapter<Number> f56021u = new TypeAdapter<Number>() {
        /* renamed from: f */
        public Number mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };

    /* renamed from: v */
    public static final TypeAdapter<Number> f56022v = new TypeAdapter<Number>() {
        /* renamed from: f */
        public Number mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };

    /* renamed from: w */
    public static final TypeAdapter<Number> f56023w;

    /* renamed from: x */
    public static final TypeAdapterFactory f56024x;

    /* renamed from: y */
    public static final TypeAdapter<Character> f56025y;

    /* renamed from: z */
    public static final TypeAdapterFactory f56026z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$36 */
    static /* synthetic */ class C1152036 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56043a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56043a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f56043a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C1152036.<clinit>():void");
        }
    }

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a */
        private final Map<String, T> f56044a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f56045b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String put : serializedName.alternate()) {
                            this.f56044a.put(put, enumR);
                        }
                    }
                    this.f56044a.put(name, enumR);
                    this.f56045b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: f */
        public T mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (Enum) this.f56044a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(t == null ? null : this.f56045b.get(t));
        }
    }

    static {
        TypeAdapter<Class> b = new TypeAdapter<Class>() {
            /* renamed from: f */
            public Class mo40900c(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.mo64054b();
        f56001a = b;
        f56002b = m78586b(Class.class, b);
        TypeAdapter<BitSet> b2 = new TypeAdapter<BitSet>() {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
                if (r8.nextInt() != 0) goto L_0x0069;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.BitSet mo40900c(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
                /*
                    r7 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r8.beginArray()
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    r2 = 0
                    r3 = 0
                L_0x000e:
                    com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                    if (r1 == r4) goto L_0x0075
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.C1152036.f56043a
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L_0x0063
                    r6 = 2
                    if (r4 == r6) goto L_0x005e
                    r6 = 3
                    if (r4 != r6) goto L_0x0047
                    java.lang.String r1 = r8.nextString()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                    if (r1 == 0) goto L_0x002e
                    goto L_0x0069
                L_0x002e:
                    r5 = 0
                    goto L_0x0069
                L_0x0030:
                    com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x0047:
                    com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x005e:
                    boolean r5 = r8.nextBoolean()
                    goto L_0x0069
                L_0x0063:
                    int r1 = r8.nextInt()
                    if (r1 == 0) goto L_0x002e
                L_0x0069:
                    if (r5 == 0) goto L_0x006e
                    r0.set(r3)
                L_0x006e:
                    int r3 = r3 + 1
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    goto L_0x000e
                L_0x0075:
                    r8.endArray()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C115002.mo40900c(com.google.gson.stream.JsonReader):java.util.BitSet");
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(bitSet.get(i) ? 1 : 0);
                }
                jsonWriter.endArray();
            }
        }.mo64054b();
        f56003c = b2;
        f56004d = m78586b(BitSet.class, b2);
        C115123 r0 = new TypeAdapter<Boolean>() {
            /* renamed from: f */
            public Boolean mo40900c(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                } else if (peek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                } else {
                    return Boolean.valueOf(jsonReader.nextBoolean());
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        f56005e = r0;
        f56007g = m78587c(Boolean.TYPE, Boolean.class, r0);
        C115225 r02 = new TypeAdapter<Number>() {
            /* renamed from: f */
            public Number mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56008h = r02;
        f56009i = m78587c(Byte.TYPE, Byte.class, r02);
        C115236 r03 = new TypeAdapter<Number>() {
            /* renamed from: f */
            public Number mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Short.valueOf((short) jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56010j = r03;
        f56011k = m78587c(Short.TYPE, Short.class, r03);
        C115247 r04 = new TypeAdapter<Number>() {
            /* renamed from: f */
            public Number mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56012l = r04;
        f56013m = m78587c(Integer.TYPE, Integer.class, r04);
        TypeAdapter<AtomicInteger> b3 = new TypeAdapter<AtomicInteger>() {
            /* renamed from: f */
            public AtomicInteger mo40900c(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value((long) atomicInteger.get());
            }
        }.mo64054b();
        f56014n = b3;
        f56015o = m78586b(AtomicInteger.class, b3);
        TypeAdapter<AtomicBoolean> b4 = new TypeAdapter<AtomicBoolean>() {
            /* renamed from: f */
            public AtomicBoolean mo40900c(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.mo64054b();
        f56016p = b4;
        f56017q = m78586b(AtomicBoolean.class, b4);
        TypeAdapter<AtomicIntegerArray> b5 = new TypeAdapter<AtomicIntegerArray>() {
            /* renamed from: f */
            public AtomicIntegerArray mo40900c(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value((long) atomicIntegerArray.get(i));
                }
                jsonWriter.endArray();
            }
        }.mo64054b();
        f56018r = b5;
        f56019s = m78586b(AtomicIntegerArray.class, b5);
        C1149414 r05 = new TypeAdapter<Number>() {
            /* renamed from: f */
            public Number mo40900c(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                int i = C1152036.f56043a[peek.ordinal()];
                if (i == 1 || i == 3) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                if (i == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + peek);
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f56023w = r05;
        f56024x = m78586b(Number.class, r05);
        C1149515 r06 = new TypeAdapter<Character>() {
            /* renamed from: f */
            public Character mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + nextString);
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Character ch) throws IOException {
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        f56025y = r06;
        f56026z = m78587c(Character.TYPE, Character.class, r06);
        C1149616 r07 = new TypeAdapter<String>() {
            /* renamed from: f */
            public String mo40900c(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                } else if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                } else {
                    return jsonReader.nextString();
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        f55975A = r07;
        f55978D = m78586b(String.class, r07);
        C1149919 r08 = new TypeAdapter<StringBuilder>() {
            /* renamed from: f */
            public StringBuilder mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        f55979E = r08;
        f55980F = m78586b(StringBuilder.class, r08);
        C1150120 r09 = new TypeAdapter<StringBuffer>() {
            /* renamed from: f */
            public StringBuffer mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f55981G = r09;
        f55982H = m78586b(StringBuffer.class, r09);
        C1150221 r010 = new TypeAdapter<URL>() {
            /* renamed from: f */
            public URL mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        f55983I = r010;
        f55984J = m78586b(URL.class, r010);
        C1150322 r011 = new TypeAdapter<URI>() {
            /* renamed from: f */
            public URI mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e) {
                    throw new JsonIOException((Throwable) e);
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        f55985K = r011;
        f55986L = m78586b(URI.class, r011);
        C1150423 r012 = new TypeAdapter<InetAddress>() {
            /* renamed from: f */
            public InetAddress mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f55987M = r012;
        f55988N = m78589e(InetAddress.class, r012);
        C1150524 r013 = new TypeAdapter<UUID>() {
            /* renamed from: f */
            public UUID mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return UUID.fromString(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        f55989O = r013;
        f55990P = m78586b(UUID.class, r013);
        TypeAdapter<Currency> b6 = new TypeAdapter<Currency>() {
            /* renamed from: f */
            public Currency mo40900c(JsonReader jsonReader) throws IOException {
                return Currency.getInstance(jsonReader.nextString());
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.mo64054b();
        f55991Q = b6;
        f55992R = m78586b(Currency.class, b6);
        C1150927 r014 = new TypeAdapter<Calendar>() {
            /* renamed from: f */
            public Calendar mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i = nextInt;
                    } else if ("month".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i6 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value((long) calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value((long) calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value((long) calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value((long) calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value((long) calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value((long) calendar.get(13));
                jsonWriter.endObject();
            }
        };
        f55994T = r014;
        f55995U = m78588d(Calendar.class, GregorianCalendar.class, r014);
        C1151028 r015 = new TypeAdapter<Locale>() {
            /* renamed from: f */
            public Locale mo40900c(JsonReader jsonReader) throws IOException {
                String str = null;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, str);
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Locale locale) throws IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        f55996V = r015;
        f55997W = m78586b(Locale.class, r015);
        C1151129 r016 = new TypeAdapter<JsonElement>() {
            /* renamed from: f */
            public JsonElement mo40900c(JsonReader jsonReader) throws IOException {
                switch (C1152036.f56043a[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new JsonPrimitive((Number) new LazilyParsedNumber(jsonReader.nextString()));
                    case 2:
                        return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                    case 3:
                        return new JsonPrimitive(jsonReader.nextString());
                    case 4:
                        jsonReader.nextNull();
                        return JsonNull.f55812a;
                    case 5:
                        JsonArray jsonArray = new JsonArray();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonArray.mo64020p(mo40900c(jsonReader));
                        }
                        jsonReader.endArray();
                        return jsonArray;
                    case 6:
                        JsonObject jsonObject = new JsonObject();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            jsonObject.mo64037p(jsonReader.nextName(), mo40900c(jsonReader));
                        }
                        jsonReader.endObject();
                        return jsonObject;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
                if (jsonElement == null || jsonElement.mo64028m()) {
                    jsonWriter.nullValue();
                } else if (jsonElement.mo64030o()) {
                    JsonPrimitive i = jsonElement.mo64026i();
                    if (i.mo64046u()) {
                        jsonWriter.value(i.mo64044q());
                    } else if (i.mo64045s()) {
                        jsonWriter.value(i.mo64013c());
                    } else {
                        jsonWriter.value(i.mo64019k());
                    }
                } else if (jsonElement.mo64027l()) {
                    jsonWriter.beginArray();
                    Iterator<JsonElement> it = jsonElement.mo64024f().iterator();
                    while (it.hasNext()) {
                        mo40901e(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                } else if (jsonElement.mo64029n()) {
                    jsonWriter.beginObject();
                    for (Map.Entry next : jsonElement.mo64025h().entrySet()) {
                        jsonWriter.name((String) next.getKey());
                        mo40901e(jsonWriter, (JsonElement) next.getValue());
                    }
                    jsonWriter.endObject();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
                }
            }
        };
        f55998X = r016;
        f55999Y = m78589e(JsonElement.class, r016);
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m78585a(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    /* renamed from: b */
    public static <TT> TypeAdapterFactory m78586b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.mo64306c() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: c */
    public static <TT> TypeAdapterFactory m78587c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> c = typeToken.mo64306c();
                if (c == cls || c == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: d */
    public static <TT> TypeAdapterFactory m78588d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            /* renamed from: a */
            public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> c = typeToken.mo64306c();
                if (c == cls || c == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    /* renamed from: e */
    public static <T1> TypeAdapterFactory m78589e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() {
            /* renamed from: a */
            public <T2> TypeAdapter<T2> mo40897a(Gson gson, TypeToken<T2> typeToken) {
                final Class<? super T2> c = typeToken.mo64306c();
                if (!cls.isAssignableFrom(c)) {
                    return null;
                }
                return new TypeAdapter<T1>() {
                    /* renamed from: c */
                    public T1 mo40900c(JsonReader jsonReader) throws IOException {
                        T1 c = typeAdapter.mo40900c(jsonReader);
                        if (c == null || c.isInstance(c)) {
                            return c;
                        }
                        throw new JsonSyntaxException("Expected a " + c.getName() + " but was " + c.getClass().getName());
                    }

                    /* renamed from: e */
                    public void mo40901e(JsonWriter jsonWriter, T1 t1) throws IOException {
                        typeAdapter.mo40901e(jsonWriter, t1);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
