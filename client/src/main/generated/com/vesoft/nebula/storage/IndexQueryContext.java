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
public class IndexQueryContext implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("IndexQueryContext");
  private static final TField INDEX_ID_FIELD_DESC = new TField("index_id", TType.I32, (short)1);
  private static final TField FILTER_FIELD_DESC = new TField("filter", TType.STRING, (short)2);
  private static final TField COLUMN_HINTS_FIELD_DESC = new TField("column_hints", TType.LIST, (short)3);

  public int index_id;
  public byte[] filter;
  public List<IndexColumnHint> column_hints;
  public static final int INDEX_ID = 1;
  public static final int FILTER = 2;
  public static final int COLUMN_HINTS = 3;

  // isset id assignments
  private static final int __INDEX_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(INDEX_ID, new FieldMetaData("index_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(FILTER, new FieldMetaData("filter", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(COLUMN_HINTS, new FieldMetaData("column_hints", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, IndexColumnHint.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(IndexQueryContext.class, metaDataMap);
  }

  public IndexQueryContext() {
  }

  public IndexQueryContext(
      int index_id,
      byte[] filter,
      List<IndexColumnHint> column_hints) {
    this();
    this.index_id = index_id;
    setIndex_idIsSet(true);
    this.filter = filter;
    this.column_hints = column_hints;
  }

  public static class Builder {
    private int index_id;
    private byte[] filter;
    private List<IndexColumnHint> column_hints;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setIndex_id(final int index_id) {
      this.index_id = index_id;
      __optional_isset.set(__INDEX_ID_ISSET_ID, true);
      return this;
    }

    public Builder setFilter(final byte[] filter) {
      this.filter = filter;
      return this;
    }

    public Builder setColumn_hints(final List<IndexColumnHint> column_hints) {
      this.column_hints = column_hints;
      return this;
    }

    public IndexQueryContext build() {
      IndexQueryContext result = new IndexQueryContext();
      if (__optional_isset.get(__INDEX_ID_ISSET_ID)) {
        result.setIndex_id(this.index_id);
      }
      result.setFilter(this.filter);
      result.setColumn_hints(this.column_hints);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexQueryContext(IndexQueryContext other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.index_id = TBaseHelper.deepCopy(other.index_id);
    if (other.isSetFilter()) {
      this.filter = TBaseHelper.deepCopy(other.filter);
    }
    if (other.isSetColumn_hints()) {
      this.column_hints = TBaseHelper.deepCopy(other.column_hints);
    }
  }

  public IndexQueryContext deepCopy() {
    return new IndexQueryContext(this);
  }

  public int getIndex_id() {
    return this.index_id;
  }

  public IndexQueryContext setIndex_id(int index_id) {
    this.index_id = index_id;
    setIndex_idIsSet(true);
    return this;
  }

  public void unsetIndex_id() {
    __isset_bit_vector.clear(__INDEX_ID_ISSET_ID);
  }

  // Returns true if field index_id is set (has been assigned a value) and false otherwise
  public boolean isSetIndex_id() {
    return __isset_bit_vector.get(__INDEX_ID_ISSET_ID);
  }

  public void setIndex_idIsSet(boolean __value) {
    __isset_bit_vector.set(__INDEX_ID_ISSET_ID, __value);
  }

  public byte[] getFilter() {
    return this.filter;
  }

  public IndexQueryContext setFilter(byte[] filter) {
    this.filter = filter;
    return this;
  }

  public void unsetFilter() {
    this.filter = null;
  }

  // Returns true if field filter is set (has been assigned a value) and false otherwise
  public boolean isSetFilter() {
    return this.filter != null;
  }

  public void setFilterIsSet(boolean __value) {
    if (!__value) {
      this.filter = null;
    }
  }

  public List<IndexColumnHint> getColumn_hints() {
    return this.column_hints;
  }

  public IndexQueryContext setColumn_hints(List<IndexColumnHint> column_hints) {
    this.column_hints = column_hints;
    return this;
  }

  public void unsetColumn_hints() {
    this.column_hints = null;
  }

  // Returns true if field column_hints is set (has been assigned a value) and false otherwise
  public boolean isSetColumn_hints() {
    return this.column_hints != null;
  }

  public void setColumn_hintsIsSet(boolean __value) {
    if (!__value) {
      this.column_hints = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case INDEX_ID:
      if (__value == null) {
        unsetIndex_id();
      } else {
        setIndex_id((Integer)__value);
      }
      break;

    case FILTER:
      if (__value == null) {
        unsetFilter();
      } else {
        setFilter((byte[])__value);
      }
      break;

    case COLUMN_HINTS:
      if (__value == null) {
        unsetColumn_hints();
      } else {
        setColumn_hints((List<IndexColumnHint>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case INDEX_ID:
      return new Integer(getIndex_id());

    case FILTER:
      return getFilter();

    case COLUMN_HINTS:
      return getColumn_hints();

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
    if (!(_that instanceof IndexQueryContext))
      return false;
    IndexQueryContext that = (IndexQueryContext)_that;

    if (!TBaseHelper.equalsNobinary(this.index_id, that.index_id)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetFilter(), that.isSetFilter(), this.filter, that.filter)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetColumn_hints(), that.isSetColumn_hints(), this.column_hints, that.column_hints)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {index_id, filter, column_hints});
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
        case INDEX_ID:
          if (__field.type == TType.I32) {
            this.index_id = iprot.readI32();
            setIndex_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FILTER:
          if (__field.type == TType.STRING) {
            this.filter = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case COLUMN_HINTS:
          if (__field.type == TType.LIST) {
            {
              TList _list182 = iprot.readListBegin();
              this.column_hints = new ArrayList<IndexColumnHint>(Math.max(0, _list182.size));
              for (int _i183 = 0; 
                   (_list182.size < 0) ? iprot.peekList() : (_i183 < _list182.size); 
                   ++_i183)
              {
                IndexColumnHint _elem184;
                _elem184 = new IndexColumnHint();
                _elem184.read(iprot);
                this.column_hints.add(_elem184);
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
    oprot.writeFieldBegin(INDEX_ID_FIELD_DESC);
    oprot.writeI32(this.index_id);
    oprot.writeFieldEnd();
    if (this.filter != null) {
      oprot.writeFieldBegin(FILTER_FIELD_DESC);
      oprot.writeBinary(this.filter);
      oprot.writeFieldEnd();
    }
    if (this.column_hints != null) {
      oprot.writeFieldBegin(COLUMN_HINTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.column_hints.size()));
        for (IndexColumnHint _iter185 : this.column_hints)        {
          _iter185.write(oprot);
        }
        oprot.writeListEnd();
      }
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
    StringBuilder sb = new StringBuilder("IndexQueryContext");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("index_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getIndex_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("filter");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getFilter() == null) {
      sb.append("null");
    } else {
        int __filter_size = Math.min(this.getFilter().length, 128);
        for (int i = 0; i < __filter_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getFilter()[i]).length() > 1 ? Integer.toHexString(this.getFilter()[i]).substring(Integer.toHexString(this.getFilter()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getFilter()[i]).toUpperCase());
        }
        if (this.getFilter().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("column_hints");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getColumn_hints() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getColumn_hints(), indent + 1, prettyPrint));
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

