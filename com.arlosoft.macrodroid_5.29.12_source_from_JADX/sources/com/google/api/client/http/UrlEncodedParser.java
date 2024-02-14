package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.Charsets;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Throwables;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class UrlEncodedParser implements ObjectParser {

    /* renamed from: a */
    public static final String f52504a = new HttpMediaType("application/x-www-form-urlencoded").mo60410l(Charsets.f52746a).mo60401a();

    /* renamed from: b */
    public static void m72183b(Reader reader, Object obj) throws IOException {
        int read;
        Object obj2 = obj;
        Class<?> cls = obj.getClass();
        ClassInfo f = ClassInfo.m72640f(cls);
        List asList = Arrays.asList(new Type[]{cls});
        GenericData genericData = GenericData.class.isAssignableFrom(cls) ? (GenericData) obj2 : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj2 : null;
        ArrayValueMap arrayValueMap = new ArrayValueMap(obj2);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    String a = CharEscapers.m72745a(stringWriter.toString());
                } else if (read == 61) {
                    z = false;
                } else if (z) {
                    stringWriter.write(read);
                } else {
                    stringWriter2.write(read);
                }
            }
            String a2 = CharEscapers.m72745a(stringWriter.toString());
            if (a2.length() != 0) {
                String a3 = CharEscapers.m72745a(stringWriter2.toString());
                FieldInfo b = f.mo60709b(a2);
                if (b != null) {
                    Type k = Data.m72660k(asList, b.mo60744d());
                    if (Types.m72739j(k)) {
                        Class<?> f2 = Types.m72735f(asList, Types.m72731b(k));
                        arrayValueMap.mo60696a(b.mo60743b(), f2, m72185f(f2, asList, a3));
                    } else if (Types.m72740k(Types.m72735f(asList, k), Iterable.class)) {
                        Collection<Object> collection = (Collection) b.mo60747g(obj2);
                        if (collection == null) {
                            collection = Data.m72656g(k);
                            b.mo60750m(obj2, collection);
                        }
                        collection.add(m72185f(k == Object.class ? null : Types.m72733d(k), asList, a3));
                    } else {
                        b.mo60750m(obj2, m72185f(k, asList, a3));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(a2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (genericData != null) {
                            genericData.mo60078d(a2, arrayList);
                        } else {
                            map.put(a2, arrayList);
                        }
                    }
                    arrayList.add(a3);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (read != -1);
        arrayValueMap.mo60697b();
    }

    /* renamed from: c */
    public static void m72184c(String str, Object obj) {
        if (str != null) {
            try {
                m72183b(new StringReader(str), obj);
            } catch (IOException e) {
                throw Throwables.m72729a(e);
            }
        }
    }

    /* renamed from: f */
    private static Object m72185f(Type type, List<Type> list, String str) {
        return Data.m72659j(Data.m72660k(list, type), str);
    }

    /* renamed from: a */
    public <T> T mo60213a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return mo60497d(new InputStreamReader(inputStream, charset), cls);
    }

    /* renamed from: d */
    public <T> T mo60497d(Reader reader, Class<T> cls) throws IOException {
        return mo60498e(reader, cls);
    }

    /* renamed from: e */
    public Object mo60498e(Reader reader, Type type) throws IOException {
        Preconditions.m72714b(type instanceof Class, "dataType has to be of type Class<?>");
        Object m = Types.m72742m((Class) type);
        m72183b(new BufferedReader(reader), m);
        return m;
    }
}
