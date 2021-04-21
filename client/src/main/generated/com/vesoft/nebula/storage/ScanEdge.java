/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ScanEdge implements TBase, java.io.Serializable, Cloneable, Comparable<ScanEdge> {
  private static final TStruct STRUCT_DESC = new TStruct("ScanEdge");
  private static final TField SRC_FIELD_DESC = new TField("src", TType.I64, (short)1);
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)2);
  private static final TField DST_FIELD_DESC = new TField("dst", TType.I64, (short)3);
  private static final TField VALUE_FIELD_DESC = new TField("value", TType.STRING, (short)4);

  public long src;
  public int type;
  public long dst;
  public byte[] value;
  public static final int SRC = 1;
  public static final int TYPE = 2;
  public static final int DST = 3;
  public static final int VALUE = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SRC_ISSET_ID = 0;
  private static final int __TYPE_ISSET_ID = 1;
  private static final int __DST_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SRC, new FieldMetaData("src", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(TYPE, new FieldMetaData("type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(DST, new FieldMetaData("dst", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(VALUE, new FieldMetaData("value", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ScanEdge.class, metaDataMap);
  }

  public ScanEdge() {
  }

  public ScanEdge(
    long src,
    int type,
    long dst,
    byte[] value)
  {
    this();
    this.src = src;
    setSrcIsSet(true);
    this.type = type;
    setTypeIsSet(true);
    this.dst = dst;
    setDstIsSet(true);
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScanEdge(ScanEdge other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.src = TBaseHelper.deepCopy(other.src);
    this.type = TBaseHelper.deepCopy(other.type);
    this.dst = TBaseHelper.deepCopy(other.dst);
    if (other.isSetValue()) {
      this.value = TBaseHelper.deepCopy(other.value);
    }
  }

  public ScanEdge deepCopy() {
    return new ScanEdge(this);
  }

  @Deprecated
  public ScanEdge clone() {
    return new ScanEdge(this);
  }

  public long  getSrc() {
    return this.src;
  }

  public ScanEdge setSrc(long src) {
    this.src = src;
    setSrcIsSet(true);
    return this;
  }

  public void unsetSrc() {
    __isset_bit_vector.clear(__SRC_ISSET_ID);
  }

  // Returns true if field src is set (has been assigned a value) and false otherwise
  public boolean isSetSrc() {
    return __isset_bit_vector.get(__SRC_ISSET_ID);
  }

  public void setSrcIsSet(boolean value) {
    __isset_bit_vector.set(__SRC_ISSET_ID, value);
  }

  public int  getType() {
    return this.type;
  }

  public ScanEdge setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bit_vector.clear(__TYPE_ISSET_ID);
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public boolean isSetType() {
    return __isset_bit_vector.get(__TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bit_vector.set(__TYPE_ISSET_ID, value);
  }

  public long  getDst() {
    return this.dst;
  }

  public ScanEdge setDst(long dst) {
    this.dst = dst;
    setDstIsSet(true);
    return this;
  }

  public void unsetDst() {
    __isset_bit_vector.clear(__DST_ISSET_ID);
  }

  // Returns true if field dst is set (has been assigned a value) and false otherwise
  public boolean isSetDst() {
    return __isset_bit_vector.get(__DST_ISSET_ID);
  }

  public void setDstIsSet(boolean value) {
    __isset_bit_vector.set(__DST_ISSET_ID, value);
  }

  public byte[]  getValue() {
    return this.value;
  }

  public ScanEdge setValue(byte[] value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  // Returns true if field value is set (has been assigned a value) and false otherwise
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SRC:
      if (value == null) {
        unsetSrc();
      } else {
        setSrc((Long)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case DST:
      if (value == null) {
        unsetDst();
      } else {
        setDst((Long)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SRC:
      return new Long(getSrc());

    case TYPE:
      return new Integer(getType());

    case DST:
      return new Long(getDst());

    case VALUE:
      return getValue();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SRC:
      return isSetSrc();
    case TYPE:
      return isSetType();
    case DST:
      return isSetDst();
    case VALUE:
      return isSetValue();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScanEdge)
      return this.equals((ScanEdge)that);
    return false;
  }

  public boolean equals(ScanEdge that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_src = true;
    boolean that_present_src = true;
    if (this_present_src || that_present_src) {
      if (!(this_present_src && that_present_src))
        return false;
      if (!TBaseHelper.equalsNobinary(this.src, that.src))
        return false;
    }

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!TBaseHelper.equalsNobinary(this.type, that.type))
        return false;
    }

    boolean this_present_dst = true;
    boolean that_present_dst = true;
    if (this_present_dst || that_present_dst) {
      if (!(this_present_dst && that_present_dst))
        return false;
      if (!TBaseHelper.equalsNobinary(this.dst, that.dst))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!TBaseHelper.equalsSlow(this.value, that.value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_src = true;
    builder.append(present_src);
    if (present_src)
      builder.append(src);

    boolean present_type = true;
    builder.append(present_type);
    if (present_type)
      builder.append(type);

    boolean present_dst = true;
    builder.append(present_dst);
    if (present_dst)
      builder.append(dst);

    boolean present_value = true && (isSetValue());
    builder.append(present_value);
    if (present_value)
      builder.append(value);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ScanEdge other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSrc()).compareTo(other.isSetSrc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(src, other.src);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(type, other.type);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDst()).compareTo(other.isSetDst());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(dst, other.dst);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(value, other.value);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SRC:
          if (field.type == TType.I64) {
            this.src = iprot.readI64();
            setSrcIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE:
          if (field.type == TType.I32) {
            this.type = iprot.readI32();
            setTypeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DST:
          if (field.type == TType.I64) {
            this.dst = iprot.readI64();
            setDstIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VALUE:
          if (field.type == TType.STRING) {
            this.value = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SRC_FIELD_DESC);
    oprot.writeI64(this.src);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(TYPE_FIELD_DESC);
    oprot.writeI32(this.type);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DST_FIELD_DESC);
    oprot.writeI64(this.dst);
    oprot.writeFieldEnd();
    if (this.value != null) {
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeBinary(this.value);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ScanEdge");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("src");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSrc(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("type");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getType(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("dst");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getDst(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("value");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getValue() == null) {
      sb.append("null");
    } else {
        int __value_size = Math.min(this. getValue().length, 128);
        for (int i = 0; i < __value_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getValue()[i]).length() > 1 ? Integer.toHexString(this. getValue()[i]).substring(Integer.toHexString(this. getValue()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getValue()[i]).toUpperCase());
        }
        if (this. getValue().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
