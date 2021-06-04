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
public class CreateCPResp implements TBase, java.io.Serializable, Cloneable, Comparable<CreateCPResp> {
  private static final TStruct STRUCT_DESC = new TStruct("CreateCPResp");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField PATH_FIELD_DESC = new TField("path", TType.STRING, (short)2);
  private static final TField PARTITION_INFO_FIELD_DESC = new TField("partition_info", TType.STRUCT, (short)3);

  public ResponseCommon result;
  public byte[] path;
  public com.vesoft.nebula.PartitionBackupInfo partition_info;
  public static final int RESULT = 1;
  public static final int PATH = 2;
  public static final int PARTITION_INFO = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ResponseCommon.class)));
    tmpMetaDataMap.put(PATH, new FieldMetaData("path", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(PARTITION_INFO, new FieldMetaData("partition_info", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.PartitionBackupInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(CreateCPResp.class, metaDataMap);
  }

  public CreateCPResp() {
  }

  public CreateCPResp(
      ResponseCommon result) {
    this();
    this.result = result;
  }

  public CreateCPResp(
      ResponseCommon result,
      byte[] path,
      com.vesoft.nebula.PartitionBackupInfo partition_info) {
    this();
    this.result = result;
    this.path = path;
    this.partition_info = partition_info;
  }

  public static class Builder {
    private ResponseCommon result;
    private byte[] path;
    private com.vesoft.nebula.PartitionBackupInfo partition_info;

    public Builder() {
    }

    public Builder setResult(final ResponseCommon result) {
      this.result = result;
      return this;
    }

    public Builder setPath(final byte[] path) {
      this.path = path;
      return this;
    }

    public Builder setPartition_info(final com.vesoft.nebula.PartitionBackupInfo partition_info) {
      this.partition_info = partition_info;
      return this;
    }

    public CreateCPResp build() {
      CreateCPResp result = new CreateCPResp();
      result.setResult(this.result);
      result.setPath(this.path);
      result.setPartition_info(this.partition_info);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateCPResp(CreateCPResp other) {
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    if (other.isSetPath()) {
      this.path = TBaseHelper.deepCopy(other.path);
    }
    if (other.isSetPartition_info()) {
      this.partition_info = TBaseHelper.deepCopy(other.partition_info);
    }
  }

  public CreateCPResp deepCopy() {
    return new CreateCPResp(this);
  }

  public ResponseCommon getResult() {
    return this.result;
  }

  public CreateCPResp setResult(ResponseCommon result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean __value) {
    if (!__value) {
      this.result = null;
    }
  }

  public byte[] getPath() {
    return this.path;
  }

  public CreateCPResp setPath(byte[] path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  // Returns true if field path is set (has been assigned a value) and false otherwise
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean __value) {
    if (!__value) {
      this.path = null;
    }
  }

  public com.vesoft.nebula.PartitionBackupInfo getPartition_info() {
    return this.partition_info;
  }

  public CreateCPResp setPartition_info(com.vesoft.nebula.PartitionBackupInfo partition_info) {
    this.partition_info = partition_info;
    return this;
  }

  public void unsetPartition_info() {
    this.partition_info = null;
  }

  // Returns true if field partition_info is set (has been assigned a value) and false otherwise
  public boolean isSetPartition_info() {
    return this.partition_info != null;
  }

  public void setPartition_infoIsSet(boolean __value) {
    if (!__value) {
      this.partition_info = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case RESULT:
      if (__value == null) {
        unsetResult();
      } else {
        setResult((ResponseCommon)__value);
      }
      break;

    case PATH:
      if (__value == null) {
        unsetPath();
      } else {
        setPath((byte[])__value);
      }
      break;

    case PARTITION_INFO:
      if (__value == null) {
        unsetPartition_info();
      } else {
        setPartition_info((com.vesoft.nebula.PartitionBackupInfo)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case PATH:
      return getPath();

    case PARTITION_INFO:
      return getPartition_info();

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
    if (!(_that instanceof CreateCPResp))
      return false;
    CreateCPResp that = (CreateCPResp)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetResult(), that.isSetResult(), this.result, that.result)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetPath(), that.isSetPath(), this.path, that.path)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPartition_info(), that.isSetPartition_info(), this.partition_info, that.partition_info)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {result, path, partition_info});
  }

  @Override
  public int compareTo(CreateCPResp other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(result, other.result);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(path, other.path);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPartition_info()).compareTo(other.isSetPartition_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(partition_info, other.partition_info);
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
        case RESULT:
          if (__field.type == TType.STRUCT) {
            this.result = new ResponseCommon();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PATH:
          if (__field.type == TType.STRING) {
            this.path = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTITION_INFO:
          if (__field.type == TType.STRUCT) {
            this.partition_info = new com.vesoft.nebula.PartitionBackupInfo();
            this.partition_info.read(iprot);
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
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.path != null) {
      oprot.writeFieldBegin(PATH_FIELD_DESC);
      oprot.writeBinary(this.path);
      oprot.writeFieldEnd();
    }
    if (this.partition_info != null) {
      oprot.writeFieldBegin(PARTITION_INFO_FIELD_DESC);
      this.partition_info.write(oprot);
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
    StringBuilder sb = new StringBuilder("CreateCPResp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getResult() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getResult(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("path");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPath() == null) {
      sb.append("null");
    } else {
        int __path_size = Math.min(this.getPath().length, 128);
        for (int i = 0; i < __path_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getPath()[i]).length() > 1 ? Integer.toHexString(this.getPath()[i]).substring(Integer.toHexString(this.getPath()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getPath()[i]).toUpperCase());
        }
        if (this.getPath().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("partition_info");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPartition_info() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getPartition_info(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (result == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'result' was not present! Struct: " + toString());
    }
  }

}
