package templates

import model.AndroidApplication
import model.Component

class ServiceTemplate implements ComponentTemplate {
	private static var ServiceTemplate INSTANCE = null;
	
	def ServiceTemplate() {}
	
	def static public ServiceTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ServiceTemplate
		return INSTANCE
	}

	override generate(AndroidApplication app, Component c) '''
/*
	Generated with DroidModeler
 */
package «app.javaName»;

import android.app.Service;

public class «c.name» extends Service {	
	//TODO
}'''
}
