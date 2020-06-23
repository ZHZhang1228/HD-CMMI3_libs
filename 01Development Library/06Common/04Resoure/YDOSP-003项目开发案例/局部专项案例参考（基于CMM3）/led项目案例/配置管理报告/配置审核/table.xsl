<?xml version="1.0"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl" 
                xmlns:html="http://www.w3.org/TR/REC-html40"
                result-ns=""
                language="JScript">

<xsl:template match="/">

<html>
<head>
<title>RowsetSchema</title>
<style>
.stdText {
  font-Family:tahoma;
  font-Size: 12px;
}
</style>
</head>
<body>

<xsl:for-each select="Report">
<h1 style="font-Family:tahoma"><xsl:value-of select="ReportTitle" /></h1>
</xsl:for-each>
<p align="left" class="stdText"><i><b>Report Parameters:</b></i></p>
<p align="left" class="stdText"><b><xsl:value-of select="Report/Parameters"/></b></p>
<p align="left" class="stdText"><b>Report run at <xsl:value-of select="Report/RunDate"/></b></p>

<table width="100%" border="1">

<xsl:for-each select="Report/Header/Column">
<!--  <th class="stdText"><xsl:value-of select="@Label" /></th> -->
	<th class="stdText" STYLE="background-color:teal; color:white; padding:4px"><xsl:value-of select="@Label" /></th>
</xsl:for-each>


<xsl:for-each select="Report/Row">
<tr>
<xsl:for-each select="*">
<td class="stdText" valign="top"><xsl:value-of match="*"/></td>
</xsl:for-each>

</tr>
</xsl:for-each>

</table>

</body>
</html>
</xsl:template>

</xsl:stylesheet>

