// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmployeeService.proto

package org.example.grpc;

public interface EmployeeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EmployeeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>repeated string technologies = 3;</code>
   * @return A list containing the technologies.
   */
  java.util.List<java.lang.String>
      getTechnologiesList();
  /**
   * <code>repeated string technologies = 3;</code>
   * @return The count of technologies.
   */
  int getTechnologiesCount();
  /**
   * <code>repeated string technologies = 3;</code>
   * @param index The index of the element to return.
   * @return The technologies at the given index.
   */
  java.lang.String getTechnologies(int index);
  /**
   * <code>repeated string technologies = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the technologies at the given index.
   */
  com.google.protobuf.ByteString
      getTechnologiesBytes(int index);

  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  int getBagOfTricksCount();
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  boolean containsBagOfTricks(
      java.lang.String key);
  /**
   * Use {@link #getBagOfTricksMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getBagOfTricks();
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getBagOfTricksMap();
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  java.lang.String getBagOfTricksOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  java.lang.String getBagOfTricksOrThrow(
      java.lang.String key);

  /**
   * <code>.EmployeeType sentiment = 5;</code>
   * @return The enum numeric value on the wire for sentiment.
   */
  int getSentimentValue();
  /**
   * <code>.EmployeeType sentiment = 5;</code>
   * @return The sentiment.
   */
  org.example.grpc.EmployeeType getSentiment();
}
