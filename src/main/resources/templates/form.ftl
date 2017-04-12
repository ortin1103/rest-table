<#--@ftlvariable name="project" type="com.nitro.entity.Project"-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
</head>
<body>
<table border="1">
    <#list projects as project>
        <tr>
            <td>${project.name}</td>
            <td></td>
            <#list project.users as userProject>
            <td>${userProject.user.name}</td>
            </#list>


    </tr>
    </#list>
</table>
</body>
</html>

