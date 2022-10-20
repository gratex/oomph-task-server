/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.oomph.setup.SetupTaskContext;

import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.TomcatServerTask;
import com.gratex.oomph.task.server.TomcatServerVersion;
import com.gratex.oomph.task.server.creator.impl.TomcatServerCreator;
import com.gratex.oomph.task.utils.Convert;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Tomcat
 * Server Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl#getJreVersion
 * <em>Jre Version</em>}</li>
 * <li>{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl#getPort
 * <em>Port</em>}</li>
 * <li>{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl#getHttpsPort
 * <em>Https Port</em>}</li>
 * <li>{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl#getServerVersion
 * <em>Server Version</em>}</li>
 * <li>{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl#getLaunchProgramArgs
 * <em>Launch Program Args</em>}</li>
 * <li>{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl#getLaunchVmArgs
 * <em>Launch Vm Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TomcatServerTaskImpl extends ServerImpl implements TomcatServerTask {
	/**
	 * The default value of the '{@link #getJreVersion() <em>Jre Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getJreVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String JRE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJreVersion() <em>Jre Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getJreVersion()
	 * @generated
	 * @ordered
	 */
	protected String jreVersion = JRE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = "8080";

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpsPort() <em>Https Port</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getHttpsPort()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTPS_PORT_EDEFAULT = "8443";

	/**
	 * The cached value of the '{@link #getHttpsPort() <em>Https Port</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getHttpsPort()
	 * @generated
	 * @ordered
	 */
	protected String httpsPort = HTTPS_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerVersion() <em>Server
	 * Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getServerVersion()
	 * @generated
	 * @ordered
	 */
	protected static final TomcatServerVersion SERVER_VERSION_EDEFAULT = TomcatServerVersion.TOMCAT70;

	/**
	 * The cached value of the '{@link #getServerVersion() <em>Server Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getServerVersion()
	 * @generated
	 * @ordered
	 */
	protected TomcatServerVersion serverVersion = SERVER_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaunchProgramArgs() <em>Launch Program
	 * Args</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLaunchProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_PROGRAM_ARGS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLaunchProgramArgs() <em>Launch Program
	 * Args</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLaunchProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected String launchProgramArgs = LAUNCH_PROGRAM_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaunchVmArgs() <em>Launch Vm Args</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLaunchVmArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_VM_ARGS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLaunchVmArgs() <em>Launch Vm Args</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLaunchVmArgs()
	 * @generated
	 * @ordered
	 */
	protected String launchVmArgs = LAUNCH_VM_ARGS_EDEFAULT;

	private TomcatServerCreator serverCreator;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TomcatServerTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.TOMCAT_SERVER_TASK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getJreVersion() {
		return jreVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setJreVersion(String newJreVersion) {
		String oldJreVersion = jreVersion;
		jreVersion = newJreVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.TOMCAT_SERVER_TASK__JRE_VERSION,
					oldJreVersion, jreVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.TOMCAT_SERVER_TASK__PORT, oldPort,
					port));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.gratex.oomph.task.server.TomcatServerTask#port()
	 */
	@Override
	public Integer port() {
		return Convert.toInteger(getPort());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getHttpsPort() {
		return httpsPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setHttpsPort(String newHttpsPort) {
		String oldHttpsPort = httpsPort;
		httpsPort = newHttpsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.TOMCAT_SERVER_TASK__HTTPS_PORT,
					oldHttpsPort, httpsPort));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.gratex.oomph.task.server.TomcatServerTask#httpsPort()
	 */
	@Override
	public Integer httpsPort() {
		return Convert.toInteger(getHttpsPort());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TomcatServerVersion getServerVersion() {
		return serverVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setServerVersion(TomcatServerVersion newServerVersion) {
		TomcatServerVersion oldServerVersion = serverVersion;
		serverVersion = newServerVersion == null ? SERVER_VERSION_EDEFAULT : newServerVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.TOMCAT_SERVER_TASK__SERVER_VERSION,
					oldServerVersion, serverVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getLaunchProgramArgs() {
		return launchProgramArgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLaunchProgramArgs(String newLaunchProgramArgs) {
		String oldLaunchProgramArgs = launchProgramArgs;
		launchProgramArgs = newLaunchProgramArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS,
					oldLaunchProgramArgs, launchProgramArgs));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getLaunchVmArgs() {
		return launchVmArgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLaunchVmArgs(String newLaunchVmArgs) {
		String oldLaunchVmArgs = launchVmArgs;
		launchVmArgs = newLaunchVmArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS,
					oldLaunchVmArgs, launchVmArgs));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServerPackage.TOMCAT_SERVER_TASK__JRE_VERSION:
			return getJreVersion();
		case ServerPackage.TOMCAT_SERVER_TASK__PORT:
			return getPort();
		case ServerPackage.TOMCAT_SERVER_TASK__HTTPS_PORT:
			return getHttpsPort();
		case ServerPackage.TOMCAT_SERVER_TASK__SERVER_VERSION:
			return getServerVersion();
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS:
			return getLaunchProgramArgs();
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS:
			return getLaunchVmArgs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ServerPackage.TOMCAT_SERVER_TASK__JRE_VERSION:
			setJreVersion((String) newValue);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__PORT:
			setPort((String) newValue);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__HTTPS_PORT:
			setHttpsPort((String) newValue);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__SERVER_VERSION:
			setServerVersion((TomcatServerVersion) newValue);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS:
			setLaunchProgramArgs((String) newValue);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS:
			setLaunchVmArgs((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ServerPackage.TOMCAT_SERVER_TASK__JRE_VERSION:
			setJreVersion(JRE_VERSION_EDEFAULT);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__HTTPS_PORT:
			setHttpsPort(HTTPS_PORT_EDEFAULT);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__SERVER_VERSION:
			setServerVersion(SERVER_VERSION_EDEFAULT);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS:
			setLaunchProgramArgs(LAUNCH_PROGRAM_ARGS_EDEFAULT);
			return;
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS:
			setLaunchVmArgs(LAUNCH_VM_ARGS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ServerPackage.TOMCAT_SERVER_TASK__JRE_VERSION:
			return JRE_VERSION_EDEFAULT == null ? jreVersion != null : !JRE_VERSION_EDEFAULT.equals(jreVersion);
		case ServerPackage.TOMCAT_SERVER_TASK__PORT:
			return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
		case ServerPackage.TOMCAT_SERVER_TASK__HTTPS_PORT:
			return HTTPS_PORT_EDEFAULT == null ? httpsPort != null : !HTTPS_PORT_EDEFAULT.equals(httpsPort);
		case ServerPackage.TOMCAT_SERVER_TASK__SERVER_VERSION:
			return serverVersion != SERVER_VERSION_EDEFAULT;
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS:
			return LAUNCH_PROGRAM_ARGS_EDEFAULT == null ? launchProgramArgs != null
					: !LAUNCH_PROGRAM_ARGS_EDEFAULT.equals(launchProgramArgs);
		case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS:
			return LAUNCH_VM_ARGS_EDEFAULT == null ? launchVmArgs != null
					: !LAUNCH_VM_ARGS_EDEFAULT.equals(launchVmArgs);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (jreVersion: ");
		result.append(jreVersion);
		result.append(", port: ");
		result.append(port);
		result.append(", httpsPort: ");
		result.append(httpsPort);
		result.append(", serverVersion: ");
		result.append(serverVersion);
		result.append(", launchProgramArgs: ");
		result.append(launchProgramArgs);
		result.append(", launchVmArgs: ");
		result.append(launchVmArgs);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isNeeded(SetupTaskContext context) throws Exception {
		serverCreator = new TomcatServerCreator(context, this);
		return !serverCreator.exists();
	}

	@Override
	public void perform(SetupTaskContext context) throws Exception {
		serverCreator.createServerInstance();
	}

	@Override
	public void dispose() {
	}

} // TomcatServerTaskImpl
