# USAGE

Edit the ../test.properties file and populate the masked values with connection information for a GMS tenant.

perform the build:

`mvn clean install`

Observe the `distributionManagement` element. The wdjws-maven-plugin will copy this element and any extension into the JAX-WS WSDL binding generated POM so that the maven `deploy` command can be successfully invoked and deploy the artifact to a local or remote repository.  



