/*
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyGoValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.compiler.go.myGo.MyGoPackage.eINSTANCE);
		return result;
	}
}
