/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule.condition;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TravelDateSubItem implements org.apache.thrift.TBase<TravelDateSubItem, TravelDateSubItem._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TravelDateSubItem");

  private static final org.apache.thrift.protocol.TField AFTER_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("afterDate", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField BEFORE_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("beforeDate", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TravelDateSubItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TravelDateSubItemTupleSchemeFactory());
  }

  public long afterDate; // optional
  public long beforeDate; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AFTER_DATE((short)1, "afterDate"),
    BEFORE_DATE((short)2, "beforeDate");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AFTER_DATE
          return AFTER_DATE;
        case 2: // BEFORE_DATE
          return BEFORE_DATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AFTERDATE_ISSET_ID = 0;
  private static final int __BEFOREDATE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.AFTER_DATE,_Fields.BEFORE_DATE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AFTER_DATE, new org.apache.thrift.meta_data.FieldMetaData("afterDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BEFORE_DATE, new org.apache.thrift.meta_data.FieldMetaData("beforeDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TravelDateSubItem.class, metaDataMap);
  }

  public TravelDateSubItem() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TravelDateSubItem(TravelDateSubItem other) {
    __isset_bitfield = other.__isset_bitfield;
    this.afterDate = other.afterDate;
    this.beforeDate = other.beforeDate;
  }

  public TravelDateSubItem deepCopy() {
    return new TravelDateSubItem(this);
  }

  @Override
  public void clear() {
    setAfterDateIsSet(false);
    this.afterDate = 0;
    setBeforeDateIsSet(false);
    this.beforeDate = 0;
  }

  public long getAfterDate() {
    return this.afterDate;
  }

  public TravelDateSubItem setAfterDate(long afterDate) {
    this.afterDate = afterDate;
    setAfterDateIsSet(true);
    return this;
  }

  public void unsetAfterDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AFTERDATE_ISSET_ID);
  }

  /** Returns true if field afterDate is set (has been assigned a value) and false otherwise */
  public boolean isSetAfterDate() {
    return EncodingUtils.testBit(__isset_bitfield, __AFTERDATE_ISSET_ID);
  }

  public void setAfterDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AFTERDATE_ISSET_ID, value);
  }

  public long getBeforeDate() {
    return this.beforeDate;
  }

  public TravelDateSubItem setBeforeDate(long beforeDate) {
    this.beforeDate = beforeDate;
    setBeforeDateIsSet(true);
    return this;
  }

  public void unsetBeforeDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BEFOREDATE_ISSET_ID);
  }

  /** Returns true if field beforeDate is set (has been assigned a value) and false otherwise */
  public boolean isSetBeforeDate() {
    return EncodingUtils.testBit(__isset_bitfield, __BEFOREDATE_ISSET_ID);
  }

  public void setBeforeDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BEFOREDATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AFTER_DATE:
      if (value == null) {
        unsetAfterDate();
      } else {
        setAfterDate((Long)value);
      }
      break;

    case BEFORE_DATE:
      if (value == null) {
        unsetBeforeDate();
      } else {
        setBeforeDate((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AFTER_DATE:
      return Long.valueOf(getAfterDate());

    case BEFORE_DATE:
      return Long.valueOf(getBeforeDate());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AFTER_DATE:
      return isSetAfterDate();
    case BEFORE_DATE:
      return isSetBeforeDate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TravelDateSubItem)
      return this.equals((TravelDateSubItem)that);
    return false;
  }

  public boolean equals(TravelDateSubItem that) {
    if (that == null)
      return false;

    boolean this_present_afterDate = true && this.isSetAfterDate();
    boolean that_present_afterDate = true && that.isSetAfterDate();
    if (this_present_afterDate || that_present_afterDate) {
      if (!(this_present_afterDate && that_present_afterDate))
        return false;
      if (this.afterDate != that.afterDate)
        return false;
    }

    boolean this_present_beforeDate = true && this.isSetBeforeDate();
    boolean that_present_beforeDate = true && that.isSetBeforeDate();
    if (this_present_beforeDate || that_present_beforeDate) {
      if (!(this_present_beforeDate && that_present_beforeDate))
        return false;
      if (this.beforeDate != that.beforeDate)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TravelDateSubItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TravelDateSubItem typedOther = (TravelDateSubItem)other;

    lastComparison = Boolean.valueOf(isSetAfterDate()).compareTo(typedOther.isSetAfterDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAfterDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.afterDate, typedOther.afterDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBeforeDate()).compareTo(typedOther.isSetBeforeDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeforeDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.beforeDate, typedOther.beforeDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TravelDateSubItem(");
    boolean first = true;

    if (isSetAfterDate()) {
      sb.append("afterDate:");
      sb.append(this.afterDate);
      first = false;
    }
    if (isSetBeforeDate()) {
      if (!first) sb.append(", ");
      sb.append("beforeDate:");
      sb.append(this.beforeDate);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TravelDateSubItemStandardSchemeFactory implements SchemeFactory {
    public TravelDateSubItemStandardScheme getScheme() {
      return new TravelDateSubItemStandardScheme();
    }
  }

  private static class TravelDateSubItemStandardScheme extends StandardScheme<TravelDateSubItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TravelDateSubItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AFTER_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.afterDate = iprot.readI64();
              struct.setAfterDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BEFORE_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.beforeDate = iprot.readI64();
              struct.setBeforeDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TravelDateSubItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetAfterDate()) {
        oprot.writeFieldBegin(AFTER_DATE_FIELD_DESC);
        oprot.writeI64(struct.afterDate);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBeforeDate()) {
        oprot.writeFieldBegin(BEFORE_DATE_FIELD_DESC);
        oprot.writeI64(struct.beforeDate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TravelDateSubItemTupleSchemeFactory implements SchemeFactory {
    public TravelDateSubItemTupleScheme getScheme() {
      return new TravelDateSubItemTupleScheme();
    }
  }

  private static class TravelDateSubItemTupleScheme extends TupleScheme<TravelDateSubItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TravelDateSubItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAfterDate()) {
        optionals.set(0);
      }
      if (struct.isSetBeforeDate()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAfterDate()) {
        oprot.writeI64(struct.afterDate);
      }
      if (struct.isSetBeforeDate()) {
        oprot.writeI64(struct.beforeDate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TravelDateSubItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.afterDate = iprot.readI64();
        struct.setAfterDateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.beforeDate = iprot.readI64();
        struct.setBeforeDateIsSet(true);
      }
    }
  }

}
