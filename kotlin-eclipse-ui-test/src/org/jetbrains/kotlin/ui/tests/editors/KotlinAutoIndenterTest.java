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

import org.junit.Test;

public class KotlinAutoIndenterTest extends KotlinAutoIndenterTestCase {
	
	@Test
	public void sampleTest() {
		doTest("ab<caret>c", "ab<br>c");
	}
	
	@Test
	public void betweenBracesOnOneLine() {
		doTest("{<caret>}", 
				
				"{<br>" +
				"\t<caret><br>" +
				"}");
	}
	
	@Test
	public void betweenBracesOnDifferentLine() {
		doTest("fun tt() {<caret><br>}",
				
				"fun tt() {<br>" +
				"\t<caret><br>" +
				"}");
	}
	
	@Test
	public void beforeCloseBrace() {
		doTest("{<br><caret>}",
				
				"{<br>" +
				"<br><caret>" +
				"}");
	}
	
	@Test
	public void afterOneOpenBrace() {
		doTest("fun tt(){<caret>",
				
				"fun tt(){<br>" +
				"\t<caret>");
	}
	
	@Test
	public void lineBreakSaveIndent() {
		doTest("fun tt() {<br>\t<caret><br>}",
				
				"fun tt() {<br>" +
				"\t<br>" +
				"\t<caret><br>" +
				"}");
	}
	
	@Test
	public void afterOperatorIfWithoutBraces() {
		doTest("fun tt() {<br>" +
				"\tif (true)<caret><br>" +
				"}",
				
				"fun tt() {<br>" +
				"\tif (true)<br>" +
				"\t\t<caret><br>" +
				"}");
	}
	
	@Test
	public void afterOperatorWhileWithoutBraces() {
		doTest("fun tt() {<br>" +
				"\twhile (true)<caret><br>" +
				"}",
				
				"fun tt() {<br>" +
				"\twhile (true)<br>" +
				"\t\t<caret><br>" +
				"}");
	}
	
	
	@Test
	public void breakLineAfterIfWithoutBraces() {
		doTest("fun tt() {<br>" +
				"\tif (true)<br>" +
				"\t\ttrue<caret><br>" +
				"}",
				
				"fun tt() {<br>" +
				"\tif (true)<br>" +
				"\t\ttrue<br>" +
				"\t<caret><br>" +
				"}");
	}
	
	@Test
	public void nestedOperatorsWithBraces() {
		doTest("fun tt() {<br>" +
				"\tif (true) {<br>" +
				"\t\tif (true) {<caret><br>" +
				"\t\t}<br>" +
				"\t}<br>" +
				"}",
				
				"fun tt() {<br>" +
				"\tif (true) {<br>" +
				"\t\tif (true) {<br>" +
				"\t\t\t<caret><br>" +
				"\t\t}<br>" +
				"\t}<br>" +
				"}");
	}
	
	@Test
	public void nestedOperatorsWithoutBraces() {
		doTest("fun tt() {<br>" +
				"\tif (true)<br>" +
				"\t\tif (true)<caret><br>" +
				"}",
				
				"fun tt() {<br>" +
				"\tif (true)<br>" +
				"\t\tif (true)<br>" +
				"\t\t\t<caret><br>" +
				"}");
	}
	
	@Test
	public void beforeFunctionStart() {
		doTest("<caret>fun tt() {<br>" +
				"}",
				
				"<br>" +
				"fun tt() {<br>" +
				"}");
	}
	
	@Test
	public void typeCloseBraceInEmptyEditor() {
		doTest("}", "}"); // Check that excetion not throwing
	}
}
