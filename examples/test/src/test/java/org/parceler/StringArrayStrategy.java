/**
 * Copyright 2013-2015 John Ericksen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.parceler;

import org.apache.commons.lang.RandomStringUtils;
import uk.co.jemos.podam.api.AttributeStrategy;
import uk.co.jemos.podam.exceptions.PodamMockeryException;

/**
 * @author John Ericksen
 */
public class StringArrayStrategy implements AttributeStrategy<String[]> {
    @Override
    public String[] getValue() throws PodamMockeryException {
        return new String[]{RandomStringUtils.random(10), RandomStringUtils.random(10), RandomStringUtils.random(10)};
    }
}
