package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.C13635d;
import okhttp3.C15904b0;
import okhttp3.C15986u;
import okhttp3.C15989v;
import okhttp3.C15995x;
import okhttp3.C15997y;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPut;
import p458df.C17122a;
import p458df.C17123b;
import p458df.C17124c;
import p458df.C17125d;
import p458df.C17126e;
import p458df.C17127f;
import p458df.C17128g;
import p458df.C17129h;
import p458df.C17130i;
import p458df.C17131j;
import p458df.C17132k;
import p458df.C17133l;
import p458df.C17134m;
import p458df.C17135n;
import p458df.C17136o;
import p458df.C17137p;
import p458df.C17138q;
import p458df.C17139r;
import p458df.C17140s;
import p458df.C17141t;
import p458df.C17142u;
import p458df.C17143v;
import p458df.C17145x;
import p458df.C17146y;
import retrofit2.C17275o;

/* renamed from: retrofit2.r */
/* compiled from: RequestFactory */
final class C17298r {

    /* renamed from: a */
    private final Method f68915a;

    /* renamed from: b */
    private final C15989v f68916b;

    /* renamed from: c */
    final String f68917c;

    /* renamed from: d */
    private final String f68918d;

    /* renamed from: e */
    private final C15986u f68919e;

    /* renamed from: f */
    private final C15995x f68920f;

    /* renamed from: g */
    private final boolean f68921g;

    /* renamed from: h */
    private final boolean f68922h;

    /* renamed from: i */
    private final boolean f68923i;

    /* renamed from: j */
    private final C17275o<?>[] f68924j;

    /* renamed from: k */
    final boolean f68925k;

    /* renamed from: retrofit2.r$a */
    /* compiled from: RequestFactory */
    static final class C17299a {

        /* renamed from: x */
        private static final Pattern f68926x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f68927y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final C17301t f68928a;

        /* renamed from: b */
        final Method f68929b;

        /* renamed from: c */
        final Annotation[] f68930c;

        /* renamed from: d */
        final Annotation[][] f68931d;

        /* renamed from: e */
        final Type[] f68932e;

        /* renamed from: f */
        boolean f68933f;

        /* renamed from: g */
        boolean f68934g;

        /* renamed from: h */
        boolean f68935h;

        /* renamed from: i */
        boolean f68936i;

        /* renamed from: j */
        boolean f68937j;

        /* renamed from: k */
        boolean f68938k;

        /* renamed from: l */
        boolean f68939l;

        /* renamed from: m */
        boolean f68940m;

        /* renamed from: n */
        String f68941n;

        /* renamed from: o */
        boolean f68942o;

        /* renamed from: p */
        boolean f68943p;

        /* renamed from: q */
        boolean f68944q;

        /* renamed from: r */
        String f68945r;

        /* renamed from: s */
        C15986u f68946s;

        /* renamed from: t */
        C15995x f68947t;

        /* renamed from: u */
        Set<String> f68948u;

        /* renamed from: v */
        C17275o<?>[] f68949v;

        /* renamed from: w */
        boolean f68950w;

