// VersionProcessorTest.java
package com.jdojo.annotation;

import java.lang.annotation.Annotation;

@Version(major = -1, minor = 2)
public class VersionProcessorTest {
	@Version(major = 1, minor = 1)
	public void m1() {
	}

	@Version(major = -2, minor = 1)
	public void m2() {
	}
}