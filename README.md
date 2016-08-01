# oomph-task-server
[Eclipse Oomph](https://projects.eclipse.org/projects/tools.oomph) extension tasks for creating Weblogic 12.1.3 and Tomcat 7 servers during setup.

## Installation
Update site: [TODO]

## Usage
To use the server task in your oomph setup file define a namespace `xmlns:server="http://www.gratex.com/oomph/task/server/1.0"` and add a schema location for the namespace (`xsi:schemaLocation`) pointing to `http://www.gratex.com/oomph/task/server/1.0 [TODO]/Server-1.0.ecore`.  

### Tomcat server
Sample Tomcat 7 server definition

```xml
<setupTask
    xsi:type="server:ServerTask"
    id="tomcat7"
    serverName="Tomcat v7.0 Server at localhost"
    location="/opt/apache-tomcat-7.0.53"
    runtimeName="Tomcat v7.0 Server"
    jreVersion="${jdk1.8.0.version}"
    port="9080"
    httpsPort="9443"/>
```

 * serverName - tomcat server instance name
 * runtimeName - eclipse runtime name for tomcat server
 * location - tomcat server installation location
 * jreVersion - eclipse java runtime version identifier
 * hostname - server host name
 * port - http port
 * httpsPort - https port


### Weblogic server
Sample Weblogic remote server definition

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
