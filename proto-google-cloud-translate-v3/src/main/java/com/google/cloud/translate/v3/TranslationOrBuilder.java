/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface TranslationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.Translation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Text translated into the target language.
   * </pre>
   *
   * <code>string translated_text = 1;</code>
   */
  java.lang.String getTranslatedText();
  /**
   *
   *
   * <pre>
   * Text translated into the target language.
   * </pre>
   *
   * <code>string translated_text = 1;</code>
   */
  com.google.protobuf.ByteString getTranslatedTextBytes();

  /**
   *
   *
   * <pre>
   * Only present when `model` is present in the request.
   * `model` here is normalized to have project number.
   * For example:
   * If the `model` requested in TranslationTextRequest is
   * `projects/{project-id}/locations/{location-id}/models/general/nmt` then
   * `model` here would be normalized to
   * `projects/{project-number}/locations/{location-id}/models/general/nmt`.
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Only present when `model` is present in the request.
   * `model` here is normalized to have project number.
   * For example:
   * If the `model` requested in TranslationTextRequest is
   * `projects/{project-id}/locations/{location-id}/models/general/nmt` then
   * `model` here would be normalized to
   * `projects/{project-number}/locations/{location-id}/models/general/nmt`.
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source text in the initial request, detected
   * automatically, if no source language was passed within the initial
   * request. If the source language was passed, auto-detection of the language
   * does not occur and this field is empty.
   * </pre>
   *
   * <code>string detected_language_code = 4;</code>
   */
  java.lang.String getDetectedLanguageCode();
  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source text in the initial request, detected
   * automatically, if no source language was passed within the initial
   * request. If the source language was passed, auto-detection of the language
   * does not occur and this field is empty.
   * </pre>
   *
   * <code>string detected_language_code = 4;</code>
   */
  com.google.protobuf.ByteString getDetectedLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The `glossary_config` used for this translation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 3;</code>
   */
  boolean hasGlossaryConfig();
  /**
   *
   *
   * <pre>
   * The `glossary_config` used for this translation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 3;</code>
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfig getGlossaryConfig();
  /**
   *
   *
   * <pre>
   * The `glossary_config` used for this translation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 3;</code>
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfigOrBuilder getGlossaryConfigOrBuilder();
}
