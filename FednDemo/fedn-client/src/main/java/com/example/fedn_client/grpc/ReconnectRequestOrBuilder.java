// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fedn.proto

package com.example.fedn_client.grpc;

public interface ReconnectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.ReconnectRequest)
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
   * <code>.grpc.Client receiver = 2;</code>
   * @return Whether the receiver field is set.
   */
  boolean hasReceiver();
  /**
   * <code>.grpc.Client receiver = 2;</code>
   * @return The receiver.
   */
  com.example.fedn_client.grpc.Client getReceiver();
  /**
   * <code>.grpc.Client receiver = 2;</code>
   */
  com.example.fedn_client.grpc.ClientOrBuilder getReceiverOrBuilder();

  /**
   * <code>uint32 reconnect = 3;</code>
   * @return The reconnect.
   */
  int getReconnect();
}
