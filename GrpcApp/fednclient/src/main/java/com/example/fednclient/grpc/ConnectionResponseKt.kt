// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: fedn.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.example.fednclient.grpc;

@kotlin.jvm.JvmName("-initializeconnectionResponse")
public inline fun connectionResponse(block: com.example.fednclient.grpc.ConnectionResponseKt.Dsl.() -> kotlin.Unit): com.example.fednclient.grpc.ConnectionResponse =
  com.example.fednclient.grpc.ConnectionResponseKt.Dsl._create(com.example.fednclient.grpc.ConnectionResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `grpc.ConnectionResponse`
 */
public object ConnectionResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.fednclient.grpc.ConnectionResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.fednclient.grpc.ConnectionResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.fednclient.grpc.ConnectionResponse = _builder.build()

    /**
     * `.grpc.ConnectionStatus status = 1;`
     */
    public var status: com.example.fednclient.grpc.ConnectionStatus
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    public var statusValue: kotlin.Int
      @JvmName("getStatusValue")
      get() = _builder.getStatusValue()
      @JvmName("setStatusValue")
      set(value) {
        _builder.setStatusValue(value)
      }
    /**
     * `.grpc.ConnectionStatus status = 1;`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.example.fednclient.grpc.ConnectionResponse.copy(block: com.example.fednclient.grpc.ConnectionResponseKt.Dsl.() -> kotlin.Unit): com.example.fednclient.grpc.ConnectionResponse =
  com.example.fednclient.grpc.ConnectionResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
