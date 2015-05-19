package com.github.dandelion.datatables.web.ddl;

import com.github.dandelion.core.web.AssetRequestContext;
import com.github.dandelion.datatables.core.extension.AbstractExtension;
import com.github.dandelion.datatables.core.generator.DTConstants;
import com.github.dandelion.datatables.core.html.HtmlTable;

public class CustomJqueryTheme extends AbstractExtension {

	@Override
	public String getExtensionName() {
		return "myTheme";
	}

	@Override
	public void setup(HtmlTable table) {
		
		// Activate bundles
		AssetRequestContext
		   .get(table.getTableConfiguration().getRequest())
		       .addBundle("ddl-dt-theme-jqueryui")
		       .addBundle("custom-theme");

		// Add "bJQueryUI":true
		addParameter(DTConstants.DT_JQUERYUI, true);
		
		// Add class="display"
		table.addCssClass("display");
	}
}
