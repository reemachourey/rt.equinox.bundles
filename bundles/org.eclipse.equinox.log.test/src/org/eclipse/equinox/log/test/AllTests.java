/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.equinox.log.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.equinox.log.test"); //$NON-NLS-1$
		suite.addTest(AllLogServiceTests.suite());
		suite.addTest(AllExtendedLogServiceTests.suite());
		return suite;
	}

}
