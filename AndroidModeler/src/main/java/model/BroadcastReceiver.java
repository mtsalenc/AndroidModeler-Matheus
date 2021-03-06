/**
 */
package model;

import org.eclipse.emf.ecore.EClass;

import templates.BroadcastReceiverTemplate;
import templates.ComponentTemplate;
import templates.impl.GCMBroadcastReceiverBaseImplTemplate;
import templates.impl.GCMBroadcastReceiverImplTemplate;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Broadcast Receiver</b></em>'. <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class BroadcastReceiver extends Component {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BroadcastReceiver() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getBroadcastReceiver();
	}

	@Override
	public String getXMLTag() {
		return "receiver";
	}

	@Override
	public ComponentTemplate getTemplate() {
		return BroadcastReceiverTemplate.getInstance();
	}

	@Override
	public ComponentTemplate getBaseTemplate() {		
		return BroadcastReceiverTemplate.getInstance();
	}

	@Override
	public ComponentTemplate getBaseImplTemplate() {		
		return GCMBroadcastReceiverBaseImplTemplate.getInstance();
	}

	@Override
	public ComponentTemplate getImplTemplate() {		
		return GCMBroadcastReceiverImplTemplate.getInstance();
	}
	
} // BroadcastReceiver
