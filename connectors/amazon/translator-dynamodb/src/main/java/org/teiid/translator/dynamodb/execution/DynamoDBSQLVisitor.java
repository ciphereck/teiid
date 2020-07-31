/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
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
package org.teiid.translator.dynamodb.execution;

import org.teiid.language.visitor.SQLStringVisitor;
import org.teiid.translator.TranslatorException;

import java.util.ArrayList;

public class DynamoDBSQLVisitor extends SQLStringVisitor {
    private ArrayList<TranslatorException> translatorExceptions = new ArrayList<TranslatorException>();

    public void checkExceptions() throws TranslatorException {
        if (!this.translatorExceptions.isEmpty()) {
            throw this.translatorExceptions.get(0);
        }
    }
}