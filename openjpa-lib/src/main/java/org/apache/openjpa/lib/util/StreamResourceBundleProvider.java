/*
 * Copyright 2006 The Apache Software Foundation.
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
package org.apache.openjpa.lib.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * {@link ResourceBundleProvider} that uses the
 * {@link ClassLoader#getResourceAsStream} method to load resources.
 * Created for use under WSAD.
 *
 * @author Stephen Kim
 */
class StreamResourceBundleProvider implements ResourceBundleProvider {

    public ResourceBundle findResource(String name, Locale locale,
        ClassLoader loader) {
        String rsrc = name.replace('.', '/') + ".properties";
        if (loader == null)
            loader = Thread.currentThread().getContextClassLoader();

        InputStream in = loader.getResourceAsStream(rsrc);
        if (in != null) {
            try {
                return new PropertyResourceBundle(in);
            } catch (Exception e) {
            } finally {
                try {
                    in.close();
                } catch (IOException ioe) {
                }
            }
        }
        return null;
    }
}
