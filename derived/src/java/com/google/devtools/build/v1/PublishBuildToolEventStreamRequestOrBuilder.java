// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/build/v1/publish_build_event.proto

package com.google.devtools.build.v1;

public interface PublishBuildToolEventStreamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.build.v1.PublishBuildToolEventStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Which build event stream this event belongs to.
   * </pre>
   *
   * <code>.google.devtools.build.v1.StreamId stream_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasStreamId();
  /**
   * <pre>
   * Which build event stream this event belongs to.
   * </pre>
   *
   * <code>.google.devtools.build.v1.StreamId stream_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.devtools.build.v1.StreamId getStreamId();
  /**
   * <pre>
   * Which build event stream this event belongs to.
   * </pre>
   *
   * <code>.google.devtools.build.v1.StreamId stream_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.devtools.build.v1.StreamIdOrBuilder getStreamIdOrBuilder();

  /**
   * <pre>
   * The position of this event in the stream. The sequence numbers for a build
   * event stream should be a sequence of consecutive natural numbers starting
   * from one. (1, 2, 3, ...)
   * </pre>
   *
   * <code>int64 sequence_number = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated long getSequenceNumber();

  /**
   * <pre>
   * The actual event.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent event = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasEvent();
  /**
   * <pre>
   * The actual event.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent event = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.devtools.build.v1.BuildEvent getEvent();
  /**
   * <pre>
   * The actual event.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildEvent event = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.devtools.build.v1.BuildEventOrBuilder getEventOrBuilder();

  /**
   * <pre>
   * The build event with position info.
   * New publishing clients should use this field rather than the 3 above.
   * </pre>
   *
   * <code>.google.devtools.build.v1.OrderedBuildEvent ordered_build_event = 4;</code>
   */
  boolean hasOrderedBuildEvent();
  /**
   * <pre>
   * The build event with position info.
   * New publishing clients should use this field rather than the 3 above.
   * </pre>
   *
   * <code>.google.devtools.build.v1.OrderedBuildEvent ordered_build_event = 4;</code>
   */
  com.google.devtools.build.v1.OrderedBuildEvent getOrderedBuildEvent();
  /**
   * <pre>
   * The build event with position info.
   * New publishing clients should use this field rather than the 3 above.
   * </pre>
   *
   * <code>.google.devtools.build.v1.OrderedBuildEvent ordered_build_event = 4;</code>
   */
  com.google.devtools.build.v1.OrderedBuildEventOrBuilder getOrderedBuildEventOrBuilder();

  /**
   * <pre>
   * The keywords to be attached to the notification which notifies the start
   * of a new build event stream. BES only reads this field when sequence_number
   * or ordered_build_event.sequence_number is 1 in this message. If this field
   * is empty, BES will not publish notification messages for this stream.
   * </pre>
   *
   * <code>repeated string notification_keywords = 5;</code>
   */
  java.util.List<java.lang.String>
      getNotificationKeywordsList();
  /**
   * <pre>
   * The keywords to be attached to the notification which notifies the start
   * of a new build event stream. BES only reads this field when sequence_number
   * or ordered_build_event.sequence_number is 1 in this message. If this field
   * is empty, BES will not publish notification messages for this stream.
   * </pre>
   *
   * <code>repeated string notification_keywords = 5;</code>
   */
  int getNotificationKeywordsCount();
  /**
   * <pre>
   * The keywords to be attached to the notification which notifies the start
   * of a new build event stream. BES only reads this field when sequence_number
   * or ordered_build_event.sequence_number is 1 in this message. If this field
   * is empty, BES will not publish notification messages for this stream.
   * </pre>
   *
   * <code>repeated string notification_keywords = 5;</code>
   */
  java.lang.String getNotificationKeywords(int index);
  /**
   * <pre>
   * The keywords to be attached to the notification which notifies the start
   * of a new build event stream. BES only reads this field when sequence_number
   * or ordered_build_event.sequence_number is 1 in this message. If this field
   * is empty, BES will not publish notification messages for this stream.
   * </pre>
   *
   * <code>repeated string notification_keywords = 5;</code>
   */
  com.google.protobuf.ByteString
      getNotificationKeywordsBytes(int index);
}
