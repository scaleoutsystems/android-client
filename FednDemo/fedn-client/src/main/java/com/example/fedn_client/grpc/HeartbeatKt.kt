// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: fedn.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.example.fedn_client.grpc;

@kotlin.jvm.JvmName("-initializeheartbeat")
public inline fun heartbeat(block: com.example.fedn_client.grpc.HeartbeatKt.Dsl.() -> kotlin.Unit): com.example.fedn_client.grpc.Heartbeat =
  com.example.fedn_client.grpc.HeartbeatKt.Dsl._create(com.example.fedn_client.grpc.Heartbeat.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `grpc.Heartbeat`
 */
public object HeartbeatKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.fedn_client.grpc.Heartbeat.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.fedn_client.grpc.Heartbeat.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.fedn_client.grpc.Heartbeat = _builder.build()

    /**
     * `.grpc.Client sender = 1;`
     */
    public var sender: com.example.fedn_client.grpc.Client
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * `.grpc.Client sender = 1;`
     */
    public fun clearSender() {
      _builder.clearSender()
    }
    /**
     * `.grpc.Client sender = 1;`
     * @return Whether the sender field is set.
     */
    public fun hasSender(): kotlin.Boolean {
      return _builder.hasSender()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.example.fedn_client.grpc.Heartbeat.copy(block: com.example.fedn_client.grpc.HeartbeatKt.Dsl.() -> kotlin.Unit): com.example.fedn_client.grpc.Heartbeat =
  com.example.fedn_client.grpc.HeartbeatKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.example.fedn_client.grpc.HeartbeatOrBuilder.senderOrNull: com.example.fedn_client.grpc.Client?
  get() = if (hasSender()) getSender() else null
