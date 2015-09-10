/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.ext.unit;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.ext.unit.TestOptions}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.unit.TestOptions} original class using Vert.x codegen.
 */
public class TestOptionsConverter {

  public static void fromJson(JsonObject json, TestOptions obj) {
    if (json.getValue("timeout") instanceof Number) {
      obj.setTimeout(((Number)json.getValue("timeout")).longValue());
    }
    if (json.getValue("useEventLoop") instanceof Boolean) {
      obj.setUseEventLoop((Boolean)json.getValue("useEventLoop"));
    }
  }

  public static void toJson(TestOptions obj, JsonObject json) {
    json.put("timeout", obj.getTimeout());
    if (obj.isUseEventLoop() != null) {
      json.put("useEventLoop", obj.isUseEventLoop());
    }
  }
}