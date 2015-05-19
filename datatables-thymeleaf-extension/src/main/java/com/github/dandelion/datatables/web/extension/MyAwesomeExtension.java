package com.github.dandelion.datatables.web.extension;

import com.github.dandelion.datatables.core.extension.AbstractExtension;
import com.github.dandelion.datatables.core.generator.DTConstants;
import com.github.dandelion.datatables.core.html.HtmlTable;

public class MyAwesomeExtension extends AbstractExtension {

	@Override
	public String getExtensionName() {
		return "myExtension";
	}

	@Override
	public void setup(HtmlTable table) {

	   // Add a new CSS class to the table
		table.addCssClass("myClass");
		
		// Override the generated configuration
		addParameter(DTConstants.DT_DOM, "tp");
	}
}