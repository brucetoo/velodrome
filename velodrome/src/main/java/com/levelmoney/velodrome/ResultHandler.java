/*
 * Copyright 2015 Level Money, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.levelmoney.velodrome;

import android.content.Intent;

public interface ResultHandler {

    /**
     * What code do we listen for in onActivityResult?
     */
    int requestCode();

    /**
     * What do we do with the result once we get it?
     * Velodrome automatically filters out !RESULT_OK
     */
    void handleResult(Intent data);

}
