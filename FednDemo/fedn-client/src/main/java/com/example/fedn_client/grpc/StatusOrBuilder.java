// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fedn.proto

package com.example.fedn_client.grpc;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpc.Client sender = 1;</code>
   * @return Whether the sender field is set.
   */
  boolean hasSender();
  /**
   * <code>.grpc.Client sender = 1;</code>
   * @return The sender.
   */
  com.example.fedn_client.grpc.Client getSender();
  /**
   * <code>.grpc.Client sender = 1;</code>
   */
  com.example.fedn_client.grpc.ClientOrBuilder getSenderOrBuilder();

  /**
   * <pre>
   *string client = 1;
   * </pre>
   *
   * <code>string status = 2;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *string client = 1;
   * </pre>
   *
   * <code>string status = 2;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>.grpc.Status.LogLevel log_level = 3;</code>
   * @return The enum numeric value on the wire for logLevel.
   */
  int getLogLevelValue();
  /**
   * <code>.grpc.Status.LogLevel log_level = 3;</code>
   * @return The logLevel.
   */
  com.example.fedn_client.grpc.Status.LogLevel getLogLevel();

  /**
   * <code>string data = 4;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 4;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>string correlation_id = 5;</code>
   * @return The correlationId.
   */
  java.lang.String getCorrelationId();
  /**
   * <code>string correlation_id = 5;</code>
   * @return The bytes for correlationId.
   */
  com.google.protobuf.ByteString
      getCorrelationIdBytes();

  /**
   * <code>string timestamp = 6;</code>
   * @return The timestamp.
   */
  java.lang.String getTimestamp();
  /**
   * <code>string timestamp = 6;</code>
   * @return The bytes for timestamp.
   */
  com.google.protobuf.ByteString
      getTimestampBytes();

  /**
   * <code>.grpc.StatusType type = 7;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.grpc.StatusType type = 7;</code>
   * @return The type.
   */
  com.example.fedn_client.grpc.StatusType getType();

  /**
   * <code>string extra = 8;</code>
   * @return The extra.
   */
  java.lang.String getExtra();
  /**
   * <code>string extra = 8;</code>
   * @return The bytes for extra.
   */
  com.google.protobuf.ByteString
      getExtraBytes();
}
