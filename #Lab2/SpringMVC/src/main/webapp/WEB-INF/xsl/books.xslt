<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:output method="html" indent="yes"/>
    <xsl:template match="/xsltBooks/all">
        <html>
            <head>
                <style>
                    table.emp {
                    border-collapse: collapse;
                    }
                    table.emp, table.emp th, table.emp td {
                    border: 1px solid gray;
                    }
                </style>
            </head>
            <body>
                <div align="center">
                    <xsl:apply-templates/>
                </div>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="Books">
        <table class="emp" style="width:80%;">
            <tr bgcolor="#eee">
                <th>Id</th>
                <th>Title</th>
                <th>Author</th>
                <th>Description</th>
                <th>Price</th>
                <th>Quant</th>
                <th>Link</th>
            </tr>
            <xsl:for-each select="Book">
                <tr>
                    <td>
                        <xsl:value-of select="id"/>
                    </td>
                    <td>
                        <xsl:value-of select="title"/>
                    </td>
                    <td>
                        <xsl:value-of select="author"/>
                    </td>
                    <td>
                        <xsl:value-of select="description"/>
                    </td>
                    <td>
                        <xsl:value-of select="price"/>
                    </td>
                    <td>
                        <xsl:value-of select="quant"/>
                    </td>
                    <td>
                        <a href="get?id={id}">to book</a>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>