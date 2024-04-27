<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema">

	<!-- IdentityTransform -->
	<xsl:template match="/ | @* | node()">
		<xsl:copy>
			<xsl:apply-templates select="@* | node()" />
		</xsl:copy>
	</xsl:template>

	<!-- Human Resources - fixed non-existent output type-->
	<xsl:template match="//wsdl:portType[@name='Human_ResourcesPort']/wsdl:operation[@name='Find_Organization']/wsdl:output">
		<wsdl:output name="Find_OrganizationOutput" message="wd-wsdl:Organization_ReferencesOutputMsg" />
	</xsl:template>

	<!-- Resource Management - fixed backslash that causes Java invalid unicode error-->
	<xsl:template match="//xsd:schema/xsd:complexType[@name='Put_Commodity_Code_ResponseType']/xsd:sequence/xsd:element[@name='Commodity_Code_Reference']/xsd:annotation/xsd:documentation">
		<xsd:documentation>Reference to the Commodity Code that was created/updated via this inbound Web Service operation.</xsd:documentation>
	</xsl:template>

</xsl:stylesheet>