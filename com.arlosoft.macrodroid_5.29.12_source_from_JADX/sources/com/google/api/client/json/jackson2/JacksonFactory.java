package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.C6796a;
import com.fasterxml.jackson.core.C6797b;
import com.fasterxml.jackson.core.C6799c;
import com.fasterxml.jackson.core.C6805g;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;

public final class JacksonFactory extends JsonFactory {

    /* renamed from: a */
    private final C6797b f52555a;

    /* renamed from: com.google.api.client.json.jackson2.JacksonFactory$1 */
    static /* synthetic */ class C108361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f52556a;

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
                com.fasterxml.jackson.core.g[] r0 = com.fasterxml.jackson.core.C6805g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52556a = r0
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f52556a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.json.jackson2.JacksonFactory.C108361.<clinit>():void");
        }
    }

    static class InstanceHolder {

        /* renamed from: a */
        static final JacksonFactory f52557a = new JacksonFactory();

        InstanceHolder() {
        }
    }

    public JacksonFactory() {
        C6797b bVar = new C6797b();
        this.f52555a = bVar;
        bVar.mo33820k(C6799c.C6800a.AUTO_CLOSE_JSON_CONTENT, false);
    }

    /* renamed from: l */
    static JsonToken m72307l(C6805g gVar) {
        if (gVar == null) {
            return null;
        }
        switch (C108361.f52556a[gVar.ordinal()]) {
            case 1:
                return JsonToken.END_ARRAY;
            case 2:
                return JsonToken.START_ARRAY;
            case 3:
                return JsonToken.END_OBJECT;
            case 4:
                return JsonToken.START_OBJECT;
            case 5:
                return JsonToken.VALUE_FALSE;
            case 6:
                return JsonToken.VALUE_TRUE;
            case 7:
                return JsonToken.VALUE_NULL;
            case 8:
                return JsonToken.VALUE_STRING;
            case 9:
                return JsonToken.VALUE_NUMBER_FLOAT;
            case 10:
                return JsonToken.VALUE_NUMBER_INT;
            case 11:
                return JsonToken.FIELD_NAME;
            default:
                return JsonToken.NOT_AVAILABLE;
        }
    }

    /* renamed from: m */
    public static JacksonFactory m72308m() {
        return InstanceHolder.f52557a;
    }

    /* renamed from: a */
    public JsonGenerator mo60171a(OutputStream outputStream, Charset charset) throws IOException {
        return new JacksonGenerator(this, this.f52555a.mo33821l(outputStream, C6796a.UTF8));
    }

    /* renamed from: b */
    public JsonParser mo60172b(InputStream inputStream) throws IOException {
        Preconditions.m72716d(inputStream);
        return new JacksonParser(this, this.f52555a.mo33822m(inputStream));
    }

    /* renamed from: c */
    public JsonParser mo60173c(InputStream inputStream, Charset charset) throws IOException {
        Preconditions.m72716d(inputStream);
        return new JacksonParser(this, this.f52555a.mo33822m(inputStream));
    }

    /* renamed from: d */
    public JsonParser mo60174d(Reader reader) throws IOException {
        Preconditions.m72716d(reader);
        return new JacksonParser(this, this.f52555a.mo33823n(reader));
    }

    /* renamed from: e */
    public JsonParser mo60175e(String str) throws IOException {
        Preconditions.m72716d(str);
        return new JacksonParser(this, this.f52555a.mo33824p(str));
    }
}
