<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:output method="html" indent="yes"/>
    <xsl:template match="/xsltUsers/get">
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
    <xsl:template match="User">
        <table class="emp" style="width:80%;">
            <tr bgcolor="#eee">
                <th>Id</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Login</th>
                <th>Password</th>
                <th>Age</th>
            </tr>
            <tr>
                <td>
                    <xsl:value-of select="id"/>
                </td>
                <td>
                    <xsl:value-of select="name"/>
                </td>
                <td>
                    <xsl:value-of select="surname"/>
                </td>
                <td>
                    <xsl:value-of select="login"/>
                </td>
                <td>
                    <xsl:value-of select="password"/>
                </td>
                <td>
                    <xsl:value-of select="age"/>
                </td>
            </tr>
        </table>
    </xsl:template>
</xsl:stylesheet>