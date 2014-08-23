package org.ispcu.ispconsumersunion;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.Hashtable;

public class FontCache {

    private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();

    public static Typeface get(String name, Context context) {
        Typeface tf = fontCache.get(name);
        if (tf == null) {
            try {
                tf = Typeface.createFromAsset(context.getAssets(), name);
            } catch (Exception e) {
                Log.getStackTraceString(e);
                Log.w("FontCache", "Font not found: " + name);
                return null;
            }
            fontCache.put(name, tf);
        }
        return tf;
    }
}