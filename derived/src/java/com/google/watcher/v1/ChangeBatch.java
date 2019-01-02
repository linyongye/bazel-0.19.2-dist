// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/watcher/v1/watch.proto

package com.google.watcher.v1;

/**
 * <pre>
 * A batch of Change messages.
 * </pre>
 *
 * Protobuf type {@code google.watcher.v1.ChangeBatch}
 */
public  final class ChangeBatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.watcher.v1.ChangeBatch)
    ChangeBatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeBatch.newBuilder() to construct.
  private ChangeBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeBatch() {
    changes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeBatch(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              changes_ = new java.util.ArrayList<com.google.watcher.v1.Change>();
              mutable_bitField0_ |= 0x00000001;
            }
            changes_.add(
                input.readMessage(com.google.watcher.v1.Change.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        changes_ = java.util.Collections.unmodifiableList(changes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_ChangeBatch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_ChangeBatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.watcher.v1.ChangeBatch.class, com.google.watcher.v1.ChangeBatch.Builder.class);
  }

  public static final int CHANGES_FIELD_NUMBER = 1;
  private java.util.List<com.google.watcher.v1.Change> changes_;
  /**
   * <pre>
   * A list of Change messages.
   * </pre>
   *
   * <code>repeated .google.watcher.v1.Change changes = 1;</code>
   */
  public java.util.List<com.google.watcher.v1.Change> getChangesList() {
    return changes_;
  }
  /**
   * <pre>
   * A list of Change messages.
   * </pre>
   *
   * <code>repeated .google.watcher.v1.Change changes = 1;</code>
   */
  public java.util.List<? extends com.google.watcher.v1.ChangeOrBuilder> 
      getChangesOrBuilderList() {
    return changes_;
  }
  /**
   * <pre>
   * A list of Change messages.
   * </pre>
   *
   * <code>repeated .google.watcher.v1.Change changes = 1;</code>
   */
  public int getChangesCount() {
    return changes_.size();
  }
  /**
   * <pre>
   * A list of Change messages.
   * </pre>
   *
   * <code>repeated .google.watcher.v1.Change changes = 1;</code>
   */
  public com.google.watcher.v1.Change getChanges(int index) {
    return changes_.get(index);
  }
  /**
   * <pre>
   * A list of Change messages.
   * </pre>
   *
   * <code>repeated .google.watcher.v1.Change changes = 1;</code>
   */
  public com.google.watcher.v1.ChangeOrBuilder getChangesOrBuilder(
      int index) {
    return changes_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < changes_.size(); i++) {
      output.writeMessage(1, changes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < changes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, changes_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.watcher.v1.ChangeBatch)) {
      return super.equals(obj);
    }
    com.google.watcher.v1.ChangeBatch other = (com.google.watcher.v1.ChangeBatch) obj;

    boolean result = true;
    result = result && getChangesList()
        .equals(other.getChangesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getChangesCount() > 0) {
      hash = (37 * hash) + CHANGES_FIELD_NUMBER;
      hash = (53 * hash) + getChangesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.watcher.v1.ChangeBatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.watcher.v1.ChangeBatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.watcher.v1.ChangeBatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.watcher.v1.ChangeBatch parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.watcher.v1.ChangeBatch prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A batch of Change messages.
   * </pre>
   *
   * Protobuf type {@code google.watcher.v1.ChangeBatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.watcher.v1.ChangeBatch)
      com.google.watcher.v1.ChangeBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_ChangeBatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_ChangeBatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.watcher.v1.ChangeBatch.class, com.google.watcher.v1.ChangeBatch.Builder.class);
    }

    // Construct using com.google.watcher.v1.ChangeBatch.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getChangesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (changesBuilder_ == null) {
        changes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        changesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_ChangeBatch_descriptor;
    }

    @java.lang.Override
    public com.google.watcher.v1.ChangeBatch getDefaultInstanceForType() {
      return com.google.watcher.v1.ChangeBatch.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.watcher.v1.ChangeBatch build() {
      com.google.watcher.v1.ChangeBatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.watcher.v1.ChangeBatch buildPartial() {
      com.google.watcher.v1.ChangeBatch result = new com.google.watcher.v1.ChangeBatch(this);
      int from_bitField0_ = bitField0_;
      if (changesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          changes_ = java.util.Collections.unmodifiableList(changes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.changes_ = changes_;
      } else {
        result.changes_ = changesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.watcher.v1.ChangeBatch) {
        return mergeFrom((com.google.watcher.v1.ChangeBatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.watcher.v1.ChangeBatch other) {
      if (other == com.google.watcher.v1.ChangeBatch.getDefaultInstance()) return this;
      if (changesBuilder_ == null) {
        if (!other.changes_.isEmpty()) {
          if (changes_.isEmpty()) {
            changes_ = other.changes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChangesIsMutable();
            changes_.addAll(other.changes_);
          }
          onChanged();
        }
      } else {
        if (!other.changes_.isEmpty()) {
          if (changesBuilder_.isEmpty()) {
            changesBuilder_.dispose();
            changesBuilder_ = null;
            changes_ = other.changes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            changesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChangesFieldBuilder() : null;
          } else {
            changesBuilder_.addAllMessages(other.changes_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.watcher.v1.ChangeBatch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.watcher.v1.ChangeBatch) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.watcher.v1.Change> changes_ =
      java.util.Collections.emptyList();
    private void ensureChangesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        changes_ = new java.util.ArrayList<com.google.watcher.v1.Change>(changes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.watcher.v1.Change, com.google.watcher.v1.Change.Builder, com.google.watcher.v1.ChangeOrBuilder> changesBuilder_;

    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public java.util.List<com.google.watcher.v1.Change> getChangesList() {
      if (changesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(changes_);
      } else {
        return changesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public int getChangesCount() {
      if (changesBuilder_ == null) {
        return changes_.size();
      } else {
        return changesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public com.google.watcher.v1.Change getChanges(int index) {
      if (changesBuilder_ == null) {
        return changes_.get(index);
      } else {
        return changesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder setChanges(
        int index, com.google.watcher.v1.Change value) {
      if (changesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChangesIsMutable();
        changes_.set(index, value);
        onChanged();
      } else {
        changesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder setChanges(
        int index, com.google.watcher.v1.Change.Builder builderForValue) {
      if (changesBuilder_ == null) {
        ensureChangesIsMutable();
        changes_.set(index, builderForValue.build());
        onChanged();
      } else {
        changesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder addChanges(com.google.watcher.v1.Change value) {
      if (changesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChangesIsMutable();
        changes_.add(value);
        onChanged();
      } else {
        changesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder addChanges(
        int index, com.google.watcher.v1.Change value) {
      if (changesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChangesIsMutable();
        changes_.add(index, value);
        onChanged();
      } else {
        changesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder addChanges(
        com.google.watcher.v1.Change.Builder builderForValue) {
      if (changesBuilder_ == null) {
        ensureChangesIsMutable();
        changes_.add(builderForValue.build());
        onChanged();
      } else {
        changesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder addChanges(
        int index, com.google.watcher.v1.Change.Builder builderForValue) {
      if (changesBuilder_ == null) {
        ensureChangesIsMutable();
        changes_.add(index, builderForValue.build());
        onChanged();
      } else {
        changesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder addAllChanges(
        java.lang.Iterable<? extends com.google.watcher.v1.Change> values) {
      if (changesBuilder_ == null) {
        ensureChangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, changes_);
        onChanged();
      } else {
        changesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder clearChanges() {
      if (changesBuilder_ == null) {
        changes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        changesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public Builder removeChanges(int index) {
      if (changesBuilder_ == null) {
        ensureChangesIsMutable();
        changes_.remove(index);
        onChanged();
      } else {
        changesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public com.google.watcher.v1.Change.Builder getChangesBuilder(
        int index) {
      return getChangesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public com.google.watcher.v1.ChangeOrBuilder getChangesOrBuilder(
        int index) {
      if (changesBuilder_ == null) {
        return changes_.get(index);  } else {
        return changesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public java.util.List<? extends com.google.watcher.v1.ChangeOrBuilder> 
         getChangesOrBuilderList() {
      if (changesBuilder_ != null) {
        return changesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(changes_);
      }
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public com.google.watcher.v1.Change.Builder addChangesBuilder() {
      return getChangesFieldBuilder().addBuilder(
          com.google.watcher.v1.Change.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public com.google.watcher.v1.Change.Builder addChangesBuilder(
        int index) {
      return getChangesFieldBuilder().addBuilder(
          index, com.google.watcher.v1.Change.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of Change messages.
     * </pre>
     *
     * <code>repeated .google.watcher.v1.Change changes = 1;</code>
     */
    public java.util.List<com.google.watcher.v1.Change.Builder> 
         getChangesBuilderList() {
      return getChangesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.watcher.v1.Change, com.google.watcher.v1.Change.Builder, com.google.watcher.v1.ChangeOrBuilder> 
        getChangesFieldBuilder() {
      if (changesBuilder_ == null) {
        changesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.watcher.v1.Change, com.google.watcher.v1.Change.Builder, com.google.watcher.v1.ChangeOrBuilder>(
                changes_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        changes_ = null;
      }
      return changesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.watcher.v1.ChangeBatch)
  }

  // @@protoc_insertion_point(class_scope:google.watcher.v1.ChangeBatch)
  private static final com.google.watcher.v1.ChangeBatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.watcher.v1.ChangeBatch();
  }

  public static com.google.watcher.v1.ChangeBatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeBatch>
      PARSER = new com.google.protobuf.AbstractParser<ChangeBatch>() {
    @java.lang.Override
    public ChangeBatch parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeBatch(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeBatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeBatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.watcher.v1.ChangeBatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
