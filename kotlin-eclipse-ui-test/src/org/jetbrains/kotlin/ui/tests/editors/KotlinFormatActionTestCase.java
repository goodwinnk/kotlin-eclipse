/*******************************************************************************
 * Copyright 2000-2014 JetBrains s.r.o.
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
 *
 *******************************************************************************/
package org.jetbrains.kotlin.ui.tests.editors;

import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
import org.jetbrains.kotlin.testframework.editor.KotlinEditorWithAfterFileTestCase;
import org.jetbrains.kotlin.testframework.utils.EditorTestUtils;

public class KotlinFormatActionTestCase extends KotlinEditorWithAfterFileTestCase {
    
    private static final String FORMAT_ACTION_TEST_DATA_SEGMENT = "format";
    
    @Override
    protected void performTest(String fileText, String content) {
        EditorsUI.getPreferenceStore().setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS, true);
        EditorsUI.getPreferenceStore().setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH, 4);
        
        testEditor.runFormatAction();
        
        EditorTestUtils.assertByEditor(getEditor(), content);
    }
    
    @Override
    protected String getTestDataRelativePath() {
        return FORMAT_ACTION_TEST_DATA_SEGMENT;
    }
}
