package org.jetbrains.kotlin.core.tests.diagnostics;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class KotlinDiagnosticsJavaPlusKotlinTest extends KotlinDiagnosticsTestCase {
	@Override
	@Before
	public void configure() {
		configureProjectWithStdLib();
	}

	@Test
	public void testaccessClassObjectFromJava() throws Exception {
		doTest("testData/diagnostics/j+k/accessClassObjectFromJava.kt");
	}

	@Test
	public void testambiguousSamAdapters() throws Exception {
		doTest("testData/diagnostics/j+k/ambiguousSamAdapters.kt");
	}

	@Test
	public void testcantDeclareIfSamAdapterIsInherited() throws Exception {
		doTest("testData/diagnostics/j+k/cantDeclareIfSamAdapterIsInherited.kt");
	}

	@Test
	public void testinheritAbstractSamAdapter() throws Exception {
		doTest("testData/diagnostics/j+k/inheritAbstractSamAdapter.kt");
	}

	@Test
	public void testinnerNestedClassFromJava() throws Exception {
		doTest("testData/diagnostics/j+k/innerNestedClassFromJava.kt");
	}

	@Test
	public void testinvisiblePackagePrivateInheritedMember() throws Exception {
		doTest("testData/diagnostics/j+k/invisiblePackagePrivateInheritedMember.kt");
	}
	
	@Test
	@Ignore("Add when java-integration will be ready")
	public void testKJKInheritance() throws Exception {
		doTest("testData/diagnostics/j+k/KJKInheritance.kt");
	}

	@Test
	@Ignore("Add when java-integration will be ready")
	public void testKJKInheritanceGeneric() throws Exception {
		doTest("testData/diagnostics/j+k/KJKInheritanceGeneric.kt");
	}

	@Test
	public void testkt1402() throws Exception {
		doTest("testData/diagnostics/j+k/kt1402.kt");
	}

	@Test
	public void testkt1431() throws Exception {
		doTest("testData/diagnostics/j+k/kt1431.kt");
	}

	@Test
	public void testkt2152() throws Exception {
		doTest("testData/diagnostics/j+k/kt2152.kt");
	}

	@Test
	public void testkt2394() throws Exception {
		doTest("testData/diagnostics/j+k/kt2394.kt");
	}

	@Test
	public void testkt2606() throws Exception {
		doTest("testData/diagnostics/j+k/kt2606.kt");
	}

	@Test
	public void testkt2619() throws Exception {
		doTest("testData/diagnostics/j+k/kt2619.kt");
	}

	@Test
	public void testkt2641() throws Exception {
		doTest("testData/diagnostics/j+k/kt2641.kt");
	}

	@Test
	public void testkt2890() throws Exception {
		doTest("testData/diagnostics/j+k/kt2890.kt");
	}

	@Test
	public void testkt3307() throws Exception {
		doTest("testData/diagnostics/j+k/kt3307.kt");
	}

	@Test
	public void testmutableIterator() throws Exception {
		doTest("testData/diagnostics/j+k/mutableIterator.kt");
	}

	@Test
	public void testoverrideRawType() throws Exception {
		doTest("testData/diagnostics/j+k/overrideRawType.kt");
	}

	@Test
	public void testOverrideVararg() throws Exception {
		doTest("testData/diagnostics/j+k/OverrideVararg.kt");
	}

	@Test
	public void testpackageVisibility() throws Exception {
		doTest("testData/diagnostics/j+k/packageVisibility.kt");
	}

	@Test
	public void testrecursiveRawUpperBound() throws Exception {
		doTest("testData/diagnostics/j+k/recursiveRawUpperBound.kt");
	}

	@Test
	public void testSimple() throws Exception {
		doTest("testData/diagnostics/j+k/Simple.kt");
	}

	@Test
	public void testStaticMembersFromSuperclasses() throws Exception {
		doTest("testData/diagnostics/j+k/StaticMembersFromSuperclasses.kt");
	}

	@Test
	public void testSupertypeArgumentsNullabilityNotNullSpecialTypes() throws Exception {
		doTest("testData/diagnostics/j+k/SupertypeArgumentsNullability-NotNull-SpecialTypes.kt");
	}

	@Test
	public void testSupertypeArgumentsNullabilityNotNullUserTypes() throws Exception {
		doTest("testData/diagnostics/j+k/SupertypeArgumentsNullability-NotNull-UserTypes.kt");
	}

	@Test
	public void testSupertypeArgumentsNullabilitySpecialTypes() throws Exception {
		doTest("testData/diagnostics/j+k/SupertypeArgumentsNullability-SpecialTypes.kt");
	}

	@Test
	public void testSupertypeArgumentsNullabilityUserTypes() throws Exception {
		doTest("testData/diagnostics/j+k/SupertypeArgumentsNullability-UserTypes.kt");
	}

	@Test
	public void testUnboxingNulls() throws Exception {
		doTest("testData/diagnostics/j+k/UnboxingNulls.kt");
	}

}
