/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class CreateCPRequest implements TBase, java.io.Serializable, Cloneable, Comparable<CreateCPRequest> {
  private static final TStruct STRUCT_DESC = new TStruct("CreateCPRequest");
  private static final TField SPACE_IDS_FIELD_DESC = new TField("space_ids", TType.LIST, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);

  public List<Integer> space_ids;
  public byte[] name;
  public static final int SPACE_IDS = 1;
  public static final int NAME = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_IDS, new FieldMetaData("space_ids", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(CreateCPRequest.class, metaDataMap);
  }

  public CreateCPRequest() {
  }

  public CreateCPRequest(
      List<Integer> space_ids,
      byte[] name) {
    this();
    this.space_ids = space_ids;
    this.name = name;
  }

  public static class Builder {
    private List<Integer> space_ids;
    private byte[] name;

    public Builder() {
    }

    public Builder setSpace_ids(final List<Integer> space_ids) {
      this.space_ids = space_ids;
      return this;
    }

    public Builder setName(final byte[] name) {
      this.name = name;
      return this;
    }

    public CreateCPRequest build() {
      CreateCPRequest result = new CreateCPRequest();
      result.setSpace_ids(this.space_ids);
      result.setName(this.name);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateCPRequest(CreateCPRequest other) {
    if (other.isSetSpace_ids()) {
      this.space_ids = TBaseHelper.deepCopy(other.space_ids);
    }
    if (other.isSetName()) {
      this.name = TBaseHelper.deepCopy(other.name);
    }
  }

  public CreateCPRequest deepCopy() {
    return new CreateCPRequest(this);
  }

  public List<Integer> getSpace_ids() {
    return this.space_ids;
  }

  public CreateCPRequest setSpace_ids(List<Integer> space_ids) {
    this.space_ids = space_ids;
    return this;
  }

  public void unsetSpace_ids() {
    this.space_ids = null;
  }

  // Returns true if field space_ids is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_ids() {
    return this.space_ids != null;
  }

  public void setSpace_idsIsSet(boolean __value) {
    if (!__value) {
      this.space_ids = null;
    }
  }

  public byte[] getName() {
    return this.name;
  }

  public CreateCPRequest setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean __value) {
    if (!__value) {
      this.name = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_IDS:
      if (__value == null) {
        unsetSpace_ids();
      } else {
        setSpace_ids((List<Integer>)__value);
      }
      break;

    case NAME:
      if (__value == null) {
        unsetName();
      } else {
        setName((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_IDS:
      return getSpace_ids();

    case NAME:
      return getName();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof CreateCPRequest))
      return false;
    CreateCPRequest that = (CreateCPRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetSpace_ids(), that.isSetSpace_ids(), this.space_ids, that.space_ids)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetName(), that.isSetName(), this.name, that.name)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_ids, name});
  }

  @Override
  public int compareTo(CreateCPRequest other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_ids()).compareTo(other.isSetSpace_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_ids, other.space_ids);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(name, other.name);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case SPACE_IDS:
          if (__field.type == TType.LIST) {
            {
              TList _list277 = iprot.readListBegin();
              this.space_ids = new ArrayList<Integer>(Math.max(0, _list277.size));
              for (int _i278 = 0; 
                   (_list277.size < 0) ? iprot.peekList() : (_i278 < _list277.size); 
                   ++_i278)
              {
                int _elem279;
                _elem279 = iprot.readI32();
                this.space_ids.add(_elem279);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case NAME:
          if (__field.type == TType.STRING) {
            this.name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
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
    if (this.space_ids != null) {
      oprot.writeFieldBegin(SPACE_IDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.space_ids.size()));
        for (int _iter280 : this.space_ids)        {
          oprot.writeI32(_iter280);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("CreateCPRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_ids");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getSpace_ids() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getSpace_ids(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("name");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getName() == null) {
      sb.append("null");
    } else {
        int __name_size = Math.min(this.getName().length, 128);
        for (int i = 0; i < __name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getName()[i]).length() > 1 ? Integer.toHexString(this.getName()[i]).substring(Integer.toHexString(this.getName()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getName()[i]).toUpperCase());
        }
        if (this.getName().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

