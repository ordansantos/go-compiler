package org.xtext.compiler.go.validation;

import java.util.ArrayList;

public class Function {
	
	public ArrayList<String> typesList;
	public String returnType;
	public String receiverType = null;
	
	public Function() {
		this.typesList = new ArrayList<String>();
	}
	
}
