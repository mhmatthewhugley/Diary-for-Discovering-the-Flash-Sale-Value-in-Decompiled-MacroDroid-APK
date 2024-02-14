package com.android.multidex;

import com.android.p023dx.p024cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.iface.Attribute;
import com.android.p023dx.p024cf.iface.FieldList;
import com.android.p023dx.p024cf.iface.HasAttribute;
import com.android.p023dx.p024cf.iface.MethodList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class MainDexListBuilder {
    private static final String CLASS_EXTENSION = ".class";
    private static final String DISABLE_ANNOTATION_RESOLUTION_WORKAROUND = "--disable-annotation-resolution-workaround";
    private static final String EOL;
    private static final int STATUS_ERROR = 1;
    private static String USAGE_MESSAGE;
    private Set<String> filesToKeep = new HashSet();

    static {
        String property = System.getProperty("line.separator");
        EOL = property;
        USAGE_MESSAGE = "Usage:" + property + property + "Short version: Don't use this." + property + property + "Slightly longer version: This tool is used by mainDexClasses script to build" + property + "the main dex list." + property;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MainDexListBuilder(boolean r5, java.lang.String r6, java.lang.String r7) throws java.io.IOException {
        /*
            r4 = this;
            r4.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.filesToKeep = r0
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0072 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0072 }
            com.android.multidex.Path r6 = new com.android.multidex.Path     // Catch:{ all -> 0x006b }
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            com.android.multidex.ClassReferenceListBuilder r7 = new com.android.multidex.ClassReferenceListBuilder     // Catch:{ all -> 0x0069 }
            r7.<init>(r6)     // Catch:{ all -> 0x0069 }
            r7.addRoots(r1)     // Catch:{ all -> 0x0069 }
            java.util.Set r7 = r7.getClassNames()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0069 }
        L_0x0025:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0069 }
            java.util.Set<java.lang.String> r2 = r4.filesToKeep     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r3.<init>()     // Catch:{ all -> 0x0069 }
            r3.append(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = ".class"
            r3.append(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0069 }
            r2.add(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0025
        L_0x0048:
            if (r5 == 0) goto L_0x004d
            r4.keepAnnotated(r6)     // Catch:{ all -> 0x0069 }
        L_0x004d:
            r1.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            java.util.List<com.android.multidex.ClassPathElement> r5 = r6.elements
            java.util.Iterator r5 = r5.iterator()
        L_0x0056:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r5.next()
            com.android.multidex.ClassPathElement r6 = (com.android.multidex.ClassPathElement) r6
            r6.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0056
        L_0x0066:
            goto L_0x0056
        L_0x0068:
            return
        L_0x0069:
            r5 = move-exception
            goto L_0x006d
        L_0x006b:
            r5 = move-exception
            r6 = r0
        L_0x006d:
            r0 = r1
            goto L_0x009b
        L_0x006f:
            r5 = move-exception
            r6 = r0
            goto L_0x009b
        L_0x0072:
            r5 = move-exception
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r1.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch:{ all -> 0x006f }
            r1.append(r6)     // Catch:{ all -> 0x006f }
            java.lang.String r6 = "\" can not be read as a zip archive. ("
            r1.append(r6)     // Catch:{ all -> 0x006f }
            java.lang.String r6 = r5.getMessage()     // Catch:{ all -> 0x006f }
            r1.append(r6)     // Catch:{ all -> 0x006f }
            java.lang.String r6 = ")"
            r1.append(r6)     // Catch:{ all -> 0x006f }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x006f }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x006f }
            throw r7     // Catch:{ all -> 0x006f }
        L_0x009b:
            r0.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00a0
        L_0x009f:
        L_0x00a0:
            if (r6 == 0) goto L_0x00ba
            java.util.List<com.android.multidex.ClassPathElement> r6 = r6.elements
            java.util.Iterator r6 = r6.iterator()
        L_0x00a8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00ba
            java.lang.Object r7 = r6.next()
            com.android.multidex.ClassPathElement r7 = (com.android.multidex.ClassPathElement) r7
            r7.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00a8
        L_0x00b8:
            goto L_0x00a8
        L_0x00ba:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.multidex.MainDexListBuilder.<init>(boolean, java.lang.String, java.lang.String):void");
    }

    private boolean hasRuntimeVisibleAnnotation(HasAttribute hasAttribute) {
        Attribute findFirst = hasAttribute.getAttributes().findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        return findFirst != null && ((AttRuntimeVisibleAnnotations) findFirst).getAnnotations().size() > 0;
    }

    private void keepAnnotated(Path path) throws FileNotFoundException {
        for (ClassPathElement list : path.getElements()) {
            for (String next : list.list()) {
                if (next.endsWith(CLASS_EXTENSION)) {
                    DirectClassFile directClassFile = path.getClass(next);
                    if (hasRuntimeVisibleAnnotation(directClassFile)) {
                        this.filesToKeep.add(next);
                    } else {
                        MethodList methods = directClassFile.getMethods();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= methods.size()) {
                                FieldList fields = directClassFile.getFields();
                                while (true) {
                                    if (i >= fields.size()) {
                                        break;
                                    } else if (hasRuntimeVisibleAnnotation(fields.get(i))) {
                                        this.filesToKeep.add(next);
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            } else if (hasRuntimeVisibleAnnotation(methods.get(i2))) {
                                this.filesToKeep.add(next);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] strArr) {
        int i = 0;
        boolean z = true;
        while (i < strArr.length - 2) {
            if (strArr[i].equals(DISABLE_ANNOTATION_RESOLUTION_WORKAROUND)) {
                z = false;
            } else {
                PrintStream printStream = System.err;
                printStream.println("Invalid option " + strArr[i]);
                printUsage();
                System.exit(1);
            }
            i++;
        }
        if (strArr.length - i != 2) {
            printUsage();
            System.exit(1);
        }
        try {
            printList(new MainDexListBuilder(z, strArr[i], strArr[i + 1]).getMainDexList());
        } catch (IOException e) {
            PrintStream printStream2 = System.err;
            printStream2.println("A fatal error occured: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void printList(Set<String> set) {
        for (String println : set) {
            System.out.println(println);
        }
    }

    private static void printUsage() {
        System.err.print(USAGE_MESSAGE);
    }

    public Set<String> getMainDexList() {
        return this.filesToKeep;
    }
}
