/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum IsolationLevel implements com.facebook.thrift.TEnum {
  DEFAULT(0),
  TOSS(1);

  private final int value;

  private IsolationLevel(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static IsolationLevel findByValue(int value) { 
    switch (value) {
      case 0:
        return DEFAULT;
      case 1:
        return TOSS;
      default:
        return null;
    }
  }
}