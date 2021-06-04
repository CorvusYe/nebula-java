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
public class TaskPara implements TBase, java.io.Serializable, Cloneable, Comparable<TaskPara> {
  private static final TStruct STRUCT_DESC = new TStruct("TaskPara");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)2);
  private static final TField TASK_SPECFIC_PARAS_FIELD_DESC = new TField("task_specfic_paras", TType.LIST, (short)3);

  public int space_id;
  public List<Integer> parts;
  public List<byte[]> task_specfic_paras;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int TASK_SPECFIC_PARAS = 3;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(TASK_SPECFIC_PARAS, new FieldMetaData("task_specfic_paras", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(TaskPara.class, metaDataMap);
  }

  public TaskPara() {
  }

  public TaskPara(
      int space_id) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
  }

  public TaskPara(
      int space_id,
      List<Integer> parts,
      List<byte[]> task_specfic_paras) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.task_specfic_paras = task_specfic_paras;
  }

  public static class Builder {
    private int space_id;
    private List<Integer> parts;
    private List<byte[]> task_specfic_paras;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final List<Integer> parts) {
      this.parts = parts;
      return this;
    }

    public Builder setTask_specfic_paras(final List<byte[]> task_specfic_paras) {
      this.task_specfic_paras = task_specfic_paras;
      return this;
    }

    public TaskPara build() {
      TaskPara result = new TaskPara();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      result.setTask_specfic_paras(this.task_specfic_paras);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskPara(TaskPara other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetTask_specfic_paras()) {
      this.task_specfic_paras = TBaseHelper.deepCopy(other.task_specfic_paras);
    }
  }

  public TaskPara deepCopy() {
    return new TaskPara(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public TaskPara setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public List<Integer> getParts() {
    return this.parts;
  }

  public TaskPara setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  public List<byte[]> getTask_specfic_paras() {
    return this.task_specfic_paras;
  }

  public TaskPara setTask_specfic_paras(List<byte[]> task_specfic_paras) {
    this.task_specfic_paras = task_specfic_paras;
    return this;
  }

  public void unsetTask_specfic_paras() {
    this.task_specfic_paras = null;
  }

  // Returns true if field task_specfic_paras is set (has been assigned a value) and false otherwise
  public boolean isSetTask_specfic_paras() {
    return this.task_specfic_paras != null;
  }

  public void setTask_specfic_parasIsSet(boolean __value) {
    if (!__value) {
      this.task_specfic_paras = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)__value);
      }
      break;

    case TASK_SPECFIC_PARAS:
      if (__value == null) {
        unsetTask_specfic_paras();
      } else {
        setTask_specfic_paras((List<byte[]>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case TASK_SPECFIC_PARAS:
      return getTask_specfic_paras();

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
    if (!(_that instanceof TaskPara))
      return false;
    TaskPara that = (TaskPara)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetTask_specfic_paras(), that.isSetTask_specfic_paras(), this.task_specfic_paras, that.task_specfic_paras)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, parts, task_specfic_paras});
  }

  @Override
  public int compareTo(TaskPara other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParts()).compareTo(other.isSetParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(parts, other.parts);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTask_specfic_paras()).compareTo(other.isSetTask_specfic_paras());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(task_specfic_paras, other.task_specfic_paras);
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
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.LIST) {
            {
              TList _list171 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list171.size));
              for (int _i172 = 0; 
                   (_list171.size < 0) ? iprot.peekList() : (_i172 < _list171.size); 
                   ++_i172)
              {
                int _elem173;
                _elem173 = iprot.readI32();
                this.parts.add(_elem173);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TASK_SPECFIC_PARAS:
          if (__field.type == TType.LIST) {
            {
              TList _list174 = iprot.readListBegin();
              this.task_specfic_paras = new ArrayList<byte[]>(Math.max(0, _list174.size));
              for (int _i175 = 0; 
                   (_list174.size < 0) ? iprot.peekList() : (_i175 < _list174.size); 
                   ++_i175)
              {
                byte[] _elem176;
                _elem176 = iprot.readBinary();
                this.task_specfic_paras.add(_elem176);
              }
              iprot.readListEnd();
            }
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
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      if (isSetParts()) {
        oprot.writeFieldBegin(PARTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
          for (int _iter177 : this.parts)          {
            oprot.writeI32(_iter177);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.task_specfic_paras != null) {
      if (isSetTask_specfic_paras()) {
        oprot.writeFieldBegin(TASK_SPECFIC_PARAS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.task_specfic_paras.size()));
          for (byte[] _iter178 : this.task_specfic_paras)          {
            oprot.writeBinary(_iter178);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
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
    StringBuilder sb = new StringBuilder("TaskPara");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (isSetParts())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("parts");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getParts() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetTask_specfic_paras())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("task_specfic_paras");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getTask_specfic_paras() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getTask_specfic_paras(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
