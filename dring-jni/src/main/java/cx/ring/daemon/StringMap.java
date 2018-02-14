/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cx.ring.daemon;

public class StringMap {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RingserviceJNI.delete_StringMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static StringMap toSwig(java.util.Map<String,String> in) {
    StringMap n = new StringMap();
    for (java.util.Map.Entry<String, String> entry : in.entrySet()) {
      if (entry.getValue() != null) {
        n.set(entry.getKey(), entry.getValue());
      }
    }
    return n;
  }
  public java.util.HashMap<String,String> toNative() {
    java.util.HashMap<String,String> out = new java.util.HashMap<>((int)size());
    StringVect keys = keys();
    for (String s : keys) {
        out.put(s, get(s));
    }
    return out;
  }
  public java.util.HashMap<String,String> toNativeFromUtf8() {
      java.util.HashMap<String,String> out = new java.util.HashMap<>((int)size());
      StringVect keys = keys();
      for (String s : keys) {
        out.put(s, getRaw(s).toJavaString());
      }
      return out;
  }

  public StringMap() {
    this(RingserviceJNI.new_StringMap__SWIG_0(), true);
  }

  public StringMap(StringMap arg0) {
    this(RingserviceJNI.new_StringMap__SWIG_1(StringMap.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return RingserviceJNI.StringMap_size(swigCPtr, this);
  }

  public boolean empty() {
    return RingserviceJNI.StringMap_empty(swigCPtr, this);
  }

  public void clear() {
    RingserviceJNI.StringMap_clear(swigCPtr, this);
  }

  public String get(String key) {
    return RingserviceJNI.StringMap_get(swigCPtr, this, key);
  }

  public void set(String key, String x) {
    RingserviceJNI.StringMap_set(swigCPtr, this, key, x);
  }

  public void del(String key) {
    RingserviceJNI.StringMap_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return RingserviceJNI.StringMap_has_key(swigCPtr, this, key);
  }

  public StringVect keys() {
    return new StringVect(RingserviceJNI.StringMap_keys(swigCPtr, this), true);
  }

  public void setRaw(String key, Blob value) {
    RingserviceJNI.StringMap_setRaw(swigCPtr, this, key, Blob.getCPtr(value), value);
  }

  public Blob getRaw(String key) {
    return new Blob(RingserviceJNI.StringMap_getRaw(swigCPtr, this, key), true);
  }

}
