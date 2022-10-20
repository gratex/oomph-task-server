# oomph-task-server
[Eclipse Oomph](https://projects.eclipse.org/projects/tools.oomph) extension tasks for creating Weblogic 12.1.3, WebSphere (7.0, 8.0, 8.5, 9) and Tomcat (7.0, 8.0, 8.5, 9.0, 10.0) servers during setup.

## Installation
Update site: https://gratex.github.io/oomph-task-server/repository/

## Eclipse dev
Start [Eclipse installer](https://wiki.eclipse.org/Eclipse_Installer) with arguments `-vmargs "-Doomph.redirection.setups=index:/->https://raw.githubusercontent.com/gratex/oomph-task-server/master/index/"` and choose Eclipse IDE for Oomph Dev and project Oomph task server

## Build
Execute the `./run` script which mounts hosts $HOME/.m2 folder and builds whole project in docker container. The result update site is located at `com.gratex.oomph.task.server.site/target/*.zip`

## Usage
To use the server task in your oomph setup file define a namespace `xmlns:server="http://www.gratex.com/oomph/task/server/1.0"` and add a schema location for the namespace (`xsi:schemaLocation`) pointing to `http://www.gratex.com/oomph/task/server/1.0 https://raw.githubusercontent.com/gratex/oomph-task-server/master/com.gratex.oomph.task.server/model/Server-1.0.ecore`.  

### Tomcat server
Sample Tomcat (7.0, 8.0, 8.5, 9.0, 10.0) server definition

```xml
<setupTask
    xsi:type="server:TomcatServerTask"
    id="tomcat7"
    serverName="Tomcat v7.0 Server at localhost"
    location="/opt/apache-tomcat-7.0.53"
    runtimeName="Tomcat v7.0 Server"
    serverVersion="Tomcat 7.0"
    jreVersion="${jdk1.8.0.version}"
    port="9080"
    httpsPort="9443"/>
```

 * serverName - tomcat server instance name
 * runtimeName - eclipse runtime name for tomcat server
 * serverVersion - tomcat server version to create
 * location - tomcat server installation location
 * jreVersion - eclipse java runtime version identifier
 * hostname - server host name
 * port - http port
 * httpsPort - https port


### Weblogic server
Sample Oracle Weblogic remote server definition

```xml
<setupTask
    xsi:type="server:WeblogicServerTask"
    id="weblogic12c13"
    serverName="Oracle WebLogic Server 12c (12.1.3) at localhost"
    location="/opt/runtimes/wls/wls1213"
    runtimeName="Oracle WebLogic Server 12c (12.1.3)"
    jreVersion="${jdk1.8.0.version}"
    port="17001"
    httpsPort="27002"
    debugPort="28453"
    username="username"
    password="password"/>
```

 * serverName - weblogic server instance name
 * runtimeName - eclipse runtime name for weblogic server
 * location - weblogic server installation location
 * jreVersion - eclipse java runtime version identifier
 * hostname - server host name
 * port - http port
 * httpsPort - https port
 * debugPort - debug port
 * username - username to access server
 * password - username password

### WebSphere
Sample IBM WebSphere (7.0, 8.0, 8.5, 9) server definition

```xml
<setupTask
          xsi:type="server:WebsphereServerTask"
          id="websphere70"
          serverVersion="WebSphere 7.0"
          runtimeName="WebSphere Application Server traditional V7.0"
          serverName="WebSphere Application Server traditional V7.0 at waslxc"
          location="/home/was/IBM/WebSphere/AppServer"
          hostname="waslxc"
          profilePath="/home/was/profiles/conv/"
          remoteOsUser="was"
          remoteOsPassword="waslxc."/>
```

* serverVersion - websphere version to create ("WebSphere 7.0", "WebSphere 8.0", "WebSphere 8.5" or "WebSphere 9")
* runtimeName - eclipse runtime name for websphere server
* serverName - websphere server instance name
* location - websphere server installation location
* hostname - server host name (default: "localhost")
* profileName - name of profile to use
* baseServerName - application server name (default: "server1")
* bootstrapPort - bootstrap port
* icpPort - ICP port
* soapPort - SOAP port
* securityUserId - user id for server connection (enables security)
* securityUserPassword - password for server connection (enables security)
* profilePath - remote server profile path (only if remote)
* remoteOsUser - user name to access remote host (only if remote)
* remoteOsPassword - password to access remote host (only if remote)
