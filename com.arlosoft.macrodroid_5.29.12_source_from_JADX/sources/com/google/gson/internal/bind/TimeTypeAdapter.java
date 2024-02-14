package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b */
    public static final TypeAdapterFactory f55957b = new TypeAdapterFactory() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.mo64306c() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f55958a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: f */
    public synchronized Time mo40900c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f55958a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: g */
    public synchronized void mo40901e(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.f55958a.format(time));
    }
}
