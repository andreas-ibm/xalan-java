/*
 * Copyright 1999-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * $Id$
 */

package org.apache.xml.serializer.utils;

import java.util.ListResourceBundle;

public class SerializerMessages_ru extends ListResourceBundle {
  public Object[][] getContents() {
    Object[][] contents =  new Object[][] {
        // BAD_MSGKEY needs translation
        // BAD_MSGFORMAT needs translation
      { SerializerMessages.ER_SERIALIZER_NOT_CONTENTHANDLER,
        "\u041a\u043b\u0430\u0441\u0441 \u0441\u0435\u0440\u0438\u0430\u043b\u0438\u0437\u0430\u0442\u043e\u0440\u0430 ''{0}'' \u043d\u0435 \u0440\u0435\u0430\u043b\u0438\u0437\u0443\u0435\u0442 org.xml.sax.ContentHandler."},

      { SerializerMessages.ER_RESOURCE_COULD_NOT_FIND,
        "\u0420\u0435\u0441\u0443\u0440\u0441 [ {0} ] \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d.\n{1}"},

      { SerializerMessages.ER_RESOURCE_COULD_NOT_LOAD,
        "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u0440\u0435\u0441\u0443\u0440\u0441 [ {0} ]: {1} \n {2} \n {3}"},

      { SerializerMessages.ER_BUFFER_SIZE_LESSTHAN_ZERO,
        "\u0420\u0430\u0437\u043c\u0435\u0440 \u0431\u0443\u0444\u0435\u0440\u0430 <=0"},

      { SerializerMessages.ER_INVALID_UTF16_SURROGATE,
        "\u041e\u0431\u043d\u0430\u0440\u0443\u0436\u0435\u043d\u043e \u043d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 UTF-16: {0} ?"},

      { SerializerMessages.ER_OIERROR,
        "\u041e\u0448\u0438\u0431\u043a\u0430 \u0432\u0432\u043e\u0434\u0430-\u0432\u044b\u0432\u043e\u0434\u0430"},

      { SerializerMessages.ER_ILLEGAL_ATTRIBUTE_POSITION,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0430\u0442\u0440\u0438\u0431\u0443\u0442 {0} \u043f\u043e\u0441\u043b\u0435 \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0445 \u0443\u0437\u043b\u043e\u0432 \u0438\u043b\u0438 \u043f\u0435\u0440\u0435\u0434 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0435\u043c \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430. \u0410\u0442\u0440\u0438\u0431\u0443\u0442 \u0431\u0443\u0434\u0435\u0442 \u043f\u0440\u043e\u0438\u0433\u043d\u043e\u0440\u0438\u0440\u043e\u0432\u0430\u043d. "},

      { SerializerMessages.ER_NAMESPACE_PREFIX,
        "\u041f\u0440\u043e\u0441\u0442\u0440\u0430\u043d\u0441\u0442\u0432\u043e \u0438\u043c\u0435\u043d \u0434\u043b\u044f \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u0430 ''{0}'' \u043d\u0435 \u043e\u0431\u044a\u044f\u0432\u043b\u0435\u043d\u043e."},

        // ER_STRAY_ATTRIBUTE needs translation
      { SerializerMessages.ER_STRAY_NAMESPACE,
        "\u041e\u0431\u044a\u044f\u0432\u043b\u0435\u043d\u0438\u0435 \u043f\u0440\u043e\u0441\u0442\u0440\u0430\u043d\u0441\u0442\u0432\u0430 \u0438\u043c\u0435\u043d ''{0}''=''{1}'' \u0432\u043d\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430."},

      { SerializerMessages.ER_COULD_NOT_LOAD_RESOURCE,
        "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c ''{0}'' (\u043f\u0440\u043e\u0432\u0435\u0440\u044c\u0442\u0435 CLASSPATH), \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u044e\u0442\u0441\u044f \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e"},

        // ER_ILLEGAL_CHARACTER needs translation
      { SerializerMessages.ER_COULD_NOT_LOAD_METHOD_PROPERTY,
        "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u0444\u0430\u0439\u043b \u0441\u0432\u043e\u0439\u0441\u0442\u0432 ''{0}'' \u0434\u043b\u044f \u043c\u0435\u0442\u043e\u0434\u0430 \u0432\u044b\u0432\u043e\u0434\u0430 ''{1}'' (\u043f\u0440\u043e\u0432\u0435\u0440\u044c\u0442\u0435 CLASSPATH)"},

      { SerializerMessages.ER_INVALID_PORT,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 \u043d\u043e\u043c\u0435\u0440 \u043f\u043e\u0440\u0442\u0430"},

      { SerializerMessages.ER_PORT_WHEN_HOST_NULL,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0437\u0430\u0434\u0430\u0442\u044c \u043f\u043e\u0440\u0442 \u0434\u043b\u044f \u043f\u0443\u0441\u0442\u043e\u0433\u043e \u0430\u0434\u0440\u0435\u0441\u0430 \u0445\u043e\u0441\u0442\u0430"},

      { SerializerMessages.ER_HOST_ADDRESS_NOT_WELLFORMED,
        "\u041d\u0435\u043f\u0440\u0430\u0432\u0438\u043b\u044c\u043d\u043e \u0441\u0444\u043e\u0440\u043c\u0438\u0440\u043e\u0432\u0430\u043d \u0430\u0434\u0440\u0435\u0441 \u0445\u043e\u0441\u0442\u0430"},

      { SerializerMessages.ER_SCHEME_NOT_CONFORMANT,
        "\u0421\u0445\u0435\u043c\u0430 \u043d\u0435 \u043a\u043e\u043d\u0444\u043e\u0440\u043c\u0430\u0442\u0438\u0432\u043d\u0430."},

      { SerializerMessages.ER_SCHEME_FROM_NULL_STRING,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0437\u0430\u0434\u0430\u0442\u044c \u0441\u0445\u0435\u043c\u0443 \u0434\u043b\u044f \u043f\u0443\u0441\u0442\u043e\u0439 \u0441\u0442\u0440\u043e\u043a\u0438"},

      { SerializerMessages.ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE,
        "\u0412 \u0438\u043c\u0435\u043d\u0438 \u043f\u0443\u0442\u0438 \u0432\u0441\u0442\u0440\u0435\u0447\u0430\u0435\u0442\u0441\u044f \u043d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u0430\u044f Esc-\u043f\u043e\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c"},

      { SerializerMessages.ER_PATH_INVALID_CHAR,
        "\u0412 \u0438\u043c\u0435\u043d\u0438 \u043f\u0443\u0442\u0438 \u043e\u0431\u043d\u0430\u0440\u0443\u0436\u0435\u043d \u043d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 \u0441\u0438\u043c\u0432\u043e\u043b: {0}"},

      { SerializerMessages.ER_FRAG_INVALID_CHAR,
        "\u0424\u0440\u0430\u0433\u043c\u0435\u043d\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u043d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 \u0441\u0438\u043c\u0432\u043e\u043b"},

      { SerializerMessages.ER_FRAG_WHEN_PATH_NULL,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0437\u0430\u0434\u0430\u0442\u044c \u0444\u0440\u0430\u0433\u043c\u0435\u043d\u0442 \u0434\u043b\u044f \u043f\u0443\u0441\u0442\u043e\u0433\u043e \u043f\u0443\u0442\u0438"},

      { SerializerMessages.ER_FRAG_FOR_GENERIC_URI,
        "\u0424\u0440\u0430\u0433\u043c\u0435\u043d\u0442 \u043c\u043e\u0436\u043d\u043e \u0437\u0430\u0434\u0430\u0442\u044c \u0442\u043e\u043b\u044c\u043a\u043e \u0434\u043b\u044f \u0448\u0430\u0431\u043b\u043e\u043d\u0430 URI"},

      { SerializerMessages.ER_NO_SCHEME_IN_URI,
        "\u0412 URI \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u0430 \u0441\u0445\u0435\u043c\u0430: {0}"},

      { SerializerMessages.ER_CANNOT_INIT_URI_EMPTY_PARMS,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0438\u043d\u0438\u0446\u0438\u0430\u043b\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c URI \u0441 \u043f\u0443\u0441\u0442\u044b\u043c\u0438 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u0430\u043c\u0438"},

      { SerializerMessages.ER_NO_FRAGMENT_STRING_IN_PATH,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0437\u0430\u0434\u0430\u0442\u044c \u0444\u0440\u0430\u0433\u043c\u0435\u043d\u0442 \u043e\u0434\u043d\u043e\u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e \u0434\u043b\u044f \u043f\u0443\u0442\u0438 \u0438 \u0444\u0440\u0430\u0433\u043c\u0435\u043d\u0442\u0430"},

      { SerializerMessages.ER_NO_QUERY_STRING_IN_PATH,
        "\u041d\u0435\u043b\u044c\u0437\u044f \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u0441\u0442\u0440\u043e\u043a\u0443 \u0437\u0430\u043f\u0440\u043e\u0441\u0430 \u0432 \u0441\u0442\u0440\u043e\u043a\u0435 \u043f\u0443\u0442\u0438 \u0438 \u0437\u0430\u043f\u0440\u043e\u0441\u0430"},

      { SerializerMessages.ER_NO_PORT_IF_NO_HOST,
        "\u041d\u0435\u043b\u044c\u0437\u044f \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u043f\u043e\u0440\u0442, \u0435\u0441\u043b\u0438 \u043d\u0435 \u0437\u0430\u0434\u0430\u043d \u0445\u043e\u0441\u0442"},

      { SerializerMessages.ER_NO_USERINFO_IF_NO_HOST,
        "\u041d\u0435\u043b\u044c\u0437\u044f \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043e \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435, \u0435\u0441\u043b\u0438 \u043d\u0435 \u0437\u0430\u0434\u0430\u043d \u0445\u043e\u0441\u0442"},

      { SerializerMessages.ER_SCHEME_REQUIRED,
        "\u041d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u0430 \u0441\u0445\u0435\u043c\u0430!"}

    };
    return contents;
  }
}
