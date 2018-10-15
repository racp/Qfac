package com.quickFac.modulo.utils;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("paper-input")
@HtmlImport("frontend://src/paper-input.html")
public class TextLine extends AbstractSinglePropertyField<TextLine, String> {


	private static final long serialVersionUID = 1L;

	public void setPlaceholder(String placeholder) {
		getElement().setProperty("placeholder", placeholder);
	}

	public void setLabel(String label) {
		getElement().setProperty("label", label);
	}
	
	public void setFloatLabel(boolean floatlabel) {
		getElement().setProperty("alwaysFloatLabel", floatlabel);
	}
	
	public void setAutocomplete(String autocomplete) {
		if(autocomplete == null) {
			autocomplete = "off";
		}
		getElement().setProperty("autocomplente", autocomplete);
	}
	
	public void setAutofocus(boolean autofocus) {
		getElement().setProperty("autofocus", autofocus);
	}
	
	public void setCharCounter(boolean charcounter) {
		getElement().setProperty("charCounter", charcounter);
	}
	
	public void setDisabled(boolean disable) {
		getElement().setProperty("disabled", disable);
	}
	
	public void setErrorMessage(String errormessage) {
		getElement().setProperty("errorMessage", errormessage);
	}
	
	public void setFocus(boolean focus) {
		getElement().setProperty("focused", focus);
	}
	
	public void getInputElement() {
		getElement().getProperty("inputElement");
	}
	
	public void setMax(String max) {
		getElement().setProperty("max", max);
	}
	
	public void setMaxlength(int maxlength) {
		getElement().setProperty("maxlength", maxlength);
	}
	
	public void setMin(String min) {
		getElement().setProperty("max", min);
	}
	
	public void setMinlength(int minlength) {
		getElement().setProperty("maxlength", minlength);
	}
	
	public void setName(String name) {
		getElement().setProperty("name", name);
	}
	
	public void setNolabelFloat(boolean nolabelFloat) {
		getElement().setProperty("noLabelfloat", nolabelFloat);
	}
	
	public void setReadOnly(boolean readOnly) {
		getElement().setProperty("readonly", readOnly);
	}
	
	public void setRequired(boolean required) {
		getElement().setProperty("required", required);
	}
	
	@Synchronize("value-changed")
	public String getValue() {
		return getElement().getProperty("value");
	}

	public TextLine() {
		super("value", "" , false);
	}

	
}
