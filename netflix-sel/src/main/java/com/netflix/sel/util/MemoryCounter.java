/*
 * Copyright 2024 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.netflix.sel.util;

import java.util.concurrent.atomic.AtomicLong;

public class MemoryCounter {
  private static final long ONE_MEGA_BYTE = 1024 * 1024;
  private static final long DEFAULT_OBJECT_SIZE_IN_BYTES = 32;

  private static final ThreadLocal<AtomicLong> memory = ThreadLocal.withInitial(AtomicLong::new);
  private static volatile long memoryLimit = ONE_MEGA_BYTE; // default 1MB

  public static void increment(long delta) {
    long size = memory.get().addAndGet(delta + DEFAULT_OBJECT_SIZE_IN_BYTES);
    if (size >= memoryLimit) {
      throw new IllegalStateException(
          "SEL evaluation aborted as it takes too much memory (in byte) over the limit "
              + memoryLimit);
    }
  }

  public static long usedMemory() {
    return memory.get().get();
  }

  public static void setMemoryLimit(long limit) {
    memoryLimit = limit;
  }

  public static void reset() {
    memory.get().set(0);
  }
}
