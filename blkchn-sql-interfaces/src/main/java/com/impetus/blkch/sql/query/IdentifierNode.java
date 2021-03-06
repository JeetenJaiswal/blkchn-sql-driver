/*******************************************************************************
* * Copyright 2018 Impetus Infotech.
* *
* * Licensed under the Apache License, Version 2.0 (the "License");
* * you may not use this file except in compliance with the License.
* * You may obtain a copy of the License at
* *
* * http://www.apache.org/licenses/LICENSE-2.0
* *
* * Unless required by applicable law or agreed to in writing, software
* * distributed under the License is distributed on an "AS IS" BASIS,
* * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* * See the License for the specific language governing permissions and
* * limitations under the License.
******************************************************************************/
package com.impetus.blkch.sql.query;

import com.impetus.blkch.sql.parser.TreeNode;

public class IdentifierNode extends TreeNode {

    public static final String DESCRIPTION = "IDENT";

    private String value;
    private IdentType type;

    public IdentifierNode(String value) {
        super(DESCRIPTION + ":" + value);
        this.value = value;
    }

    public IdentifierNode(String value, IdentType type) {
        super(DESCRIPTION + ":" + value);
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public IdentType getType() {
        return type;
    }

    public static enum IdentType {
                                  NUMBER, BOOLEAN, STRING, BYTES;
    }

}
