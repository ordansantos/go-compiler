/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.compiler.go.MyGoRuntimeModule;
import org.xtext.compiler.go.MyGoStandaloneSetup;
import org.xtext.compiler.go.ide.MyGoIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyGoIdeSetup extends MyGoStandaloneSetup {
  @Override
  public Injector createInjector() {
    MyGoRuntimeModule _myGoRuntimeModule = new MyGoRuntimeModule();
    MyGoIdeModule _myGoIdeModule = new MyGoIdeModule();
    return Guice.createInjector(Modules2.mixin(_myGoRuntimeModule, _myGoIdeModule));
  }
}