        C17299a(C17301t tVar, Method method) {
            this.f68928a = tVar;
            this.f68929b = method;
            this.f68930c = method.getAnnotations();
            this.f68932e = method.getGenericParameterTypes();
            this.f68931d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private static Class<?> m100962a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: c */
        private C15986u m100963c(String[] strArr) {
            C15986u.C15987a aVar = new C15986u.C15987a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C17307x.m101011m(this.f68929b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f68947t = C15995x.m96395e(trim);
                    } catch (IllegalArgumentException e) {
                        throw C17307x.m101012n(this.f68929b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo76251a(substring, trim);
                }
            }
            return aVar.mo76256f();
        }

        /* renamed from: d */
        private void m100964d(String str, String str2, boolean z) {
            String str3 = this.f68941n;
            if (str3 == null) {
                this.f68941n = str;
                this.f68942o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f68926x.matcher(substring).find()) {
                            throw C17307x.m101011m(this.f68929b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f68945r = str2;
                    this.f68948u = m100968h(str2);
                    return;
                }
                return;
            }
            throw C17307x.m101011m(this.f68929b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        private void m100965e(Annotation annotation) {
            if (annotation instanceof C17123b) {
                m100964d(HttpDelete.METHOD_NAME, ((C17123b) annotation).value(), false);
            } else if (annotation instanceof C17127f) {
                m100964d("GET", ((C17127f) annotation).value(), false);
            } else if (annotation instanceof C17128g) {
                m100964d(HttpHead.METHOD_NAME, ((C17128g) annotation).value(), false);
            } else if (annotation instanceof C17135n) {
                m100964d("PATCH", ((C17135n) annotation).value(), true);
            } else if (annotation instanceof C17136o) {
                m100964d("POST", ((C17136o) annotation).value(), true);
            } else if (annotation instanceof C17137p) {
                m100964d(HttpPut.METHOD_NAME, ((C17137p) annotation).value(), true);
            } else if (annotation instanceof C17134m) {
                m100964d(HttpOptions.METHOD_NAME, ((C17134m) annotation).value(), false);
            } else if (annotation instanceof C17129h) {
                C17129h hVar = (C17129h) annotation;
                m100964d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof C17132k) {
                String[] value = ((C17132k) annotation).value();
                if (value.length != 0) {
                    this.f68946s = m100963c(value);
                    return;
                }
                throw C17307x.m101011m(this.f68929b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof C17133l) {
                if (!this.f68943p) {
                    this.f68944q = true;
                    return;
                }
                throw C17307x.m101011m(this.f68929b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof C17126e)) {
            } else {
                if (!this.f68944q) {
                    this.f68943p = true;
                    return;
                }
                throw C17307x.m101011m(this.f68929b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: f */
        private C17275o<?> m100966f(int i, Type type, Annotation[] annotationArr, boolean z) {
            C17275o<?> oVar;
            if (annotationArr != null) {
                oVar = null;
                for (Annotation g : annotationArr) {
                    C17275o<?> g2 = m100967g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (oVar == null) {
                            oVar = g2;
                        } else {
                            throw C17307x.m101013o(this.f68929b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                oVar = null;
            }
            if (oVar != null) {
                return oVar;
            }
            if (z) {
                try {
                    if (C17307x.m101006h(type) == C13635d.class) {
                        this.f68950w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C17307x.m101013o(this.f68929b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        private C17275o<?> m100967g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<C15997y.C16000c> cls2 = C15997y.C16000c.class;
            if (annotation instanceof C17146y) {
                m100970j(i, type);
                if (this.f68940m) {
                    throw C17307x.m101013o(this.f68929b, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f68936i) {
                    throw C17307x.m101013o(this.f68929b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f68937j) {
                    throw C17307x.m101013o(this.f68929b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f68938k) {
                    throw C17307x.m101013o(this.f68929b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f68939l) {
                    throw C17307x.m101013o(this.f68929b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f68945r == null) {
                    this.f68940m = true;
                    if (type == C15989v.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C17275o.C17291p(this.f68929b, i);
                    }
                    throw C17307x.m101013o(this.f68929b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw C17307x.m101013o(this.f68929b, i, "@Url cannot be used with @%s URL", this.f68941n);
                }
            } else if (annotation instanceof C17140s) {
                m100970j(i, type);
                if (this.f68937j) {
                    throw C17307x.m101013o(this.f68929b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f68938k) {
                    throw C17307x.m101013o(this.f68929b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f68939l) {
                    throw C17307x.m101013o(this.f68929b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f68940m) {
                    throw C17307x.m101013o(this.f68929b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f68945r != null) {
                    this.f68936i = true;
                    C17140s sVar = (C17140s) annotation;
                    String value = sVar.value();
                    m100969i(i, value);
                    return new C17275o.C17286k(this.f68929b, i, value, this.f68928a.mo80606i(type, annotationArr), sVar.encoded());
                } else {
                    throw C17307x.m101013o(this.f68929b, i, "@Path can only be used with relative url on @%s", this.f68941n);
                }
            } else if (annotation instanceof C17141t) {
                m100970j(i, type);
                C17141t tVar = (C17141t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h = C17307x.m101006h(type);
                this.f68937j = true;
                if (Iterable.class.isAssignableFrom(h)) {
                    if (type instanceof ParameterizedType) {
                        return new C17275o.C17287l(value2, this.f68928a.mo80606i(C17307x.m101005g(0, (ParameterizedType) type), annotationArr), encoded).mo80564c();
                    }
                    throw C17307x.m101013o(this.f68929b, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h.isArray()) {
                    return new C17275o.C17287l(value2, this.f68928a.mo80606i(type, annotationArr), encoded);
                } else {
                    return new C17275o.C17287l(value2, this.f68928a.mo80606i(m100962a(h.getComponentType()), annotationArr), encoded).mo80563b();
                }
            } else if (annotation instanceof C17143v) {
                m100970j(i, type);
                boolean encoded2 = ((C17143v) annotation).encoded();
                Class<?> h2 = C17307x.m101006h(type);
                this.f68938k = true;
                if (Iterable.class.isAssignableFrom(h2)) {
                    if (type instanceof ParameterizedType) {
                        return new C17275o.C17289n(this.f68928a.mo80606i(C17307x.m101005g(0, (ParameterizedType) type), annotationArr), encoded2).mo80564c();
                    }
                    throw C17307x.m101013o(this.f68929b, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h2.isArray()) {
                    return new C17275o.C17289n(this.f68928a.mo80606i(type, annotationArr), encoded2);
                } else {
                    return new C17275o.C17289n(this.f68928a.mo80606i(m100962a(h2.getComponentType()), annotationArr), encoded2).mo80563b();
                }
            } else if (annotation instanceof C17142u) {
                m100970j(i, type);
                Class<?> h3 = C17307x.m101006h(type);
                this.f68939l = true;
                if (Map.class.isAssignableFrom(h3)) {
                    Type i2 = C17307x.m101007i(type, h3, Map.class);
                    if (i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i2;
                        Type g = C17307x.m101005g(0, parameterizedType);
                        if (cls == g) {
                            return new C17275o.C17288m(this.f68929b, i, this.f68928a.mo80606i(C17307x.m101005g(1, parameterizedType), annotationArr), ((C17142u) annotation).encoded());
                        }
                        throw C17307x.m101013o(this.f68929b, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                    }
                    throw C17307x.m101013o(this.f68929b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C17307x.m101013o(this.f68929b, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C17130i) {
                m100970j(i, type);
                String value3 = ((C17130i) annotation).value();
                Class<?> h4 = C17307x.m101006h(type);
                if (Iterable.class.isAssignableFrom(h4)) {
                    if (type instanceof ParameterizedType) {
                        return new C17275o.C17281f(value3, this.f68928a.mo80606i(C17307x.m101005g(0, (ParameterizedType) type), annotationArr)).mo80564c();
                    }
                    throw C17307x.m101013o(this.f68929b, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h4.isArray()) {
                    return new C17275o.C17281f(value3, this.f68928a.mo80606i(type, annotationArr));
                } else {
                    return new C17275o.C17281f(value3, this.f68928a.mo80606i(m100962a(h4.getComponentType()), annotationArr)).mo80563b();
                }
            } else if (annotation instanceof C17131j) {
                if (type == C15986u.class) {
                    return new C17275o.C17283h(this.f68929b, i);
                }
                m100970j(i, type);
                Class<?> h5 = C17307x.m101006h(type);
                if (Map.class.isAssignableFrom(h5)) {
                    Type i3 = C17307x.m101007i(type, h5, Map.class);
                    if (i3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                        Type g2 = C17307x.m101005g(0, parameterizedType2);
                        if (cls == g2) {
                            return new C17275o.C17282g(this.f68929b, i, this.f68928a.mo80606i(C17307x.m101005g(1, parameterizedType2), annotationArr));
                        }
                        throw C17307x.m101013o(this.f68929b, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                    }
                    throw C17307x.m101013o(this.f68929b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C17307x.m101013o(this.f68929b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C17124c) {
                m100970j(i, type);
                if (this.f68943p) {
                    C17124c cVar = (C17124c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f68933f = true;
                    Class<?> h6 = C17307x.m101006h(type);
                    if (Iterable.class.isAssignableFrom(h6)) {
                        if (type instanceof ParameterizedType) {
                            return new C17275o.C17279d(value4, this.f68928a.mo80606i(C17307x.m101005g(0, (ParameterizedType) type), annotationArr), encoded3).mo80564c();
                        }
                        throw C17307x.m101013o(this.f68929b, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h6.isArray()) {
                        return new C17275o.C17279d(value4, this.f68928a.mo80606i(type, annotationArr), encoded3);
                    } else {
                        return new C17275o.C17279d(value4, this.f68928a.mo80606i(m100962a(h6.getComponentType()), annotationArr), encoded3).mo80563b();
                    }
                } else {
                    throw C17307x.m101013o(this.f68929b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C17125d) {
                m100970j(i, type);
                if (this.f68943p) {
                    Class<?> h7 = C17307x.m101006h(type);
                    if (Map.class.isAssignableFrom(h7)) {
                        Type i4 = C17307x.m101007i(type, h7, Map.class);
                        if (i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                            Type g3 = C17307x.m101005g(0, parameterizedType3);
                            if (cls == g3) {
                                C17246f i5 = this.f68928a.mo80606i(C17307x.m101005g(1, parameterizedType3), annotationArr);
                                this.f68933f = true;
                                return new C17275o.C17280e(this.f68929b, i, i5, ((C17125d) annotation).encoded());
                            }
                            throw C17307x.m101013o(this.f68929b, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                        }
                        throw C17307x.m101013o(this.f68929b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C17307x.m101013o(this.f68929b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw C17307x.m101013o(this.f68929b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C17138q) {
                m100970j(i, type);
                if (this.f68944q) {
                    C17138q qVar = (C17138q) annotation;
                    this.f68934g = true;
                    String value5 = qVar.value();
                    Class<?> h8 = C17307x.m101006h(type);
                    if (!value5.isEmpty()) {
                        C15986u h9 = C15986u.m96302h("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                        if (Iterable.class.isAssignableFrom(h8)) {
                            if (type instanceof ParameterizedType) {
                                Type g4 = C17307x.m101005g(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(C17307x.m101006h(g4))) {
                                    return new C17275o.C17284i(this.f68929b, i, h9, this.f68928a.mo80604g(g4, annotationArr, this.f68930c)).mo80564c();
                                }
                                throw C17307x.m101013o(this.f68929b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw C17307x.m101013o(this.f68929b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h8.isArray()) {
                            Class<?> a = m100962a(h8.getComponentType());
                            if (!cls2.isAssignableFrom(a)) {
                                return new C17275o.C17284i(this.f68929b, i, h9, this.f68928a.mo80604g(a, annotationArr, this.f68930c)).mo80563b();
                            }
                            throw C17307x.m101013o(this.f68929b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(h8)) {
                            return new C17275o.C17284i(this.f68929b, i, h9, this.f68928a.mo80604g(type, annotationArr, this.f68930c));
                        } else {
                            throw C17307x.m101013o(this.f68929b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(h8)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw C17307x.m101013o(this.f68929b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(C17307x.m101006h(C17307x.m101005g(0, (ParameterizedType) type)))) {
                            return C17275o.C17290o.f68892a.mo80564c();
                        } else {
                            throw C17307x.m101013o(this.f68929b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (h8.isArray()) {
                        if (cls2.isAssignableFrom(h8.getComponentType())) {
                            return C17275o.C17290o.f68892a.mo80563b();
                        }
                        throw C17307x.m101013o(this.f68929b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(h8)) {
                        return C17275o.C17290o.f68892a;
                    } else {
                        throw C17307x.m101013o(this.f68929b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw C17307x.m101013o(this.f68929b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof C17139r) {
                m100970j(i, type);
                if (this.f68944q) {
                    this.f68934g = true;
                    Class<?> h10 = C17307x.m101006h(type);
                    if (Map.class.isAssignableFrom(h10)) {
                        Type i6 = C17307x.m101007i(type, h10, Map.class);
                        if (i6 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i6;
                            Type g5 = C17307x.m101005g(0, parameterizedType4);
                            if (cls == g5) {
                                Type g6 = C17307x.m101005g(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(C17307x.m101006h(g6))) {
                                    return new C17275o.C17285j(this.f68929b, i, this.f68928a.mo80604g(g6, annotationArr, this.f68930c), ((C17139r) annotation).encoding());
                                }
                                throw C17307x.m101013o(this.f68929b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw C17307x.m101013o(this.f68929b, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                        }
                        throw C17307x.m101013o(this.f68929b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C17307x.m101013o(this.f68929b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw C17307x.m101013o(this.f68929b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C17122a) {
                m100970j(i, type);
                if (this.f68943p || this.f68944q) {
                    throw C17307x.m101013o(this.f68929b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f68935h) {
                    try {
                        C17246f g7 = this.f68928a.mo80604g(type, annotationArr, this.f68930c);
                        this.f68935h = true;
                        return new C17275o.C17278c(this.f68929b, i, g7);
                    } catch (RuntimeException e) {
                        throw C17307x.m101014p(this.f68929b, e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw C17307x.m101013o(this.f68929b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (!(annotation instanceof C17145x)) {
                return null;
            } else {
                m100970j(i, type);
                Class<?> h11 = C17307x.m101006h(type);
                int i7 = i - 1;
                while (i7 >= 0) {
                    C17275o<?> oVar = this.f68949v[i7];
                    if (!(oVar instanceof C17275o.C17292q) || !((C17275o.C17292q) oVar).f68895a.equals(h11)) {
                        i7--;
                    } else {
                        throw C17307x.m101013o(this.f68929b, i, "@Tag type " + h11.getName() + " is duplicate of parameter #" + (i7 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new C17275o.C17292q(h11);
            }
        }

        /* renamed from: h */
        static Set<String> m100968h(String str) {
            Matcher matcher = f68926x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: i */
        private void m100969i(int i, String str) {
            if (!f68927y.matcher(str).matches()) {
                throw C17307x.m101013o(this.f68929b, i, "@Path parameter name must match %s. Found: %s", f68926x.pattern(), str);
            } else if (!this.f68948u.contains(str)) {
                throw C17307x.m101013o(this.f68929b, i, "URL \"%s\" does not contain \"{%s}\".", this.f68945r, str);
            }
        }

        /* renamed from: j */
        private void m100970j(int i, Type type) {
            if (C17307x.m101008j(type)) {
                throw C17307x.m101013o(this.f68929b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C17298r mo80591b() {
            for (Annotation e : this.f68930c) {
                m100965e(e);
            }
            if (this.f68941n != null) {
                if (!this.f68942o) {
                    if (this.f68944q) {
                        throw C17307x.m101011m(this.f68929b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f68943p) {
                        throw C17307x.m101011m(this.f68929b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f68931d.length;
                this.f68949v = new C17275o[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    C17275o<?>[] oVarArr = this.f68949v;
                    Type type = this.f68932e[i2];
                    Annotation[] annotationArr = this.f68931d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    oVarArr[i2] = m100966f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f68945r != null || this.f68940m) {
                    boolean z2 = this.f68943p;
                    if (!z2 && !this.f68944q && !this.f68942o && this.f68935h) {
                        throw C17307x.m101011m(this.f68929b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f68933f) {
                        throw C17307x.m101011m(this.f68929b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f68944q || this.f68934g) {
                        return new C17298r(this);
                    } else {
                        throw C17307x.m101011m(this.f68929b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw C17307x.m101011m(this.f68929b, "Missing either @%s URL or @Url parameter.", this.f68941n);
                }
            } else {
                throw C17307x.m101011m(this.f68929b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C17298r(C17299a aVar) {
        this.f68915a = aVar.f68929b;
        this.f68916b = aVar.f68928a.f68956c;
        this.f68917c = aVar.f68941n;
        this.f68918d = aVar.f68945r;
        this.f68919e = aVar.f68946s;
        this.f68920f = aVar.f68947t;
        this.f68921g = aVar.f68942o;
        this.f68922h = aVar.f68943p;
        this.f68923i = aVar.f68944q;
        this.f68924j = aVar.f68949v;
        this.f68925k = aVar.f68950w;
    }

    /* renamed from: b */
    static C17298r m100960b(C17301t tVar, Method method) {
        return new C17299a(tVar, method).mo80591b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C15904b0 mo80590a(Object[] objArr) throws IOException {
        C17275o<?>[] oVarArr = this.f68924j;
        int length = objArr.length;
        if (length == oVarArr.length) {
            C17296q qVar = new C17296q(this.f68917c, this.f68916b, this.f68918d, this.f68919e, this.f68920f, this.f68921g, this.f68922h, this.f68923i);
            if (this.f68925k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                oVarArr[i].mo80562a(qVar, objArr[i]);
            }
            return qVar.mo80587k().mo75934m(C17258k.class, new C17258k(this.f68915a, arrayList)).mo75923b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + oVarArr.length + ")");
    }
}
