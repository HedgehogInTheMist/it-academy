<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 	 <xsl:output method="html"/>
	 
	 <xsl:template match="/studentList">
		<table border="1"><xsl:apply-templates/></table>
	 </xsl:template>
	 <xsl:template match="/studentList/student">
		
	 <tr><xsl:apply-templates/></tr>
	 </xsl:template>
	 
	 
	 
	 <xsl:template match="/studentList/student/firstName">
		<td><xsl:value-of select="text()"/></td>
	 </xsl:template>
	 
	 <xsl:template match="/studentList/student/lastName">
		<td><xsl:value-of select="text()"/></td>
	 </xsl:template>
	
	 <xsl:template match="/studentList/student/age">
		<td><xsl:value-of select="text()"/></td>
	 </xsl:template>
	 
	 <xsl:template match="/studentList/student/faculty">
		<td><xsl:value-of select="text()"/></td>
	 </xsl:template>
	 
</xsl:stylesheet>