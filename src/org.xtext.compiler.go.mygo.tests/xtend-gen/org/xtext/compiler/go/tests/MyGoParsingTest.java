/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.compiler.go.myGo.Model;
import org.xtext.compiler.go.tests.MyGoInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MyGoInjectorProvider.class)
@SuppressWarnings("all")
public class MyGoParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello abc!");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      InputOutput.<Model>println(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void integerLiteralsTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("42");
      _builder.newLine();
      _builder.append("0600");
      _builder.newLine();
      _builder.append("0xBadFace");
      _builder.newLine();
      _builder.append("170141183460469231731687303715884105727");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
