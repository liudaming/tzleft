/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule.rule;

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

public class PenaltyFee implements org.apache.thrift.TBase<PenaltyFee, PenaltyFee._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PenaltyFee");

  private static final org.apache.thrift.protocol.TField CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("currency", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PenaltyFeeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PenaltyFeeTupleSchemeFactory());
  }

  public String currency; // optional
  public double amount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CURRENCY((short)1, "currency"),
    AMOUNT((short)2, "amount");

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
        case 1: // CURRENCY
          return CURRENCY;
        case 2: // AMOUNT
          return AMOUNT;
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
  private static final int __AMOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CURRENCY,_Fields.AMOUNT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("currency", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PenaltyFee.class, metaDataMap);
  }

  public PenaltyFee() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PenaltyFee(PenaltyFee other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCurrency()) {
      this.currency = other.currency;
    }
    this.amount = other.amount;
  }

  public PenaltyFee deepCopy() {
    return new PenaltyFee(this);
  }

  @Override
  public void clear() {
    this.currency = null;
    setAmountIsSet(false);
    this.amount = 0.0;
  }

  public String getCurrency() {
    return this.currency;
  }

  public PenaltyFee setCurrency(String currency) {
    this.currency = currency;
    return this;
  }

  public void unsetCurrency() {
    this.currency = null;
  }

  /** Returns true if field currency is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrency() {
    return this.currency != null;
  }

  public void setCurrencyIsSet(boolean value) {
    if (!value) {
      this.currency = null;
    }
  }

  public double getAmount() {
    return this.amount;
  }

  public PenaltyFee setAmount(double amount) {
    this.amount = amount;
    setAmountIsSet(true);
    return this;
  }

  public void unsetAmount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return EncodingUtils.testBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  public void setAmountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AMOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CURRENCY:
      if (value == null) {
        unsetCurrency();
      } else {
        setCurrency((String)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CURRENCY:
      return getCurrency();

    case AMOUNT:
      return Double.valueOf(getAmount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CURRENCY:
      return isSetCurrency();
    case AMOUNT:
      return isSetAmount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PenaltyFee)
      return this.equals((PenaltyFee)that);
    return false;
  }

  public boolean equals(PenaltyFee that) {
    if (that == null)
      return false;

    boolean this_present_currency = true && this.isSetCurrency();
    boolean that_present_currency = true && that.isSetCurrency();
    if (this_present_currency || that_present_currency) {
      if (!(this_present_currency && that_present_currency))
        return false;
      if (!this.currency.equals(that.currency))
        return false;
    }

    boolean this_present_amount = true && this.isSetAmount();
    boolean that_present_amount = true && that.isSetAmount();
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PenaltyFee other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PenaltyFee typedOther = (PenaltyFee)other;

    lastComparison = Boolean.valueOf(isSetCurrency()).compareTo(typedOther.isSetCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currency, typedOther.currency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmount()).compareTo(typedOther.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, typedOther.amount);
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
    StringBuilder sb = new StringBuilder("PenaltyFee(");
    boolean first = true;

    if (isSetCurrency()) {
      sb.append("currency:");
      if (this.currency == null) {
        sb.append("null");
      } else {
        sb.append(this.currency);
      }
      first = false;
    }
    if (isSetAmount()) {
      if (!first) sb.append(", ");
      sb.append("amount:");
      sb.append(this.amount);
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

  private static class PenaltyFeeStandardSchemeFactory implements SchemeFactory {
    public PenaltyFeeStandardScheme getScheme() {
      return new PenaltyFeeStandardScheme();
    }
  }

  private static class PenaltyFeeStandardScheme extends StandardScheme<PenaltyFee> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PenaltyFee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currency = iprot.readString();
              struct.setCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.amount = iprot.readDouble();
              struct.setAmountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PenaltyFee struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.currency != null) {
        if (struct.isSetCurrency()) {
          oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
          oprot.writeString(struct.currency);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetAmount()) {
        oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
        oprot.writeDouble(struct.amount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PenaltyFeeTupleSchemeFactory implements SchemeFactory {
    public PenaltyFeeTupleScheme getScheme() {
      return new PenaltyFeeTupleScheme();
    }
  }

  private static class PenaltyFeeTupleScheme extends TupleScheme<PenaltyFee> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PenaltyFee struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCurrency()) {
        optionals.set(0);
      }
      if (struct.isSetAmount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCurrency()) {
        oprot.writeString(struct.currency);
      }
      if (struct.isSetAmount()) {
        oprot.writeDouble(struct.amount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PenaltyFee struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.currency = iprot.readString();
        struct.setCurrencyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.amount = iprot.readDouble();
        struct.setAmountIsSet(true);
      }
    }
  }

}
