// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
////////////////////////////////////////////////////////////////////////////////

package com.google.crypto.tink;

import com.google.errorprone.annotations.Immutable;

/** A KeyTemplate specifies how to generate keys of a particular type. */
@Immutable
public final class KeyTemplate {
  private final com.google.crypto.tink.proto.KeyTemplate kt;

  public static final KeyTemplate fromProto(com.google.crypto.tink.proto.KeyTemplate kt) {
    return new KeyTemplate(kt);
  }

  private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate kt) {
    this.kt = kt;
  }

  com.google.crypto.tink.proto.KeyTemplate getProto() {
    return kt;
  }
}