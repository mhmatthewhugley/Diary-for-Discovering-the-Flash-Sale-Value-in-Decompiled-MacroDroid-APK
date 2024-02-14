package com.google.gson;

import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

final class DefaultDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f55758a;

    /* renamed from: b */
    private final List<DateFormat> f55759b;

    DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f55759b = arrayList;
        this.f55758a = m78279h(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: f */
    private Date m78278f(String str) {
        synchronized (this.f55759b) {
            for (DateFormat parse : this.f55759b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date c = ISO8601Utils.m78721c(str, new ParsePosition(0));
                return c;
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    /* renamed from: h */
    private static Class<? extends Date> m78279h(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: g */
    public Date mo40900c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date f = m78278f(jsonReader.nextString());
        Class<? extends Date> cls = this.f55758a;
        if (cls == Date.class) {
            return f;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(f.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(f.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    public void mo40901e(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f55759b) {
            jsonWriter.value(this.f55759b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f55759b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f55759b = arrayList;
        this.f55758a = m78279h(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.m78461e()) {
            arrayList.add(PreJava9DateFormatProvider.m78504c(i, i2));
        }
    }
}
