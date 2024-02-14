package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    public static final TypeAdapterFactory f55915b = new TypeAdapterFactory() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.mo64306c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final List<DateFormat> f55916a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f55916a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.m78461e()) {
            arrayList.add(PreJava9DateFormatProvider.m78504c(2, 2));
        }
    }

    /* renamed from: f */
    private synchronized Date m78525f(String str) {
        for (DateFormat parse : this.f55916a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return ISO8601Utils.m78721c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* renamed from: g */
    public Date mo40900c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return m78525f(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: h */
    public synchronized void mo40901e(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.f55916a.get(0).format(date));
        }
    }
}
