/*
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.compiler.go.mygo.ui.internal.MygoActivator;

public class MyGoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MygoActivator.getInstance().getInjector("org.xtext.compiler.go.MyGo");
	}

}
